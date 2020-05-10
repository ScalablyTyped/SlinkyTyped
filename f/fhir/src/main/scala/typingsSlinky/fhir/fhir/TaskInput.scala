package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information used to perform task
  */
@js.native
trait TaskInput extends BackboneElement {
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
    * Label for the input
    */
  var `type`: CodeableConcept = js.native
  /**
    * Content to use in performing the task
    */
  var valueAddress: js.UndefOr[Address] = js.native
  /**
    * Content to use in performing the task
    */
  var valueAge: js.UndefOr[Age] = js.native
  /**
    * Content to use in performing the task
    */
  var valueAnnotation: js.UndefOr[Annotation] = js.native
  /**
    * Content to use in performing the task
    */
  var valueAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Content to use in performing the task
    */
  var valueBase64Binary: js.UndefOr[base64Binary] = js.native
  /**
    * Content to use in performing the task
    */
  var valueBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Content to use in performing the task
    */
  var valueCode: js.UndefOr[code] = js.native
  /**
    * Content to use in performing the task
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Content to use in performing the task
    */
  var valueCoding: js.UndefOr[Coding] = js.native
  /**
    * Content to use in performing the task
    */
  var valueContactPoint: js.UndefOr[ContactPoint] = js.native
  /**
    * Content to use in performing the task
    */
  var valueCount: js.UndefOr[Count] = js.native
  /**
    * Content to use in performing the task
    */
  var valueDate: js.UndefOr[date] = js.native
  /**
    * Content to use in performing the task
    */
  var valueDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Content to use in performing the task
    */
  var valueDecimal: js.UndefOr[decimal] = js.native
  /**
    * Content to use in performing the task
    */
  var valueDistance: js.UndefOr[Distance] = js.native
  /**
    * Content to use in performing the task
    */
  var valueDuration: js.UndefOr[Duration] = js.native
  /**
    * Content to use in performing the task
    */
  var valueHumanName: js.UndefOr[HumanName] = js.native
  /**
    * Content to use in performing the task
    */
  var valueId: js.UndefOr[id] = js.native
  /**
    * Content to use in performing the task
    */
  var valueIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * Content to use in performing the task
    */
  var valueInstant: js.UndefOr[instant] = js.native
  /**
    * Content to use in performing the task
    */
  var valueInteger: js.UndefOr[integer] = js.native
  /**
    * Content to use in performing the task
    */
  var valueMarkdown: js.UndefOr[markdown] = js.native
  /**
    * Content to use in performing the task
    */
  var valueMeta: js.UndefOr[Meta] = js.native
  /**
    * Content to use in performing the task
    */
  var valueMoney: js.UndefOr[Money] = js.native
  /**
    * Content to use in performing the task
    */
  var valueOid: js.UndefOr[oid] = js.native
  /**
    * Content to use in performing the task
    */
  var valuePeriod: js.UndefOr[Period] = js.native
  /**
    * Content to use in performing the task
    */
  var valuePositiveInt: js.UndefOr[positiveInt] = js.native
  /**
    * Content to use in performing the task
    */
  var valueQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Content to use in performing the task
    */
  var valueRange: js.UndefOr[Range] = js.native
  /**
    * Content to use in performing the task
    */
  var valueRatio: js.UndefOr[Ratio] = js.native
  /**
    * Content to use in performing the task
    */
  var valueReference: js.UndefOr[Reference] = js.native
  /**
    * Content to use in performing the task
    */
  var valueSampledData: js.UndefOr[SampledData] = js.native
  /**
    * Content to use in performing the task
    */
  var valueSignature: js.UndefOr[Signature] = js.native
  /**
    * Content to use in performing the task
    */
  var valueString: js.UndefOr[String] = js.native
  /**
    * Content to use in performing the task
    */
  var valueTime: js.UndefOr[time] = js.native
  /**
    * Content to use in performing the task
    */
  var valueTiming: js.UndefOr[Timing] = js.native
  /**
    * Content to use in performing the task
    */
  var valueUnsignedInt: js.UndefOr[unsignedInt] = js.native
  /**
    * Content to use in performing the task
    */
  var valueUri: js.UndefOr[uri] = js.native
}

object TaskInput {
  @scala.inline
  def apply(`type`: CodeableConcept): TaskInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskInput]
  }
  @scala.inline
  implicit class TaskInputOps[Self <: TaskInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
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

