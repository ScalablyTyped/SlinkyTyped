package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for SessionEntityTypes.ListSessionEntityTypes.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of session entity types. There will be a maximum number of items
    * returned based on the page_size field in the request.
    */
  var sessionEntityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponseOps[Self <: SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionEntityTypes(value: js.Array[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionEntityTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionEntityTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionEntityTypes")(js.undefined)
        ret
    }
  }
  
}

