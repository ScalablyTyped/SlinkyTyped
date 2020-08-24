package typingsSlinky.bizcharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antvG2.mod.AxisGrid
import typingsSlinky.antvG2.mod.AxisLabel
import typingsSlinky.antvG2.mod.AxisTitle
import typingsSlinky.antvG2.mod.Styles.tickLine
import typingsSlinky.bizcharts.mod.AxisProps
import typingsSlinky.bizcharts.mod.PositionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Axis {
  @JSImport("bizcharts", "Axis")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.bizcharts.mod.Axis] {
    @scala.inline
    def grid(value: AxisGrid): this.type = set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def gridNull: this.type = set("grid", null)
    @scala.inline
    def label(value: AxisLabel): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def labelNull: this.type = set("label", null)
    @scala.inline
    def line(value: typingsSlinky.antvG2.mod.Styles.line): this.type = set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def lineNull: this.type = set("line", null)
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def position(value: PositionType): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def subTickCount(value: Double): this.type = set("subTickCount", value.asInstanceOf[js.Any])
    @scala.inline
    def subTickLine(value: tickLine): this.type = set("subTickLine", value.asInstanceOf[js.Any])
    @scala.inline
    def tickLine(value: typingsSlinky.antvG2.mod.Styles.tickLine): this.type = set("tickLine", value.asInstanceOf[js.Any])
    @scala.inline
    def tickLineNull: this.type = set("tickLine", null)
    @scala.inline
    def title(value: AxisTitle | Boolean): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleNull: this.type = set("title", null)
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AxisProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Axis.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

