package typingsSlinky.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginDetails extends js.Object {
  var ProductId: string = js.native
}

object OriginDetails {
  @scala.inline
  def apply(ProductId: string): OriginDetails = {
    val __obj = js.Dynamic.literal(ProductId = ProductId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginDetails]
  }
  @scala.inline
  implicit class OriginDetailsOps[Self <: OriginDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProductId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

