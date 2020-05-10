package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ValueSet details if this is coded
  */
@js.native
trait ElementDefinitionBinding extends Element {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'strength'.
    */
  var _strength: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueSetUri'.
    */
  var _valueSetUri: js.UndefOr[Element] = js.native
  /**
    * Human explanation of the value set
    */
  var description: js.UndefOr[String] = js.native
  /**
    * required | extensible | preferred | example
    */
  var strength: code = js.native
  /**
    * Source of value set
    */
  var valueSetReference: js.UndefOr[Reference] = js.native
  /**
    * Source of value set
    */
  var valueSetUri: js.UndefOr[uri] = js.native
}

object ElementDefinitionBinding {
  @scala.inline
  def apply(strength: code): ElementDefinitionBinding = {
    val __obj = js.Dynamic.literal(strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionBinding]
  }
  @scala.inline
  implicit class ElementDefinitionBindingOps[Self <: ElementDefinitionBinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStrength(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_description(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(js.undefined)
        ret
    }
    @scala.inline
    def with_strength(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_strength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_strength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_strength")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueSetUri(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueSetUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueSetUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueSetUri")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withValueSetReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSetReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueSetReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSetReference")(js.undefined)
        ret
    }
    @scala.inline
    def withValueSetUri(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSetUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueSetUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSetUri")(js.undefined)
        ret
    }
  }
  
}

