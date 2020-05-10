package typingsSlinky.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetShippingLabelOutput extends js.Object {
  var ShippingLabelURL: js.UndefOr[GenericString] = js.native
  var Warning: js.UndefOr[GenericString] = js.native
}

object GetShippingLabelOutput {
  @scala.inline
  def apply(): GetShippingLabelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetShippingLabelOutput]
  }
  @scala.inline
  implicit class GetShippingLabelOutputOps[Self <: GetShippingLabelOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShippingLabelURL(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingLabelURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingLabelURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingLabelURL")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Warning")(js.undefined)
        ret
    }
  }
  
}

