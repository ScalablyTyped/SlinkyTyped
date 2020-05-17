package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LetterContent extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var AttentionLine: String = js.native
  var CCList: String = js.native
  var Closing: String = js.native
  val Creator: Double = js.native
  var DateFormat: String = js.native
  val Duplicate: LetterContent = js.native
  var EnclosureNumber: Double = js.native
  var IncludeHeaderFooter: Boolean = js.native
  var InfoBlock: Boolean = js.native
  var LetterStyle: WdLetterStyle = js.native
  var Letterhead: Boolean = js.native
  var LetterheadLocation: WdLetterheadLocation = js.native
  var LetterheadSize: Double = js.native
  var MailingInstructions: String = js.native
  var PageDesign: String = js.native
  val Parent: js.Any = js.native
  var RecipientAddress: String = js.native
  var RecipientCode: String = js.native
  var RecipientGender: WdSalutationGender = js.native
  var RecipientName: String = js.native
  var RecipientReference: String = js.native
  var ReturnAddress: String = js.native
  var ReturnAddressShortForm: String = js.native
  var Salutation: String = js.native
  var SalutationType: WdSalutationType = js.native
  var SenderCity: String = js.native
  var SenderCode: String = js.native
  var SenderCompany: String = js.native
  var SenderGender: WdSalutationGender = js.native
  var SenderInitials: String = js.native
  var SenderJobTitle: String = js.native
  var SenderName: String = js.native
  var SenderReference: String = js.native
  var Subject: String = js.native
  @JSName("Word.LetterContent_typekey")
  var WordDotLetterContent_typekey: LetterContent = js.native
}

object LetterContent {
  @scala.inline
  def apply(
    Application: Application,
    AttentionLine: String,
    CCList: String,
    Closing: String,
    Creator: Double,
    DateFormat: String,
    Duplicate: LetterContent,
    EnclosureNumber: Double,
    IncludeHeaderFooter: Boolean,
    InfoBlock: Boolean,
    LetterStyle: WdLetterStyle,
    Letterhead: Boolean,
    LetterheadLocation: WdLetterheadLocation,
    LetterheadSize: Double,
    MailingInstructions: String,
    PageDesign: String,
    Parent: js.Any,
    RecipientAddress: String,
    RecipientCode: String,
    RecipientGender: WdSalutationGender,
    RecipientName: String,
    RecipientReference: String,
    ReturnAddress: String,
    ReturnAddressShortForm: String,
    Salutation: String,
    SalutationType: WdSalutationType,
    SenderCity: String,
    SenderCode: String,
    SenderCompany: String,
    SenderGender: WdSalutationGender,
    SenderInitials: String,
    SenderJobTitle: String,
    SenderName: String,
    SenderReference: String,
    Subject: String,
    WordDotLetterContent_typekey: LetterContent
  ): LetterContent = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AttentionLine = AttentionLine.asInstanceOf[js.Any], CCList = CCList.asInstanceOf[js.Any], Closing = Closing.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DateFormat = DateFormat.asInstanceOf[js.Any], Duplicate = Duplicate.asInstanceOf[js.Any], EnclosureNumber = EnclosureNumber.asInstanceOf[js.Any], IncludeHeaderFooter = IncludeHeaderFooter.asInstanceOf[js.Any], InfoBlock = InfoBlock.asInstanceOf[js.Any], LetterStyle = LetterStyle.asInstanceOf[js.Any], Letterhead = Letterhead.asInstanceOf[js.Any], LetterheadLocation = LetterheadLocation.asInstanceOf[js.Any], LetterheadSize = LetterheadSize.asInstanceOf[js.Any], MailingInstructions = MailingInstructions.asInstanceOf[js.Any], PageDesign = PageDesign.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RecipientAddress = RecipientAddress.asInstanceOf[js.Any], RecipientCode = RecipientCode.asInstanceOf[js.Any], RecipientGender = RecipientGender.asInstanceOf[js.Any], RecipientName = RecipientName.asInstanceOf[js.Any], RecipientReference = RecipientReference.asInstanceOf[js.Any], ReturnAddress = ReturnAddress.asInstanceOf[js.Any], ReturnAddressShortForm = ReturnAddressShortForm.asInstanceOf[js.Any], Salutation = Salutation.asInstanceOf[js.Any], SalutationType = SalutationType.asInstanceOf[js.Any], SenderCity = SenderCity.asInstanceOf[js.Any], SenderCode = SenderCode.asInstanceOf[js.Any], SenderCompany = SenderCompany.asInstanceOf[js.Any], SenderGender = SenderGender.asInstanceOf[js.Any], SenderInitials = SenderInitials.asInstanceOf[js.Any], SenderJobTitle = SenderJobTitle.asInstanceOf[js.Any], SenderName = SenderName.asInstanceOf[js.Any], SenderReference = SenderReference.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.LetterContent_typekey")(WordDotLetterContent_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LetterContent]
  }
  @scala.inline
  implicit class LetterContentOps[Self <: LetterContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttentionLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttentionLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCCList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CCList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Closing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuplicate(value: LetterContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duplicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnclosureNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnclosureNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeHeaderFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeHeaderFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLetterStyle(value: WdLetterStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LetterStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLetterhead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Letterhead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLetterheadLocation(value: WdLetterheadLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LetterheadLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLetterheadSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LetterheadSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMailingInstructions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MailingInstructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageDesign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageDesign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipientAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecipientAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipientCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecipientCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipientGender(value: WdSalutationGender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecipientGender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipientName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecipientName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipientReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecipientReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnAddressShortForm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnAddressShortForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSalutation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Salutation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSalutationType(value: WdSalutationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SalutationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderCity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderCompany(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderCompany")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderGender(value: WdSalutationGender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderGender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderInitials(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderInitials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderJobTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderJobTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotLetterContent_typekey(value: LetterContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.LetterContent_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

