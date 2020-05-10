package typingsSlinky.ionicCore.navInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionInstruction extends js.Object {
  var done: js.UndefOr[TransitionDoneFn] = js.native
  var enteringRequiresTransition: js.UndefOr[Boolean] = js.native
  var insertStart: js.UndefOr[Double] = js.native
  var insertViews: js.UndefOr[js.Array[_]] = js.native
  var leavingRequiresTransition: js.UndefOr[Boolean] = js.native
  var opts: js.UndefOr[NavOptions | Null] = js.native
  var reject: js.UndefOr[js.Function1[/* rejectReason */ String, Unit]] = js.native
  var removeCount: js.UndefOr[Double] = js.native
  var removeStart: js.UndefOr[Double] = js.native
  var removeView: js.UndefOr[typingsSlinky.ionicCore.viewControllerMod.ViewController] = js.native
  var resolve: js.UndefOr[js.Function1[/* hasCompleted */ Boolean, Unit]] = js.native
}

object TransitionInstruction {
  @scala.inline
  def apply(): TransitionInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionInstruction]
  }
  @scala.inline
  implicit class TransitionInstructionOps[Self <: TransitionInstruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDone(
      value: (/* hasCompleted */ Boolean, /* requiresTransition */ Boolean, /* enteringView */ js.UndefOr[typingsSlinky.ionicCore.viewControllerMod.ViewController], /* leavingView */ js.UndefOr[typingsSlinky.ionicCore.viewControllerMod.ViewController], /* direction */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withEnteringRequiresTransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enteringRequiresTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnteringRequiresTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enteringRequiresTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertStart")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertViews(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertViews")(js.undefined)
        ret
    }
    @scala.inline
    def withLeavingRequiresTransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leavingRequiresTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeavingRequiresTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leavingRequiresTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withOpts(value: NavOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(js.undefined)
        ret
    }
    @scala.inline
    def withOptsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(null)
        ret
    }
    @scala.inline
    def withReject(value: /* rejectReason */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveView(value: typingsSlinky.ionicCore.viewControllerMod.ViewController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeView")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(value: /* hasCompleted */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.undefined)
        ret
    }
  }
  
}

