package typingsSlinky.pulumiAws.inputMod.codepipeline

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookFilter extends js.Object {
  var jsonPath: Input[String] = js.native
  var matchEquals: Input[String] = js.native
}

object WebhookFilter {
  @scala.inline
  def apply(jsonPath: Input[String], matchEquals: Input[String]): WebhookFilter = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any], matchEquals = matchEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookFilter]
  }
  @scala.inline
  implicit class WebhookFilterOps[Self <: WebhookFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJsonPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchEquals(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchEquals")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

