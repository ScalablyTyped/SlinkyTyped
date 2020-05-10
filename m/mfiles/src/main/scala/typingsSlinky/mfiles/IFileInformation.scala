package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFFileInformationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileInformation extends js.Object {
  var EmailMessage: IEmailMessageInformation = js.native
  var FileType: MFFileInformationType = js.native
  def Clear(): Unit = js.native
  def ExtractFromFile(PathToFile: String): Unit = js.native
}

object IFileInformation {
  @scala.inline
  def apply(
    Clear: () => Unit,
    EmailMessage: IEmailMessageInformation,
    ExtractFromFile: String => Unit,
    FileType: MFFileInformationType
  ): IFileInformation = {
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), EmailMessage = EmailMessage.asInstanceOf[js.Any], ExtractFromFile = js.Any.fromFunction1(ExtractFromFile), FileType = FileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileInformation]
  }
  @scala.inline
  implicit class IFileInformationOps[Self <: IFileInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmailMessage(value: IEmailMessageInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtractFromFile(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtractFromFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFileType(value: MFFileInformationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

