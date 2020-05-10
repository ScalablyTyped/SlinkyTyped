package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ListNotificationChannelDescriptors response.
  */
@js.native
trait SchemaListNotificationChannelDescriptorsResponse extends js.Object {
  /**
    * The monitored resource descriptors supported for the specified project,
    * optionally filtered.
    */
  var channelDescriptors: js.UndefOr[js.Array[SchemaNotificationChannelDescriptor]] = js.native
  /**
    * If not empty, indicates that there may be more results that match the
    * request. Use the value in the page_token field in a subsequent request to
    * fetch the next set of results. If empty, all results have been returned.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListNotificationChannelDescriptorsResponse {
  @scala.inline
  def apply(): SchemaListNotificationChannelDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNotificationChannelDescriptorsResponse]
  }
  @scala.inline
  implicit class SchemaListNotificationChannelDescriptorsResponseOps[Self <: SchemaListNotificationChannelDescriptorsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelDescriptors(value: js.Array[SchemaNotificationChannelDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelDescriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelDescriptors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelDescriptors")(js.undefined)
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

