package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBatchHeader extends js.Object {
  /** BatchHeader signerPublicKey */
  var signerPublicKey: js.UndefOr[String | Null] = js.native
  /** BatchHeader transactionIds */
  var transactionIds: js.UndefOr[js.Array[String] | Null] = js.native
}

object IBatchHeader {
  @scala.inline
  def apply(): IBatchHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchHeader]
  }
  @scala.inline
  implicit class IBatchHeaderOps[Self <: IBatchHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withTransactionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionIdsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionIds")(null)
        ret
    }
  }
  
}

