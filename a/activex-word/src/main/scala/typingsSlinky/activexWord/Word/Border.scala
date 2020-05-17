package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Border extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var ArtStyle: WdPageBorderArt = js.native
  var ArtWidth: Double = js.native
  var Color: WdColor = js.native
  var ColorIndex: WdColorIndex = js.native
  val Creator: Double = js.native
  val Inside: Boolean = js.native
  var LineStyle: WdLineStyle = js.native
  var LineWidth: WdLineWidth = js.native
  val Parent: js.Any = js.native
  var Visible: Boolean = js.native
  @JSName("Word.Border_typekey")
  var WordDotBorder_typekey: Border = js.native
}

object Border {
  @scala.inline
  def apply(
    Application: Application,
    ArtStyle: WdPageBorderArt,
    ArtWidth: Double,
    Color: WdColor,
    ColorIndex: WdColorIndex,
    Creator: Double,
    Inside: Boolean,
    LineStyle: WdLineStyle,
    LineWidth: WdLineWidth,
    Parent: js.Any,
    Visible: Boolean,
    WordDotBorder_typekey: Border
  ): Border = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ArtStyle = ArtStyle.asInstanceOf[js.Any], ArtWidth = ArtWidth.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Inside = Inside.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], LineWidth = LineWidth.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Border_typekey")(WordDotBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  @scala.inline
  implicit class BorderOps[Self <: Border] (val x: Self) extends AnyVal {
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
    def withArtStyle(value: WdPageBorderArt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArtStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArtWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: WdColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorIndex(value: WdColorIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineStyle(value: WdLineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineWidth(value: WdLineWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotBorder_typekey(value: Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Border_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

