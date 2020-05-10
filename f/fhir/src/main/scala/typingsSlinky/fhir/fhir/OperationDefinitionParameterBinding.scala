package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ValueSet details if this is coded
  */
@js.native
trait OperationDefinitionParameterBinding extends BackboneElement {
  /**
    * Contains extended information for property 'strength'.
    */
  var _strength: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueSetUri'.
    */
  var _valueSetUri: js.UndefOr[Element] = js.native
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

object OperationDefinitionParameterBinding {
  @scala.inline
  def apply(strength: code): OperationDefinitionParameterBinding = {
    val __obj = js.Dynamic.literal(strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDefinitionParameterBinding]
  }
  @scala.inline
  implicit class OperationDefinitionParameterBindingOps[Self <: OperationDefinitionParameterBinding] (val x: Self) extends AnyVal {
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

