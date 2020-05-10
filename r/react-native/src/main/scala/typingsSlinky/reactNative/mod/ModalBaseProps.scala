package typingsSlinky.reactNative.mod

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.reactNativeStrings.fade
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalBaseProps extends js.Object {
  /**
    * @deprecated Use animationType instead
    */
  var animated: js.UndefOr[Boolean] = js.native
  /**
    * The `animationType` prop controls how the modal animates.
    *
    * - `slide` slides in from the bottom
    * - `fade` fades into view
    * - `none` appears without an animation
    */
  var animationType: js.UndefOr[none | slide | fade] = js.native
  /**
    * The `onRequestClose` prop allows passing a function that will be called once the modal has been dismissed.
    * _On the Android platform, this is a required function._
    */
  var onRequestClose: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The `onShow` prop allows passing a function that will be called once the modal has been shown.
    */
  var onShow: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, _], Unit]] = js.native
  /**
    * The `transparent` prop determines whether your modal will fill the entire view.
    * Setting this to `true` will render the modal over a transparent background.
    */
  var transparent: js.UndefOr[Boolean] = js.native
  /**
    * The `visible` prop determines whether your modal is visible.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object ModalBaseProps {
  @scala.inline
  def apply(): ModalBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalBaseProps]
  }
  @scala.inline
  implicit class ModalBasePropsOps[Self <: ModalBaseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationType(value: none | slide | fade): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationType")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRequestClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRequestClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: SyntheticEvent[NodeHandle, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

