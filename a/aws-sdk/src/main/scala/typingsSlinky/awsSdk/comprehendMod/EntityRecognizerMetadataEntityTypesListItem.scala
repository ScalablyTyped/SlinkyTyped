package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityRecognizerMetadataEntityTypesListItem extends js.Object {
  /**
    * Detailed information about the accuracy of the entity recognizer for a specific item on the list of entity types. 
    */
  var EvaluationMetrics: js.UndefOr[EntityTypesEvaluationMetrics] = js.native
  /**
    * Indicates the number of times the given entity type was seen in the training data. 
    */
  var NumberOfTrainMentions: js.UndefOr[Integer] = js.native
  /**
    * Type of entity from the list of entity types in the metadata of an entity recognizer. 
    */
  var Type: js.UndefOr[AnyLengthString] = js.native
}

object EntityRecognizerMetadataEntityTypesListItem {
  @scala.inline
  def apply(): EntityRecognizerMetadataEntityTypesListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityRecognizerMetadataEntityTypesListItem]
  }
  @scala.inline
  implicit class EntityRecognizerMetadataEntityTypesListItemOps[Self <: EntityRecognizerMetadataEntityTypesListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvaluationMetrics(value: EntityTypesEvaluationMetrics): Self = {
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
    def withNumberOfTrainMentions(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfTrainMentions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfTrainMentions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfTrainMentions")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: AnyLengthString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

