package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathMat extends js.Object {
  var Align: WdOMathVertAlignType = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var ColGap: Double = js.native
  var ColGapRule: WdOMathSpacingRule = js.native
  var ColSpacing: Double = js.native
  val Cols: OMathMatCols = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  var PlcHoldHidden: Boolean = js.native
  var RowSpacing: Double = js.native
  var RowSpacingRule: WdOMathSpacingRule = js.native
  val Rows: OMathMatRows = js.native
  @JSName("Word.OMathMat_typekey")
  var WordDotOMathMat_typekey: OMathMat = js.native
  def Cell(Row: Double, Col: Double): OMath = js.native
}

object OMathMat {
  @scala.inline
  def apply(
    Align: WdOMathVertAlignType,
    Application: Application,
    Cell: (Double, Double) => OMath,
    ColGap: Double,
    ColGapRule: WdOMathSpacingRule,
    ColSpacing: Double,
    Cols: OMathMatCols,
    Creator: Double,
    Parent: js.Any,
    PlcHoldHidden: Boolean,
    RowSpacing: Double,
    RowSpacingRule: WdOMathSpacingRule,
    Rows: OMathMatRows,
    WordDotOMathMat_typekey: OMathMat
  ): OMathMat = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Cell = js.Any.fromFunction2(Cell), ColGap = ColGap.asInstanceOf[js.Any], ColGapRule = ColGapRule.asInstanceOf[js.Any], ColSpacing = ColSpacing.asInstanceOf[js.Any], Cols = Cols.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PlcHoldHidden = PlcHoldHidden.asInstanceOf[js.Any], RowSpacing = RowSpacing.asInstanceOf[js.Any], RowSpacingRule = RowSpacingRule.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathMat_typekey")(WordDotOMathMat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathMat]
  }
  @scala.inline
  implicit class OMathMatOps[Self <: OMathMat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: WdOMathVertAlignType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCell(value: (Double, Double) => OMath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cell")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withColGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColGapRule(value: WdOMathSpacingRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColGapRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCols(value: OMathMatCols): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlcHoldHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlcHoldHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowSpacingRule(value: WdOMathSpacingRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowSpacingRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: OMathMatRows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotOMathMat_typekey(value: OMathMat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathMat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

