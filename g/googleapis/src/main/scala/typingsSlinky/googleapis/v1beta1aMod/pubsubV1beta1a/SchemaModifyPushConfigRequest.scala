package typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the ModifyPushConfig method.
  */
@js.native
trait SchemaModifyPushConfigRequest extends js.Object {
  /**
    * An empty &lt;code&gt;push_config&lt;/code&gt; indicates that the Pub/Sub
    * system should pause pushing messages from the given subscription.
    */
  var pushConfig: js.UndefOr[SchemaPushConfig] = js.native
  /**
    * The name of the subscription.
    */
  var subscription: js.UndefOr[String] = js.native
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
    @scala.inline
    def withSubscription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.undefined)
        ret
    }
  }
  
}

