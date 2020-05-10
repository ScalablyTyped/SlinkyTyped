package typingsSlinky.mangopay2NodejsSdk.mod.bankAccount

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import typingsSlinky.mangopay2NodejsSdk.mod.address.AddressType
import typingsSlinky.mangopay2NodejsSdk.mod.models.BankAccountDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.OtherData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.CAData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.GBData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.IBANData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.USData & {  Type  :never} */
@js.native
trait DataIntersection extends js.Object {
  /**
    * The ABA of the bank account. Must be numbers only, and 9 digits long
    */
  var ABA: String = js.native
  /**
    * The account number of the bank account. Must be numbers only. Canadian account numbers must be a maximum of 20 digits.
    */
  /**
    * The account number of the bank account. Must be numbers only. GB account numbers must be 8 digits long.
    */
  /**
    * The account number of the bank account. US account numbers must be digits only.
    */
  var AccountNumber: String = js.native
  /**
    * Whether the bank account is active or not
    */
  var Active: Boolean = js.native
  /**
    * The BIC of the bank account
    */
  var BIC: js.UndefOr[String] = js.native
  /**
    * The name of the bank where the account is held. Must be letters or numbers only and maximum 50 characters long.
    */
  var BankName: String = js.native
  /**
    * The branch code of the bank where the bank account. Must be numbers only, and 5 digits long
    */
  var BranchCode: String = js.native
  /**
    * The Country of the Address
    */
  var Country: String = js.native
  var CreationDate: Double = js.native
  /**
    * The type of account
    */
  var DepositAccountType: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.DepositAccountType] = js.native
  /**
    * @deprecated
    */
  var Details: js.UndefOr[BankAccountDetails] = js.native
  /**
    * The IBAN of the bank account
    */
  var IBAN: String = js.native
  var Id: String = js.native
  /**
    * The institution number of the bank account. Must be numbers only, and 3 or 4 digits long
    */
  var InstitutionNumber: String = js.native
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType = js.native
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String = js.native
  /**
    * The sort code of the bank account. Must be numbers only, and 6 digits long
    */
  var SortCode: String = js.native
  var Tag: String = js.native
  /**
    * The type of bank account
    */
  var Type: BankAccountType with OTHER with CA with GB with IBAN with US = js.native
  /**
    * The object owner's UserId
    */
  var UserId: String = js.native
}

object DataIntersection {
  @scala.inline
  def apply(
    ABA: String,
    AccountNumber: String,
    Active: Boolean,
    BankName: String,
    BranchCode: String,
    Country: String,
    CreationDate: Double,
    IBAN: String,
    Id: String,
    InstitutionNumber: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    SortCode: String,
    Tag: String,
    Type: BankAccountType with OTHER with CA with GB with IBAN with US,
    UserId: String
  ): DataIntersection = {
    val __obj = js.Dynamic.literal(ABA = ABA.asInstanceOf[js.Any], AccountNumber = AccountNumber.asInstanceOf[js.Any], Active = Active.asInstanceOf[js.Any], BankName = BankName.asInstanceOf[js.Any], BranchCode = BranchCode.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InstitutionNumber = InstitutionNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], SortCode = SortCode.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIntersection]
  }
  @scala.inline
  implicit class DataIntersectionOps[Self <: DataIntersection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withABA(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ABA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBankName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BankName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranchCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BranchCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIBAN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IBAN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstitutionNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstitutionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerAddress(value: AddressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: BankAccountType with OTHER with CA with GB with IBAN with US): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBIC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BIC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBIC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BIC")(js.undefined)
        ret
    }
    @scala.inline
    def withDepositAccountType(value: DepositAccountType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DepositAccountType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepositAccountType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DepositAccountType")(js.undefined)
        ret
    }
    @scala.inline
    def withDetails(value: BankAccountDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(js.undefined)
        ret
    }
  }
  
}

