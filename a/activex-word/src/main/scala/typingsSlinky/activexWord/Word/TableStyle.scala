package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableStyle extends js.Object {
  var Alignment: WdRowAlignment = js.native
  var AllowBreakAcrossPage: Double = js.native
  var AllowPageBreaks: Boolean = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var Borders: typingsSlinky.activexWord.Word.Borders = js.native
  var BottomPadding: Double = js.native
  var ColumnStripe: Double = js.native
  val Creator: Double = js.native
  var LeftIndent: Double = js.native
  var LeftPadding: Double = js.native
  val Parent: js.Any = js.native
  var RightPadding: Double = js.native
  var RowStripe: Double = js.native
  val Shading: typingsSlinky.activexWord.Word.Shading = js.native
  var Spacing: Double = js.native
  var TableDirection: WdTableDirection = js.native
  var TopPadding: Double = js.native
  @JSName("Word.TableStyle_typekey")
  var WordDotTableStyle_typekey: TableStyle = js.native
  def Condition(ConditionCode: WdConditionCode): ConditionalStyle = js.native
}

object TableStyle {
  @scala.inline
  def apply(
    Alignment: WdRowAlignment,
    AllowBreakAcrossPage: Double,
    AllowPageBreaks: Boolean,
    Application: Application,
    Borders: Borders,
    BottomPadding: Double,
    ColumnStripe: Double,
    Condition: WdConditionCode => ConditionalStyle,
    Creator: Double,
    LeftIndent: Double,
    LeftPadding: Double,
    Parent: js.Any,
    RightPadding: Double,
    RowStripe: Double,
    Shading: Shading,
    Spacing: Double,
    TableDirection: WdTableDirection,
    TopPadding: Double,
    WordDotTableStyle_typekey: TableStyle
  ): TableStyle = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], AllowBreakAcrossPage = AllowBreakAcrossPage.asInstanceOf[js.Any], AllowPageBreaks = AllowPageBreaks.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], BottomPadding = BottomPadding.asInstanceOf[js.Any], ColumnStripe = ColumnStripe.asInstanceOf[js.Any], Condition = js.Any.fromFunction1(Condition), Creator = Creator.asInstanceOf[js.Any], LeftIndent = LeftIndent.asInstanceOf[js.Any], LeftPadding = LeftPadding.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RightPadding = RightPadding.asInstanceOf[js.Any], RowStripe = RowStripe.asInstanceOf[js.Any], Shading = Shading.asInstanceOf[js.Any], Spacing = Spacing.asInstanceOf[js.Any], TableDirection = TableDirection.asInstanceOf[js.Any], TopPadding = TopPadding.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TableStyle_typekey")(WordDotTableStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableStyle]
  }
  @scala.inline
  implicit class TableStyleOps[Self <: TableStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: WdRowAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowBreakAcrossPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowBreakAcrossPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowPageBreaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowPageBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorders(value: Borders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Borders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnStripe(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnStripe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCondition(value: WdConditionCode => ConditionalStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Condition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowStripe(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowStripe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShading(value: Shading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableDirection(value: WdTableDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotTableStyle_typekey(value: TableStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.TableStyle_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

