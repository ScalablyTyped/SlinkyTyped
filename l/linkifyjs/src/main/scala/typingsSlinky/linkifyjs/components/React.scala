package typingsSlinky.linkifyjs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.linkifyjs.mod.Options
import typingsSlinky.linkifyjs.reactMod.LinkifyProps
import typingsSlinky.linkifyjs.reactMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object React {
  @JSImport("linkifyjs/react", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def options(value: Options): this.type = set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def tagName(value: String): this.type = set("tagName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LinkifyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: React.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

