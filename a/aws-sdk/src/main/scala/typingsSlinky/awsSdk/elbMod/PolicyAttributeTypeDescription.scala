package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyAttributeTypeDescription extends js.Object {
  /**
    * The name of the attribute.
    */
  var AttributeName: js.UndefOr[typingsSlinky.awsSdk.elbMod.AttributeName] = js.native
  /**
    * The type of the attribute. For example, Boolean or Integer.
    */
  var AttributeType: js.UndefOr[typingsSlinky.awsSdk.elbMod.AttributeType] = js.native
  /**
    * The cardinality of the attribute. Valid values:   ONE(1) : Single value required   ZERO_OR_ONE(0..1) : Up to one value is allowed   ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed   ONE_OR_MORE(1..*0) : Required. Multiple values are allowed  
    */
  var Cardinality: js.UndefOr[typingsSlinky.awsSdk.elbMod.Cardinality] = js.native
  /**
    * The default value of the attribute, if applicable.
    */
  var DefaultValue: js.UndefOr[typingsSlinky.awsSdk.elbMod.DefaultValue] = js.native
  /**
    * A description of the attribute.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.elbMod.Description] = js.native
}

object PolicyAttributeTypeDescription {
  @scala.inline
  def apply(): PolicyAttributeTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyAttributeTypeDescription]
  }
  @scala.inline
  implicit class PolicyAttributeTypeDescriptionOps[Self <: PolicyAttributeTypeDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: AttributeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeType(value: AttributeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeType")(js.undefined)
        ret
    }
    @scala.inline
    def withCardinality(value: Cardinality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cardinality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardinality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cardinality")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: DefaultValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
  }
  
}

