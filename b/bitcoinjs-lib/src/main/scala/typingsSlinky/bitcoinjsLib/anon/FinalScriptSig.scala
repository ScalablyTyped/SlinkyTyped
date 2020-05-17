package typingsSlinky.bitcoinjsLib.anon

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinalScriptSig extends js.Object {
  var finalScriptSig: js.UndefOr[Buffer] = js.native
  var finalScriptWitness: js.UndefOr[Buffer] = js.native
}

object FinalScriptSig {
  @scala.inline
  def apply(): FinalScriptSig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinalScriptSig]
  }
  @scala.inline
  implicit class FinalScriptSigOps[Self <: FinalScriptSig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinalScriptSig(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalScriptSig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalScriptSig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalScriptSig")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalScriptWitness(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalScriptWitness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalScriptWitness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalScriptWitness")(js.undefined)
        ret
    }
  }
  
}

