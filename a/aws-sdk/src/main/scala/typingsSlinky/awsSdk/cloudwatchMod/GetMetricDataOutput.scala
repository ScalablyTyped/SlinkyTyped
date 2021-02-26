package typingsSlinky.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMetricDataOutput extends StObject {
  
  /**
    * Contains a message about this GetMetricData operation, if the operation results in such a message. An example of a message that might be returned is Maximum number of allowed metrics exceeded. If there is a message, as much of the operation as possible is still executed. A message appears here only if it is related to the global GetMetricData operation. Any message about a specific metric returned by the operation appears in the MetricDataResult object returned for that metric.
    */
  var Messages: js.UndefOr[MetricDataResultMessages] = js.native
  
  /**
    * The metrics that are returned, including the metric name, namespace, and dimensions.
    */
  var MetricDataResults: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.MetricDataResults] = js.native
  
  /**
    * A token that marks the next batch of returned results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.NextToken] = js.native
}
object GetMetricDataOutput {
  
  @scala.inline
  def apply(): GetMetricDataOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricDataOutput]
  }
  
  @scala.inline
  implicit class GetMetricDataOutputMutableBuilder[Self <: GetMetricDataOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: MetricDataResultMessages): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "Messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: MessageData*): Self = StObject.set(x, "Messages", js.Array(value :_*))
    
    @scala.inline
    def setMetricDataResults(value: MetricDataResults): Self = StObject.set(x, "MetricDataResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricDataResultsUndefined: Self = StObject.set(x, "MetricDataResults", js.undefined)
    
    @scala.inline
    def setMetricDataResultsVarargs(value: MetricDataResult*): Self = StObject.set(x, "MetricDataResults", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
