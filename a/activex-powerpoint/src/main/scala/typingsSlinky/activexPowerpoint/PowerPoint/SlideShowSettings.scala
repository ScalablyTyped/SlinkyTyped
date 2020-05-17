package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlideShowSettings extends js.Object {
  var AdvanceMode: PpSlideShowAdvanceMode = js.native
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var EndingSlide: Double = js.native
  var LoopUntilStopped: MsoTriState = js.native
  val NamedSlideShows: typingsSlinky.activexPowerpoint.PowerPoint.NamedSlideShows = js.native
  val Parent: js.Any = js.native
  val PointerColor: ColorFormat = js.native
  @JSName("PowerPoint.SlideShowSettings_typekey")
  var PowerPointDotSlideShowSettings_typekey: SlideShowSettings = js.native
  var RangeType: PpSlideShowRangeType = js.native
  var ShowMediaControls: MsoTriState = js.native
  var ShowPresenterView: MsoTriState = js.native
  var ShowScrollbar: MsoTriState = js.native
  var ShowType: PpSlideShowType = js.native
  var ShowWithAnimation: MsoTriState = js.native
  var ShowWithNarration: MsoTriState = js.native
  var SlideShowName: String = js.native
  var StartingSlide: Double = js.native
  def Run(): SlideShowWindow = js.native
}

object SlideShowSettings {
  @scala.inline
  def apply(
    AdvanceMode: PpSlideShowAdvanceMode,
    Application: Application,
    EndingSlide: Double,
    LoopUntilStopped: MsoTriState,
    NamedSlideShows: NamedSlideShows,
    Parent: js.Any,
    PointerColor: ColorFormat,
    PowerPointDotSlideShowSettings_typekey: SlideShowSettings,
    RangeType: PpSlideShowRangeType,
    Run: () => SlideShowWindow,
    ShowMediaControls: MsoTriState,
    ShowPresenterView: MsoTriState,
    ShowScrollbar: MsoTriState,
    ShowType: PpSlideShowType,
    ShowWithAnimation: MsoTriState,
    ShowWithNarration: MsoTriState,
    SlideShowName: String,
    StartingSlide: Double
  ): SlideShowSettings = {
    val __obj = js.Dynamic.literal(AdvanceMode = AdvanceMode.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], EndingSlide = EndingSlide.asInstanceOf[js.Any], LoopUntilStopped = LoopUntilStopped.asInstanceOf[js.Any], NamedSlideShows = NamedSlideShows.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PointerColor = PointerColor.asInstanceOf[js.Any], RangeType = RangeType.asInstanceOf[js.Any], Run = js.Any.fromFunction0(Run), ShowMediaControls = ShowMediaControls.asInstanceOf[js.Any], ShowPresenterView = ShowPresenterView.asInstanceOf[js.Any], ShowScrollbar = ShowScrollbar.asInstanceOf[js.Any], ShowType = ShowType.asInstanceOf[js.Any], ShowWithAnimation = ShowWithAnimation.asInstanceOf[js.Any], ShowWithNarration = ShowWithNarration.asInstanceOf[js.Any], SlideShowName = SlideShowName.asInstanceOf[js.Any], StartingSlide = StartingSlide.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SlideShowSettings_typekey")(PowerPointDotSlideShowSettings_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideShowSettings]
  }
  @scala.inline
  implicit class SlideShowSettingsOps[Self <: SlideShowSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvanceMode(value: PpSlideShowAdvanceMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdvanceMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndingSlide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndingSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoopUntilStopped(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoopUntilStopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamedSlideShows(value: NamedSlideShows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedSlideShows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointerColor(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PointerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotSlideShowSettings_typekey(value: SlideShowSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.SlideShowSettings_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeType(value: PpSlideShowRangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun(value: () => SlideShowWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Run")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowMediaControls(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowMediaControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowPresenterView(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowPresenterView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowScrollbar(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowType(value: PpSlideShowType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowWithAnimation(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowWithAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowWithNarration(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowWithNarration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideShowName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlideShowName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartingSlide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartingSlide")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

