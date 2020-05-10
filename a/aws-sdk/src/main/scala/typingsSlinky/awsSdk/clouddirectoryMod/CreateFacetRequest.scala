package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFacetRequest extends js.Object {
  /**
    * The attributes that are associated with the Facet.
    */
  var Attributes: js.UndefOr[FacetAttributeList] = js.native
  /**
    * There are two different styles that you can define on any given facet, Static and Dynamic. For static facets, all attributes must be defined in the schema. For dynamic facets, attributes can be defined during data plane operations.
    */
  var FacetStyle: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.FacetStyle] = js.native
  /**
    * The name of the Facet, which is unique for a given schema.
    */
  var Name: FacetName = js.native
  /**
    * Specifies whether a given object created from this facet is of type node, leaf node, policy or index.   Node: Can have multiple children but one parent.     Leaf node: Cannot have children but can have multiple parents.     Policy: Allows you to store a policy document and policy type. For more information, see Policies.     Index: Can be created with the Index API.  
    */
  var ObjectType: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ObjectType] = js.native
  /**
    * The schema ARN in which the new Facet will be created. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}

object CreateFacetRequest {
  @scala.inline
  def apply(Name: FacetName, SchemaArn: Arn): CreateFacetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFacetRequest]
  }
  @scala.inline
  implicit class CreateFacetRequestOps[Self <: CreateFacetRequest] (val x: Self) extends AnyVal {
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
    def withAttributes(value: FacetAttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withFacetStyle(value: FacetStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FacetStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacetStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FacetStyle")(js.undefined)
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

