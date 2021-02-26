package typingsSlinky.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionEventInvokeConfig extends StObject {
  
  /**
    * A destination for events after they have been sent to a function for processing.  Destinations     Function - The Amazon Resource Name (ARN) of a Lambda function.    Queue - The ARN of an SQS queue.    Topic - The ARN of an SNS topic.    Event Bus - The ARN of an Amazon EventBridge event bus.  
    */
  var DestinationConfig: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.DestinationConfig] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the function.
    */
  var FunctionArn: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.FunctionArn] = js.native
  
  /**
    * The date and time that the configuration was last updated.
    */
  var LastModified: js.UndefOr[js.Date] = js.native
  
  /**
    * The maximum age of a request that Lambda sends to a function for processing.
    */
  var MaximumEventAgeInSeconds: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.MaximumEventAgeInSeconds] = js.native
  
  /**
    * The maximum number of times to retry when the function returns an error.
    */
  var MaximumRetryAttempts: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.MaximumRetryAttempts] = js.native
}
object FunctionEventInvokeConfig {
  
  @scala.inline
  def apply(): FunctionEventInvokeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionEventInvokeConfig]
  }
  
  @scala.inline
  implicit class FunctionEventInvokeConfigMutableBuilder[Self <: FunctionEventInvokeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationConfig(value: DestinationConfig): Self = StObject.set(x, "DestinationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationConfigUndefined: Self = StObject.set(x, "DestinationConfig", js.undefined)
    
    @scala.inline
    def setFunctionArn(value: FunctionArn): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionArnUndefined: Self = StObject.set(x, "FunctionArn", js.undefined)
    
    @scala.inline
    def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    @scala.inline
    def setMaximumEventAgeInSeconds(value: MaximumEventAgeInSeconds): Self = StObject.set(x, "MaximumEventAgeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumEventAgeInSecondsUndefined: Self = StObject.set(x, "MaximumEventAgeInSeconds", js.undefined)
    
    @scala.inline
    def setMaximumRetryAttempts(value: MaximumRetryAttempts): Self = StObject.set(x, "MaximumRetryAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumRetryAttemptsUndefined: Self = StObject.set(x, "MaximumRetryAttempts", js.undefined)
  }
}
