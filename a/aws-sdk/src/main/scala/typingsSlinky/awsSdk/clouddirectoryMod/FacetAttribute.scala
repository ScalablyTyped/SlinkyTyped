package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacetAttribute extends js.Object {
  /**
    * A facet attribute consists of either a definition or a reference. This structure contains the attribute definition. See Attribute References for more information.
    */
  var AttributeDefinition: js.UndefOr[FacetAttributeDefinition] = js.native
  /**
    * An attribute reference that is associated with the attribute. See Attribute References for more information.
    */
  var AttributeReference: js.UndefOr[FacetAttributeReference] = js.native
  /**
    * The name of the facet attribute.
    */
  var Name: AttributeName = js.native
  /**
    * The required behavior of the FacetAttribute.
    */
  var RequiredBehavior: js.UndefOr[RequiredAttributeBehavior] = js.native
}

object FacetAttribute {
  @scala.inline
  def apply(Name: AttributeName): FacetAttribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetAttribute]
  }
  @scala.inline
  implicit class FacetAttributeOps[Self <: FacetAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: AttributeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeDefinition(value: FacetAttributeDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeReference(value: FacetAttributeReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeReference")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredBehavior(value: RequiredAttributeBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiredBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiredBehavior")(js.undefined)
        ret
    }
  }
  
}

