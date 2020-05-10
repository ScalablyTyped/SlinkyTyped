package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAddressResult extends js.Object {
  /**
    * The address that you want the Snowball or Snowballs associated with a specific job to be shipped to.
    */
  var Address: js.UndefOr[typingsSlinky.awsSdk.snowballMod.Address] = js.native
}

object DescribeAddressResult {
  @scala.inline
  def apply(): DescribeAddressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddressResult]
  }
  @scala.inline
  implicit class DescribeAddressResultOps[Self <: DescribeAddressResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(js.undefined)
        ret
    }
  }
  
}

