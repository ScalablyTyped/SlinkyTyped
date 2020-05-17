package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HorizontalLineFormat extends js.Object {
  var Alignment: WdHorizontalLineAlignment = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var NoShade: Boolean = js.native
  val Parent: js.Any = js.native
  var PercentWidth: Double = js.native
  var WidthType: WdHorizontalLineWidthType = js.native
  @JSName("Word.HorizontalLineFormat_typekey")
  var WordDotHorizontalLineFormat_typekey: HorizontalLineFormat = js.native
}

object HorizontalLineFormat {
  @scala.inline
  def apply(
    Alignment: WdHorizontalLineAlignment,
    Application: Application,
    Creator: Double,
    NoShade: Boolean,
    Parent: js.Any,
    PercentWidth: Double,
    WidthType: WdHorizontalLineWidthType,
    WordDotHorizontalLineFormat_typekey: HorizontalLineFormat
  ): HorizontalLineFormat = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], NoShade = NoShade.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PercentWidth = PercentWidth.asInstanceOf[js.Any], WidthType = WidthType.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HorizontalLineFormat_typekey")(WordDotHorizontalLineFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalLineFormat]
  }
  @scala.inline
  implicit class HorizontalLineFormatOps[Self <: HorizontalLineFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: WdHorizontalLineAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
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
    def withNoShade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoShade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PercentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidthType(value: WdHorizontalLineWidthType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WidthType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotHorizontalLineFormat_typekey(value: HorizontalLineFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.HorizontalLineFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

