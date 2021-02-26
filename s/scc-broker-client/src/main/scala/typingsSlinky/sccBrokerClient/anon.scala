package typingsSlinky.sccBrokerClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Error extends StObject {
    
    var error: js.Error = js.native
  }
  object Error {
    
    @scala.inline
    def apply(error: js.Error): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NoMatchingPublishTargetError extends StObject {
    
    def NoMatchingPublishTargetError(channelName: String): js.Error = js.native
    
    def NoMatchingSubscribeTargetError(channelName: String): js.Error = js.native
    
    def NoMatchingUnsubscribeTargetError(channelName: String): js.Error = js.native
  }
  object NoMatchingPublishTargetError {
    
    @scala.inline
    def apply(
      NoMatchingPublishTargetError: String => js.Error,
      NoMatchingSubscribeTargetError: String => js.Error,
      NoMatchingUnsubscribeTargetError: String => js.Error
    ): NoMatchingPublishTargetError = {
      val __obj = js.Dynamic.literal(NoMatchingPublishTargetError = js.Any.fromFunction1(NoMatchingPublishTargetError), NoMatchingSubscribeTargetError = js.Any.fromFunction1(NoMatchingSubscribeTargetError), NoMatchingUnsubscribeTargetError = js.Any.fromFunction1(NoMatchingUnsubscribeTargetError))
      __obj.asInstanceOf[NoMatchingPublishTargetError]
    }
    
    @scala.inline
    implicit class NoMatchingPublishTargetErrorMutableBuilder[Self <: NoMatchingPublishTargetError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoMatchingPublishTargetError(value: String => js.Error): Self = StObject.set(x, "NoMatchingPublishTargetError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNoMatchingSubscribeTargetError(value: String => js.Error): Self = StObject.set(x, "NoMatchingSubscribeTargetError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNoMatchingUnsubscribeTargetError(value: String => js.Error): Self = StObject.set(x, "NoMatchingUnsubscribeTargetError", js.Any.fromFunction1(value))
    }
  }
}
