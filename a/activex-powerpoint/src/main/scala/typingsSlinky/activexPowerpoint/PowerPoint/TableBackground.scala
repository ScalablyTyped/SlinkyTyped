package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.ReflectionFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableBackground extends js.Object {
  val Fill: FillFormat = js.native
  val Picture: PictureFormat = js.native
  @JSName("PowerPoint.TableBackground_typekey")
  var PowerPointDotTableBackground_typekey: TableBackground = js.native
  val Reflection: ReflectionFormat = js.native
  val Shadow: ShadowFormat = js.native
}

object TableBackground {
  @scala.inline
  def apply(
    Fill: FillFormat,
    Picture: PictureFormat,
    PowerPointDotTableBackground_typekey: TableBackground,
    Reflection: ReflectionFormat,
    Shadow: ShadowFormat
  ): TableBackground = {
    val __obj = js.Dynamic.literal(Fill = Fill.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], Reflection = Reflection.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TableBackground_typekey")(PowerPointDotTableBackground_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBackground]
  }
  @scala.inline
  implicit class TableBackgroundOps[Self <: TableBackground] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: FillFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicture(value: PictureFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotTableBackground_typekey(value: TableBackground): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.TableBackground_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReflection(value: ReflectionFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reflection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadow(value: ShadowFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shadow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

