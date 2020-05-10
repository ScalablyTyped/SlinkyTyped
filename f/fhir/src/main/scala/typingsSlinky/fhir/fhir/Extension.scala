package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional Extensions Element
  */
@js.native
trait Extension extends Element {
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueBase64Binary'.
    */
  var _valueBase64Binary: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueCode'.
    */
  var _valueCode: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueDate'.
    */
  var _valueDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueDecimal'.
    */
  var _valueDecimal: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueId'.
    */
  var _valueId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueInstant'.
    */
  var _valueInstant: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueMarkdown'.
    */
  var _valueMarkdown: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueOid'.
    */
  var _valueOid: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valuePositiveInt'.
    */
  var _valuePositiveInt: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueTime'.
    */
  var _valueTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueUnsignedInt'.
    */
  var _valueUnsignedInt: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueUri'.
    */
  var _valueUri: js.UndefOr[Element] = js.native
  /**
    * identifies the meaning of the extension
    */
  var url: uri = js.native
  /**
    * Value of extension
    */
  var valueAddress: js.UndefOr[Address] = js.native
  /**
    * Value of extension
    */
  var valueAge: js.UndefOr[Age] = js.native
  /**
    * Value of extension
    */
  var valueAnnotation: js.UndefOr[Annotation] = js.native
  /**
    * Value of extension
    */
  var valueAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Value of extension
    */
  var valueBase64Binary: js.UndefOr[base64Binary] = js.native
  /**
    * Value of extension
    */
  var valueBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Value of extension
    */
  var valueCode: js.UndefOr[code] = js.native
  /**
    * Value of extension
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Value of extension
    */
  var valueCoding: js.UndefOr[Coding] = js.native
  /**
    * Value of extension
    */
  var valueContactPoint: js.UndefOr[ContactPoint] = js.native
  /**
    * Value of extension
    */
  var valueCount: js.UndefOr[Count] = js.native
  /**
    * Value of extension
    */
  var valueDate: js.UndefOr[date] = js.native
  /**
    * Value of extension
    */
  var valueDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Value of extension
    */
  var valueDecimal: js.UndefOr[decimal] = js.native
  /**
    * Value of extension
    */
  var valueDistance: js.UndefOr[Distance] = js.native
  /**
    * Value of extension
    */
  var valueDuration: js.UndefOr[Duration] = js.native
  /**
    * Value of extension
    */
  var valueHumanName: js.UndefOr[HumanName] = js.native
  /**
    * Value of extension
    */
  var valueId: js.UndefOr[id] = js.native
  /**
    * Value of extension
    */
  var valueIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * Value of extension
    */
  var valueInstant: js.UndefOr[instant] = js.native
  /**
    * Value of extension
    */
  var valueInteger: js.UndefOr[integer] = js.native
  /**
    * Value of extension
    */
  var valueMarkdown: js.UndefOr[markdown] = js.native
  /**
    * Value of extension
    */
  var valueMeta: js.UndefOr[Meta] = js.native
  /**
    * Value of extension
    */
  var valueMoney: js.UndefOr[Money] = js.native
  /**
    * Value of extension
    */
  var valueOid: js.UndefOr[oid] = js.native
  /**
    * Value of extension
    */
  var valuePeriod: js.UndefOr[Period] = js.native
  /**
    * Value of extension
    */
  var valuePositiveInt: js.UndefOr[positiveInt] = js.native
  /**
    * Value of extension
    */
  var valueQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Value of extension
    */
  var valueRange: js.UndefOr[Range] = js.native
  /**
    * Value of extension
    */
  var valueRatio: js.UndefOr[Ratio] = js.native
  /**
    * Value of extension
    */
  var valueReference: js.UndefOr[Reference] = js.native
  /**
    * Value of extension
    */
  var valueSampledData: js.UndefOr[SampledData] = js.native
  /**
    * Value of extension
    */
  var valueSignature: js.UndefOr[Signature] = js.native
  /**
    * Value of extension
    */
  var valueString: js.UndefOr[String] = js.native
  /**
    * Value of extension
    */
  var valueTime: js.UndefOr[time] = js.native
  /**
    * Value of extension
    */
  var valueTiming: js.UndefOr[Timing] = js.native
  /**
    * Value of extension
    */
  var valueUnsignedInt: js.UndefOr[unsignedInt] = js.native
  /**
    * Value of extension
    */
  var valueUri: js.UndefOr[uri] = js.native
}

