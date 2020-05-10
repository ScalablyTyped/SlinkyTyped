package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIntrospectionSchemaResponse extends js.Object {
  /**
    * The schema, in GraphQL Schema Definition Language (SDL) format. For more information, see the GraphQL SDL documentation.
    */
  var schema: js.UndefOr[_Blob] = js.native
}

object GetIntrospectionSchemaResponse {
  @scala.inline
  def apply(): GetIntrospectionSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIntrospectionSchemaResponse]
  }
  @scala.inline
  implicit class GetIntrospectionSchemaResponseOps[Self <: GetIntrospectionSchemaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchemaUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: _Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
  }
  
}

