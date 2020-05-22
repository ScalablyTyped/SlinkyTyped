package typingsSlinky.pulumiAws.lifecyclePolicyDocumentMod

import typingsSlinky.pulumiAws.pulumiAwsStrings.expire
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  /**
    * The specified action type - the only supported value is `expire`.
    */
  var `type`: Input[expire] = js.native
}

object Action {
  @scala.inline
  def apply(`type`: Input[expire]): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

