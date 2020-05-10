package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of the content of the value set (CLD)
  */
@js.native
trait ValueSetCompose extends BackboneElement {
  /**
    * Contains extended information for property 'inactive'.
    */
  var _inactive: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'lockedDate'.
    */
  var _lockedDate: js.UndefOr[Element] = js.native
  /**
    * Explicitly exclude codes from a code system or other value sets
    */
  var exclude: js.UndefOr[js.Array[ValueSetComposeInclude]] = js.native
  /**
    * Whether inactive codes are in the value set
    */
  var inactive: js.UndefOr[Boolean] = js.native
  /**
    * Include one or more codes from a code system or other value set(s)
    */
  var include: js.Array[ValueSetComposeInclude] = js.native
  /**
    * Fixed date for version-less references (transitive)
    */
  var lockedDate: js.UndefOr[date] = js.native
}

object ValueSetCompose {
  @scala.inline
  def apply(include: js.Array[ValueSetComposeInclude]): ValueSetCompose = {
    val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetCompose]
  }
  @scala.inline
  implicit class ValueSetComposeOps[Self <: ValueSetCompose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInclude(value: js.Array[ValueSetComposeInclude]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
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
    def with_lockedDate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lockedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_lockedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lockedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[ValueSetComposeInclude]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
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
    def withLockedDate(value: date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedDate")(js.undefined)
        ret
    }
  }
  
}

