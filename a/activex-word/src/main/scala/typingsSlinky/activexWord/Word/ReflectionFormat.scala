package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.MsoReflectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReflectionFormat extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var Blur: Double = js.native
  val Creator: Double = js.native
  var Offset: Double = js.native
  val Parent: js.Any = js.native
  var Size: Double = js.native
  var Transparency: Double = js.native
  var Type: MsoReflectionType = js.native
  @JSName("Word.ReflectionFormat_typekey")
  var WordDotReflectionFormat_typekey: ReflectionFormat = js.native
}

object ReflectionFormat {
  @scala.inline
  def apply(
    Application: Application,
    Blur: Double,
    Creator: Double,
    Offset: Double,
    Parent: js.Any,
    Size: Double,
    Transparency: Double,
    Type: MsoReflectionType,
    WordDotReflectionFormat_typekey: ReflectionFormat
  ): ReflectionFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Blur = Blur.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ReflectionFormat_typekey")(WordDotReflectionFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionFormat]
  }
  @scala.inline
  implicit class ReflectionFormatOps[Self <: ReflectionFormat] (val x: Self) extends AnyVal {
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
    def withBlur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransparency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MsoReflectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotReflectionFormat_typekey(value: ReflectionFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.ReflectionFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

