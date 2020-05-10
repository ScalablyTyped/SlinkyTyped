package typingsSlinky.googleCloudKms.mod.v1

import typingsSlinky.googleProtobuf.timestampPbMod.Timestamp.AsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoKeyVersion extends js.Object {
  var algorithm: CryptoKeyVersionAlgorithm = js.native
  var attestation: js.UndefOr[KeyOperationAttestation] = js.native
  var createTime: AsObject = js.native
  var destroyEventTime: js.UndefOr[AsObject] = js.native
  var destroyTime: js.UndefOr[AsObject] = js.native
  var generateTime: AsObject = js.native
  var name: String = js.native
  var protectionLevel: ProtectionLevel = js.native
  var state: CryptoKeyVersionState = js.native
}

object CryptoKeyVersion {
  @scala.inline
  def apply(
    algorithm: CryptoKeyVersionAlgorithm,
    createTime: AsObject,
    generateTime: AsObject,
    name: String,
    protectionLevel: ProtectionLevel,
    state: CryptoKeyVersionState
  ): CryptoKeyVersion = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], generateTime = generateTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKeyVersion]
  }
  @scala.inline
  implicit class CryptoKeyVersionOps[Self <: CryptoKeyVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: CryptoKeyVersionAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTime(value: AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerateTime(value: AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtectionLevel(value: ProtectionLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: CryptoKeyVersionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttestation(value: KeyOperationAttestation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attestation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttestation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attestation")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyEventTime(value: AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyEventTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyEventTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyEventTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyTime(value: AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyTime")(js.undefined)
        ret
    }
  }
  
}

