package typingsSlinky.featherlight.Featherlight

import typingsSlinky.featherlight.JQuery
import typingsSlinky.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentFilter extends js.Object {
  var process: js.UndefOr[js.Function1[/* data */ JQuery | String, JQuery | JQueryPromise[JQuery]]] = js.native
  var regex: js.UndefOr[js.RegExp] = js.native
  var test: js.UndefOr[js.Function1[/* data */ JQuery | String, Boolean]] = js.native
}

object ContentFilter {
  @scala.inline
  def apply(): ContentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentFilter]
  }
  @scala.inline
  implicit class ContentFilterOps[Self <: ContentFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcess(value: /* data */ JQuery | String => JQuery | JQueryPromise[JQuery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.undefined)
        ret
    }
    @scala.inline
    def withRegex(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(js.undefined)
        ret
    }
    @scala.inline
    def withTest(value: /* data */ JQuery | String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.undefined)
        ret
    }
  }
  
}

