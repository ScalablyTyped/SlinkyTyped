package typingsSlinky.reactSparklines.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSparklines.mod.Point
import typingsSlinky.reactSparklines.mod.SparklinesTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SparklinesText {
  @JSImport("react-sparklines", "SparklinesText")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSparklines.mod.SparklinesText] {
    @scala.inline
    def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def fontSize(value: Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def point(value: Point): this.type = set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SparklinesTextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SparklinesText.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

