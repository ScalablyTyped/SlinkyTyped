package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.awsLambdaStrings.`read-only`
import typingsSlinky.awsLambda.awsLambdaStrings.base64
import typingsSlinky.awsLambda.awsLambdaStrings.replace
import typingsSlinky.awsLambda.awsLambdaStrings.text_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  var action: `read-only` | replace = js.native
  var data: String = js.native
  var encoding: base64 | text_ = js.native
  val inputTruncated: Boolean = js.native
}

object Action {
  @scala.inline
  def apply(action: `read-only` | replace, data: String, encoding: base64 | text_, inputTruncated: Boolean): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], inputTruncated = inputTruncated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: `read-only` | replace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoding(value: base64 | text_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTruncated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

