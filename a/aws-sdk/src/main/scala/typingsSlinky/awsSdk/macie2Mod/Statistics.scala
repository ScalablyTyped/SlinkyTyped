package typingsSlinky.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Statistics extends StObject {
  
  /**
    * The approximate number of objects that the job has yet to process during its current run.
    */
  var approximateNumberOfObjectsToProcess: js.UndefOr[double] = js.native
  
  /**
    * The number of times that the job has run.
    */
  var numberOfRuns: js.UndefOr[double] = js.native
}
object Statistics {
  
  @scala.inline
  def apply(): Statistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Statistics]
  }
  
  @scala.inline
  implicit class StatisticsMutableBuilder[Self <: Statistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproximateNumberOfObjectsToProcess(value: double): Self = StObject.set(x, "approximateNumberOfObjectsToProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproximateNumberOfObjectsToProcessUndefined: Self = StObject.set(x, "approximateNumberOfObjectsToProcess", js.undefined)
    
    @scala.inline
    def setNumberOfRuns(value: double): Self = StObject.set(x, "numberOfRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfRunsUndefined: Self = StObject.set(x, "numberOfRuns", js.undefined)
  }
}
