package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ListMonitoredResourceDescriptors response.
  */
@js.native
trait SchemaListMonitoredResourceDescriptorsResponse extends js.Object {
  /**
    * If there are more results than have been returned, then this field is set
    * to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The monitored resource descriptors that are available to this project and
    * that match filter, if present.
    */
  var resourceDescriptors: js.UndefOr[js.Array[SchemaMonitoredResourceDescriptor]] = js.native
}

object SchemaListMonitoredResourceDescriptorsResponse {
  @scala.inline
  def apply(): SchemaListMonitoredResourceDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMonitoredResourceDescriptorsResponse]
  }
  @scala.inline
  implicit class SchemaListMonitoredResourceDescriptorsResponseOps[Self <: SchemaListMonitoredResourceDescriptorsResponse] (val x: Self) extends AnyVal {
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
    def withResourceDescriptors(value: js.Array[SchemaMonitoredResourceDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceDescriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceDescriptors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceDescriptors")(js.undefined)
        ret
    }
  }
  
}

