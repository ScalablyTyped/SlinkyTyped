package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What codes are expected
  */
@js.native
trait DataRequirementCodeFilter extends Element {
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueCode'.
    */
  var _valueCode: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'valueSetString'.
    */
  var _valueSetString: js.UndefOr[Element] = js.native
  /**
    * The code-valued attribute of the filter
    */
  var path: String = js.native
  /**
    * What code is expected
    */
  var valueCode: js.UndefOr[js.Array[code]] = js.native
  /**
    * What CodeableConcept is expected
    */
  var valueCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * What Coding is expected
    */
  var valueCoding: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * Valueset for the filter
    */
  var valueSetReference: js.UndefOr[Reference] = js.native
  /**
    * Valueset for the filter
    */
  var valueSetString: js.UndefOr[String] = js.native
}

object DataRequirementCodeFilter {
  @scala.inline
  def apply(path: String): DataRequirementCodeFilter = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRequirementCodeFilter]
  }
  @scala.inline
  implicit class DataRequirementCodeFilterOps[Self <: DataRequirementCodeFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_path(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_path")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueCode(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueCode")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueSetString(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueSetString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueSetString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueSetString")(js.undefined)
        ret
    }
    @scala.inline
    def withValueCode(value: js.Array[code]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCode")(js.undefined)
        ret
    }
    @scala.inline
    def withValueCodeableConcept(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withValueCoding(value: js.Array[Coding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueCoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCoding")(js.undefined)
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
    def withValueSetString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSetString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueSetString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSetString")(js.undefined)
        ret
    }
  }
  
}

