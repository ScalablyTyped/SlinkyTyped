package typingsSlinky.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationOptions extends js.Object {
  /**
    * Configure what animates when modal is dismissed
    */
  var dismissModal: js.UndefOr[ScreenAnimationOptions] = js.native
  /**
    * Configure what animates when a screen is popped
    */
  var pop: js.UndefOr[StackAnimationOptions] = js.native
  /**
    * Configure what animates when a screen is pushed
    */
  var push: js.UndefOr[StackAnimationOptions] = js.native
  /**
    * Configure the setRoot animation
    */
  var setRoot: js.UndefOr[ScreenAnimationOptions] = js.native
  /**
    * Configure what animates when modal is shown
    */
  var showModal: js.UndefOr[ScreenAnimationOptions] = js.native
}

object AnimationOptions {
  @scala.inline
  def apply(): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptions]
  }
  @scala.inline
  implicit class AnimationOptionsOps[Self <: AnimationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDismissModal(value: ScreenAnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissModal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissModal")(js.undefined)
        ret
    }
    @scala.inline
    def withPop(value: StackAnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(js.undefined)
        ret
    }
    @scala.inline
    def withPush(value: StackAnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRoot(value: ScreenAnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withShowModal(value: ScreenAnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showModal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showModal")(js.undefined)
        ret
    }
  }
  
}

