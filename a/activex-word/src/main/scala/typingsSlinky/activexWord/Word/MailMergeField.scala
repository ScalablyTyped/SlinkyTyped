package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailMergeField extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var Code: Range = js.native
  val Creator: Double = js.native
  var Locked: Boolean = js.native
  val Next: MailMergeField = js.native
  val Parent: js.Any = js.native
  val Previous: MailMergeField = js.native
  val Type: WdFieldType = js.native
  @JSName("Word.MailMergeField_typekey")
  var WordDotMailMergeField_typekey: MailMergeField = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
}

object MailMergeField {
  @scala.inline
  def apply(
    Application: Application,
    Code: Range,
    Copy: () => Unit,
    Creator: Double,
    Cut: () => Unit,
    Delete: () => Unit,
    Locked: Boolean,
    Next: MailMergeField,
    Parent: js.Any,
    Previous: MailMergeField,
    Select: () => Unit,
    Type: WdFieldType,
    WordDotMailMergeField_typekey: MailMergeField
  ): MailMergeField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), Locked = Locked.asInstanceOf[js.Any], Next = Next.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Previous = Previous.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MailMergeField_typekey")(WordDotMailMergeField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeField]
  }
  @scala.inline
  implicit class MailMergeFieldOps[Self <: MailMergeField] (val x: Self) extends AnyVal {
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
    def withCode(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCut(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: MailMergeField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevious(value: MailMergeField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Previous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: WdFieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotMailMergeField_typekey(value: MailMergeField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.MailMergeField_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

