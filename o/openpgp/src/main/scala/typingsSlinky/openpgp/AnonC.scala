package typingsSlinky.openpgp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonC extends js.Object {
  var C: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  var V: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
}

object AnonC {
  @scala.inline
  def apply(
    C: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
    V: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
  ): AnonC = {
    val __obj = js.Dynamic.literal(C = C.asInstanceOf[js.Any], V = V.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonC]
  }
  @scala.inline
  implicit class AnonCOps[Self <: AnonC] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withC(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("C")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withV(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("V")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

