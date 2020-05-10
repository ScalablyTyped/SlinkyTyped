package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedLinkSpecifier extends js.Object {
  /**
    * Identifies the attribute value to update.
    */
  var IdentityAttributeValues: AttributeNameAndValueList = js.native
  /**
    * Identifies the source object that the typed link will attach to.
    */
  var SourceObjectReference: ObjectReference = js.native
  /**
    * Identifies the target object that the typed link will attach to.
    */
  var TargetObjectReference: ObjectReference = js.native
  /**
    * Identifies the typed link facet that is associated with the typed link.
    */
  var TypedLinkFacet: TypedLinkSchemaAndFacetName = js.native
}

object TypedLinkSpecifier {
  @scala.inline
  def apply(
    IdentityAttributeValues: AttributeNameAndValueList,
    SourceObjectReference: ObjectReference,
    TargetObjectReference: ObjectReference,
    TypedLinkFacet: TypedLinkSchemaAndFacetName
  ): TypedLinkSpecifier = {
    val __obj = js.Dynamic.literal(IdentityAttributeValues = IdentityAttributeValues.asInstanceOf[js.Any], SourceObjectReference = SourceObjectReference.asInstanceOf[js.Any], TargetObjectReference = TargetObjectReference.asInstanceOf[js.Any], TypedLinkFacet = TypedLinkFacet.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkSpecifier]
  }
  @scala.inline
  implicit class TypedLinkSpecifierOps[Self <: TypedLinkSpecifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentityAttributeValues(value: AttributeNameAndValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityAttributeValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceObjectReference(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceObjectReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetObjectReference(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetObjectReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypedLinkFacet(value: TypedLinkSchemaAndFacetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypedLinkFacet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

