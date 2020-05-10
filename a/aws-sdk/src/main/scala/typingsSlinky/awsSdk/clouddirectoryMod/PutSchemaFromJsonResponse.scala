package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutSchemaFromJsonResponse extends js.Object {
  /**
    * The ARN of the schema to update.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.Arn] = js.native
}

object PutSchemaFromJsonResponse {
  @scala.inline
  def apply(): PutSchemaFromJsonResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSchemaFromJsonResponse]
  }
  @scala.inline
  implicit class PutSchemaFromJsonResponseOps[Self <: PutSchemaFromJsonResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
  }
  
}

