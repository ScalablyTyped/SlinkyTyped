package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTypedLinkFacetRequest extends js.Object {
  /**
    *  Facet structure that is associated with the typed link facet.
    */
  var Facet: TypedLinkFacet = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}

object CreateTypedLinkFacetRequest {
  @scala.inline
  def apply(Facet: TypedLinkFacet, SchemaArn: Arn): CreateTypedLinkFacetRequest = {
    val __obj = js.Dynamic.literal(Facet = Facet.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTypedLinkFacetRequest]
  }
  @scala.inline
  implicit class CreateTypedLinkFacetRequestOps[Self <: CreateTypedLinkFacetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFacet(value: TypedLinkFacet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Facet")(value.asInstanceOf[js.Any])
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

