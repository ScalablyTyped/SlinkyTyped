package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.height
import typingsSlinky.reactNative.reactNativeStrings.padding
import typingsSlinky.reactNative.reactNativeStrings.position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardAvoidingViewProps extends ViewProps {
  var behavior: js.UndefOr[height | position | padding] = js.native
  /**
    * The style of the content container(View) when behavior is 'position'.
    */
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Enables or disables the KeyboardAvoidingView.
    *
    * Default is true
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * This is the distance between the top of the user screen and the react native view,
    * may be non-zero in some use cases.
    */
  var keyboardVerticalOffset: js.UndefOr[Double] = js.native
}

object KeyboardAvoidingViewProps {
  @scala.inline
  def apply(): KeyboardAvoidingViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardAvoidingViewProps]
  }
  @scala.inline
  implicit class KeyboardAvoidingViewPropsOps[Self <: KeyboardAvoidingViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBehavior(value: height | position | padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(js.undefined)
        ret
    }
    @scala.inline
    def withContentContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContentContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(null)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardVerticalOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardVerticalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardVerticalOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardVerticalOffset")(js.undefined)
        ret
    }
  }
  
}

