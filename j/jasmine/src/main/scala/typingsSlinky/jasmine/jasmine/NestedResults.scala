package typingsSlinky.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NestedResults extends Result {
  
  def addResult(result: Result): Unit = js.native
  
  var description: String = js.native
  
  var failedCount: Double = js.native
  
  def getItems(): js.Array[Result] = js.native
  
  def log(values: js.Any): Unit = js.native
  
  def passed(): Boolean = js.native
  
  var passedCount: Double = js.native
  
  def rollupCounts(result: NestedResults): Unit = js.native
  
  var skipped: Boolean = js.native
  
  var totalCount: Double = js.native
}
object NestedResults {
  
  @scala.inline
  def apply(
    addResult: Result => Unit,
    description: String,
    failedCount: Double,
    getItems: () => js.Array[Result],
    log: js.Any => Unit,
    passed: () => Boolean,
    passedCount: Double,
    rollupCounts: NestedResults => Unit,
    skipped: Boolean,
    totalCount: Double,
    `type`: String
  ): NestedResults = {
    val __obj = js.Dynamic.literal(addResult = js.Any.fromFunction1(addResult), description = description.asInstanceOf[js.Any], failedCount = failedCount.asInstanceOf[js.Any], getItems = js.Any.fromFunction0(getItems), log = js.Any.fromFunction1(log), passed = js.Any.fromFunction0(passed), passedCount = passedCount.asInstanceOf[js.Any], rollupCounts = js.Any.fromFunction1(rollupCounts), skipped = skipped.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedResults]
  }
  
  @scala.inline
  implicit class NestedResultsMutableBuilder[Self <: NestedResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddResult(value: Result => Unit): Self = StObject.set(x, "addResult", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedCount(value: Double): Self = StObject.set(x, "failedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetItems(value: () => js.Array[Result]): Self = StObject.set(x, "getItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLog(value: js.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPassed(value: () => Boolean): Self = StObject.set(x, "passed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPassedCount(value: Double): Self = StObject.set(x, "passedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollupCounts(value: NestedResults => Unit): Self = StObject.set(x, "rollupCounts", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkipped(value: Boolean): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
  }
}
