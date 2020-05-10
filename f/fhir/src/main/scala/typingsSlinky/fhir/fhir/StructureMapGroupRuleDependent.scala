package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Which other rules to apply in the context of this rule
  */
@js.native
trait StructureMapGroupRuleDependent extends BackboneElement {
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'variable'.
    */
  var _variable: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Name of a rule or group to apply
    */
  var name: id = js.native
  /**
    * Variable to pass to the rule or group
    */
  var variable: js.Array[String] = js.native
}

object StructureMapGroupRuleDependent {
  @scala.inline
  def apply(name: id, variable: js.Array[String]): StructureMapGroupRuleDependent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroupRuleDependent]
  }
  @scala.inline
  implicit class StructureMapGroupRuleDependentOps[Self <: StructureMapGroupRuleDependent] (val x: Self) extends AnyVal {
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
    def withVariable(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(value.asInstanceOf[js.Any])
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
    def with_variable(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_variable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_variable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_variable")(js.undefined)
        ret
    }
  }
  
}

