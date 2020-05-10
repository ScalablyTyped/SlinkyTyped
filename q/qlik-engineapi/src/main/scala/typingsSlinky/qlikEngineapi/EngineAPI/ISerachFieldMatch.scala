package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SerachFieldMatch...
  */
@js.native
trait ISerachFieldMatch extends js.Object {
  /**
    * Position of the field in the list of fields, starting from 0.
    * The list of fields is defined in qResults/qFieldNames and contains the search associations.
    */
  var qField: Double = js.native
  /**
    * Number of search hits in the field.
    * The number of values in qValues and the value of qNoOfMatches are equal if qMaxNbrFieldMatches is -1.
    */
  var qNoOfMatches: Double = js.native
  /**
    * Positions of the search terms, starting from 0.
    */
  var qTerms: js.Array[Double] = js.native
  /**
    * Positions of the matching values in the search results.
    * The maximum number of values in this list is defined by qMaxNbrFieldMatches.
    */
  var qValues: js.Array[Double] = js.native
}

object ISerachFieldMatch {
  @scala.inline
  def apply(qField: Double, qNoOfMatches: Double, qTerms: js.Array[Double], qValues: js.Array[Double]): ISerachFieldMatch = {
    val __obj = js.Dynamic.literal(qField = qField.asInstanceOf[js.Any], qNoOfMatches = qNoOfMatches.asInstanceOf[js.Any], qTerms = qTerms.asInstanceOf[js.Any], qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISerachFieldMatch]
  }
  @scala.inline
  implicit class ISerachFieldMatchOps[Self <: ISerachFieldMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQField(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQNoOfMatches(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNoOfMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTerms(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTerms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQValues(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

