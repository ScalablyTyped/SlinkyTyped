package typingsSlinky.rrule.yearinfoMod

import typingsSlinky.rrule.rruleNumbers.`365`
import typingsSlinky.rrule.rruleNumbers.`366`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YearInfo extends js.Object {
  var mdaymask: js.Array[Double] = js.native
  var mmask: js.Array[Double] = js.native
  var mrange: js.Array[Double] = js.native
  var nextyearlen: `365` | `366` = js.native
  var nmdaymask: js.Array[Double] = js.native
  var wdaymask: js.Array[Double] = js.native
  var wnomask: js.Array[Double] | Null = js.native
  var yearlen: `365` | `366` = js.native
  var yearordinal: Double = js.native
  var yearweekday: Double = js.native
}

object YearInfo {
  @scala.inline
  def apply(
    mdaymask: js.Array[Double],
    mmask: js.Array[Double],
    mrange: js.Array[Double],
    nextyearlen: `365` | `366`,
    nmdaymask: js.Array[Double],
    wdaymask: js.Array[Double],
    yearlen: `365` | `366`,
    yearordinal: Double,
    yearweekday: Double
  ): YearInfo = {
    val __obj = js.Dynamic.literal(mdaymask = mdaymask.asInstanceOf[js.Any], mmask = mmask.asInstanceOf[js.Any], mrange = mrange.asInstanceOf[js.Any], nextyearlen = nextyearlen.asInstanceOf[js.Any], nmdaymask = nmdaymask.asInstanceOf[js.Any], wdaymask = wdaymask.asInstanceOf[js.Any], yearlen = yearlen.asInstanceOf[js.Any], yearordinal = yearordinal.asInstanceOf[js.Any], yearweekday = yearweekday.asInstanceOf[js.Any])
    __obj.asInstanceOf[YearInfo]
  }
  @scala.inline
  implicit class YearInfoOps[Self <: YearInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMdaymask(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdaymask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMmask(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mmask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMrange(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mrange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextyearlen(value: `365` | `366`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextyearlen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNmdaymask(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nmdaymask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWdaymask(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wdaymask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYearlen(value: `365` | `366`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearlen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYearordinal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearordinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYearweekday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearweekday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWnomask(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wnomask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWnomaskNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wnomask")(null)
        ret
    }
  }
  
}

