package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.awsLambdaStrings.`read-only`
import typingsSlinky.awsLambda.awsLambdaStrings.base64
import typingsSlinky.awsLambda.awsLambdaStrings.replace
import typingsSlinky.awsLambda.awsLambdaStrings.text_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var action: `read-only` | replace
  var data: String
  var encoding: base64 | text_
  val inputTruncated: Boolean
}

object Action {
  @scala.inline
  def apply(action: `read-only` | replace, data: String, encoding: base64 | text_, inputTruncated: Boolean): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], inputTruncated = inputTruncated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

