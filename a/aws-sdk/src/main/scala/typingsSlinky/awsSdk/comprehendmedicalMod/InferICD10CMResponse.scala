package typingsSlinky.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferICD10CMResponse extends js.Object {
  /**
    * The medical conditions detected in the text linked to ICD-10-CM concepts. If the action is successful, the service sends back an HTTP 200 response, as well as the entities detected.
    */
  var Entities: ICD10CMEntityList = js.native
  /**
    * The version of the model used to analyze the documents, in the format n.n.n You can use this information to track the model used for a particular batch of documents.
    */
  var ModelVersion: js.UndefOr[String] = js.native
  /**
    * If the result of the previous request to InferICD10CM was truncated, include the PaginationToken to fetch the next page of medical condition entities. 
    */
  var PaginationToken: js.UndefOr[String] = js.native
}

object InferICD10CMResponse {
  @scala.inline
  def apply(Entities: ICD10CMEntityList): InferICD10CMResponse = {
    val __obj = js.Dynamic.literal(Entities = Entities.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferICD10CMResponse]
  }
  @scala.inline
  implicit class InferICD10CMResponseOps[Self <: InferICD10CMResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntities(value: ICD10CMEntityList): Self = {
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
    def withoutModelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelVersion")(js.undefined)
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

