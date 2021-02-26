package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTransformJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the transform job.
    */
  var TransformJobArn: typingsSlinky.awsSdk.sagemakerMod.TransformJobArn = js.native
}
object CreateTransformJobResponse {
  
  @scala.inline
  def apply(TransformJobArn: TransformJobArn): CreateTransformJobResponse = {
    val __obj = js.Dynamic.literal(TransformJobArn = TransformJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransformJobResponse]
  }
  
  @scala.inline
  implicit class CreateTransformJobResponseMutableBuilder[Self <: CreateTransformJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransformJobArn(value: TransformJobArn): Self = StObject.set(x, "TransformJobArn", value.asInstanceOf[js.Any])
  }
}
