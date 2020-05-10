package typingsSlinky.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for ListTensorFlowVersions.
  */
@js.native
trait SchemaListTensorFlowVersionsResponse extends js.Object {
  /**
    * The next page token or empty if none.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The listed nodes.
    */
  var tensorflowVersions: js.UndefOr[js.Array[SchemaTensorFlowVersion]] = js.native
}

object SchemaListTensorFlowVersionsResponse {
  @scala.inline
  def apply(): SchemaListTensorFlowVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTensorFlowVersionsResponse]
  }
  @scala.inline
  implicit class SchemaListTensorFlowVersionsResponseOps[Self <: SchemaListTensorFlowVersionsResponse] (val x: Self) extends AnyVal {
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
    def withTensorflowVersions(value: js.Array[SchemaTensorFlowVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorflowVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTensorflowVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorflowVersions")(js.undefined)
        ret
    }
  }
  
}

