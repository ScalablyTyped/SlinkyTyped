package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Condition that must evaluate to true
  */
@js.native
trait ElementDefinitionConstraint extends Element {
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'human'.
    */
  var _human: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'key'.
    */
  var _key: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'requirements'.
    */
  var _requirements: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'severity'.
    */
  var _severity: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'source'.
    */
  var _source: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'xpath'.
    */
  var _xpath: js.UndefOr[Element] = js.native
  /**
    * FHIRPath expression of constraint
    */
  var expression: String = js.native
  /**
    * Human description of constraint
    */
  var human: String = js.native
  /**
    * Target of 'condition' reference above
    */
  var key: id = js.native
  /**
    * Why this constraint is necessary or appropriate
    */
  var requirements: js.UndefOr[String] = js.native
  /**
    * error | warning
    */
  var severity: code = js.native
  /**
    * Reference to original source of constraint
    */
  var source: js.UndefOr[uri] = js.native
  /**
    * XPath expression of constraint
    */
  var xpath: js.UndefOr[String] = js.native
}

object ElementDefinitionConstraint {
  @scala.inline
  def apply(expression: String, human: String, key: id, severity: code): ElementDefinitionConstraint = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], human = human.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionConstraint]
  }
  @scala.inline
  implicit class ElementDefinitionConstraintOps[Self <: ElementDefinitionConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHuman(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("human")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeverity(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_expression(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_expression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_expression")(js.undefined)
        ret
    }
    @scala.inline
    def with_human(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_human")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_human: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_human")(js.undefined)
        ret
    }
    @scala.inline
    def with_key(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_key")(js.undefined)
        ret
    }
    @scala.inline
    def with_requirements(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_requirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_requirements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_requirements")(js.undefined)
        ret
    }
    @scala.inline
    def with_severity(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_severity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_severity")(js.undefined)
        ret
    }
    @scala.inline
    def with_source(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_source: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source")(js.undefined)
        ret
    }
    @scala.inline
    def with_xpath(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_xpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_xpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_xpath")(js.undefined)
        ret
    }
    @scala.inline
    def withRequirements(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequirements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withXpath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpath")(js.undefined)
        ret
    }
  }
  
}

