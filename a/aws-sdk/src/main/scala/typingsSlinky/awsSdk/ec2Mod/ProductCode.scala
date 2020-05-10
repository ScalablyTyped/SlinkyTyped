package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductCode extends js.Object {
  /**
    * The product code.
    */
  var ProductCodeId: js.UndefOr[String] = js.native
  /**
    * The type of product code.
    */
  var ProductCodeType: js.UndefOr[ProductCodeValues] = js.native
}

object ProductCode {
  @scala.inline
  def apply(): ProductCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductCode]
  }
  @scala.inline
  implicit class ProductCodeOps[Self <: ProductCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProductCodeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductCodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductCodeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductCodeId")(js.undefined)
        ret
    }
    @scala.inline
    def withProductCodeType(value: ProductCodeValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductCodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductCodeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductCodeType")(js.undefined)
        ret
    }
  }
  
}

