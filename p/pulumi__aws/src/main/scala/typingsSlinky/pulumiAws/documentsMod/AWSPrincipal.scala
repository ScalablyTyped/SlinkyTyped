package typingsSlinky.pulumiAws.documentsMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AWSPrincipal extends Principal {
  var AWS: Input[js.Array[Input[String]] | String] = js.native
}

object AWSPrincipal {
  @scala.inline
  def apply(AWS: Input[js.Array[Input[String]] | String]): AWSPrincipal = {
    val __obj = js.Dynamic.literal(AWS = AWS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AWSPrincipal]
  }
  @scala.inline
  implicit class AWSPrincipalOps[Self <: AWSPrincipal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAWS(value: Input[js.Array[Input[String]] | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AWS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

