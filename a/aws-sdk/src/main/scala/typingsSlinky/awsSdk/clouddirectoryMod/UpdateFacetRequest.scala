package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFacetRequest extends js.Object {
  /**
    * List of attributes that need to be updated in a given schema Facet. Each attribute is followed by AttributeAction, which specifies the type of update operation to perform. 
    */
  var AttributeUpdates: js.UndefOr[FacetAttributeUpdateList] = js.native
  /**
    * The name of the facet.
    */
  var Name: FacetName = js.native
  /**
    * The object type that is associated with the facet. See CreateFacetRequest$ObjectType for more details.
    */
  var ObjectType: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ObjectType] = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the Facet. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}

object UpdateFacetRequest {
  @scala.inline
  def apply(Name: FacetName, SchemaArn: Arn): UpdateFacetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFacetRequest]
  }
  @scala.inline
  implicit class UpdateFacetRequestOps[Self <: UpdateFacetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: FacetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeUpdates(value: FacetAttributeUpdateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectType(value: ObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectType")(js.undefined)
        ret
    }
  }
  
}

