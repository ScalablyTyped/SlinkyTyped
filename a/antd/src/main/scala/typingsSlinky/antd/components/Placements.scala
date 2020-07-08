package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.placementsMod.AdjustOverflow
import typingsSlinky.antd.placementsMod.PlacementsConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Placements {
  @JSImport("antd/lib/tooltip/placements", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def arrowPointAtCenter(value: Boolean): this.type = set("arrowPointAtCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def arrowWidth(value: Double): this.type = set("arrowWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def autoAdjustOverflow(value: Boolean | AdjustOverflow): this.type = set("autoAdjustOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontalArrowShift(value: Double): this.type = set("horizontalArrowShift", value.asInstanceOf[js.Any])
    @scala.inline
    def verticalArrowShift(value: Double): this.type = set("verticalArrowShift", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PlacementsConfig): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Placements.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

