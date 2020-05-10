package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransactionHeader extends js.Object {
  /** TransactionHeader batcherPublicKey */
  var batcherPublicKey: js.UndefOr[String | Null] = js.native
  /** TransactionHeader dependencies */
  var dependencies: js.UndefOr[js.Array[String] | Null] = js.native
  /** TransactionHeader familyName */
  var familyName: js.UndefOr[String | Null] = js.native
  /** TransactionHeader familyVersion */
  var familyVersion: js.UndefOr[String | Null] = js.native
  /** TransactionHeader inputs */
  var inputs: js.UndefOr[js.Array[String] | Null] = js.native
  /** TransactionHeader nonce */
  var nonce: js.UndefOr[String | Null] = js.native
  /** TransactionHeader outputs */
  var outputs: js.UndefOr[js.Array[String] | Null] = js.native
  /** TransactionHeader payloadSha512 */
  var payloadSha512: js.UndefOr[String | Null] = js.native
  /** TransactionHeader signerPublicKey */
  var signerPublicKey: js.UndefOr[String | Null] = js.native
}

object ITransactionHeader {
  @scala.inline
  def apply(): ITransactionHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransactionHeader]
  }
  @scala.inline
  implicit class ITransactionHeaderOps[Self <: ITransactionHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatcherPublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batcherPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatcherPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batcherPublicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withBatcherPublicKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batcherPublicKey")(null)
        ret
    }
    @scala.inline
    def withDependencies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDependenciesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(null)
        ret
    }
    @scala.inline
    def withFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamilyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(js.undefined)
        ret
    }
    @scala.inline
    def withFamilyNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(null)
        ret
    }
    @scala.inline
    def withFamilyVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamilyVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withFamilyVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyVersion")(null)
        ret
    }
    @scala.inline
    def withInputs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(js.undefined)
        ret
    }
    @scala.inline
    def withInputsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(null)
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
    @scala.inline
    def withNonceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(null)
        ret
    }
    @scala.inline
    def withOutputs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(null)
        ret
    }
    @scala.inline
    def withPayloadSha512(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadSha512")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloadSha512: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadSha512")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloadSha512Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadSha512")(null)
        ret
    }
    @scala.inline
    def withSignerPublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignerPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerPublicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSignerPublicKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerPublicKey")(null)
        ret
    }
  }
  
}

