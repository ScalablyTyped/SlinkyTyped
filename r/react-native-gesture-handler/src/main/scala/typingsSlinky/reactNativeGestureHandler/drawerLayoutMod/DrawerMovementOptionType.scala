package typingsSlinky.reactNativeGestureHandler.drawerLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerMovementOptionType extends js.Object {
  var velocity: js.UndefOr[Double] = js.native
}

object DrawerMovementOptionType {
  @scala.inline
  def apply(): DrawerMovementOptionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerMovementOptionType]
  }
  @scala.inline
  implicit class DrawerMovementOptionTypeOps[Self <: DrawerMovementOptionType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocity")(js.undefined)
        ret
    }
  }
  
}

