package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The designation to be included
  */
@js.native
trait ExpansionProfileDesignationIncludeDesignation extends BackboneElement {
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.native
  /**
    * Human language of the designation to be included
    */
  var language: js.UndefOr[code] = js.native
  /**
    * What kind of Designation to include
    */
  var use: js.UndefOr[Coding] = js.native
}

object ExpansionProfileDesignationIncludeDesignation {
  @scala.inline
  def apply(): ExpansionProfileDesignationIncludeDesignation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionProfileDesignationIncludeDesignation]
  }
  @scala.inline
  implicit class ExpansionProfileDesignationIncludeDesignationOps[Self <: ExpansionProfileDesignationIncludeDesignation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_language(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_language: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_language")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withUse(value: Coding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.undefined)
        ret
    }
  }
  
}

