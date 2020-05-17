package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeEffectScheme extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  @JSName("Office.ThemeEffectScheme_typekey")
  var OfficeDotThemeEffectScheme_typekey: ThemeEffectScheme = js.native
  val Parent: js.Any = js.native
  def Load(FileName: String): Unit = js.native
}

object ThemeEffectScheme {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Load: String => Unit,
    OfficeDotThemeEffectScheme_typekey: ThemeEffectScheme,
    Parent: js.Any
  ): ThemeEffectScheme = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Load = js.Any.fromFunction1(Load), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ThemeEffectScheme_typekey")(OfficeDotThemeEffectScheme_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeEffectScheme]
  }
  @scala.inline
  implicit class ThemeEffectSchemeOps[Self <: ThemeEffectScheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOfficeDotThemeEffectScheme_typekey(value: ThemeEffectScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.ThemeEffectScheme_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

