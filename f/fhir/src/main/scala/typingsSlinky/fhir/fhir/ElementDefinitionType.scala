package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data type and Profile for this element
  */
@js.native
trait ElementDefinitionType extends Element {
  /**
    * Contains extended information for property 'aggregation'.
    */
  var _aggregation: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'targetProfile'.
    */
  var _targetProfile: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'versioning'.
    */
  var _versioning: js.UndefOr[Element] = js.native
  /**
    * contained | referenced | bundled - how aggregated
    */
  var aggregation: js.UndefOr[js.Array[code]] = js.native
  /**
    * Data type or Resource (reference to definition)
    */
  var code: uri = js.native
  /**
    * Profile (StructureDefinition) to apply (or IG)
    */
  var profile: js.UndefOr[uri] = js.native
  /**
    * Profile (StructureDefinition) to apply to reference target (or IG)
    */
  var targetProfile: js.UndefOr[uri] = js.native
  /**
    * either | independent | specific
    */
  var versioning: js.UndefOr[code] = js.native
}

object ElementDefinitionType {
  @scala.inline
  def apply(code: uri): ElementDefinitionType = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionType]
  }
  @scala.inline
  implicit class ElementDefinitionTypeOps[Self <: ElementDefinitionType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_aggregation(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_aggregation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_aggregation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_aggregation")(js.undefined)
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
    def with_profile(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_profile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_profile")(js.undefined)
        ret
    }
    @scala.inline
    def with_targetProfile(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_targetProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_targetProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_targetProfile")(js.undefined)
        ret
    }
    @scala.inline
    def with_versioning(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_versioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_versioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_versioning")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregation(value: js.Array[code]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregation")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: uri): Self = {
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
    @scala.inline
    def withTargetProfile(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withVersioning(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versioning")(js.undefined)
        ret
    }
  }
  
}

