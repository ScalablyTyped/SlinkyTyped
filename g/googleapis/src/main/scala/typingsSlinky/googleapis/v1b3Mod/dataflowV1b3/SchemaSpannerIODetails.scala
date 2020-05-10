package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for a Spanner connector used by the job.
  */
@js.native
trait SchemaSpannerIODetails extends js.Object {
  /**
    * DatabaseId accessed in the connection.
    */
  var databaseId: js.UndefOr[String] = js.native
  /**
    * InstanceId accessed in the connection.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * ProjectId accessed in the connection.
    */
  var projectId: js.UndefOr[String] = js.native
}

object SchemaSpannerIODetails {
  @scala.inline
  def apply(): SchemaSpannerIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpannerIODetails]
  }
  @scala.inline
  implicit class SchemaSpannerIODetailsOps[Self <: SchemaSpannerIODetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
  }
  
}

