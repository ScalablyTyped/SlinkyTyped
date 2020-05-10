package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transform Rule from source to target
  */
@js.native
trait StructureMapGroupRule extends BackboneElement {
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Which other rules to apply in the context of this rule
    */
  var dependent: js.UndefOr[js.Array[StructureMapGroupRuleDependent]] = js.native
  /**
    * Documentation for this instance of data
    */
  var documentation: js.UndefOr[String] = js.native
  /**
    * Name of the rule for internal references
    */
  var name: id = js.native
  /**
    * Rules contained in this rule
    */
  var rule: js.UndefOr[js.Array[StructureMapGroupRule]] = js.native
  /**
    * Source inputs to the mapping
    */
  var source: js.Array[StructureMapGroupRuleSource] = js.native
  /**
    * Content to create because of this mapping rule
    */
  var target: js.UndefOr[js.Array[StructureMapGroupRuleTarget]] = js.native
}

object StructureMapGroupRule {
  @scala.inline
  def apply(name: id, source: js.Array[StructureMapGroupRuleSource]): StructureMapGroupRule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroupRule]
  }
  @scala.inline
  implicit class StructureMapGroupRuleOps[Self <: StructureMapGroupRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: js.Array[StructureMapGroupRuleSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_documentation(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_documentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_documentation")(js.undefined)
        ret
    }
    @scala.inline
    def with_name(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(js.undefined)
        ret
    }
    @scala.inline
    def withDependent(value: js.Array[StructureMapGroupRuleDependent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependent")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(js.undefined)
        ret
    }
    @scala.inline
    def withRule(value: js.Array[StructureMapGroupRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: js.Array[StructureMapGroupRuleTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

