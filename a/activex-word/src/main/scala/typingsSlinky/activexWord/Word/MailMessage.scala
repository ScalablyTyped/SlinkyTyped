package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailMessage extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.MailMessage_typekey")
  var WordDotMailMessage_typekey: MailMessage = js.native
  def CheckName(): Unit = js.native
  def Delete(): Unit = js.native
  def DisplayMoveDialog(): Unit = js.native
  def DisplayProperties(): Unit = js.native
  def DisplaySelectNamesDialog(): Unit = js.native
  def Forward(): Unit = js.native
  def GoToNext(): Unit = js.native
  def GoToPrevious(): Unit = js.native
  def Reply(): Unit = js.native
  def ReplyAll(): Unit = js.native
  def ToggleHeader(): Unit = js.native
}

object MailMessage {
  @scala.inline
  def apply(
    Application: Application,
    CheckName: () => Unit,
    Creator: Double,
    Delete: () => Unit,
    DisplayMoveDialog: () => Unit,
    DisplayProperties: () => Unit,
    DisplaySelectNamesDialog: () => Unit,
    Forward: () => Unit,
    GoToNext: () => Unit,
    GoToPrevious: () => Unit,
    Parent: js.Any,
    Reply: () => Unit,
    ReplyAll: () => Unit,
    ToggleHeader: () => Unit,
    WordDotMailMessage_typekey: MailMessage
  ): MailMessage = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CheckName = js.Any.fromFunction0(CheckName), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DisplayMoveDialog = js.Any.fromFunction0(DisplayMoveDialog), DisplayProperties = js.Any.fromFunction0(DisplayProperties), DisplaySelectNamesDialog = js.Any.fromFunction0(DisplaySelectNamesDialog), Forward = js.Any.fromFunction0(Forward), GoToNext = js.Any.fromFunction0(GoToNext), GoToPrevious = js.Any.fromFunction0(GoToPrevious), Parent = Parent.asInstanceOf[js.Any], Reply = js.Any.fromFunction0(Reply), ReplyAll = js.Any.fromFunction0(ReplyAll), ToggleHeader = js.Any.fromFunction0(ToggleHeader))
    __obj.updateDynamic("Word.MailMessage_typekey")(WordDotMailMessage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMessage]
  }
  @scala.inline
  implicit class MailMessageOps[Self <: MailMessage] (val x: Self) extends AnyVal {
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
    def withCheckName(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisplayMoveDialog(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayMoveDialog")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisplayProperties(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisplaySelectNamesDialog(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplaySelectNamesDialog")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withForward(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Forward")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGoToNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GoToNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGoToPrevious(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GoToPrevious")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReply(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reply")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReplyAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggleHeader(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToggleHeader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWordDotMailMessage_typekey(value: MailMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.MailMessage_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

