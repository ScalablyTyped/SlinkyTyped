package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageSetup extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var FirstSlideNumber: Double = js.native
  var NotesOrientation: MsoOrientation = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.PageSetup_typekey")
  var PowerPointDotPageSetup_typekey: PageSetup = js.native
  var SlideHeight: Double = js.native
  var SlideOrientation: MsoOrientation = js.native
  var SlideSize: PpSlideSizeType = js.native
  var SlideWidth: Double = js.native
}

object PageSetup {
  @scala.inline
  def apply(
    Application: Application,
    FirstSlideNumber: Double,
    NotesOrientation: MsoOrientation,
    Parent: js.Any,
    PowerPointDotPageSetup_typekey: PageSetup,
    SlideHeight: Double,
    SlideOrientation: MsoOrientation,
    SlideSize: PpSlideSizeType,
    SlideWidth: Double
  ): PageSetup = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], FirstSlideNumber = FirstSlideNumber.asInstanceOf[js.Any], NotesOrientation = NotesOrientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SlideHeight = SlideHeight.asInstanceOf[js.Any], SlideOrientation = SlideOrientation.asInstanceOf[js.Any], SlideSize = SlideSize.asInstanceOf[js.Any], SlideWidth = SlideWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PageSetup_typekey")(PowerPointDotPageSetup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSetup]
  }
  @scala.inline
  implicit class PageSetupOps[Self <: PageSetup] (val x: Self) extends AnyVal {
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
    def withFirstSlideNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstSlideNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotesOrientation(value: MsoOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotesOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotPageSetup_typekey(value: PageSetup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.PageSetup_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlideHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideOrientation(value: MsoOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlideOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideSize(value: PpSlideSizeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlideSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlideWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

