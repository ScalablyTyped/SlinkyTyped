package typingsSlinky.pulumiAws.productSubscriptionMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductSubscriptionArgs extends js.Object {
  /**
    * The ARN of the product that generates findings that you want to import into Security Hub - see below.
    */
  val productArn: Input[String] = js.native
}

object ProductSubscriptionArgs {
  @scala.inline
  def apply(productArn: Input[String]): ProductSubscriptionArgs = {
    val __obj = js.Dynamic.literal(productArn = productArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductSubscriptionArgs]
  }
  @scala.inline
  implicit class ProductSubscriptionArgsOps[Self <: ProductSubscriptionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProductArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

