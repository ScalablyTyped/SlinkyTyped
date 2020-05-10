package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListSessionEntityTypesResponse. */
@js.native
trait IListSessionEntityTypesResponse extends js.Object {
  /** ListSessionEntityTypesResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.native
  /** ListSessionEntityTypesResponse sessionEntityTypes */
  var sessionEntityTypes: js.UndefOr[js.Array[ISessionEntityType] | Null] = js.native
}

object IListSessionEntityTypesResponse {
  @scala.inline
  def apply(): IListSessionEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListSessionEntityTypesResponse]
  }
  @scala.inline
  implicit class IListSessionEntityTypesResponseOps[Self <: IListSessionEntityTypesResponse] (val x: Self) extends AnyVal {
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
    def withNextPageTokenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(null)
        ret
    }
    @scala.inline
    def withSessionEntityTypes(value: js.Array[ISessionEntityType]): Self = {
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
    @scala.inline
    def withSessionEntityTypesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionEntityTypes")(null)
        ret
    }
  }
  
}

