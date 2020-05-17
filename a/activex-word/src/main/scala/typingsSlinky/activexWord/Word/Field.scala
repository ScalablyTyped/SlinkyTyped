package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var Code: Range = js.native
  val Creator: Double = js.native
  var Data: String = js.native
  val Index: Double = js.native
  val InlineShape: typingsSlinky.activexWord.Word.InlineShape = js.native
  val Kind: WdFieldKind = js.native
  val LinkFormat: typingsSlinky.activexWord.Word.LinkFormat = js.native
  var Locked: Boolean = js.native
  val Next: Field = js.native
  val OLEFormat: typingsSlinky.activexWord.Word.OLEFormat = js.native
  val Parent: js.Any = js.native
  val Previous: Field = js.native
  var Result: Range = js.native
  var ShowCodes: Boolean = js.native
  val Type: WdFieldType = js.native
  @JSName("Word.Field_typekey")
  var WordDotField_typekey: Field = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def DoClick(): Unit = js.native
  def Select(): Unit = js.native
  def Unlink(): Unit = js.native
  def Update(): Boolean = js.native
  def UpdateSource(): Unit = js.native
}

object Field {
  @scala.inline
  def apply(
    Application: Application,
    Code: Range,
    Copy: () => Unit,
    Creator: Double,
    Cut: () => Unit,
    Data: String,
    Delete: () => Unit,
    DoClick: () => Unit,
    Index: Double,
    InlineShape: InlineShape,
    Kind: WdFieldKind,
    LinkFormat: LinkFormat,
    Locked: Boolean,
    Next: Field,
    OLEFormat: OLEFormat,
    Parent: js.Any,
    Previous: Field,
    Result: Range,
    Select: () => Unit,
    ShowCodes: Boolean,
    Type: WdFieldType,
    Unlink: () => Unit,
    Update: () => Boolean,
    UpdateSource: () => Unit,
    WordDotField_typekey: Field
  ): Field = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), Data = Data.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DoClick = js.Any.fromFunction0(DoClick), Index = Index.asInstanceOf[js.Any], InlineShape = InlineShape.asInstanceOf[js.Any], Kind = Kind.asInstanceOf[js.Any], LinkFormat = LinkFormat.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Next = Next.asInstanceOf[js.Any], OLEFormat = OLEFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Previous = Previous.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), ShowCodes = ShowCodes.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Unlink = js.Any.fromFunction0(Unlink), Update = js.Any.fromFunction0(Update), UpdateSource = js.Any.fromFunction0(UpdateSource))
    __obj.updateDynamic("Word.Field_typekey")(WordDotField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
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
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDoClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInlineShape(value: InlineShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InlineShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: WdFieldKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkFormat(value: LinkFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOLEFormat(value: OLEFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OLEFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevious(value: Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Previous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowCodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: WdFieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnlink(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unlink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateSource(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWordDotField_typekey(value: Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Field_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

