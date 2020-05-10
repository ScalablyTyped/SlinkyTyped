package typingsSlinky.pulumiAws.outputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAmiProductCode extends js.Object {
  var productCodeId: String = js.native
  var productCodeType: String = js.native
}

object GetAmiProductCode {
  @scala.inline
  def apply(productCodeId: String, productCodeType: String): GetAmiProductCode = {
    val __obj = js.Dynamic.literal(productCodeId = productCodeId.asInstanceOf[js.Any], productCodeType = productCodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAmiProductCode]
  }
  @scala.inline
  implicit class GetAmiProductCodeOps[Self <: GetAmiProductCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProductCodeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productCodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductCodeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productCodeType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

