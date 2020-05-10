package typingsSlinky.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the UpdateTopic method.
  */
@js.native
trait SchemaUpdateTopicRequest extends js.Object {
  /**
    * The updated topic object.
    */
  var topic: js.UndefOr[SchemaTopic] = js.native
  /**
    * Indicates which fields in the provided topic to update. Must be specified
    * and non-empty. Note that if `update_mask` contains
    * &quot;message_storage_policy&quot; then the new value will be determined
    * based on the policy configured at the project or organization level. The
    * `message_storage_policy` must not be set in the `topic` provided above.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaUpdateTopicRequest {
  @scala.inline
  def apply(): SchemaUpdateTopicRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateTopicRequest]
  }
  @scala.inline
  implicit class SchemaUpdateTopicRequestOps[Self <: SchemaUpdateTopicRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTopic(value: SchemaTopic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(js.undefined)
        ret
    }
  }
  
}

