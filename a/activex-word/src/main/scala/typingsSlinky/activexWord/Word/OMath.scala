package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMath extends js.Object {
  var AlignPoint: Double = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val ArgIndex: Double = js.native
  var ArgSize: Double = js.native
  val Breaks: OMathBreaks = js.native
  val Creator: Double = js.native
  val Functions: OMathFunctions = js.native
  var Justification: WdOMathJc = js.native
  val NestingLevel: Double = js.native
  val Parent: js.Any = js.native
  val ParentArg: OMath = js.native
  val ParentCol: OMathMatCol = js.native
  val ParentFunction: OMathFunction = js.native
  val ParentOMath: OMath = js.native
  val ParentRow: OMathMatRow = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  var Type: WdOMathType = js.native
  @JSName("Word.OMath_typekey")
  var WordDotOMath_typekey: OMath = js.native
  def BuildUp(): Unit = js.native
  def ConvertToLiteralText(): Unit = js.native
  def ConvertToMathText(): Unit = js.native
  def ConvertToNormalText(): Unit = js.native
  def Linearize(): Unit = js.native
  def Remove(): Unit = js.native
}

object OMath {
  @scala.inline
  def apply(
    AlignPoint: Double,
    Application: Application,
    ArgIndex: Double,
    ArgSize: Double,
    Breaks: OMathBreaks,
    BuildUp: () => Unit,
    ConvertToLiteralText: () => Unit,
    ConvertToMathText: () => Unit,
    ConvertToNormalText: () => Unit,
    Creator: Double,
    Functions: OMathFunctions,
    Justification: WdOMathJc,
    Linearize: () => Unit,
    NestingLevel: Double,
    Parent: js.Any,
    ParentArg: OMath,
    ParentCol: OMathMatCol,
    ParentFunction: OMathFunction,
    ParentOMath: OMath,
    ParentRow: OMathMatRow,
    Range: Range,
    Remove: () => Unit,
    Type: WdOMathType,
    WordDotOMath_typekey: OMath
  ): OMath = {
    val __obj = js.Dynamic.literal(AlignPoint = AlignPoint.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], ArgIndex = ArgIndex.asInstanceOf[js.Any], ArgSize = ArgSize.asInstanceOf[js.Any], Breaks = Breaks.asInstanceOf[js.Any], BuildUp = js.Any.fromFunction0(BuildUp), ConvertToLiteralText = js.Any.fromFunction0(ConvertToLiteralText), ConvertToMathText = js.Any.fromFunction0(ConvertToMathText), ConvertToNormalText = js.Any.fromFunction0(ConvertToNormalText), Creator = Creator.asInstanceOf[js.Any], Functions = Functions.asInstanceOf[js.Any], Justification = Justification.asInstanceOf[js.Any], Linearize = js.Any.fromFunction0(Linearize), NestingLevel = NestingLevel.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ParentArg = ParentArg.asInstanceOf[js.Any], ParentCol = ParentCol.asInstanceOf[js.Any], ParentFunction = ParentFunction.asInstanceOf[js.Any], ParentOMath = ParentOMath.asInstanceOf[js.Any], ParentRow = ParentRow.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Remove = js.Any.fromFunction0(Remove), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMath_typekey")(WordDotOMath_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMath]
  }
  @scala.inline
  implicit class OMathOps[Self <: OMath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignPoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlignPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArgIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArgSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreaks(value: OMathBreaks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Breaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildUp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuildUp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConvertToLiteralText(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConvertToLiteralText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConvertToMathText(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConvertToMathText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConvertToNormalText(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConvertToNormalText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctions(value: OMathFunctions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Functions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJustification(value: WdOMathJc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Justification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinearize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Linearize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNestingLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NestingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentArg(value: OMath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentArg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentCol(value: OMathMatCol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentFunction(value: OMathFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentOMath(value: OMath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentOMath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentRow(value: OMathMatRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: WdOMathType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotOMath_typekey(value: OMath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMath_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

