package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Select codes/concepts by their properties (including relationships)
  */
@js.native
trait ValueSetComposeIncludeFilter extends BackboneElement {
  /**
    * Contains extended information for property 'op'.
    */
  var _op: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'property'.
    */
  var _property: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  /**
    * = | is-a | descendent-of | is-not-a | regex | in | not-in | generalizes | exists
    */
  var op: code = js.native
  /**
    * A property defined by the code system
    */
  var property: code = js.native
  /**
    * Code from the system, or regex criteria, or boolean value for exists
    */
  var value: code = js.native
}

object ValueSetComposeIncludeFilter {
  @scala.inline
  def apply(op: code, property: code, value: code): ValueSetComposeIncludeFilter = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetComposeIncludeFilter]
  }
  @scala.inline
  implicit class ValueSetComposeIncludeFilterOps[Self <: ValueSetComposeIncludeFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOp(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_op(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_op")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_op: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_op")(js.undefined)
        ret
    }
    @scala.inline
    def with_property(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_property: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_property")(js.undefined)
        ret
    }
    @scala.inline
    def with_value(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_value")(js.undefined)
        ret
    }
  }
  
}

