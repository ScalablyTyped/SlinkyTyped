package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.MsoColorType
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorFormat extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var Black: Double = js.native
  var Brightness: Double = js.native
  val Creator: Double = js.native
  var Cyan: Double = js.native
  var Magenta: Double = js.native
  var Name: String = js.native
  var ObjectThemeColor: WdThemeColorIndex = js.native
  var OverPrint: MsoTriState = js.native
  val Parent: js.Any = js.native
  var RGB: Double = js.native
  var SchemeColor: Double = js.native
  var TintAndShade: Double = js.native
  val Type: MsoColorType = js.native
  @JSName("Word.ColorFormat_typekey")
  var WordDotColorFormat_typekey: ColorFormat = js.native
  var Yellow: Double = js.native
  def Ink(Index: Double): Double = js.native
  def SetCMYK(Cyan: Double, Magenta: Double, Yellow: Double, Black: Double): Unit = js.native
}

object ColorFormat {
  @scala.inline
  def apply(
    Application: Application,
    Black: Double,
    Brightness: Double,
    Creator: Double,
    Cyan: Double,
    Ink: Double => Double,
    Magenta: Double,
    Name: String,
    ObjectThemeColor: WdThemeColorIndex,
    OverPrint: MsoTriState,
    Parent: js.Any,
    RGB: Double,
    SchemeColor: Double,
    SetCMYK: (Double, Double, Double, Double) => Unit,
    TintAndShade: Double,
    Type: MsoColorType,
    WordDotColorFormat_typekey: ColorFormat,
    Yellow: Double
  ): ColorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Black = Black.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Cyan = Cyan.asInstanceOf[js.Any], Ink = js.Any.fromFunction1(Ink), Magenta = Magenta.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectThemeColor = ObjectThemeColor.asInstanceOf[js.Any], OverPrint = OverPrint.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], SchemeColor = SchemeColor.asInstanceOf[js.Any], SetCMYK = js.Any.fromFunction4(SetCMYK), TintAndShade = TintAndShade.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Yellow = Yellow.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ColorFormat_typekey")(WordDotColorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorFormat]
  }
  @scala.inline
  implicit class ColorFormatOps[Self <: ColorFormat] (val x: Self) extends AnyVal {
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
    def withBlack(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Black")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrightness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCyan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cyan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInk(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMagenta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Magenta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectThemeColor(value: WdThemeColorIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectThemeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverPrint(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRGB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RGB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemeColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetCMYK(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetCMYK")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withTintAndShade(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TintAndShade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MsoColorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotColorFormat_typekey(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.ColorFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYellow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Yellow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

