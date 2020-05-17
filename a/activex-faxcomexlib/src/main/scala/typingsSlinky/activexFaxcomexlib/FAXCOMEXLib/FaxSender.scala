package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxSender Class */
@js.native
trait FaxSender extends js.Object {
  /** Sender's billing code */
  var BillingCode: String = js.native
  /** City */
  var City: String = js.native
  /** Sender's company */
  var Company: String = js.native
  /** Sender's country or region */
  var Country: String = js.native
  /** Sender's department */
  var Department: String = js.native
  /** Sender's e-mail address */
  var Email: String = js.native
  @JSName("FAXCOMEXLib.FaxSender_typekey")
  var FAXCOMEXLibDotFaxSender_typekey: FaxSender = js.native
  /** Sender's fax number */
  var FaxNumber: String = js.native
  /** Sender's home phone */
  var HomePhone: String = js.native
  /** Sender's name */
  var Name: String = js.native
  /** Sender's office location */
  var OfficeLocation: String = js.native
  /** Sender's office phone */
  var OfficePhone: String = js.native
  /** Sender's state */
  var State: String = js.native
  /** Sender's street address */
  var StreetAddress: String = js.native
  /** Transmitting Station ID */
  var TSID: String = js.native
  /** Sender's title */
  var Title: String = js.native
  /** Sender's zip code */
  var ZipCode: String = js.native
  /** Load default sender */
  def LoadDefaultSender(): Unit = js.native
  /** Save default sender */
  def SaveDefaultSender(): Unit = js.native
}

object FaxSender {
  @scala.inline
  def apply(
    BillingCode: String,
    City: String,
    Company: String,
    Country: String,
    Department: String,
    Email: String,
    FAXCOMEXLibDotFaxSender_typekey: FaxSender,
    FaxNumber: String,
    HomePhone: String,
    LoadDefaultSender: () => Unit,
    Name: String,
    OfficeLocation: String,
    OfficePhone: String,
    SaveDefaultSender: () => Unit,
    State: String,
    StreetAddress: String,
    TSID: String,
    Title: String,
    ZipCode: String
  ): FaxSender = {
    val __obj = js.Dynamic.literal(BillingCode = BillingCode.asInstanceOf[js.Any], City = City.asInstanceOf[js.Any], Company = Company.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], Department = Department.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], FaxNumber = FaxNumber.asInstanceOf[js.Any], HomePhone = HomePhone.asInstanceOf[js.Any], LoadDefaultSender = js.Any.fromFunction0(LoadDefaultSender), Name = Name.asInstanceOf[js.Any], OfficeLocation = OfficeLocation.asInstanceOf[js.Any], OfficePhone = OfficePhone.asInstanceOf[js.Any], SaveDefaultSender = js.Any.fromFunction0(SaveDefaultSender), State = State.asInstanceOf[js.Any], StreetAddress = StreetAddress.asInstanceOf[js.Any], TSID = TSID.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], ZipCode = ZipCode.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxSender_typekey")(FAXCOMEXLibDotFaxSender_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxSender]
  }
  @scala.inline
  implicit class FaxSenderOps[Self <: FaxSender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("City")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompany(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepartment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Department")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAXCOMEXLibDotFaxSender_typekey(value: FaxSender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxSender_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFaxNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaxNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHomePhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomePhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadDefaultSender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadDefaultSender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfficeLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficePhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfficePhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveDefaultSender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SaveDefaultSender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreetAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreetAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZipCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

