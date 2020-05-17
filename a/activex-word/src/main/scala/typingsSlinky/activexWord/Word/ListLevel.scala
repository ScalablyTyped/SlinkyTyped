package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLevel extends js.Object {
  var Alignment: WdListLevelAlignment = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var Font: typingsSlinky.activexWord.Word.Font = js.native
  val Index: Double = js.native
  var LinkedStyle: String = js.native
  var NumberFormat: String = js.native
  var NumberPosition: Double = js.native
  var NumberStyle: WdListNumberStyle = js.native
  val Parent: js.Any = js.native
  val PictureBullet: InlineShape = js.native
  var ResetOnHigher: Double = js.native
  var ResetOnHigherOld: Boolean = js.native
  var StartAt: Double = js.native
  var TabPosition: Double = js.native
  var TextPosition: Double = js.native
  var TrailingCharacter: WdTrailingCharacter = js.native
  @JSName("Word.ListLevel_typekey")
  var WordDotListLevel_typekey: ListLevel = js.native
  def ApplyPictureBullet(FileName: String): InlineShape = js.native
}

object ListLevel {
  @scala.inline
  def apply(
    Alignment: WdListLevelAlignment,
    Application: Application,
    ApplyPictureBullet: String => InlineShape,
    Creator: Double,
    Font: Font,
    Index: Double,
    LinkedStyle: String,
    NumberFormat: String,
    NumberPosition: Double,
    NumberStyle: WdListNumberStyle,
    Parent: js.Any,
    PictureBullet: InlineShape,
    ResetOnHigher: Double,
    ResetOnHigherOld: Boolean,
    StartAt: Double,
    TabPosition: Double,
    TextPosition: Double,
    TrailingCharacter: WdTrailingCharacter,
    WordDotListLevel_typekey: ListLevel
  ): ListLevel = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], ApplyPictureBullet = js.Any.fromFunction1(ApplyPictureBullet), Creator = Creator.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], LinkedStyle = LinkedStyle.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], NumberPosition = NumberPosition.asInstanceOf[js.Any], NumberStyle = NumberStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PictureBullet = PictureBullet.asInstanceOf[js.Any], ResetOnHigher = ResetOnHigher.asInstanceOf[js.Any], ResetOnHigherOld = ResetOnHigherOld.asInstanceOf[js.Any], StartAt = StartAt.asInstanceOf[js.Any], TabPosition = TabPosition.asInstanceOf[js.Any], TextPosition = TextPosition.asInstanceOf[js.Any], TrailingCharacter = TrailingCharacter.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ListLevel_typekey")(WordDotListLevel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLevel]
  }
  @scala.inline
  implicit class ListLevelOps[Self <: ListLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: WdListLevelAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplyPictureBullet(value: String => InlineShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyPictureBullet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkedStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkedStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberStyle(value: WdListNumberStyle): Self = {
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
    def withPictureBullet(value: InlineShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureBullet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetOnHigher(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResetOnHigher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetOnHigherOld(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResetOnHigherOld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrailingCharacter(value: WdTrailingCharacter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrailingCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotListLevel_typekey(value: ListLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.ListLevel_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

