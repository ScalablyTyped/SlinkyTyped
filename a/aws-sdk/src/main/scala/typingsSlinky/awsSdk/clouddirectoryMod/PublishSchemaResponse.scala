package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishSchemaResponse extends js.Object {
  /**
    * The ARN that is associated with the published schema. For more information, see arns.
    */
  var PublishedSchemaArn: js.UndefOr[Arn] = js.native
}

object PublishSchemaResponse {
  @scala.inline
  def apply(): PublishSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishSchemaResponse]
  }
  @scala.inline
  implicit class PublishSchemaResponseOps[Self <: PublishSchemaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublishedSchemaArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublishedSchemaArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishedSchemaArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublishedSchemaArn")(js.undefined)
        ret
    }
  }
  
}

