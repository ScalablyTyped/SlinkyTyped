package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetKeyPairResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the key pair.
    */
  var keyPair: js.UndefOr[KeyPair] = js.native
}

object GetKeyPairResult {
  @scala.inline
  def apply(): GetKeyPairResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyPairResult]
  }
  @scala.inline
  implicit class GetKeyPairResultOps[Self <: GetKeyPairResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyPair(value: KeyPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPair")(js.undefined)
        ret
    }
  }
  
}

