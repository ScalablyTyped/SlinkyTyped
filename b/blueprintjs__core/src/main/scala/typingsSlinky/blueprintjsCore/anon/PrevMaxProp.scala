package typingsSlinky.blueprintjsCore.anon

import typingsSlinky.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrevMaxProp extends js.Object {
  var prevMaxProp: Double = js.native
  var prevMinProp: Double = js.native
  var prevValueProp: ReactText = js.native
  var stepMaxPrecision: Double = js.native
  var value: String = js.native
}

object PrevMaxProp {
  @scala.inline
  def apply(
    prevMaxProp: Double,
    prevMinProp: Double,
    prevValueProp: ReactText,
    stepMaxPrecision: Double,
    value: String
  ): PrevMaxProp = {
    val __obj = js.Dynamic.literal(prevMaxProp = prevMaxProp.asInstanceOf[js.Any], prevMinProp = prevMinProp.asInstanceOf[js.Any], prevValueProp = prevValueProp.asInstanceOf[js.Any], stepMaxPrecision = stepMaxPrecision.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevMaxProp]
  }
  @scala.inline
  implicit class PrevMaxPropOps[Self <: PrevMaxProp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrevMaxProp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevMaxProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevMinProp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevMinProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevValueProp(value: ReactText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevValueProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepMaxPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepMaxPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

