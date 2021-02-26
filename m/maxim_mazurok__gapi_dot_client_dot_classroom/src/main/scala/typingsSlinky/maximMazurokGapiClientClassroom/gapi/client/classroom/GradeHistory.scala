package typingsSlinky.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GradeHistory extends StObject {
  
  /** The teacher who made the grade change. */
  var actorUserId: js.UndefOr[String] = js.native
  
  /** The type of grade change at this time in the submission grade history. */
  var gradeChangeType: js.UndefOr[String] = js.native
  
  /** When the grade of the submission was changed. */
  var gradeTimestamp: js.UndefOr[String] = js.native
  
  /** The denominator of the grade at this time in the submission grade history. */
  var maxPoints: js.UndefOr[Double] = js.native
  
  /** The numerator of the grade at this time in the submission grade history. */
  var pointsEarned: js.UndefOr[Double] = js.native
}
object GradeHistory {
  
  @scala.inline
  def apply(): GradeHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GradeHistory]
  }
  
  @scala.inline
  implicit class GradeHistoryMutableBuilder[Self <: GradeHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActorUserId(value: String): Self = StObject.set(x, "actorUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActorUserIdUndefined: Self = StObject.set(x, "actorUserId", js.undefined)
    
    @scala.inline
    def setGradeChangeType(value: String): Self = StObject.set(x, "gradeChangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradeChangeTypeUndefined: Self = StObject.set(x, "gradeChangeType", js.undefined)
    
    @scala.inline
    def setGradeTimestamp(value: String): Self = StObject.set(x, "gradeTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradeTimestampUndefined: Self = StObject.set(x, "gradeTimestamp", js.undefined)
    
    @scala.inline
    def setMaxPoints(value: Double): Self = StObject.set(x, "maxPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPointsUndefined: Self = StObject.set(x, "maxPoints", js.undefined)
    
    @scala.inline
    def setPointsEarned(value: Double): Self = StObject.set(x, "pointsEarned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsEarnedUndefined: Self = StObject.set(x, "pointsEarned", js.undefined)
  }
}
