package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateSourceTemplate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: typingsSlinky.awsSdk.quicksightMod.Arn = js.native
}

object TemplateSourceTemplate {
  @scala.inline
  def apply(Arn: Arn): TemplateSourceTemplate = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateSourceTemplate]
  }
  @scala.inline
  implicit class TemplateSourceTemplateOps[Self <: TemplateSourceTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

