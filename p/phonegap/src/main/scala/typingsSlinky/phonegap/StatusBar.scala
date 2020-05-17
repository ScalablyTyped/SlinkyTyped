package typingsSlinky.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Defined in lib.d.ts
interface LocalStorage {
  key;
  getItem;
  setItem;
  removeItem;
  clear;
}
*/
@js.native
trait StatusBar extends js.Object {
  var isVisible: Boolean = js.native
  def backgroundColorByHexString(hexString: String): Unit = js.native
  def backgroundColorByName(colorname: String): Unit = js.native
  def hide(): Unit = js.native
  def overlaysWebView(doOverlay: Boolean): Unit = js.native
  def show(): Unit = js.native
  def styleBlackOpaque(): Unit = js.native
  def styleBlackTranslucent(): Unit = js.native
  def styleDefault(): Unit = js.native
  def styleLightContent(): Unit = js.native
}

object StatusBar {
  @scala.inline
  def apply(
    backgroundColorByHexString: String => Unit,
    backgroundColorByName: String => Unit,
    hide: () => Unit,
    isVisible: Boolean,
    overlaysWebView: Boolean => Unit,
    show: () => Unit,
    styleBlackOpaque: () => Unit,
    styleBlackTranslucent: () => Unit,
    styleDefault: () => Unit,
    styleLightContent: () => Unit
  ): StatusBar = {
    val __obj = js.Dynamic.literal(backgroundColorByHexString = js.Any.fromFunction1(backgroundColorByHexString), backgroundColorByName = js.Any.fromFunction1(backgroundColorByName), hide = js.Any.fromFunction0(hide), isVisible = isVisible.asInstanceOf[js.Any], overlaysWebView = js.Any.fromFunction1(overlaysWebView), show = js.Any.fromFunction0(show), styleBlackOpaque = js.Any.fromFunction0(styleBlackOpaque), styleBlackTranslucent = js.Any.fromFunction0(styleBlackTranslucent), styleDefault = js.Any.fromFunction0(styleDefault), styleLightContent = js.Any.fromFunction0(styleLightContent))
    __obj.asInstanceOf[StatusBar]
  }
  @scala.inline
  implicit class StatusBarOps[Self <: StatusBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColorByHexString(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorByHexString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBackgroundColorByName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlaysWebView(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlaysWebView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStyleBlackOpaque(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBlackOpaque")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStyleBlackTranslucent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleBlackTranslucent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStyleDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStyleLightContent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleLightContent")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

