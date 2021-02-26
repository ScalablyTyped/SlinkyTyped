package typingsSlinky.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AchievementUpdateRequest extends StObject {
  
  /** The achievement this update is being applied to. */
  var achievementId: js.UndefOr[String] = js.native
  
  /** The payload if an update of type `INCREMENT` was requested for the achievement. */
  var incrementPayload: js.UndefOr[GamesAchievementIncrement] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementUpdateRequest`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The payload if an update of type `SET_STEPS_AT_LEAST` was requested for the achievement. */
  var setStepsAtLeastPayload: js.UndefOr[GamesAchievementSetStepsAtLeast] = js.native
  
  /** The type of update being applied. */
  var updateType: js.UndefOr[String] = js.native
}
object AchievementUpdateRequest {
  
  @scala.inline
  def apply(): AchievementUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementUpdateRequest]
  }
  
  @scala.inline
  implicit class AchievementUpdateRequestMutableBuilder[Self <: AchievementUpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAchievementId(value: String): Self = StObject.set(x, "achievementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAchievementIdUndefined: Self = StObject.set(x, "achievementId", js.undefined)
    
    @scala.inline
    def setIncrementPayload(value: GamesAchievementIncrement): Self = StObject.set(x, "incrementPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementPayloadUndefined: Self = StObject.set(x, "incrementPayload", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSetStepsAtLeastPayload(value: GamesAchievementSetStepsAtLeast): Self = StObject.set(x, "setStepsAtLeastPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetStepsAtLeastPayloadUndefined: Self = StObject.set(x, "setStepsAtLeastPayload", js.undefined)
    
    @scala.inline
    def setUpdateType(value: String): Self = StObject.set(x, "updateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTypeUndefined: Self = StObject.set(x, "updateType", js.undefined)
  }
}
