package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifierMetadata extends js.Object {
  /**
    *  Describes the result metrics for the test data associated with an documentation classifier.
    */
  var EvaluationMetrics: js.UndefOr[ClassifierEvaluationMetrics] = js.native
  /**
    * The number of labels in the input data. 
    */
  var NumberOfLabels: js.UndefOr[Integer] = js.native
  /**
    * The number of documents in the input data that were used to test the classifier. Typically this is 10 to 20 percent of the input documents.
    */
  var NumberOfTestDocuments: js.UndefOr[Integer] = js.native
  /**
    * The number of documents in the input data that were used to train the classifier. Typically this is 80 to 90 percent of the input documents.
    */
  var NumberOfTrainedDocuments: js.UndefOr[Integer] = js.native
}

object ClassifierMetadata {
  @scala.inline
  def apply(): ClassifierMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifierMetadata]
  }
  @scala.inline
  implicit class ClassifierMetadataOps[Self <: ClassifierMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvaluationMetrics(value: ClassifierEvaluationMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfLabels(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfTestDocuments(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfTestDocuments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfTestDocuments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfTestDocuments")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfTrainedDocuments(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfTrainedDocuments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfTrainedDocuments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfTrainedDocuments")(js.undefined)
        ret
    }
  }
  
}

