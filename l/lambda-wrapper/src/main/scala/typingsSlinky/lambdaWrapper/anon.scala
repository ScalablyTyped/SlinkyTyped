package typingsSlinky.lambdaWrapper

import typingsSlinky.awsLambda.handlerMod.ClientContext
import typingsSlinky.awsLambda.handlerMod.CognitoIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Handler[THandlerName /* <: String */] extends StObject {
    
    var handler: js.UndefOr[THandlerName] = js.native
  }
  object Handler {
    
    @scala.inline
    def apply[THandlerName /* <: String */](): Handler[THandlerName] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Handler[THandlerName]]
    }
    
    @scala.inline
    implicit class HandlerMutableBuilder[Self <: Handler[_], THandlerName /* <: String */] (val x: Self with Handler[THandlerName]) extends AnyVal {
      
      @scala.inline
      def setHandler(value: THandlerName): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    }
  }
  
  @js.native
  trait LambdaFunction extends StObject {
    
    var lambdaFunction: String = js.native
    
    var region: String = js.native
  }
  object LambdaFunction {
    
    @scala.inline
    def apply(lambdaFunction: String, region: String): LambdaFunction = {
      val __obj = js.Dynamic.literal(lambdaFunction = lambdaFunction.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[LambdaFunction]
    }
    
    @scala.inline
    implicit class LambdaFunctionMutableBuilder[Self <: LambdaFunction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLambdaFunction(value: String): Self = StObject.set(x, "lambdaFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<aws-lambda.aws-lambda.Context> */
  @js.native
  trait PartialContext extends StObject {
    
    var awsRequestId: js.UndefOr[String] = js.native
    
    var callbackWaitsForEmptyEventLoop: js.UndefOr[Boolean] = js.native
    
    var clientContext: js.UndefOr[ClientContext] = js.native
    
    var done: js.UndefOr[js.Function0[Unit]] = js.native
    
    var fail: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
    
    var functionName: js.UndefOr[String] = js.native
    
    var functionVersion: js.UndefOr[String] = js.native
    
    var getRemainingTimeInMillis: js.UndefOr[js.Function0[Double]] = js.native
    
    var identity: js.UndefOr[CognitoIdentity] = js.native
    
    var invokedFunctionArn: js.UndefOr[String] = js.native
    
    var logGroupName: js.UndefOr[String] = js.native
    
    var logStreamName: js.UndefOr[String] = js.native
    
    var memoryLimitInMB: js.UndefOr[String] = js.native
    
    var succeed: js.UndefOr[js.Function1[/* messageOrObject */ js.Any, Unit]] = js.native
  }
  object PartialContext {
    
    @scala.inline
    def apply(): PartialContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialContext]
    }
    
    @scala.inline
    implicit class PartialContextMutableBuilder[Self <: PartialContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwsRequestId(value: String): Self = StObject.set(x, "awsRequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsRequestIdUndefined: Self = StObject.set(x, "awsRequestId", js.undefined)
      
      @scala.inline
      def setCallbackWaitsForEmptyEventLoop(value: Boolean): Self = StObject.set(x, "callbackWaitsForEmptyEventLoop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackWaitsForEmptyEventLoopUndefined: Self = StObject.set(x, "callbackWaitsForEmptyEventLoop", js.undefined)
      
      @scala.inline
      def setClientContext(value: ClientContext): Self = StObject.set(x, "clientContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientContextUndefined: Self = StObject.set(x, "clientContext", js.undefined)
      
      @scala.inline
      def setDone(value: () => Unit): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      @scala.inline
      def setFail(value: /* error */ js.Error => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
      
      @scala.inline
      def setFunctionVersion(value: String): Self = StObject.set(x, "functionVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionVersionUndefined: Self = StObject.set(x, "functionVersion", js.undefined)
      
      @scala.inline
      def setGetRemainingTimeInMillis(value: () => Double): Self = StObject.set(x, "getRemainingTimeInMillis", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRemainingTimeInMillisUndefined: Self = StObject.set(x, "getRemainingTimeInMillis", js.undefined)
      
      @scala.inline
      def setIdentity(value: CognitoIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      @scala.inline
      def setInvokedFunctionArn(value: String): Self = StObject.set(x, "invokedFunctionArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvokedFunctionArnUndefined: Self = StObject.set(x, "invokedFunctionArn", js.undefined)
      
      @scala.inline
      def setLogGroupName(value: String): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
      
      @scala.inline
      def setLogStreamName(value: String): Self = StObject.set(x, "logStreamName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogStreamNameUndefined: Self = StObject.set(x, "logStreamName", js.undefined)
      
      @scala.inline
      def setMemoryLimitInMB(value: String): Self = StObject.set(x, "memoryLimitInMB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryLimitInMBUndefined: Self = StObject.set(x, "memoryLimitInMB", js.undefined)
      
      @scala.inline
      def setSucceed(value: /* messageOrObject */ js.Any => Unit): Self = StObject.set(x, "succeed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSucceedUndefined: Self = StObject.set(x, "succeed", js.undefined)
    }
  }
}
