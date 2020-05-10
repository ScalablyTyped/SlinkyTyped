package typingsSlinky.googleapis.v1Dot4Mod.adsenseV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPayments extends js.Object {
  /**
    * The list of Payments for the account. One or both of a) the account&#39;s
    * most recent payment; and b) the account&#39;s upcoming payment.
    */
  var items: js.UndefOr[js.Array[SchemaPayment]] = js.native
  /**
    * Kind of list this is, in this case adsense#payments.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaPayments {
  @scala.inline
  def apply(): SchemaPayments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPayments]
  }
  @scala.inline
  implicit class SchemaPaymentsOps[Self <: SchemaPayments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[SchemaPayment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

