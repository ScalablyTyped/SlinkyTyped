package typingsSlinky.aliApp.anon

import typingsSlinky.aliApp.aliAppNumbers.`0`
import typingsSlinky.aliApp.aliAppNumbers.`1`
import typingsSlinky.aliApp.aliAppNumbers.`2`
import typingsSlinky.aliApp.aliAppNumbers.`3`
import typingsSlinky.aliApp.my.LocationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.GetLocationOptions> */
@js.native
trait PartialGetLocationOptions extends js.Object {
  var cacheTimeout: js.UndefOr[Double] = js.native
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var success: js.UndefOr[js.Function1[/* res */ LocationData, Unit]] = js.native
  var `type`: js.UndefOr[`0` | `1` | `2` | `3`] = js.native
}

object PartialGetLocationOptions {
  @scala.inline
  def apply(): PartialGetLocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGetLocationOptions]
  }
  @scala.inline
  implicit class PartialGetLocationOptionsOps[Self <: PartialGetLocationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: /* res */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: /* res */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ LocationData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: `0` | `1` | `2` | `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

