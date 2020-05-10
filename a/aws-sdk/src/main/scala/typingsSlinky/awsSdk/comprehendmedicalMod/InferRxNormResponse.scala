package typingsSlinky.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferRxNormResponse extends js.Object {
  /**
    * The medication entities detected in the text linked to RxNorm concepts. If the action is successful, the service sends back an HTTP 200 response, as well as the entities detected.
    */
  var Entities: RxNormEntityList = js.native
  /**
    * The version of the model used to analyze the documents, in the format n.n.n You can use this information to track the model used for a particular batch of documents.
    */
  var ModelVersion: js.UndefOr[String] = js.native
  /**
    * If the result of the previous request to InferRxNorm was truncated, include the PaginationToken to fetch the next page of medication entities.
    */
  var PaginationToken: js.UndefOr[String] = js.native
}

object InferRxNormResponse {
  @scala.inline
  def apply(Entities: RxNormEntityList): InferRxNormResponse = {
    val __obj = js.Dynamic.literal(Entities = Entities.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferRxNormResponse]
  }
  @scala.inline
  implicit class InferRxNormResponseOps[Self <: InferRxNormResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntities(value: RxNormEntityList): Self = {
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

