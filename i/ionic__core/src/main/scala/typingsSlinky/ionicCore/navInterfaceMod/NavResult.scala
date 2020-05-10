package typingsSlinky.ionicCore.navInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavResult extends js.Object {
  var direction: js.UndefOr[NavDirection] = js.native
  var enteringView: js.UndefOr[typingsSlinky.ionicCore.viewControllerMod.ViewController] = js.native
  var hasCompleted: Boolean = js.native
  var leavingView: js.UndefOr[typingsSlinky.ionicCore.viewControllerMod.ViewController] = js.native
  var requiresTransition: Boolean = js.native
}

object NavResult {
  @scala.inline
  def apply(hasCompleted: Boolean, requiresTransition: Boolean): NavResult = {
    val __obj = js.Dynamic.literal(hasCompleted = hasCompleted.asInstanceOf[js.Any], requiresTransition = requiresTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavResult]
  }
  @scala.inline
  implicit class NavResultOps[Self <: NavResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasCompleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiresTransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiresTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: NavDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withEnteringView(value: typingsSlinky.ionicCore.viewControllerMod.ViewController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enteringView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnteringView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enteringView")(js.undefined)
        ret
    }
    @scala.inline
    def withLeavingView(value: typingsSlinky.ionicCore.viewControllerMod.ViewController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leavingView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeavingView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leavingView")(js.undefined)
        ret
    }
  }
  
}

