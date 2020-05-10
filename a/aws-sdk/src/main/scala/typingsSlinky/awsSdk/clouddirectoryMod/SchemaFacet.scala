package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFacet extends js.Object {
  /**
    * The name of the facet.
    */
  var FacetName: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.FacetName] = js.native
  /**
    * The ARN of the schema that contains the facet with no minor component. See arns and In-Place Schema Upgrade for a description of when to provide minor versions.
    */
  var SchemaArn: js.UndefOr[Arn] = js.native
}

object SchemaFacet {
  @scala.inline
  def apply(): SchemaFacet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFacet]
  }
  @scala.inline
  implicit class SchemaFacetOps[Self <: SchemaFacet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFacetName(value: FacetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FacetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FacetName")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaArn")(js.undefined)
        ret
    }
  }
  
}

