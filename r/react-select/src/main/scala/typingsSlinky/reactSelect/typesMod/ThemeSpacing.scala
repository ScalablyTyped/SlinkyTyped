package typingsSlinky.reactSelect.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeSpacing extends js.Object {
  var baseUnit: Double = js.native
  var controlHeight: Double = js.native
  var menuGutter: Double = js.native
}

object ThemeSpacing {
  @scala.inline
  def apply(baseUnit: Double, controlHeight: Double, menuGutter: Double): ThemeSpacing = {
    val __obj = js.Dynamic.literal(baseUnit = baseUnit.asInstanceOf[js.Any], controlHeight = controlHeight.asInstanceOf[js.Any], menuGutter = menuGutter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeSpacing]
  }
  @scala.inline
  implicit class ThemeSpacingOps[Self <: ThemeSpacing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuGutter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuGutter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

