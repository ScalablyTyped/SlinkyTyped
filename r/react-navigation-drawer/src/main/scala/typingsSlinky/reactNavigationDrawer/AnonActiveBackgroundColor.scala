package typingsSlinky.reactNavigationDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActiveBackgroundColor extends js.Object {
  var activeBackgroundColor: AnonDark = js.native
  var activeTintColor: AnonDark = js.native
  var inactiveBackgroundColor: AnonDark = js.native
  var inactiveTintColor: AnonDark = js.native
}

object AnonActiveBackgroundColor {
  @scala.inline
  def apply(
    activeBackgroundColor: AnonDark,
    activeTintColor: AnonDark,
    inactiveBackgroundColor: AnonDark,
    inactiveTintColor: AnonDark
  ): AnonActiveBackgroundColor = {
    val __obj = js.Dynamic.literal(activeBackgroundColor = activeBackgroundColor.asInstanceOf[js.Any], activeTintColor = activeTintColor.asInstanceOf[js.Any], inactiveBackgroundColor = inactiveBackgroundColor.asInstanceOf[js.Any], inactiveTintColor = inactiveTintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActiveBackgroundColor]
  }
  @scala.inline
  implicit class AnonActiveBackgroundColorOps[Self <: AnonActiveBackgroundColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveBackgroundColor(value: AnonDark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveTintColor(value: AnonDark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactiveBackgroundColor(value: AnonDark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactiveTintColor(value: AnonDark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveTintColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

