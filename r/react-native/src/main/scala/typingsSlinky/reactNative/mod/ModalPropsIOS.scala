package typingsSlinky.reactNative.mod

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.reactNativeStrings.`landscape-left`
import typingsSlinky.reactNative.reactNativeStrings.`landscape-right`
import typingsSlinky.reactNative.reactNativeStrings.`portrait-upside-down`
import typingsSlinky.reactNative.reactNativeStrings.formSheet
import typingsSlinky.reactNative.reactNativeStrings.fullScreen
import typingsSlinky.reactNative.reactNativeStrings.landscape
import typingsSlinky.reactNative.reactNativeStrings.overFullScreen
import typingsSlinky.reactNative.reactNativeStrings.pageSheet
import typingsSlinky.reactNative.reactNativeStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalPropsIOS extends js.Object {
  /**
    * The `onDismiss` prop allows passing a function that will be called once the modal has been dismissed.
    */
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The `onOrientationChange` callback is called when the orientation changes while the modal is being displayed.
    * The orientation provided is only 'portrait' or 'landscape'. This callback is also called on initial render, regardless of the current orientation.
    */
  var onOrientationChange: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, _], Unit]] = js.native
  /**
    * The `presentationStyle` determines the style of modal to show
    */
  var presentationStyle: js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen] = js.native
  /**
    * The `supportedOrientations` prop allows the modal to be rotated to any of the specified orientations.
    * On iOS, the modal is still restricted by what's specified in your app's Info.plist's UISupportedInterfaceOrientations field.
    */
  var supportedOrientations: js.UndefOr[
    js.Array[
      portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
    ]
  ] = js.native
}

object ModalPropsIOS {
  @scala.inline
  def apply(): ModalPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalPropsIOS]
  }
  @scala.inline
  implicit class ModalPropsIOSOps[Self <: ModalPropsIOS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOrientationChange(value: SyntheticEvent[NodeHandle, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOrientationChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOrientationChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOrientationChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPresentationStyle(value: fullScreen | pageSheet | formSheet | overFullScreen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresentationStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedOrientations(
      value: js.Array[
          portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedOrientations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedOrientations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedOrientations")(js.undefined)
        ret
    }
  }
  
}

