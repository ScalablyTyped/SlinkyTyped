package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Codes in the value set
  */
@js.native
trait ValueSetExpansionContains extends BackboneElement {
  /**
    * Contains extended information for property 'abstract'.
    */
  var _abstract: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'inactive'.
    */
  var _inactive: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  /**
    * If user cannot select this entry
    */
  var `abstract`: js.UndefOr[Boolean] = js.native
  /**
    * Code - if blank, this is not a selectable code
    */
  var code: js.UndefOr[typingsSlinky.fhir.fhir.code] = js.native
  /**
    * Codes contained under this entry
    */
  var contains: js.UndefOr[js.Array[ValueSetExpansionContains]] = js.native
  /**
    * Additional representations for this item
    */
  var designation: js.UndefOr[js.Array[ValueSetComposeIncludeConceptDesignation]] = js.native
  /**
    * User display for the concept
    */
  var display: js.UndefOr[String] = js.native
  /**
    * If concept is inactive in the code system
    */
  var inactive: js.UndefOr[Boolean] = js.native
  /**
    * System value for the code
    */
  var system: js.UndefOr[uri] = js.native
  /**
    * Version in which this code/display is defined
    */
  var version: js.UndefOr[String] = js.native
}

object ValueSetExpansionContains {
  @scala.inline
  def apply(): ValueSetExpansionContains = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueSetExpansionContains]
  }
  @scala.inline
  implicit class ValueSetExpansionContainsOps[Self <: ValueSetExpansionContains] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_abstract(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_abstract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_abstract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_abstract")(js.undefined)
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
    def with_inactive(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_inactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_inactive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_inactive")(js.undefined)
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
    def with_version(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_version")(js.undefined)
        ret
    }
    @scala.inline
    def withAbstract(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abstract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbstract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abstract")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withContains(value: js.Array[ValueSetExpansionContains]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withDesignation(value: js.Array[ValueSetComposeIncludeConceptDesignation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("designation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesignation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("designation")(js.undefined)
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
    def withInactive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactive")(js.undefined)
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
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

