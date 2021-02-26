package typingsSlinky.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AchievementSetStepsAtLeastResponse extends StObject {
  
  /** The current steps recorded for this incremental achievement. */
  var currentSteps: js.UndefOr[Double] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementSetStepsAtLeastResponse`. */
  var kind: js.UndefOr[String] = js.native
  
  /** Whether the current steps for the achievement has reached the number of steps required to unlock. */
  var newlyUnlocked: js.UndefOr[Boolean] = js.native
}
object AchievementSetStepsAtLeastResponse {
  
  @scala.inline
  def apply(): AchievementSetStepsAtLeastResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementSetStepsAtLeastResponse]
  }
  
  @scala.inline
  implicit class AchievementSetStepsAtLeastResponseMutableBuilder[Self <: AchievementSetStepsAtLeastResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentSteps(value: Double): Self = StObject.set(x, "currentSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStepsUndefined: Self = StObject.set(x, "currentSteps", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNewlyUnlocked(value: Boolean): Self = StObject.set(x, "newlyUnlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewlyUnlockedUndefined: Self = StObject.set(x, "newlyUnlocked", js.undefined)
  }
}
