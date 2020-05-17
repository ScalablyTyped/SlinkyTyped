package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionLabel extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val BuiltIn: Boolean = js.native
  var ChapterStyleLevel: Double = js.native
  val Creator: Double = js.native
  val ID: WdCaptionLabelID = js.native
  var IncludeChapterNumber: Boolean = js.native
  val Name: String = js.native
  var NumberStyle: WdCaptionNumberStyle = js.native
  val Parent: js.Any = js.native
  var Position: WdCaptionPosition = js.native
  var Separator: WdSeparatorType = js.native
  @JSName("Word.CaptionLabel_typekey")
  var WordDotCaptionLabel_typekey: CaptionLabel = js.native
  def Delete(): Unit = js.native
}

object CaptionLabel {
  @scala.inline
  def apply(
    Application: Application,
    BuiltIn: Boolean,
    ChapterStyleLevel: Double,
    Creator: Double,
    Delete: () => Unit,
    ID: WdCaptionLabelID,
    IncludeChapterNumber: Boolean,
    Name: String,
    NumberStyle: WdCaptionNumberStyle,
    Parent: js.Any,
    Position: WdCaptionPosition,
    Separator: WdSeparatorType,
    WordDotCaptionLabel_typekey: CaptionLabel
  ): CaptionLabel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BuiltIn = BuiltIn.asInstanceOf[js.Any], ChapterStyleLevel = ChapterStyleLevel.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), ID = ID.asInstanceOf[js.Any], IncludeChapterNumber = IncludeChapterNumber.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberStyle = NumberStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CaptionLabel_typekey")(WordDotCaptionLabel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionLabel]
  }
  @scala.inline
  implicit class CaptionLabelOps[Self <: CaptionLabel] (val x: Self) extends AnyVal {
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
    def withBuiltIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuiltIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChapterStyleLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChapterStyleLevel")(value.asInstanceOf[js.Any])
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
    def withID(value: WdCaptionLabelID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeChapterNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeChapterNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberStyle(value: WdCaptionNumberStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: WdCaptionPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparator(value: WdSeparatorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotCaptionLabel_typekey(value: CaptionLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.CaptionLabel_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

