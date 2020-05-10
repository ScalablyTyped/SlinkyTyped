package typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Schema.Payments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentsCollection extends js.Object {
  // List the payments for this AdSense account.
  def list(): Payments = js.native
}

object PaymentsCollection {
  @scala.inline
  def apply(list: () => Payments): PaymentsCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction0(list))
    __obj.asInstanceOf[PaymentsCollection]
  }
  @scala.inline
  implicit class PaymentsCollectionOps[Self <: PaymentsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: () => Payments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

