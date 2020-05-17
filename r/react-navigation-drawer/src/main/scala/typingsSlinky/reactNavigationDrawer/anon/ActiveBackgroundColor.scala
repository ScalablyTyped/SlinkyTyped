package typingsSlinky.reactNavigationDrawer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveBackgroundColor extends js.Object {
  var activeBackgroundColor: Dark = js.native
  var activeTintColor: Dark = js.native
  var inactiveBackgroundColor: Dark = js.native
  var inactiveTintColor: Dark = js.native
}

object ActiveBackgroundColor {
  @scala.inline
  def apply(
    activeBackgroundColor: Dark,
    activeTintColor: Dark,
    inactiveBackgroundColor: Dark,
    inactiveTintColor: Dark
  ): ActiveBackgroundColor = {
    val __obj = js.Dynamic.literal(activeBackgroundColor = activeBackgroundColor.asInstanceOf[js.Any], activeTintColor = activeTintColor.asInstanceOf[js.Any], inactiveBackgroundColor = inactiveBackgroundColor.asInstanceOf[js.Any], inactiveTintColor = inactiveTintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveBackgroundColor]
  }
  @scala.inline
  implicit class ActiveBackgroundColorOps[Self <: ActiveBackgroundColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveBackgroundColor(value: Dark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveTintColor(value: Dark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactiveBackgroundColor(value: Dark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactiveTintColor(value: Dark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveTintColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

