package typingsSlinky.mobxTask

import typingsSlinky.mobxTask.taskMod.Task_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskGroupMod {
  
  /* Inlined std.Pick<mobx-task.mobx-task/lib/task.Task<A, R>, mobx-task.mobx-task/lib/task-group.QueryableMethods> */
  @js.native
  trait TaskGroup[A /* <: js.Array[_] */, R] extends StObject {
    
    var error: js.UndefOr[js.Any] = js.native
    
    var `match`: js.UndefOr[js.Any] = js.native
    
    var pending: js.UndefOr[js.Any] = js.native
    
    var rejected: js.UndefOr[js.Any] = js.native
    
    var resolved: js.UndefOr[js.Any] = js.native
    
    var result: js.UndefOr[js.Any] = js.native
    
    var state: js.UndefOr[js.Any] = js.native
  }
  object TaskGroup {
    
    @JSImport("mobx-task/lib/task-group", "TaskGroup")
    @js.native
    def apply[A /* <: js.Array[_] */, R](tasks: js.Array[Task_[A, R]]): TaskGroup[A, R] = js.native
    
    @scala.inline
    implicit class TaskGroupMutableBuilder[Self <: TaskGroup[_, _], A /* <: js.Array[_] */, R] (val x: Self with (TaskGroup[A, R])) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setMatch(value: js.Any): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setPending(value: js.Any): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      @scala.inline
      def setRejected(value: js.Any): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectedUndefined: Self = StObject.set(x, "rejected", js.undefined)
      
      @scala.inline
      def setResolved(value: js.Any): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mobxTask.mobxTaskStrings.state
    - typingsSlinky.mobxTask.mobxTaskStrings.pending
    - typingsSlinky.mobxTask.mobxTaskStrings.resolved
    - typingsSlinky.mobxTask.mobxTaskStrings.rejected
    - typingsSlinky.mobxTask.mobxTaskStrings.result
    - typingsSlinky.mobxTask.mobxTaskStrings.error
    - typingsSlinky.mobxTask.mobxTaskStrings.`match`
  */
  trait QueryableMethods extends StObject
  object QueryableMethods {
    
    @scala.inline
    def error: typingsSlinky.mobxTask.mobxTaskStrings.error = "error".asInstanceOf[typingsSlinky.mobxTask.mobxTaskStrings.error]
    
    @scala.inline
    def `match`: typingsSlinky.mobxTask.mobxTaskStrings.`match` = "match".asInstanceOf[typingsSlinky.mobxTask.mobxTaskStrings.`match`]
    
    @scala.inline
    def pending: typingsSlinky.mobxTask.mobxTaskStrings.pending = "pending".asInstanceOf[typingsSlinky.mobxTask.mobxTaskStrings.pending]
    
    @scala.inline
    def rejected: typingsSlinky.mobxTask.mobxTaskStrings.rejected = "rejected".asInstanceOf[typingsSlinky.mobxTask.mobxTaskStrings.rejected]
    
    @scala.inline
    def resolved: typingsSlinky.mobxTask.mobxTaskStrings.resolved = "resolved".asInstanceOf[typingsSlinky.mobxTask.mobxTaskStrings.resolved]
    
    @scala.inline
    def result: typingsSlinky.mobxTask.mobxTaskStrings.result = "result".asInstanceOf[typingsSlinky.mobxTask.mobxTaskStrings.result]
    
    @scala.inline
    def state: typingsSlinky.mobxTask.mobxTaskStrings.state = "state".asInstanceOf[typingsSlinky.mobxTask.mobxTaskStrings.state]
  }
}
