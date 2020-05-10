package typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response that returns all Composite Types supported by Deployment Manager
  */
@js.native
trait SchemaCompositeTypesListResponse extends js.Object {
  /**
    * Output only. A list of resource composite types supported by Deployment
    * Manager.
    */
  var compositeTypes: js.UndefOr[js.Array[SchemaCompositeType]] = js.native
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaCompositeTypesListResponse {
  @scala.inline
  def apply(): SchemaCompositeTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompositeTypesListResponse]
  }
  @scala.inline
  implicit class SchemaCompositeTypesListResponseOps[Self <: SchemaCompositeTypesListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompositeTypes(value: js.Array[SchemaCompositeType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompositeTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeTypes")(js.undefined)
        ret
    }
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
  }
  
}

