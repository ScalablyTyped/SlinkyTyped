package typingsSlinky.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectPHIResponse extends js.Object {
  /**
    *  The collection of PHI entities extracted from the input text and their associated information. For each entity, the response provides the entity text, the entity category, where the entity text begins and ends, and the level of confidence that Amazon Comprehend Medical has in its detection. 
    */
  var Entities: EntityList = js.native
  /**
    * The version of the model used to analyze the documents. The version number looks like X.X.X. You can use this information to track the model used for a particular batch of documents.
    */
  var ModelVersion: String = js.native
  /**
    *  If the result of the previous request to DetectPHI was truncated, include the PaginationToken to fetch the next page of PHI entities. 
    */
  var PaginationToken: js.UndefOr[String] = js.native
}

object DetectPHIResponse {
  @scala.inline
  def apply(Entities: EntityList, ModelVersion: String): DetectPHIResponse = {
    val __obj = js.Dynamic.literal(Entities = Entities.asInstanceOf[js.Any], ModelVersion = ModelVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectPHIResponse]
  }
  @scala.inline
  implicit class DetectPHIResponseOps[Self <: DetectPHIResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntities(value: EntityList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaginationToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationToken")(js.undefined)
        ret
    }
  }
  
}

