package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.slideInMod.SlideInProps
import typingsSlinky.materialUi.slideInMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SlideIn {
  @JSImport("material-ui/internal/SlideIn", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def childStyle(value: CSSProperties): this.type = set("childStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: typingsSlinky.materialUi.MaterialUI.propTypes.direction): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def enterDelay(value: Double): this.type = set("enterDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SlideInProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SlideIn.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

