package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUserDefinedFunctionResource extends js.Object {
  /**
    * [Pick one] An inline resource that contains code for a user-defined
    * function (UDF). Providing a inline code resource is equivalent to
    * providing a URI for a file containing the same code.
    */
  var inlineCode: js.UndefOr[String] = js.native
  /**
    * [Pick one] A code resource to load from a Google Cloud Storage URI
    * (gs://bucket/path).
    */
  var resourceUri: js.UndefOr[String] = js.native
}

object SchemaUserDefinedFunctionResource {
  @scala.inline
  def apply(): SchemaUserDefinedFunctionResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserDefinedFunctionResource]
  }
  @scala.inline
  implicit class SchemaUserDefinedFunctionResourceOps[Self <: SchemaUserDefinedFunctionResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInlineCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineCode")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUri")(js.undefined)
        ret
    }
  }
  
}

