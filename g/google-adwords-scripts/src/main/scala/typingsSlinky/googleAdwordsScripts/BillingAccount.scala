package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Budget Orders
@js.native
trait BillingAccount extends js.Object {
  def getId(): Double = js.native
  def getName(): String = js.native
  def getPrimaryBillingId(): String = js.native
  def getSecondaryBillingId(): String = js.native
}

object BillingAccount {
  @scala.inline
  def apply(
    getId: () => Double,
    getName: () => String,
    getPrimaryBillingId: () => String,
    getSecondaryBillingId: () => String
  ): BillingAccount = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getPrimaryBillingId = js.Any.fromFunction0(getPrimaryBillingId), getSecondaryBillingId = js.Any.fromFunction0(getSecondaryBillingId))
    __obj.asInstanceOf[BillingAccount]
  }
  @scala.inline
  implicit class BillingAccountOps[Self <: BillingAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPrimaryBillingId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrimaryBillingId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSecondaryBillingId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSecondaryBillingId")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

