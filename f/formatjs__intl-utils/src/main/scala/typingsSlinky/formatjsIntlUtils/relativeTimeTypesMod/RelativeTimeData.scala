package typingsSlinky.formatjsIntlUtils.relativeTimeTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ u in @formatjs/intl-utils.@formatjs/intl-utils/dist/plural-rules-types.LDMLPluralRule ]:? string} */
@js.native
trait RelativeTimeData extends js.Object {
  var few: js.UndefOr[String] = js.native
  var many: js.UndefOr[String] = js.native
  var one: js.UndefOr[String] = js.native
  var other: js.UndefOr[String] = js.native
  var two: js.UndefOr[String] = js.native
  var zero: js.UndefOr[String] = js.native
}

object RelativeTimeData {
  @scala.inline
  def apply(): RelativeTimeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeTimeData]
  }
  @scala.inline
  implicit class RelativeTimeDataOps[Self <: RelativeTimeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFew(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("few")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("few")(js.undefined)
        ret
    }
    @scala.inline
    def withMany(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("many")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("many")(js.undefined)
        ret
    }
    @scala.inline
    def withOne(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("one")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("one")(js.undefined)
        ret
    }
    @scala.inline
    def withOther(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOther: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(js.undefined)
        ret
    }
    @scala.inline
    def withTwo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("two")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("two")(js.undefined)
        ret
    }
    @scala.inline
    def withZero(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZero: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zero")(js.undefined)
        ret
    }
  }
  
}

