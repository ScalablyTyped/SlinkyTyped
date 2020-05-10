package typingsSlinky.ntlmClient.mod

import typingsSlinky.node.Buffer
import typingsSlinky.ntlmClient.AnonBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NtlmType2 extends js.Object {
  var challenge: Buffer = js.native
  var encoding: String = js.native
  var flags: Double = js.native
  var targetInfo: AnonBuffer = js.native
  var targetName: String = js.native
  var version: Double = js.native
}

object NtlmType2 {
  @scala.inline
  def apply(
    challenge: Buffer,
    encoding: String,
    flags: Double,
    targetInfo: AnonBuffer,
    targetName: String,
    version: Double
  ): NtlmType2 = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], targetInfo = targetInfo.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NtlmType2]
  }
  @scala.inline
  implicit class NtlmType2Ops[Self <: NtlmType2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChallenge(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetInfo(value: AnonBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

