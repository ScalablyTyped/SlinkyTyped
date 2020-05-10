package typingsSlinky.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the ModifyPushConfig method.
  */
@js.native
trait SchemaModifyPushConfigRequest extends js.Object {
  /**
    * The push configuration for future deliveries.  An empty `pushConfig`
    * indicates that the Pub/Sub system should stop pushing messages from the
    * given subscription and allow messages to be pulled and acknowledged -
    * effectively pausing the subscription if `Pull` or `StreamingPull` is not
    * called.
    */
  var pushConfig: js.UndefOr[SchemaPushConfig] = js.native
}

object SchemaModifyPushConfigRequest {
  @scala.inline
  def apply(): SchemaModifyPushConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyPushConfigRequest]
  }
  @scala.inline
  implicit class SchemaModifyPushConfigRequestOps[Self <: SchemaModifyPushConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPushConfig(value: SchemaPushConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushConfig")(js.undefined)
        ret
    }
  }
  
}

