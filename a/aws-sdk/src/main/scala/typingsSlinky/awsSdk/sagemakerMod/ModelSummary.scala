package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelSummary extends js.Object {
  /**
    * A timestamp that indicates when the model was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * The Amazon Resource Name (ARN) of the model.
    */
  var ModelArn: typingsSlinky.awsSdk.sagemakerMod.ModelArn = js.native
  /**
    * The name of the model that you want a summary for.
    */
  var ModelName: typingsSlinky.awsSdk.sagemakerMod.ModelName = js.native
}

object ModelSummary {
  @scala.inline
  def apply(CreationTime: js.Date, ModelArn: ModelArn, ModelName: ModelName): ModelSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ModelArn = ModelArn.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModelSummary]
  }
}

