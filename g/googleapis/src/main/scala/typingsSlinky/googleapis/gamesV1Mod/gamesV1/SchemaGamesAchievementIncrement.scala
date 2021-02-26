package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for the payload to request to increment an
  * achievement.
  */
@js.native
trait SchemaGamesAchievementIncrement extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#GamesAchievementIncrement.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The requestId associated with an increment to an achievement.
    */
  var requestId: js.UndefOr[String] = js.native
  
  /**
    * The number of steps to be incremented.
    */
  var steps: js.UndefOr[Double] = js.native
}
object SchemaGamesAchievementIncrement {
  
  @scala.inline
  def apply(): SchemaGamesAchievementIncrement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGamesAchievementIncrement]
  }
  
  @scala.inline
  implicit class SchemaGamesAchievementIncrementMutableBuilder[Self <: SchemaGamesAchievementIncrement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
  }
}
