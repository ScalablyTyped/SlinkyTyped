package typingsSlinky.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageTiming extends js.Object {
  var _startRender: js.UndefOr[Double | Null] = js.native
  /** A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.native
  /**
    * Content of the page loaded. Number of milliseconds since page load
    * started (`page.startedDateTime`).
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var onContentLoad: js.UndefOr[Double] = js.native
  /**
    * Page is loaded (`onLoad` event fired). Number of milliseconds since
    * page load started (`page.startedDateTime`).
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var onLoad: js.UndefOr[Double] = js.native
}

object PageTiming {
  @scala.inline
  def apply(): PageTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageTiming]
  }
  @scala.inline
  implicit class PageTimingOps[Self <: PageTiming] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_startRender(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_startRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_startRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_startRender")(js.undefined)
        ret
    }
    @scala.inline
    def with_startRenderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_startRender")(null)
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContentLoad(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnContentLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
  }
  
}

