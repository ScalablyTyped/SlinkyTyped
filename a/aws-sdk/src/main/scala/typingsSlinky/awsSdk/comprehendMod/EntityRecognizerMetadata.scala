package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityRecognizerMetadata extends js.Object {
  /**
    * Entity types from the metadata of an entity recognizer.
    */
  var EntityTypes: js.UndefOr[EntityRecognizerMetadataEntityTypesList] = js.native
  /**
    * Detailed information about the accuracy of an entity recognizer.
    */
  var EvaluationMetrics: js.UndefOr[EntityRecognizerEvaluationMetrics] = js.native
  /**
    *  The number of documents in the input data that were used to test the entity recognizer. Typically this is 10 to 20 percent of the input documents.
    */
  var NumberOfTestDocuments: js.UndefOr[Integer] = js.native
  /**
    *  The number of documents in the input data that were used to train the entity recognizer. Typically this is 80 to 90 percent of the input documents.
    */
  var NumberOfTrainedDocuments: js.UndefOr[Integer] = js.native
}

object EntityRecognizerMetadata {
  @scala.inline
  def apply(): EntityRecognizerMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityRecognizerMetadata]
  }
  @scala.inline
  implicit class EntityRecognizerMetadataOps[Self <: EntityRecognizerMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityTypes(value: EntityRecognizerMetadataEntityTypesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withEvaluationMetrics(value: EntityRecognizerEvaluationMetrics): Self = {
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

