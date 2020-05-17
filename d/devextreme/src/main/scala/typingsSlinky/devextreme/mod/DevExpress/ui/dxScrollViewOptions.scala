package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.ComponentDxScrollView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxScrollViewOptions extends dxScrollableOptions[dxScrollView] {
  /** A function that is executed when the "pull to refresh" gesture is performed. Supported in mobile themes only. */
  var onPullDown: js.UndefOr[js.Function1[/* e */ ComponentDxScrollView, _]] = js.native
  /** A function that is executed when the content is scrolled down to the bottom. */
  var onReachBottom: js.UndefOr[js.Function1[/* e */ ComponentDxScrollView, _]] = js.native
  /** Specifies the text shown in the pullDown panel when pulling the content down lowers the refresh threshold. */
  var pulledDownText: js.UndefOr[String] = js.native
  /** Specifies the text shown in the pullDown panel while pulling the content down to the refresh threshold. */
  var pullingDownText: js.UndefOr[String] = js.native
  /** Specifies the text shown in the pullDown panel displayed when content is scrolled to the bottom. */
  var reachBottomText: js.UndefOr[String] = js.native
  /** Specifies the text shown in the pullDown panel displayed when the content is being refreshed. */
  var refreshingText: js.UndefOr[String] = js.native
}

object dxScrollViewOptions {
  @scala.inline
  def apply(): dxScrollViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxScrollViewOptions]
  }
  @scala.inline
  implicit class dxScrollViewOptionsOps[Self <: dxScrollViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnPullDown(value: /* e */ ComponentDxScrollView => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPullDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReachBottom(value: /* e */ ComponentDxScrollView => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReachBottom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReachBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReachBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withPulledDownText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulledDownText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPulledDownText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulledDownText")(js.undefined)
        ret
    }
    @scala.inline
    def withPullingDownText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullingDownText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullingDownText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullingDownText")(js.undefined)
        ret
    }
    @scala.inline
    def withReachBottomText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachBottomText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReachBottomText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachBottomText")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshingText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshingText")(js.undefined)
        ret
    }
  }
  
}

