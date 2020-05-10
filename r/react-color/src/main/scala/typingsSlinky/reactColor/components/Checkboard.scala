package typingsSlinky.reactColor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactColor.checkboardMod.CheckboardProps
import typingsSlinky.reactColor.checkboardMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Checkboard {
  @JSImport("react-color/lib/components/common/Checkboard", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def grey(value: String): this.type = set("grey", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def white(value: String): this.type = set("white", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CheckboardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Checkboard.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