object Extension {
  @scala.inline
  def apply(url: uri): Extension = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  @scala.inline
  implicit class ExtensionOps[Self <: Extension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_url(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_url")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueBase64Binary(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueBase64Binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueBase64Binary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueBase64Binary")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueBoolean(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueCode(value: Element): Self = {
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
    def with_valueDate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueDate")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueDecimal(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueDecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueDecimal")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueId")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueInstant(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueInstant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueInstant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueInstant")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueInteger(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueInteger")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueMarkdown(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueMarkdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueMarkdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueMarkdown")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueOid(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueOid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueOid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueOid")(js.undefined)
        ret
    }
    @scala.inline
    def with_valuePositiveInt(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valuePositiveInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valuePositiveInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valuePositiveInt")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueString(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueString")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueUnsignedInt(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueUnsignedInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueUnsignedInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueUnsignedInt")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueUri(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueUri")(js.undefined)
        ret
    }
    @scala.inline
    def withValueAddress(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withValueAge(value: Age): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAge")(js.undefined)
        ret
    }
    @scala.inline
    def withValueAnnotation(value: Annotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withValueAttachment(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAttachment")(js.undefined)
        ret
    }
    @scala.inline
    def withValueBase64Binary(value: base64Binary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBase64Binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueBase64Binary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBase64Binary")(js.undefined)
        ret
    }
    @scala.inline
    def withValueBoolean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def withValueCode(value: code): Self = {
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
    def withValueCodeableConcept(value: CodeableConcept): Self = {
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
    def withValueCoding(value: Coding): Self = {
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
    def withValueContactPoint(value: ContactPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueContactPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueContactPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueContactPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withValueCount(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCount")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDate(value: date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDate")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDecimal(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDecimal")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDistance(value: Distance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDuration(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withValueHumanName(value: HumanName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueHumanName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueHumanName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueHumanName")(js.undefined)
        ret
    }
    @scala.inline
    def withValueId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueId")(js.undefined)
        ret
    }
    @scala.inline
    def withValueIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withValueInstant(value: instant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInstant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueInstant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInstant")(js.undefined)
        ret
    }
    @scala.inline
    def withValueInteger(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInteger")(js.undefined)
        ret
    }
    @scala.inline
    def withValueMarkdown(value: markdown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMarkdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueMarkdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMarkdown")(js.undefined)
        ret
    }
    @scala.inline
    def withValueMeta(value: Meta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withValueMoney(value: Money): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMoney")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueMoney: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueMoney")(js.undefined)
        ret
    }
    @scala.inline
    def withValueOid(value: oid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueOid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueOid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueOid")(js.undefined)
        ret
    }
    @scala.inline
    def withValuePeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValuePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withValuePositiveInt(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePositiveInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValuePositiveInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePositiveInt")(js.undefined)
        ret
    }
    @scala.inline
    def withValueQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueQuantity")(js.undefined)
        ret
    }
    @scala.inline
    def withValueRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRange")(js.undefined)
        ret
    }
    @scala.inline
    def withValueRatio(value: Ratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withValueReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueReference")(js.undefined)
        ret
    }
    @scala.inline
    def withValueSampledData(value: SampledData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSampledData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueSampledData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSampledData")(js.undefined)
        ret
    }
    @scala.inline
    def withValueSignature(value: Signature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withValueString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueString")(js.undefined)
        ret
    }
    @scala.inline
    def withValueTime(value: time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTime")(js.undefined)
        ret
    }
    @scala.inline
    def withValueTiming(value: Timing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTiming")(js.undefined)
        ret
    }
    @scala.inline
    def withValueUnsignedInt(value: unsignedInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueUnsignedInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueUnsignedInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueUnsignedInt")(js.undefined)
        ret
    }
    @scala.inline
    def withValueUri(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueUri")(js.undefined)
        ret
    }
  }
  
}

