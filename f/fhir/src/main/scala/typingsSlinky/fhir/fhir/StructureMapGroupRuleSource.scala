package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Source inputs to the mapping
  */
@js.native
trait StructureMapGroupRuleSource extends BackboneElement {
  /**
    * Contains extended information for property 'check'.
    */
  var _check: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'condition'.
    */
  var _condition: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'context'.
    */
  var _context: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'defaultValueBase64Binary'.
    */
  var _defaultValueBase64Binary: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'defaultValueBoolean'.
    */
  var _defaultValueBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'defaultValueCode'.
    */
  var _defaultValueCode: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'defaultValueDate'.
    */
  var _defaultValueDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'defaultValueDateTime'.
    */
  var _defaultValueDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'defaultValueDecimal'.
    */
  var _defaultValueDecimal: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'defaultValueId'.
    */
  var _defaultValueId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'defaultValueInstant'.
    */
  var _defaultValueInstant: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'defaultValueInteger'.
    */
  var _defaultValueInteger: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'defaultValueMarkdown'.
    */
  var _defaultValueMarkdown: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'defaultValueOid'.
    */
  var _defaultValueOid: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'defaultValuePositiveInt'.
    */
  var _defaultValuePositiveInt: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'defaultValueString'.
    */
  var _defaultValueString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'defaultValueTime'.
    */
  var _defaultValueTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'defaultValueUnsignedInt'.
    */
  var _defaultValueUnsignedInt: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'defaultValueUri'.
    */
  var _defaultValueUri: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'element'.
    */
  var _element: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'listMode'.
    */
  var _listMode: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'variable'.
    */
  var _variable: js.UndefOr[Element] = js.native
  /**
    * FHIRPath expression  - must be true or the mapping engine throws an error instead of completing
    */
  var check: js.UndefOr[String] = js.native
  /**
    * FHIRPath expression  - must be true or the rule does not apply
    */
  var condition: js.UndefOr[String] = js.native
  /**
    * Type or variable this rule applies to
    */
  var context: id = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueAddress: js.UndefOr[Address] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueAge: js.UndefOr[Age] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueAnnotation: js.UndefOr[Annotation] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueBase64Binary: js.UndefOr[base64Binary] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueCode: js.UndefOr[code] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueCoding: js.UndefOr[Coding] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueContactPoint: js.UndefOr[ContactPoint] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueCount: js.UndefOr[Count] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueDate: js.UndefOr[date] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueDecimal: js.UndefOr[decimal] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueDistance: js.UndefOr[Distance] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueDuration: js.UndefOr[Duration] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueHumanName: js.UndefOr[HumanName] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueId: js.UndefOr[id] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueInstant: js.UndefOr[instant] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueInteger: js.UndefOr[integer] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueMarkdown: js.UndefOr[markdown] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueMeta: js.UndefOr[Meta] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueMoney: js.UndefOr[Money] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueOid: js.UndefOr[oid] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValuePeriod: js.UndefOr[Period] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValuePositiveInt: js.UndefOr[positiveInt] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueRange: js.UndefOr[Range] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueRatio: js.UndefOr[Ratio] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueReference: js.UndefOr[Reference] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueSampledData: js.UndefOr[SampledData] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueSignature: js.UndefOr[Signature] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueString: js.UndefOr[String] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueTime: js.UndefOr[time] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueTiming: js.UndefOr[Timing] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueUnsignedInt: js.UndefOr[unsignedInt] = js.native
  /**
    * Default value if no value exists
    */
  var defaultValueUri: js.UndefOr[uri] = js.native
  /**
    * Optional field for this source
    */
  var element: js.UndefOr[String] = js.native
  /**
    * first | not_first | last | not_last | only_one
    */
  var listMode: js.UndefOr[code] = js.native
  /**
    * Specified maximum cardinality (number or *)
    */
  var max: js.UndefOr[String] = js.native
  /**
    * Specified minimum cardinality
    */
  var min: js.UndefOr[integer] = js.native
  /**
    * Rule only applies if source has this type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Named context for field, if a field is specified
    */
  var variable: js.UndefOr[id] = js.native
}

