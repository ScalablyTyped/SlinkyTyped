package typingsSlinky.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.saucelabs.saucelabsStrings.ABORTED
import typingsSlinky.saucelabs.saucelabsStrings.CANCELED
import typingsSlinky.saucelabs.saucelabsStrings.FAILURE
import typingsSlinky.saucelabs.saucelabsStrings.LANDSCAPE
import typingsSlinky.saucelabs.saucelabsStrings.PORTRAIT
import typingsSlinky.saucelabs.saucelabsStrings.SKIPPED
import typingsSlinky.saucelabs.saucelabsStrings.SUCCESS
import typingsSlinky.saucelabs.saucelabsStrings.UNKNOWN
import typingsSlinky.saucelabs.saucelabsStrings.WARNING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Step
  extends /* key */ StringDictionary[js.Any] {
  
  var error: js.UndefOr[ScriptError] = js.native
  
  var hasReplayImage: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[Id] = js.native
  
  var line: js.UndefOr[Double] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var orientation: js.UndefOr[PORTRAIT | LANDSCAPE] = js.native
  
  var recordedImage: js.UndefOr[Id] = js.native
  
  var resolvedPosition: js.UndefOr[Point] = js.native
  
  var status: js.UndefOr[UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED] = js.native
  
  var warning: js.UndefOr[ScriptWarning] = js.native
}
object Step {
  
  @scala.inline
  def apply(): Step = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Step]
  }
  
  @scala.inline
  implicit class StepMutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: ScriptError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setHasReplayImage(value: Boolean): Self = StObject.set(x, "hasReplayImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasReplayImageUndefined: Self = StObject.set(x, "hasReplayImage", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setOrientation(value: PORTRAIT | LANDSCAPE): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setRecordedImage(value: Id): Self = StObject.set(x, "recordedImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordedImageUndefined: Self = StObject.set(x, "recordedImage", js.undefined)
    
    @scala.inline
    def setResolvedPosition(value: Point): Self = StObject.set(x, "resolvedPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedPositionUndefined: Self = StObject.set(x, "resolvedPosition", js.undefined)
    
    @scala.inline
    def setStatus(value: UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setWarning(value: ScriptWarning): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
