package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathDelim extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var BegChar: Double = js.native
  val Creator: Double = js.native
  val E: OMathArgs = js.native
  var EndChar: Double = js.native
  var Grow: Boolean = js.native
  var NoLeftChar: Boolean = js.native
  var NoRightChar: Boolean = js.native
  val Parent: js.Any = js.native
  var SepChar: Double = js.native
  var Shape: WdOMathShapeType = js.native
  @JSName("Word.OMathDelim_typekey")
  var WordDotOMathDelim_typekey: OMathDelim = js.native
}

object OMathDelim {
  @scala.inline
  def apply(
    Application: Application,
    BegChar: Double,
    Creator: Double,
    E: OMathArgs,
    EndChar: Double,
    Grow: Boolean,
    NoLeftChar: Boolean,
    NoRightChar: Boolean,
    Parent: js.Any,
    SepChar: Double,
    Shape: WdOMathShapeType,
    WordDotOMathDelim_typekey: OMathDelim
  ): OMathDelim = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BegChar = BegChar.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], EndChar = EndChar.asInstanceOf[js.Any], Grow = Grow.asInstanceOf[js.Any], NoLeftChar = NoLeftChar.asInstanceOf[js.Any], NoRightChar = NoRightChar.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SepChar = SepChar.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathDelim_typekey")(WordDotOMathDelim_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathDelim]
  }
  @scala.inline
  implicit class OMathDelimOps[Self <: OMathDelim] (val x: Self) extends AnyVal {
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
    def withBegChar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BegChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withE(value: OMathArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndChar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Grow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoLeftChar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoLeftChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoRightChar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoRightChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSepChar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SepChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: WdOMathShapeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotOMathDelim_typekey(value: OMathDelim): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OMathDelim_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

