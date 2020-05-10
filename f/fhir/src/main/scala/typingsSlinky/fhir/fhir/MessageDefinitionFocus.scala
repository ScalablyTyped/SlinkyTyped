package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource(s) that are the subject of the event
  */
@js.native
trait MessageDefinitionFocus extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.native
  /**
    * Type of resource
    */
  var code: typingsSlinky.fhir.fhir.code = js.native
  /**
    * Maximum number of focuses of this type
    */
  var max: js.UndefOr[String] = js.native
  /**
    * Minimum number of focuses of this type
    */
  var min: js.UndefOr[unsignedInt] = js.native
  /**
    * Profile that must be adhered to by focus
    */
  var profile: js.UndefOr[Reference] = js.native
}

object MessageDefinitionFocus {
  @scala.inline
  def apply(code: code): MessageDefinitionFocus = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDefinitionFocus]
  }
  @scala.inline
  implicit class MessageDefinitionFocusOps[Self <: MessageDefinitionFocus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
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
    def with_max(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_max: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_max")(js.undefined)
        ret
    }
    @scala.inline
    def with_min(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_min: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_min")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: unsignedInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
  }
  
}