object StructureMapGroupRuleSource {
  @scala.inline
  def apply(context: id): StructureMapGroupRuleSource = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroupRuleSource]
  }
  @scala.inline
  implicit class StructureMapGroupRuleSourceOps[Self <: StructureMapGroupRuleSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_check(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_check: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_check")(js.undefined)
        ret
    }
    @scala.inline
    def with_condition(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_condition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_condition")(js.undefined)
        ret
    }
    @scala.inline
    def with_context(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_context: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_context")(js.undefined)
        ret
    }
    @scala.inline
    def with_defaultValueBase64Binary(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueBase64Binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_defaultValueBase64Binary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueBase64Binary")(js.undefined)
        ret
    }
    @scala.inline
    def with_defaultValueBoolean(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_defaultValueBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def with_defaultValueCode(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_defaultValueCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueCode")(js.undefined)
        ret
    }
    @scala.inline
    def with_defaultValueDate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_defaultValueDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueDate")(js.undefined)
        ret
    }
    @scala.inline
    def with_defaultValueDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_defaultValueDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_defaultValueDecimal(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueDecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_defaultValueDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueDecimal")(js.undefined)
        ret
    }
    @scala.inline
    def with_defaultValueId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_defaultValueId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueId")(js.undefined)
        ret
    }
    @scala.inline
    def with_defaultValueInstant(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueInstant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_defaultValueInstant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueInstant")(js.undefined)
        ret
    }
    @scala.inline
    def with_defaultValueInteger(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_defaultValueInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueInteger")(js.undefined)
        ret
    }
    @scala.inline
    def with_defaultValueMarkdown(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueMarkdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_defaultValueMarkdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueMarkdown")(js.undefined)
        ret
    }
    @scala.inline
    def with_defaultValueOid(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueOid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_defaultValueOid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueOid")(js.undefined)
        ret
    }
    @scala.inline
    def with_defaultValuePositiveInt(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValuePositiveInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_defaultValuePositiveInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValuePositiveInt")(js.undefined)
        ret
    }
    @scala.inline
    def with_defaultValueString(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_defaultValueString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueString")(js.undefined)
        ret
    }
    @scala.inline
    def with_defaultValueTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_defaultValueTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_defaultValueUnsignedInt(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueUnsignedInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_defaultValueUnsignedInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueUnsignedInt")(js.undefined)
        ret
    }
    @scala.inline
    def with_defaultValueUri(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_defaultValueUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defaultValueUri")(js.undefined)
        ret
    }
    @scala.inline
    def with_element(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_element: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_element")(js.undefined)
        ret
    }
    @scala.inline
    def with_listMode(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_listMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_listMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_listMode")(js.undefined)
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
    def with_type(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(js.undefined)
        ret
    }
    @scala.inline
    def with_variable(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_variable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_variable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_variable")(js.undefined)
        ret
    }
    @scala.inline
    def withCheck(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.undefined)
        ret
    }
    @scala.inline
    def withCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueAddress(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueAge(value: Age): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueAge")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueAnnotation(value: Annotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueAttachment(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueAttachment")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueBase64Binary(value: base64Binary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueBase64Binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueBase64Binary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueBase64Binary")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueBoolean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueCode(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueCode")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueCoding(value: Coding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueCoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueCoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueCoding")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueContactPoint(value: ContactPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueContactPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueContactPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueContactPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueCount(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueDate(value: date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueDecimal(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueDecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueDecimal")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueDistance(value: Distance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueDuration(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueHumanName(value: HumanName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueHumanName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueHumanName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueHumanName")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueId")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueInstant(value: instant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueInstant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueInstant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueInstant")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueInteger(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueInteger")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueMarkdown(value: markdown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueMarkdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueMarkdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueMarkdown")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueMeta(value: Meta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueMoney(value: Money): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueMoney")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueMoney: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueMoney")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueOid(value: oid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueOid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueOid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueOid")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValuePeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValuePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValuePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValuePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValuePositiveInt(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValuePositiveInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValuePositiveInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValuePositiveInt")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueQuantity")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueRatio(value: Ratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueReference")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueSampledData(value: SampledData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueSampledData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueSampledData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueSampledData")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueSignature(value: Signature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueString")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueTime(value: time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueTiming(value: Timing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueTiming")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueUnsignedInt(value: unsignedInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueUnsignedInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueUnsignedInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueUnsignedInt")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueUri(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValueUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueUri")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withListMode(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMode")(js.undefined)
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
    def withMin(value: integer): Self = {
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVariable(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(js.undefined)
        ret
    }
  }
  
}

