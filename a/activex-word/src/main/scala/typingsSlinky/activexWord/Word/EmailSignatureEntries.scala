package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailSignatureEntries extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.EmailSignatureEntries_typekey")
  var WordDotEmailSignatureEntries_typekey: EmailSignatureEntries = js.native
  def Add(Name: String, Range: Range): EmailSignatureEntry = js.native
  def Item(Index: js.Any): EmailSignatureEntry = js.native
}

object EmailSignatureEntries {
  @scala.inline
  def apply(
    Add: (String, Range) => EmailSignatureEntry,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => EmailSignatureEntry,
    Parent: js.Any,
    WordDotEmailSignatureEntries_typekey: EmailSignatureEntries
  ): EmailSignatureEntries = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.EmailSignatureEntries_typekey")(WordDotEmailSignatureEntries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailSignatureEntries]
  }
  @scala.inline
  implicit class EmailSignatureEntriesOps[Self <: EmailSignatureEntries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (String, Range) => EmailSignatureEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any => EmailSignatureEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotEmailSignatureEntries_typekey(value: EmailSignatureEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.EmailSignatureEntries_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

