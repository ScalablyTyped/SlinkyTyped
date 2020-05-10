package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashEncryption extends js.Object {
  /**
    * Time (in seconds) between each encryption key rotation.
    */
  var KeyRotationIntervalSeconds: js.UndefOr[integer] = js.native
  var SpekeKeyProvider: typingsSlinky.awsSdk.mediapackageMod.SpekeKeyProvider = js.native
}

object DashEncryption {
  @scala.inline
  def apply(SpekeKeyProvider: SpekeKeyProvider): DashEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashEncryption]
  }
  @scala.inline
  implicit class DashEncryptionOps[Self <: DashEncryption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpekeKeyProvider(value: SpekeKeyProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpekeKeyProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyRotationIntervalSeconds(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyRotationIntervalSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyRotationIntervalSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyRotationIntervalSeconds")(js.undefined)
        ret
    }
  }
  
}

