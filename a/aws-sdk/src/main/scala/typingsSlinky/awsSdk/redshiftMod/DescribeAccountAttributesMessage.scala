package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountAttributesMessage extends js.Object {
  /**
    * A list of attribute names.
    */
  var AttributeNames: js.UndefOr[AttributeNameList] = js.native
}

object DescribeAccountAttributesMessage {
  @scala.inline
  def apply(): DescribeAccountAttributesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesMessage]
  }
  @scala.inline
  implicit class DescribeAccountAttributesMessageOps[Self <: DescribeAccountAttributesMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeNames(value: AttributeNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeNames")(js.undefined)
        ret
    }
  }
  
}

