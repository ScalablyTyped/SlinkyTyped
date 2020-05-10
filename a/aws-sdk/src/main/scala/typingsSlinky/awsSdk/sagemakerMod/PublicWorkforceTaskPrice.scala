package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicWorkforceTaskPrice extends js.Object {
  /**
    * Defines the amount of money paid to an Amazon Mechanical Turk worker in United States dollars.
    */
  var AmountInUsd: js.UndefOr[USD] = js.native
}

object PublicWorkforceTaskPrice {
  @scala.inline
  def apply(): PublicWorkforceTaskPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicWorkforceTaskPrice]
  }
  @scala.inline
  implicit class PublicWorkforceTaskPriceOps[Self <: PublicWorkforceTaskPrice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmountInUsd(value: USD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmountInUsd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmountInUsd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmountInUsd")(js.undefined)
        ret
    }
  }
  
}

