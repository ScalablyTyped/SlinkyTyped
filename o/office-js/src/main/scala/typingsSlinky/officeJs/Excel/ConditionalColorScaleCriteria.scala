package typingsSlinky.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the criteria of the color scale.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalColorScaleCriteria extends js.Object {
  /**
    *
    * The maximum point Color Scale Criterion.
    *
    * [Api set: ExcelApi 1.6]
    */
  var maximum: ConditionalColorScaleCriterion = js.native
  /**
    *
    * The midpoint Color Scale Criterion if the color scale is a 3-color scale.
    *
    * [Api set: ExcelApi 1.6]
    */
  var midpoint: js.UndefOr[ConditionalColorScaleCriterion] = js.native
  /**
    *
    * The minimum point Color Scale Criterion.
    *
    * [Api set: ExcelApi 1.6]
    */
  var minimum: ConditionalColorScaleCriterion = js.native
}

object ConditionalColorScaleCriteria {
  @scala.inline
  def apply(maximum: ConditionalColorScaleCriterion, minimum: ConditionalColorScaleCriterion): ConditionalColorScaleCriteria = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalColorScaleCriteria]
  }
  @scala.inline
  implicit class ConditionalColorScaleCriteriaOps[Self <: ConditionalColorScaleCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximum(value: ConditionalColorScaleCriterion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimum(value: ConditionalColorScaleCriterion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMidpoint(value: ConditionalColorScaleCriterion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMidpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midpoint")(js.undefined)
        ret
    }
  }
  
}

