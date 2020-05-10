package typingsSlinky.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration for notification of new states received from the device.
  */
@js.native
trait SchemaStateNotificationConfig extends js.Object {
  /**
    * A Cloud Pub/Sub topic name. For example,
    * `projects/myProject/topics/deviceEvents`.
    */
  var pubsubTopicName: js.UndefOr[String] = js.native
}

object SchemaStateNotificationConfig {
  @scala.inline
  def apply(): SchemaStateNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStateNotificationConfig]
  }
  @scala.inline
  implicit class SchemaStateNotificationConfigOps[Self <: SchemaStateNotificationConfig] (val x: Self) extends AnyVal {
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
  }
  
}

