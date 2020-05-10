package typingsSlinky.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEntitiesDetectionV2JobsResponse extends js.Object {
  /**
    * A list containing the properties of each job returned.
    */
  var ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[
    typingsSlinky.awsSdk.comprehendmedicalMod.ComprehendMedicalAsyncJobPropertiesList
  ] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListEntitiesDetectionV2JobsResponse {
  @scala.inline
  def apply(): ListEntitiesDetectionV2JobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntitiesDetectionV2JobsResponse]
  }
  @scala.inline
  implicit class ListEntitiesDetectionV2JobsResponseOps[Self <: ListEntitiesDetectionV2JobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComprehendMedicalAsyncJobPropertiesList(value: ComprehendMedicalAsyncJobPropertiesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComprehendMedicalAsyncJobPropertiesList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComprehendMedicalAsyncJobPropertiesList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComprehendMedicalAsyncJobPropertiesList")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

