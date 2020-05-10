package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCopyProductStatusOutput extends js.Object {
  /**
    * The status of the copy product operation.
    */
  var CopyProductStatus: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.CopyProductStatus] = js.native
  /**
    * The status message.
    */
  var StatusDetail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.StatusDetail] = js.native
  /**
    * The identifier of the copied product.
    */
  var TargetProductId: js.UndefOr[Id] = js.native
}

object DescribeCopyProductStatusOutput {
  @scala.inline
  def apply(): DescribeCopyProductStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCopyProductStatusOutput]
  }
  @scala.inline
  implicit class DescribeCopyProductStatusOutputOps[Self <: DescribeCopyProductStatusOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyProductStatus(value: CopyProductStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyProductStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyProductStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyProductStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusDetail(value: StatusDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetProductId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetProductId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetProductId")(js.undefined)
        ret
    }
  }
  
}

