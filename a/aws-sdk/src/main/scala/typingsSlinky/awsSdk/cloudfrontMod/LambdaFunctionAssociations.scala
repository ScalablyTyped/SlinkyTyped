package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaFunctionAssociations extends js.Object {
  /**
    *  Optional: A complex type that contains LambdaFunctionAssociation items for this cache behavior. If Quantity is 0, you can omit Items.
    */
  var Items: js.UndefOr[LambdaFunctionAssociationList] = js.native
  /**
    * The number of Lambda function associations for this cache behavior.
    */
  var Quantity: integer = js.native
}

object LambdaFunctionAssociations {
  @scala.inline
  def apply(Quantity: integer): LambdaFunctionAssociations = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionAssociations]
  }
  @scala.inline
  implicit class LambdaFunctionAssociationsOps[Self <: LambdaFunctionAssociations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuantity(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: LambdaFunctionAssociationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(js.undefined)
        ret
    }
  }
  
}

