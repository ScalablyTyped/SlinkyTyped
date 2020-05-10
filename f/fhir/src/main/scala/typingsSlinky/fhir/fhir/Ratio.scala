package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ratio of two Quantity values - a numerator and a denominator
  */
@js.native
trait Ratio extends Element {
  /**
    * Denominator value
    */
  var denominator: js.UndefOr[Quantity] = js.native
  /**
    * Numerator value
    */
  var numerator: js.UndefOr[Quantity] = js.native
}

object Ratio {
  @scala.inline
  def apply(): Ratio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ratio]
  }
  @scala.inline
  implicit class RatioOps[Self <: Ratio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDenominator(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("denominator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDenominator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("denominator")(js.undefined)
        ret
    }
    @scala.inline
    def withNumerator(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numerator")(js.undefined)
        ret
    }
  }
  
}

