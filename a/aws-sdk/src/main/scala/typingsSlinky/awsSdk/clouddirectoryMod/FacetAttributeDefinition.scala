package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacetAttributeDefinition extends js.Object {
  /**
    * The default value of the attribute (if configured).
    */
  var DefaultValue: js.UndefOr[TypedAttributeValue] = js.native
  /**
    * Whether the attribute is mutable or not.
    */
  var IsImmutable: js.UndefOr[Bool] = js.native
  /**
    * Validation rules attached to the attribute definition.
    */
  var Rules: js.UndefOr[RuleMap] = js.native
  /**
    * The type of the attribute.
    */
  var Type: FacetAttributeType = js.native
}

object FacetAttributeDefinition {
  @scala.inline
  def apply(Type: FacetAttributeType): FacetAttributeDefinition = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetAttributeDefinition]
  }
  @scala.inline
  implicit class FacetAttributeDefinitionOps[Self <: FacetAttributeDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

