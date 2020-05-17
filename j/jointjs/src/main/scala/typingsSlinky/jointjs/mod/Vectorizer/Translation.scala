package typingsSlinky.jointjs.mod.Vectorizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Translation extends js.Object {
  var tx: Double = js.native
  var ty: Double = js.native
}

object Translation {
  @scala.inline
  def apply(tx: Double, ty: Double): Translation = {
    val __obj = js.Dynamic.literal(tx = tx.asInstanceOf[js.Any], ty = ty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Translation]
  }
  @scala.inline
  implicit class TranslationOps[Self <: Translation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

