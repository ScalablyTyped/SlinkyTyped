package typingsSlinky.pulumiAws.receiptFilterMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptFilterArgs extends js.Object {
  /**
    * The IP address or address range to filter, in CIDR notation
    */
  val cidr: Input[String] = js.native
  /**
    * The name of the filter
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Block or Allow
    */
  val policy: Input[String] = js.native
}

object ReceiptFilterArgs {
  @scala.inline
  def apply(cidr: Input[String], policy: Input[String]): ReceiptFilterArgs = {
    val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptFilterArgs]
  }
  @scala.inline
  implicit class ReceiptFilterArgsOps[Self <: ReceiptFilterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidr(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

