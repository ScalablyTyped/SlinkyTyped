package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindMatchesParameters extends js.Object {
  /**
    * The value that is selected when tuning your transform for a balance between accuracy and cost. A value of 0.5 means that the system balances accuracy and cost concerns. A value of 1.0 means a bias purely for accuracy, which typically results in a higher cost, sometimes substantially higher. A value of 0.0 means a bias purely for cost, which results in a less accurate FindMatches transform, sometimes with unacceptable accuracy. Accuracy measures how well the transform finds true positives and true negatives. Increasing accuracy requires more machine resources and cost. But it also results in increased recall.  Cost measures how many compute resources, and thus money, are consumed to run the transform.
    */
  var AccuracyCostTradeoff: js.UndefOr[GenericBoundedDouble] = js.native
  /**
    * The value to switch on or off to force the output to match the provided labels from users. If the value is True, the find matches transform forces the output to match the provided labels. The results override the normal conflation results. If the value is False, the find matches transform does not ensure all the labels provided are respected, and the results rely on the trained model. Note that setting this value to true may increase the conflation execution time.
    */
  var EnforceProvidedLabels: js.UndefOr[NullableBoolean] = js.native
  /**
    * The value selected when tuning your transform for a balance between precision and recall. A value of 0.5 means no preference; a value of 1.0 means a bias purely for precision, and a value of 0.0 means a bias for recall. Because this is a tradeoff, choosing values close to 1.0 means very low recall, and choosing values close to 0.0 results in very low precision. The precision metric indicates how often your model is correct when it predicts a match.  The recall metric indicates that for an actual match, how often your model predicts the match.
    */
  var PrecisionRecallTradeoff: js.UndefOr[GenericBoundedDouble] = js.native
  /**
    * The name of a column that uniquely identifies rows in the source table. Used to help identify matching records.
    */
  var PrimaryKeyColumnName: js.UndefOr[ColumnNameString] = js.native
}

object FindMatchesParameters {
  @scala.inline
  def apply(): FindMatchesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindMatchesParameters]
  }
  @scala.inline
  implicit class FindMatchesParametersOps[Self <: FindMatchesParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccuracyCostTradeoff(value: GenericBoundedDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccuracyCostTradeoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccuracyCostTradeoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccuracyCostTradeoff")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforceProvidedLabels(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnforceProvidedLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceProvidedLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnforceProvidedLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecisionRecallTradeoff(value: GenericBoundedDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrecisionRecallTradeoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecisionRecallTradeoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrecisionRecallTradeoff")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryKeyColumnName(value: ColumnNameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryKeyColumnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryKeyColumnName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryKeyColumnName")(js.undefined)
        ret
    }
  }
  
}

