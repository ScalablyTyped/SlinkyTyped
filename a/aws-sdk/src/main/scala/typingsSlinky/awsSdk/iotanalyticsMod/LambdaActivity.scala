package typingsSlinky.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LambdaActivity extends StObject {
  
  /**
    * The number of messages passed to the Lambda function for processing. The Lambda function must be able to process all of these messages within five minutes, which is the maximum timeout duration for Lambda functions.
    */
  var batchSize: ActivityBatchSize = js.native
  
  /**
    * The name of the Lambda function that is run on the message.
    */
  var lambdaName: LambdaName = js.native
  
  /**
    * The name of the lambda activity.
    */
  var name: ActivityName = js.native
  
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.native
}
object LambdaActivity {
  
  @scala.inline
  def apply(batchSize: ActivityBatchSize, lambdaName: LambdaName, name: ActivityName): LambdaActivity = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], lambdaName = lambdaName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaActivity]
  }
  
  @scala.inline
  implicit class LambdaActivityMutableBuilder[Self <: LambdaActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: ActivityBatchSize): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaName(value: LambdaName): Self = StObject.set(x, "lambdaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ActivityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: ActivityName): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
