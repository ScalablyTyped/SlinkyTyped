package typingsSlinky.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberInternalSlots extends js.Object {
  var ild: NumberILD = js.native
  var nu: js.Array[String] = js.native
  var patterns: NumberLocalePatternData = js.native
}

object NumberInternalSlots {
  @scala.inline
  def apply(ild: NumberILD, nu: js.Array[String], patterns: NumberLocalePatternData): NumberInternalSlots = {
    val __obj = js.Dynamic.literal(ild = ild.asInstanceOf[js.Any], nu = nu.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberInternalSlots]
  }
  @scala.inline
  implicit class NumberInternalSlotsOps[Self <: NumberInternalSlots] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIld(value: NumberILD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNu(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatterns(value: NumberLocalePatternData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

