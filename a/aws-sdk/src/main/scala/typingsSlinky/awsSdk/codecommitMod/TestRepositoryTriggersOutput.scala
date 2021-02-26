package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRepositoryTriggersOutput extends StObject {
  
  /**
    * The list of triggers that were not tested. This list provides the names of the triggers that could not be tested, separated by commas.
    */
  var failedExecutions: js.UndefOr[RepositoryTriggerExecutionFailureList] = js.native
  
  /**
    * The list of triggers that were successfully tested. This list provides the names of the triggers that were successfully tested, separated by commas.
    */
  var successfulExecutions: js.UndefOr[RepositoryTriggerNameList] = js.native
}
object TestRepositoryTriggersOutput {
  
  @scala.inline
  def apply(): TestRepositoryTriggersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestRepositoryTriggersOutput]
  }
  
  @scala.inline
  implicit class TestRepositoryTriggersOutputMutableBuilder[Self <: TestRepositoryTriggersOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedExecutions(value: RepositoryTriggerExecutionFailureList): Self = StObject.set(x, "failedExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedExecutionsUndefined: Self = StObject.set(x, "failedExecutions", js.undefined)
    
    @scala.inline
    def setFailedExecutionsVarargs(value: RepositoryTriggerExecutionFailure*): Self = StObject.set(x, "failedExecutions", js.Array(value :_*))
    
    @scala.inline
    def setSuccessfulExecutions(value: RepositoryTriggerNameList): Self = StObject.set(x, "successfulExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulExecutionsUndefined: Self = StObject.set(x, "successfulExecutions", js.undefined)
    
    @scala.inline
    def setSuccessfulExecutionsVarargs(value: RepositoryTriggerName*): Self = StObject.set(x, "successfulExecutions", js.Array(value :_*))
  }
}
