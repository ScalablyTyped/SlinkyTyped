package typingsSlinky.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveContest extends StObject {
  
  var appeal: Double = js.native
  
  var condition: String = js.native
  
  var contest: String = js.native
  
  var jam: Double = js.native
}
object MoveContest {
  
  @scala.inline
  def apply(appeal: Double, condition: String, contest: String, jam: Double): MoveContest = {
    val __obj = js.Dynamic.literal(appeal = appeal.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], contest = contest.asInstanceOf[js.Any], jam = jam.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveContest]
  }
  
  @scala.inline
  implicit class MoveContestMutableBuilder[Self <: MoveContest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppeal(value: Double): Self = StObject.set(x, "appeal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContest(value: String): Self = StObject.set(x, "contest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJam(value: Double): Self = StObject.set(x, "jam", value.asInstanceOf[js.Any])
  }
}
