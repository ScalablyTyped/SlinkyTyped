package typingsSlinky.googleapis.loggingV2Mod.loggingV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result returned from ListMonitoredResourceDescriptors.
  */
@js.native
trait SchemaListMonitoredResourceDescriptorsResponse extends js.Object {
  /**
    * If there might be more results than those appearing in this response,
    * then nextPageToken is included. To get the next set of results, call this
    * method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of resource descriptors.
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

