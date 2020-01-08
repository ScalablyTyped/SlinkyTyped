package typingsSlinky.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopTransformJobRequest extends js.Object {
  /**
    * The name of the transform job to stop.
    */
  var TransformJobName: typingsSlinky.awsDashSdk.clientsSagemakerMod.TransformJobName = js.native
}

object StopTransformJobRequest {
  @scala.inline
  def apply(TransformJobName: TransformJobName): StopTransformJobRequest = {
    val __obj = js.Dynamic.literal(TransformJobName = TransformJobName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopTransformJobRequest]
  }
}

