package typingsSlinky.mangopay2NodejsSdk.mod.eMoney

import typingsSlinky.mangopay2NodejsSdk.mod.MoneyData
import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EMoneyData extends EntityBaseData {
  /**
    * The amount of money that has been credited to this user
    */
  var CreditedEMoney: MoneyData = js.native
  /**
    * The amount of money that has been debited from this user
    */
  var DebitedEMoney: MoneyData = js.native
  /**
    * The object owner's UserId
    */
  var UserId: String = js.native
}

object EMoneyData {
  @scala.inline
  def apply(
    CreationDate: Double,
    CreditedEMoney: MoneyData,
    DebitedEMoney: MoneyData,
    Id: String,
    Tag: String,
    UserId: String
  ): EMoneyData = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], CreditedEMoney = CreditedEMoney.asInstanceOf[js.Any], DebitedEMoney = DebitedEMoney.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EMoneyData]
  }
  @scala.inline
  implicit class EMoneyDataOps[Self <: EMoneyData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreditedEMoney(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditedEMoney")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebitedEMoney(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebitedEMoney")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

