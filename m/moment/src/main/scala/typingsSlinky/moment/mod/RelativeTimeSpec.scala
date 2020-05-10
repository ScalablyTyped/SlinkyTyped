package typingsSlinky.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelativeTimeSpec extends js.Object {
  var M: js.UndefOr[RelativeTimeSpecVal] = js.native
  var MM: js.UndefOr[RelativeTimeSpecVal] = js.native
  var d: js.UndefOr[RelativeTimeSpecVal] = js.native
  var dd: js.UndefOr[RelativeTimeSpecVal] = js.native
  var future: js.UndefOr[RelativeTimeFuturePastVal] = js.native
  var h: js.UndefOr[RelativeTimeSpecVal] = js.native
  var hh: js.UndefOr[RelativeTimeSpecVal] = js.native
  var m: js.UndefOr[RelativeTimeSpecVal] = js.native
  var mm: js.UndefOr[RelativeTimeSpecVal] = js.native
  var past: js.UndefOr[RelativeTimeFuturePastVal] = js.native
  var s: js.UndefOr[RelativeTimeSpecVal] = js.native
  var ss: js.UndefOr[RelativeTimeSpecVal] = js.native
  var y: js.UndefOr[RelativeTimeSpecVal] = js.native
  var yy: js.UndefOr[RelativeTimeSpecVal] = js.native
}

object RelativeTimeSpec {
  @scala.inline
  def apply(): RelativeTimeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeTimeSpec]
  }
  @scala.inline
  implicit class RelativeTimeSpecOps[Self <: RelativeTimeSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withM(value: RelativeTimeSpecVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M")(js.undefined)
        ret
    }
    @scala.inline
    def withMMFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MM")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMM(value: RelativeTimeSpecVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MM")(js.undefined)
        ret
    }
    @scala.inline
    def withDFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withD(value: RelativeTimeSpecVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(js.undefined)
        ret
    }
    @scala.inline
    def withDdFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dd")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDd(value: RelativeTimeSpecVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dd")(js.undefined)
        ret
    }
    @scala.inline
    def withFutureFunction1(value: /* relTime */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("future")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFuture(value: RelativeTimeFuturePastVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("future")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFuture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("future")(js.undefined)
        ret
    }
    @scala.inline
    def withHFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withH(value: RelativeTimeSpecVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(js.undefined)
        ret
    }
    @scala.inline
    def withHhFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hh")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withHh(value: RelativeTimeSpecVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hh")(js.undefined)
        ret
    }
    @scala.inline
    def withPastFunction1(value: /* relTime */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("past")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPast(value: RelativeTimeFuturePastVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("past")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("past")(js.undefined)
        ret
    }
    @scala.inline
    def withSFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withS(value: RelativeTimeSpecVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(js.undefined)
        ret
    }
    @scala.inline
    def withSsFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ss")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSs(value: RelativeTimeSpecVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ss")(js.undefined)
        ret
    }
    @scala.inline
    def withYFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withY(value: RelativeTimeSpecVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withYyFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yy")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withYy(value: RelativeTimeSpecVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yy")(js.undefined)
        ret
    }
  }
  
}

