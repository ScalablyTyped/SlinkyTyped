package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlideShowSettings extends StObject {
  
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
  
  def Run(): SlideShowWindow = js.native
  
  var ShowMediaControls: MsoTriState = js.native
  
  var ShowPresenterView: MsoTriState = js.native
  
  var ShowScrollbar: MsoTriState = js.native
  
  var ShowType: PpSlideShowType = js.native
  
  var ShowWithAnimation: MsoTriState = js.native
  
  var ShowWithNarration: MsoTriState = js.native
  
  var SlideShowName: String = js.native
  
  var StartingSlide: Double = js.native
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
  implicit class SlideShowSettingsMutableBuilder[Self <: SlideShowSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvanceMode(value: PpSlideShowAdvanceMode): Self = StObject.set(x, "AdvanceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndingSlide(value: Double): Self = StObject.set(x, "EndingSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUntilStopped(value: MsoTriState): Self = StObject.set(x, "LoopUntilStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedSlideShows(value: NamedSlideShows): Self = StObject.set(x, "NamedSlideShows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerColor(value: ColorFormat): Self = StObject.set(x, "PointerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotSlideShowSettings_typekey(value: SlideShowSettings): Self = StObject.set(x, "PowerPoint.SlideShowSettings_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeType(value: PpSlideShowRangeType): Self = StObject.set(x, "RangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun(value: () => SlideShowWindow): Self = StObject.set(x, "Run", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowMediaControls(value: MsoTriState): Self = StObject.set(x, "ShowMediaControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPresenterView(value: MsoTriState): Self = StObject.set(x, "ShowPresenterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowScrollbar(value: MsoTriState): Self = StObject.set(x, "ShowScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowType(value: PpSlideShowType): Self = StObject.set(x, "ShowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowWithAnimation(value: MsoTriState): Self = StObject.set(x, "ShowWithAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowWithNarration(value: MsoTriState): Self = StObject.set(x, "ShowWithNarration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideShowName(value: String): Self = StObject.set(x, "SlideShowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingSlide(value: Double): Self = StObject.set(x, "StartingSlide", value.asInstanceOf[js.Any])
  }
}
