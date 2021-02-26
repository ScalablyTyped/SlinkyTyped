package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelingJobSnsDataSource extends StObject {
  
  /**
    * The Amazon SNS input topic Amazon Resource Name (ARN). Specify the ARN of the input topic you will use to send new data objects to a streaming labeling job. If you specify an input topic for SnsTopicArn in InputConfig, you must specify a value for SnsTopicArn in OutputConfig.
    */
  var SnsTopicArn: typingsSlinky.awsSdk.sagemakerMod.SnsTopicArn = js.native
}
object LabelingJobSnsDataSource {
  
  @scala.inline
  def apply(SnsTopicArn: SnsTopicArn): LabelingJobSnsDataSource = {
    val __obj = js.Dynamic.literal(SnsTopicArn = SnsTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobSnsDataSource]
  }
  
  @scala.inline
  implicit class LabelingJobSnsDataSourceMutableBuilder[Self <: LabelingJobSnsDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnsTopicArn(value: SnsTopicArn): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
  }
}
