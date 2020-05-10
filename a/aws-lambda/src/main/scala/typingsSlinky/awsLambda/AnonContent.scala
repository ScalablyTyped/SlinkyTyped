package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.awsLambdaStrings.CustomPayload
import typingsSlinky.awsLambda.awsLambdaStrings.PlainText
import typingsSlinky.awsLambda.awsLambdaStrings.SSML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContent extends js.Object {
  var content: String = js.native
  var contentType: PlainText | SSML | CustomPayload = js.native
}

object AnonContent {
  @scala.inline
  def apply(content: String, contentType: PlainText | SSML | CustomPayload): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
  @scala.inline
  implicit class AnonContentOps[Self <: AnonContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: PlainText | SSML | CustomPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

