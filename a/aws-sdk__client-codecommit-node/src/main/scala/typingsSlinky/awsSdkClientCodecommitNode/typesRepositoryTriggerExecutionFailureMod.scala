package typingsSlinky.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoryTriggerExecutionFailureMod {
  
  @js.native
  trait RepositoryTriggerExecutionFailure extends StObject {
    
    /**
      * <p>Additional message information about the trigger that did not run.</p>
      */
    var failureMessage: js.UndefOr[String] = js.native
    
    /**
      * <p>The name of the trigger that did not run.</p>
      */
    var trigger: js.UndefOr[String] = js.native
  }
  object RepositoryTriggerExecutionFailure {
    
    @scala.inline
    def apply(): RepositoryTriggerExecutionFailure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepositoryTriggerExecutionFailure]
    }
    
    @scala.inline
    implicit class RepositoryTriggerExecutionFailureMutableBuilder[Self <: RepositoryTriggerExecutionFailure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailureMessage(value: String): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureMessageUndefined: Self = StObject.set(x, "failureMessage", js.undefined)
      
      @scala.inline
      def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
  
  type UnmarshalledRepositoryTriggerExecutionFailure = RepositoryTriggerExecutionFailure
}
