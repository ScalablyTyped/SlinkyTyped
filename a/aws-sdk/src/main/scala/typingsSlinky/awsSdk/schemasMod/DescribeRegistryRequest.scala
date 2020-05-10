package typingsSlinky.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRegistryRequest extends js.Object {
  var RegistryName: string = js.native
}

object DescribeRegistryRequest {
  @scala.inline
  def apply(RegistryName: string): DescribeRegistryRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRegistryRequest]
  }
  @scala.inline
  implicit class DescribeRegistryRequestOps[Self <: DescribeRegistryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegistryName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistryName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

