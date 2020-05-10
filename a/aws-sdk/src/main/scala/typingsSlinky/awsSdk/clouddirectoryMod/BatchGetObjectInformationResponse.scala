package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetObjectInformationResponse extends js.Object {
  /**
    * The ObjectIdentifier of the specified object.
    */
  var ObjectIdentifier: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.native
  /**
    * The facets attached to the specified object.
    */
  var SchemaFacets: js.UndefOr[SchemaFacetList] = js.native
}

object BatchGetObjectInformationResponse {
  @scala.inline
  def apply(): BatchGetObjectInformationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetObjectInformationResponse]
  }
  @scala.inline
  implicit class BatchGetObjectInformationResponseOps[Self <: BatchGetObjectInformationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectIdentifier(value: ObjectIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaFacets(value: SchemaFacetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaFacets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaFacets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaFacets")(js.undefined)
        ret
    }
  }
  
}

