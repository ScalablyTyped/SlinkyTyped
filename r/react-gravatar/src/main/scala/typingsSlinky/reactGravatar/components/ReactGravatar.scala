package typingsSlinky.reactGravatar.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactGravatar.mod.DefaultImage
import typingsSlinky.reactGravatar.mod.Props
import typingsSlinky.reactGravatar.mod.Rating
import typingsSlinky.reactGravatar.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactGravatar {
  @JSImport("react-gravatar", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def default(value: DefaultImage): this.type = set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def email(value: String): this.type = set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def md5(value: String): this.type = set("md5", value.asInstanceOf[js.Any])
    @scala.inline
    def protocol(value: String): this.type = set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def rating(value: Rating): this.type = set("rating", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactGravatar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

