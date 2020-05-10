package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusCodes extends js.Object {
  /**
    * The items (status codes) for an origin group.
    */
  var Items: StatusCodeList = js.native
  /**
    * The number of status codes.
    */
  var Quantity: integer = js.native
}

object StatusCodes {
  @scala.inline
  def apply(Items: StatusCodeList, Quantity: integer): StatusCodes = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusCodes]
  }
  @scala.inline
  implicit class StatusCodesOps[Self <: StatusCodes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: StatusCodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuantity(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quantity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

