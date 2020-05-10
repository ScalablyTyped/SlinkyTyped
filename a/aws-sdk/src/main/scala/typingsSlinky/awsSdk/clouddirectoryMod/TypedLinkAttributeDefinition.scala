package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedLinkAttributeDefinition extends js.Object {
  /**
    * The default value of the attribute (if configured).
    */
  var DefaultValue: js.UndefOr[TypedAttributeValue] = js.native
  /**
    * Whether the attribute is mutable or not.
    */
  var IsImmutable: js.UndefOr[Bool] = js.native
  /**
    * The unique name of the typed link attribute.
    */
  var Name: AttributeName = js.native
  /**
    * The required behavior of the TypedLinkAttributeDefinition.
    */
  var RequiredBehavior: RequiredAttributeBehavior = js.native
  /**
    * Validation rules that are attached to the attribute definition.
    */
  var Rules: js.UndefOr[RuleMap] = js.native
  /**
    * The type of the attribute.
    */
  var Type: FacetAttributeType = js.native
}

object TypedLinkAttributeDefinition {
  @scala.inline
  def apply(Name: AttributeName, RequiredBehavior: RequiredAttributeBehavior, Type: FacetAttributeType): TypedLinkAttributeDefinition = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RequiredBehavior = RequiredBehavior.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkAttributeDefinition]
  }
  @scala.inline
  implicit class TypedLinkAttributeDefinitionOps[Self <: TypedLinkAttributeDefinition] (val x: Self) extends AnyVal {
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
    def withRequiredBehavior(value: RequiredAttributeBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiredBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: FacetAttributeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: TypedAttributeValue): Self = {
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
    def withIsImmutable(value: Bool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsImmutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsImmutable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsImmutable")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: RuleMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(js.undefined)
        ret
    }
  }
  
}

