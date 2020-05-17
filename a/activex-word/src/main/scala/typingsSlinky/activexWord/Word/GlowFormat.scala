package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlowFormat extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Color: ColorFormat = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  var Radius: Double = js.native
  var Transparency: Double = js.native
  @JSName("Word.GlowFormat_typekey")
  var WordDotGlowFormat_typekey: GlowFormat = js.native
}

object GlowFormat {
  @scala.inline
  def apply(
    Application: Application,
    Color: ColorFormat,
    Creator: Double,
    Parent: js.Any,
    Radius: Double,
    Transparency: Double,
    WordDotGlowFormat_typekey: GlowFormat
  ): GlowFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Radius = Radius.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.GlowFormat_typekey")(WordDotGlowFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlowFormat]
  }
  @scala.inline
  implicit class GlowFormatOps[Self <: GlowFormat] (val x: Self) extends AnyVal {
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
    def withColor(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
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
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransparency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotGlowFormat_typekey(value: GlowFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.GlowFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

