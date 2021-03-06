package typingsSlinky.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationOutputKinesisFirehose extends StObject {
  
  /**
    * The ARN of the Kinesis Firehose delivery stream.
    */
  var resourceArn: String = js.native
  
  /**
    * The ARN of the IAM Role used to access the stream.
    */
  var roleArn: String = js.native
}
object AnalyticsApplicationOutputKinesisFirehose {
  
  @scala.inline
  def apply(resourceArn: String, roleArn: String): AnalyticsApplicationOutputKinesisFirehose = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationOutputKinesisFirehose]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationOutputKinesisFirehoseMutableBuilder[Self <: AnalyticsApplicationOutputKinesisFirehose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
