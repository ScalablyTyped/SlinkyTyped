package typingsSlinky.bitcoinjsLib.transactionBuilderMod

import typingsSlinky.bitcoinjsLib.ecpairMod.Signer
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TxbSignArg extends js.Object {
  var hashType: js.UndefOr[Double] = js.native
  var keyPair: Signer = js.native
  var prevOutScriptType: String = js.native
  var redeemScript: js.UndefOr[Buffer] = js.native
  var vin: Double = js.native
  var witnessScript: js.UndefOr[Buffer] = js.native
  var witnessValue: js.UndefOr[Double] = js.native
}

object TxbSignArg {
  @scala.inline
  def apply(keyPair: Signer, prevOutScriptType: String, vin: Double): TxbSignArg = {
    val __obj = js.Dynamic.literal(keyPair = keyPair.asInstanceOf[js.Any], prevOutScriptType = prevOutScriptType.asInstanceOf[js.Any], vin = vin.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxbSignArg]
  }
  @scala.inline
  implicit class TxbSignArgOps[Self <: TxbSignArg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyPair(value: Signer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevOutScriptType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevOutScriptType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashType")(js.undefined)
        ret
    }
    @scala.inline
    def withRedeemScript(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redeemScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedeemScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redeemScript")(js.undefined)
        ret
    }
    @scala.inline
    def withWitnessScript(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("witnessScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWitnessScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("witnessScript")(js.undefined)
        ret
    }
    @scala.inline
    def withWitnessValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("witnessValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWitnessValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("witnessValue")(js.undefined)
        ret
    }
  }
  
}

