package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * For Composite resources to define the parts
  */
@js.native
trait SearchParameterComponent extends BackboneElement {
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.native
  /**
    * Defines how the part works
    */
  var definition: Reference = js.native
  /**
    * Subexpression relative to main expression
    */
  var expression: String = js.native
}

object SearchParameterComponent {
  @scala.inline
  def apply(definition: Reference, expression: String): SearchParameterComponent = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParameterComponent]
  }
  @scala.inline
  implicit class SearchParameterComponentOps[Self <: SearchParameterComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinition(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
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
  }
  
}

