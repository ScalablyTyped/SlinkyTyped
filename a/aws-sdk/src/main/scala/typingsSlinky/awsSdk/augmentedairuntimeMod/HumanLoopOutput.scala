package typingsSlinky.awsSdk.augmentedairuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HumanLoopOutput extends StObject {
  
  /**
    * The location of the Amazon S3 object where Amazon Augmented AI stores your human loop output.
    */
  var OutputS3Uri: String = js.native
}
object HumanLoopOutput {
  
  @scala.inline
  def apply(OutputS3Uri: String): HumanLoopOutput = {
    val __obj = js.Dynamic.literal(OutputS3Uri = OutputS3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopOutput]
  }
  
  @scala.inline
  implicit class HumanLoopOutputMutableBuilder[Self <: HumanLoopOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputS3Uri(value: String): Self = StObject.set(x, "OutputS3Uri", value.asInstanceOf[js.Any])
  }
}
