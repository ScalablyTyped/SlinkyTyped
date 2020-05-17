package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TickLabels extends js.Object {
  var Alignment: Double = js.native
  val Application: js.Any = js.native
  var AutoScaleFont: js.Any = js.native
  val Creator: Double = js.native
  val Depth: Double = js.native
  val Font: ChartFont = js.native
  val Format: ChartFormat = js.native
  var MultiLevel: Boolean = js.native
  val Name: String = js.native
  var NumberFormat: String = js.native
  var NumberFormatLinked: Boolean = js.native
  var NumberFormatLocal: js.Any = js.native
  var Offset: Double = js.native
  var Orientation: XlTickLabelOrientation = js.native
  val Parent: js.Any = js.native
  var ReadingOrder: Double = js.native
  @JSName("Word.TickLabels_typekey")
  var WordDotTickLabels_typekey: TickLabels = js.native
  def Delete(): js.Any = js.native
  def Select(): js.Any = js.native
}

object TickLabels {
  @scala.inline
  def apply(
    Alignment: Double,
    Application: js.Any,
    AutoScaleFont: js.Any,
    Creator: Double,
    Delete: () => js.Any,
    Depth: Double,
    Font: ChartFont,
    Format: ChartFormat,
    MultiLevel: Boolean,
    Name: String,
    NumberFormat: String,
    NumberFormatLinked: Boolean,
    NumberFormatLocal: js.Any,
    Offset: Double,
    Orientation: XlTickLabelOrientation,
    Parent: js.Any,
    ReadingOrder: Double,
    Select: () => js.Any,
    WordDotTickLabels_typekey: TickLabels
  ): TickLabels = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Depth = Depth.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], MultiLevel = MultiLevel.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], NumberFormatLinked = NumberFormatLinked.asInstanceOf[js.Any], NumberFormatLocal = NumberFormatLocal.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReadingOrder = ReadingOrder.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Word.TickLabels_typekey")(WordDotTickLabels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickLabels]
  }
  @scala.inline
  implicit class TickLabelsOps[Self <: TickLabels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoScaleFont(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScaleFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: ChartFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: ChartFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberFormatLinked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberFormatLinked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberFormatLocal(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberFormatLocal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: XlTickLabelOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadingOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadingOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWordDotTickLabels_typekey(value: TickLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.TickLabels_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

