package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Breaks: typingsSlinky.activexWord.Word.Breaks = js.native
  val Creator: Double = js.native
  val EnhMetaFileBits: js.Any = js.native
  val Height: Double = js.native
  val Left: Double = js.native
  val Parent: js.Any = js.native
  val Rectangles: typingsSlinky.activexWord.Word.Rectangles = js.native
  val Top: Double = js.native
  val Width: Double = js.native
  @JSName("Word.Page_typekey")
  var WordDotPage_typekey: Page = js.native
}

object Page {
  @scala.inline
  def apply(
    Application: Application,
    Breaks: Breaks,
    Creator: Double,
    EnhMetaFileBits: js.Any,
    Height: Double,
    Left: Double,
    Parent: js.Any,
    Rectangles: Rectangles,
    Top: Double,
    Width: Double,
    WordDotPage_typekey: Page
  ): Page = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Breaks = Breaks.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EnhMetaFileBits = EnhMetaFileBits.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Rectangles = Rectangles.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Page_typekey")(WordDotPage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
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
    def withBreaks(value: Breaks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Breaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnhMetaFileBits(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnhMetaFileBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRectangles(value: Rectangles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rectangles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotPage_typekey(value: Page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Page_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

