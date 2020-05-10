package typingsSlinky.momentMini.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelativeTimeSpec extends js.Object {
  var M: RelativeTimeSpecVal = js.native
  var MM: RelativeTimeSpecVal = js.native
  var d: RelativeTimeSpecVal = js.native
  var dd: RelativeTimeSpecVal = js.native
  var future: RelativeTimeFuturePastVal = js.native
  var h: RelativeTimeSpecVal = js.native
  var hh: RelativeTimeSpecVal = js.native
  var m: RelativeTimeSpecVal = js.native
  var mm: RelativeTimeSpecVal = js.native
  var past: RelativeTimeFuturePastVal = js.native
  var s: RelativeTimeSpecVal = js.native
  var ss: RelativeTimeSpecVal = js.native
  var y: RelativeTimeSpecVal = js.native
  var yy: RelativeTimeSpecVal = js.native
}

object RelativeTimeSpec {
  @scala.inline
  def apply(
    M: RelativeTimeSpecVal,
    MM: RelativeTimeSpecVal,
    d: RelativeTimeSpecVal,
    dd: RelativeTimeSpecVal,
    future: RelativeTimeFuturePastVal,
    h: RelativeTimeSpecVal,
    hh: RelativeTimeSpecVal,
    m: RelativeTimeSpecVal,
    mm: RelativeTimeSpecVal,
    past: RelativeTimeFuturePastVal,
    s: RelativeTimeSpecVal,
    ss: RelativeTimeSpecVal,
    y: RelativeTimeSpecVal,
    yy: RelativeTimeSpecVal
  ): RelativeTimeSpec = {
    val __obj = js.Dynamic.literal(M = M.asInstanceOf[js.Any], MM = MM.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hh = hh.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], mm = mm.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yy = yy.asInstanceOf[js.Any])
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
  }
  
}

