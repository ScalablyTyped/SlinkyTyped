package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSchemaAsJsonResponse extends js.Object {
  /**
    * The JSON representation of the schema document.
    */
  var Document: js.UndefOr[SchemaJsonDocument] = js.native
  /**
    * The name of the retrieved schema.
    */
  var Name: js.UndefOr[SchemaName] = js.native
}

object GetSchemaAsJsonResponse {
  @scala.inline
  def apply(): GetSchemaAsJsonResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSchemaAsJsonResponse]
  }
  @scala.inline
  implicit class GetSchemaAsJsonResponseOps[Self <: GetSchemaAsJsonResponse] (val x: Self) extends AnyVal {
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
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Document")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: SchemaName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

