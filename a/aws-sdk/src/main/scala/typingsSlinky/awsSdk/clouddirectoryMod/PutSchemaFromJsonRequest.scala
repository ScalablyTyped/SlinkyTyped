package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutSchemaFromJsonRequest extends js.Object {
  /**
    * The replacement JSON schema.
    */
  var Document: SchemaJsonDocument = js.native
  /**
    * The ARN of the schema to update.
    */
  var SchemaArn: Arn = js.native
}

object PutSchemaFromJsonRequest {
  @scala.inline
  def apply(Document: SchemaJsonDocument, SchemaArn: Arn): PutSchemaFromJsonRequest = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSchemaFromJsonRequest]
  }
  @scala.inline
  implicit class PutSchemaFromJsonRequestOps[Self <: PutSchemaFromJsonRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: SchemaJsonDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

