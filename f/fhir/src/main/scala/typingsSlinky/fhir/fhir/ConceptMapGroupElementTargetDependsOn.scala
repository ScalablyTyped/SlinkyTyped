package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Other elements required for this mapping (from context)
  */
@js.native
trait ConceptMapGroupElementTargetDependsOn extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'property'.
    */
  var _property: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.native
  /**
    * Value of the referenced element
    */
  var code: String = js.native
  /**
    * Display for the code
    */
  var display: js.UndefOr[String] = js.native
  /**
    * Reference to property mapping depends on
    */
  var property: uri = js.native
  /**
    * Code System (if necessary)
    */
  var system: js.UndefOr[uri] = js.native
}

object ConceptMapGroupElementTargetDependsOn {
  @scala.inline
  def apply(code: String, property: uri): ConceptMapGroupElementTargetDependsOn = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptMapGroupElementTargetDependsOn]
  }
  @scala.inline
  implicit class ConceptMapGroupElementTargetDependsOnOps[Self <: ConceptMapGroupElementTargetDependsOn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_code(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_code")(js.undefined)
        ret
    }
    @scala.inline
    def with_display(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_display: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_display")(js.undefined)
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
    def with_system(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_system: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_system")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withSystem(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(js.undefined)
        ret
    }
  }
  
}

