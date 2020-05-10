package typingsSlinky.reactCopyToClipboard.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCopyToClipboard.mod.Options
import typingsSlinky.reactCopyToClipboard.mod.Props
import typingsSlinky.reactCopyToClipboard.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCopyToClipboard {
  @JSImport("react-copy-to-clipboard", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def onCopy(value: (/* text */ String, /* result */ Boolean) => Unit): this.type = set("onCopy", js.Any.fromFunction2(value))
    @scala.inline
    def options(value: Options): this.type = set("options", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(text: String): Builder = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

