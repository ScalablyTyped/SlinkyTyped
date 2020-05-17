package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlideShowWindow extends js.Object {
  val Active: MsoTriState = js.native
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var Height: Double = js.native
  val IsFullScreen: MsoTriState = js.native
  var Left: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.SlideShowWindow_typekey")
  var PowerPointDotSlideShowWindow_typekey: SlideShowWindow = js.native
  val Presentation: typingsSlinky.activexPowerpoint.PowerPoint.Presentation = js.native
  var Top: Double = js.native
  val View: SlideShowView = js.native
  var Width: Double = js.native
  def Activate(): Unit = js.native
}

object SlideShowWindow {
  @scala.inline
  def apply(
    Activate: () => Unit,
    Active: MsoTriState,
    Application: Application,
    Height: Double,
    IsFullScreen: MsoTriState,
    Left: Double,
    Parent: js.Any,
    PowerPointDotSlideShowWindow_typekey: SlideShowWindow,
    Presentation: Presentation,
    Top: Double,
    View: SlideShowView,
    Width: Double
  ): SlideShowWindow = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), Active = Active.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], IsFullScreen = IsFullScreen.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Presentation = Presentation.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SlideShowWindow_typekey")(PowerPointDotSlideShowWindow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideShowWindow]
  }
  @scala.inline
  implicit class SlideShowWindowOps[Self <: SlideShowWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withActive(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFullScreen(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsFullScreen")(value.asInstanceOf[js.Any])
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
    def withPowerPointDotSlideShowWindow_typekey(value: SlideShowWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.SlideShowWindow_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresentation(value: Presentation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Presentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: SlideShowView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("View")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

