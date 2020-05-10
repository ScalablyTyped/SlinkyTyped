package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MssEncryption extends js.Object {
  var SpekeKeyProvider: typingsSlinky.awsSdk.mediapackageMod.SpekeKeyProvider = js.native
}

object MssEncryption {
  @scala.inline
  def apply(SpekeKeyProvider: SpekeKeyProvider): MssEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[MssEncryption]
  }
  @scala.inline
  implicit class MssEncryptionOps[Self <: MssEncryption] (val x: Self) extends AnyVal {
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
  }
  
}

