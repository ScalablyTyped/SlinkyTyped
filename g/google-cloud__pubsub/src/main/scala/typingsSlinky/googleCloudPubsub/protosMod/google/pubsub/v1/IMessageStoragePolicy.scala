package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a MessageStoragePolicy. */
@js.native
trait IMessageStoragePolicy extends js.Object {
  /** MessageStoragePolicy allowedPersistenceRegions */
  var allowedPersistenceRegions: js.UndefOr[js.Array[String] | Null] = js.native
}

object IMessageStoragePolicy {
  @scala.inline
  def apply(): IMessageStoragePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageStoragePolicy]
  }
  @scala.inline
  implicit class IMessageStoragePolicyOps[Self <: IMessageStoragePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedPersistenceRegions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedPersistenceRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedPersistenceRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedPersistenceRegions")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedPersistenceRegionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedPersistenceRegions")(null)
        ret
    }
  }
  
}

