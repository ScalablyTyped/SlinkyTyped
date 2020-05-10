package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountAttributesResult extends js.Object {
  /**
    * Information about the account attributes.
    */
  var AccountAttributes: js.UndefOr[AccountAttributeList] = js.native
}

object DescribeAccountAttributesResult {
  @scala.inline
  def apply(): DescribeAccountAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesResult]
  }
  @scala.inline
  implicit class DescribeAccountAttributesResultOps[Self <: DescribeAccountAttributesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountAttributes(value: AccountAttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountAttributes")(js.undefined)
        ret
    }
  }
  
}

