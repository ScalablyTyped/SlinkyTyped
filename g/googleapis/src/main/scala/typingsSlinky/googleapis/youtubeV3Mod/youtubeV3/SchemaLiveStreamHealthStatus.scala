package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveStreamHealthStatus extends js.Object {
  /**
    * The configurations issues on this stream
    */
  var configurationIssues: js.UndefOr[js.Array[SchemaLiveStreamConfigurationIssue]] = js.native
  /**
    * The last time this status was updated (in seconds)
    */
  var lastUpdateTimeSeconds: js.UndefOr[String] = js.native
  /**
    * The status code of this stream
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaLiveStreamHealthStatus {
  @scala.inline
  def apply(): SchemaLiveStreamHealthStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveStreamHealthStatus]
  }
  @scala.inline
  implicit class SchemaLiveStreamHealthStatusOps[Self <: SchemaLiveStreamHealthStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationIssues(value: js.Array[SchemaLiveStreamConfigurationIssue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationIssues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationIssues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationIssues")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateTimeSeconds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTimeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateTimeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTimeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

