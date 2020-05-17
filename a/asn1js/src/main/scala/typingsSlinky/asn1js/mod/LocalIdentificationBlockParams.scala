package typingsSlinky.asn1js.mod

import typingsSlinky.asn1js.anon.LocalHexBlockParamsisCons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalIdentificationBlockParams extends js.Object {
  var idBlock: js.UndefOr[LocalHexBlockParamsisCons] = js.native
}

object LocalIdentificationBlockParams {
  @scala.inline
  def apply(): LocalIdentificationBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalIdentificationBlockParams]
  }
  @scala.inline
  implicit class LocalIdentificationBlockParamsOps[Self <: LocalIdentificationBlockParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdBlock(value: LocalHexBlockParamsisCons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idBlock")(js.undefined)
        ret
    }
  }
  
}

