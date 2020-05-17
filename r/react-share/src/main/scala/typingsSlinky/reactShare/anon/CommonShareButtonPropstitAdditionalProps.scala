package typingsSlinky.reactShare.anon

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.StyleHTMLAttributes
import typingsSlinky.reactShare.reactShareStrings.screenCenter
import typingsSlinky.reactShare.reactShareStrings.windowCenter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-share.react-share.CommonShareButtonProps & {  title ? :string} */
@js.native
trait CommonShareButtonPropstitAdditionalProps extends js.Object {
  /**
    * An object to pass any additional properties, such as `aria-*` attributes.
    */
  var additionalProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  /**
    *  Takes a function that returns a Promise to be fulfilled before calling
    * `onClick`. If you do not return promise, `onClick` is called immediately.
    */
  var beforeOnClick: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.native
  /**
    * A class name to add to the others added by react-share (SocialMediaShareButton, ...).
    */
  var className: js.UndefOr[String] = js.native
  /** Disables click action and adds `disabled` class */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Style when button is disabled
    * @default { opacity: 0.6 }
    */
  var disabledStyle: js.UndefOr[StyleHTMLAttributes[HTMLDivElement]] = js.native
  /**
    * Click callback handler.
    */
  var onClick: js.UndefOr[js.Function1[/* link */ String, Unit]] = js.native
  /**
    * Takes a function to be called after closing share dialog.
    */
  var onShareWindowClose: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * If false, does not open a new window and call the onClick callback instead.
    * @default true
    */
  var openWindow: js.UndefOr[Boolean] = js.native
  /**
    * The HTML role of the div.
    * @default "button"
    */
  var role: js.UndefOr[String] = js.native
  /**
    * Extra style for the button.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Indicates that its element can be focused, and where it participates in sequential keyboard
    * navigation.
    * @default "0"
    */
  var tabIndex: js.UndefOr[Double] = js.native
  /**
    * Title of the shared page. Note that if Pocket detects a title tag
    * on the page being saved, this parameter will be ignored
    * and the title tag of the saved page will be used instead.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * URL of the shared page
    */
  var url: String = js.native
  var windowHeight: js.UndefOr[Double] = js.native
  /**
    * Whether to center the share box respectively to the screen or to the window.
    * @default "windowCenter"
    */
  var windowPosition: js.UndefOr[windowCenter | screenCenter] = js.native
  var windowWidth: js.UndefOr[Double] = js.native
}

object CommonShareButtonPropstitAdditionalProps {
  @scala.inline
  def apply(url: String): CommonShareButtonPropstitAdditionalProps = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonShareButtonPropstitAdditionalProps]
  }
  @scala.inline
  implicit class CommonShareButtonPropstitAdditionalPropsOps[Self <: CommonShareButtonPropstitAdditionalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalProps(value: HTMLAttributes[HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalProps")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeOnClick(value: () => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOnClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledStyle(value: StyleHTMLAttributes[HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* link */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShareWindowClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShareWindowClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShareWindowClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShareWindowClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowPosition(value: windowCenter | screenCenter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowWidth")(js.undefined)
        ret
    }
  }
  
}

