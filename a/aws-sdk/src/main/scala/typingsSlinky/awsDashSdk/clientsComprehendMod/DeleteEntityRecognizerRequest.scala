package typingsSlinky.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEntityRecognizerRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer.
    */
  var EntityRecognizerArn: typingsSlinky.awsDashSdk.clientsComprehendMod.EntityRecognizerArn = js.native
}

object DeleteEntityRecognizerRequest {
  @scala.inline
  def apply(EntityRecognizerArn: EntityRecognizerArn): DeleteEntityRecognizerRequest = {
    val __obj = js.Dynamic.literal(EntityRecognizerArn = EntityRecognizerArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEntityRecognizerRequest]
  }
}

