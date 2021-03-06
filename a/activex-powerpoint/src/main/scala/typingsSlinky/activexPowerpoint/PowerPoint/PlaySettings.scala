package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaySettings extends StObject {
  
  var ActionVerb: String = js.native
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  var HideWhileNotPlaying: MsoTriState = js.native
  
  var LoopUntilStopped: MsoTriState = js.native
  
  val Parent: js.Any = js.native
  
  var PauseAnimation: MsoTriState = js.native
  
  var PlayOnEntry: MsoTriState = js.native
  
  @JSName("PowerPoint.PlaySettings_typekey")
  var PowerPointDotPlaySettings_typekey: PlaySettings = js.native
  
  var RewindMovie: MsoTriState = js.native
  
  var StopAfterSlides: Double = js.native
}
object PlaySettings {
  
  @scala.inline
  def apply(
    ActionVerb: String,
    Application: Application,
    HideWhileNotPlaying: MsoTriState,
    LoopUntilStopped: MsoTriState,
    Parent: js.Any,
    PauseAnimation: MsoTriState,
    PlayOnEntry: MsoTriState,
    PowerPointDotPlaySettings_typekey: PlaySettings,
    RewindMovie: MsoTriState,
    StopAfterSlides: Double
  ): PlaySettings = {
    val __obj = js.Dynamic.literal(ActionVerb = ActionVerb.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], HideWhileNotPlaying = HideWhileNotPlaying.asInstanceOf[js.Any], LoopUntilStopped = LoopUntilStopped.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PauseAnimation = PauseAnimation.asInstanceOf[js.Any], PlayOnEntry = PlayOnEntry.asInstanceOf[js.Any], RewindMovie = RewindMovie.asInstanceOf[js.Any], StopAfterSlides = StopAfterSlides.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PlaySettings_typekey")(PowerPointDotPlaySettings_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaySettings]
  }
  
  @scala.inline
  implicit class PlaySettingsMutableBuilder[Self <: PlaySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionVerb(value: String): Self = StObject.set(x, "ActionVerb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideWhileNotPlaying(value: MsoTriState): Self = StObject.set(x, "HideWhileNotPlaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUntilStopped(value: MsoTriState): Self = StObject.set(x, "LoopUntilStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseAnimation(value: MsoTriState): Self = StObject.set(x, "PauseAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayOnEntry(value: MsoTriState): Self = StObject.set(x, "PlayOnEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotPlaySettings_typekey(value: PlaySettings): Self = StObject.set(x, "PowerPoint.PlaySettings_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewindMovie(value: MsoTriState): Self = StObject.set(x, "RewindMovie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopAfterSlides(value: Double): Self = StObject.set(x, "StopAfterSlides", value.asInstanceOf[js.Any])
  }
}
