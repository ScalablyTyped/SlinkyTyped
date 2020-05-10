package typingsSlinky.materialUiCore.createPaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeAction extends js.Object {
  var active: String = js.native
  var disabled: String = js.native
  var disabledBackground: String = js.native
  var hover: String = js.native
  var hoverOpacity: Double = js.native
  var selected: String = js.native
}

object TypeAction {
  @scala.inline
  def apply(
    active: String,
    disabled: String,
    disabledBackground: String,
    hover: String,
    hoverOpacity: Double,
    selected: String
  ): TypeAction = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], disabledBackground = disabledBackground.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], hoverOpacity = hoverOpacity.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeAction]
  }
  @scala.inline
  implicit class TypeActionOps[Self <: TypeAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

