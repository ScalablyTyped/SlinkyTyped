package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathFunction extends js.Object {
  val Acc: OMathAcc = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Args: OMathArgs = js.native
  val Bar: OMathBar = js.native
  val BorderBox: OMathBorderBox = js.native
  val Box: OMathBox = js.native
  val Creator: Double = js.native
  val Delim: OMathDelim = js.native
  val EqArray: OMathEqArray = js.native
  val Frac: OMathFrac = js.native
  val Func: OMathFunc = js.native
  val GroupChar: OMathGroupChar = js.native
  val LimLow: OMathLimLow = js.native
  val LimUpp: OMathLimUpp = js.native
  val Mat: OMathMat = js.native
  val Nary: OMathNary = js.native
  val OMath: typingsSlinky.activexWord.Word.OMath = js.native
  val Parent: js.Any = js.native
  val Phantom: OMathPhantom = js.native
  val Rad: OMathRad = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  val ScrPre: OMathScrPre = js.native
  val ScrSub: OMathScrSub = js.native
  val ScrSubSup: OMathScrSubSup = js.native
  val ScrSup: OMathScrSup = js.native
  val Type: WdOMathFunctionType = js.native
  @JSName("Word.OMathFunction_typekey")
  var WordDotOMathFunction_typekey: OMathFunction = js.native
  def Remove(): OMathFunction = js.native
}

object OMathFunction {
  @scala.inline
  def apply(
    Acc: OMathAcc,
    Application: Application,
    Args: OMathArgs,
    Bar: OMathBar,
    BorderBox: OMathBorderBox,
    Box: OMathBox,
    Creator: Double,
    Delim: OMathDelim,
    EqArray: OMathEqArray,
    Frac: OMathFrac,
    Func: OMathFunc,
    GroupChar: OMathGroupChar,
    LimLow: OMathLimLow,
    LimUpp: OMathLimUpp,
    Mat: OMathMat,
    Nary: OMathNary,
    OMath: OMath,
    Parent: js.Any,
    Phantom: OMathPhantom,
    Rad: OMathRad,
    Range: Range,
    Remove: () => OMathFunction,
    ScrPre: OMathScrPre,
    ScrSub: OMathScrSub,
    ScrSubSup: OMathScrSubSup,
    ScrSup: OMathScrSup,
    Type: WdOMathFunctionType,
    WordDotOMathFunction_typekey: OMathFunction
  ): OMathFunction = {
    val __obj = js.Dynamic.literal(Acc = Acc.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], Bar = Bar.asInstanceOf[js.Any], BorderBox = BorderBox.asInstanceOf[js.Any], Box = Box.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delim = Delim.asInstanceOf[js.Any], EqArray = EqArray.asInstanceOf[js.Any], Frac = Frac.asInstanceOf[js.Any], Func = Func.asInstanceOf[js.Any], GroupChar = GroupChar.asInstanceOf[js.Any], LimLow = LimLow.asInstanceOf[js.Any], LimUpp = LimUpp.asInstanceOf[js.Any], Mat = Mat.asInstanceOf[js.Any], Nary = Nary.asInstanceOf[js.Any], OMath = OMath.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Phantom = Phantom.asInstanceOf[js.Any], Rad = Rad.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Remove = js.Any.fromFunction0(Remove), ScrPre = ScrPre.asInstanceOf[js.Any], ScrSub = ScrSub.asInstanceOf[js.Any], ScrSubSup = ScrSubSup.asInstanceOf[js.Any], ScrSup = ScrSup.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathFunction_typekey")(WordDotOMathFunction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathFunction]
  }
  @scala.inline
  implicit class OMathFunctionOps[Self <: OMathFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcc(value: OMathAcc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Acc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: OMathArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBar(value: OMathBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderBox(value: OMathBorderBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorderBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBox(value: OMathBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Box")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelim(value: OMathDelim): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEqArray(value: OMathEqArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EqArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrac(value: OMathFrac): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Frac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunc(value: OMathFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Func")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupChar(value: OMathGroupChar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimLow(value: OMathLimLow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimLow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimUpp(value: OMathLimUpp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimUpp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMat(value: OMathMat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNary(value: OMathNary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOMath(value: OMath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OMath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhantom(value: OMathPhantom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phantom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRad(value: OMathRad): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: () => OMathFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScrPre(value: OMathScrPre): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScrPre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrSub(value: OMathScrSub): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScrSub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrSubSup(value: OMathScrSubSup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScrSubSup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrSup(value: OMathScrSup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScrSup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: WdOMathFunctionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotOMathFunction_typekey(value: OMathFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathFunction_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

