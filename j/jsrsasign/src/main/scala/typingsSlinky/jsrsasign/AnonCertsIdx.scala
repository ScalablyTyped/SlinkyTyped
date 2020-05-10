package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCertsIdx extends js.Object {
  var certsIdx: Double = js.native
  var signerInfos: js.Array[_] = js.native
}

object AnonCertsIdx {
  @scala.inline
  def apply(certsIdx: Double, signerInfos: js.Array[_]): AnonCertsIdx = {
    val __obj = js.Dynamic.literal(certsIdx = certsIdx.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCertsIdx]
  }
  @scala.inline
  implicit class AnonCertsIdxOps[Self <: AnonCertsIdx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertsIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certsIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignerInfos(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerInfos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

