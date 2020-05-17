package typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1

import typingsSlinky.googleCloudPubsub.pubsubMod.google.protobuf.IDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an ExpirationPolicy. */
@js.native
trait IExpirationPolicy extends js.Object {
  /** ExpirationPolicy ttl */
  var ttl: js.UndefOr[IDuration | Null] = js.native
}

object IExpirationPolicy {
  @scala.inline
  def apply(): IExpirationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExpirationPolicy]
  }
  @scala.inline
  implicit class IExpirationPolicyOps[Self <: IExpirationPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTtl(value: IDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
    @scala.inline
    def withTtlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(null)
        ret
    }
  }
  
}

