package typingsSlinky.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration for forwarding telemetry events.
  */
@js.native
trait SchemaEventNotificationConfig extends js.Object {
  /**
    * A Cloud Pub/Sub topic name. For example,
    * `projects/myProject/topics/deviceEvents`.
    */
  var pubsubTopicName: js.UndefOr[String] = js.native
  /**
    * If the subfolder name matches this string exactly, this configuration
    * will be used. The string must not include the leading &#39;/&#39;
    * character. If empty, all strings are matched. This field is used only for
    * telemetry events; subfolders are not supported for state changes.
    */
  var subfolderMatches: js.UndefOr[String] = js.native
}

object SchemaEventNotificationConfig {
  @scala.inline
  def apply(): SchemaEventNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventNotificationConfig]
  }
  @scala.inline
  implicit class SchemaEventNotificationConfigOps[Self <: SchemaEventNotificationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPubsubTopicName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubsubTopicName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubsubTopicName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubsubTopicName")(js.undefined)
        ret
    }
    @scala.inline
    def withSubfolderMatches(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subfolderMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubfolderMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subfolderMatches")(js.undefined)
        ret
    }
  }
  
}

