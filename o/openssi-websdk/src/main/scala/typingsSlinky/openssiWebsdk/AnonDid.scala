package typingsSlinky.openssiWebsdk

import typingsSlinky.openssiWebsdk.mod.DID
import typingsSlinky.openssiWebsdk.mod.Verkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDid extends js.Object {
  var did: DID = js.native
  var verkey: Verkey = js.native
}

object AnonDid {
  @scala.inline
  def apply(did: DID, verkey: Verkey): AnonDid = {
    val __obj = js.Dynamic.literal(did = did.asInstanceOf[js.Any], verkey = verkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDid]
  }
  @scala.inline
  implicit class AnonDidOps[Self <: AnonDid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDid(value: DID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("did")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerkey(value: Verkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verkey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

