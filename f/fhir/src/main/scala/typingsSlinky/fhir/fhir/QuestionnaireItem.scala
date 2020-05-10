package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Questions and sections within the Questionnaire
  */
@js.native
trait QuestionnaireItem extends BackboneElement {
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'initialBoolean'.
    */
  var _initialBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'initialDate'.
    */
  var _initialDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'initialDateTime'.
    */
  var _initialDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'initialDecimal'.
    */
  var _initialDecimal: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'initialInteger'.
    */
  var _initialInteger: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'initialString'.
    */
  var _initialString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'initialTime'.
    */
  var _initialTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'initialUri'.
    */
  var _initialUri: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'linkId'.
    */
  var _linkId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'maxLength'.
    */
  var _maxLength: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'prefix'.
    */
  var _prefix: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'readOnly'.
    */
  var _readOnly: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'repeats'.
    */
  var _repeats: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'required'.
    */
  var _required: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Corresponding concept for this item in a terminology
    */
  var code: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * ElementDefinition - details for the item
    */
  var definition: js.UndefOr[uri] = js.native
  /**
    * Only allow data when
    */
  var enableWhen: js.UndefOr[js.Array[QuestionnaireItemEnableWhen]] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialCoding: js.UndefOr[Coding] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialDate: js.UndefOr[date] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialDecimal: js.UndefOr[decimal] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialInteger: js.UndefOr[integer] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialReference: js.UndefOr[Reference] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialString: js.UndefOr[String] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialTime: js.UndefOr[time] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialUri: js.UndefOr[uri] = js.native
  /**
    * Nested questionnaire items
    */
  var item: js.UndefOr[js.Array[QuestionnaireItem]] = js.native
  /**
    * Unique id for item in questionnaire
    */
  var linkId: String = js.native
  /**
    * No more than this many characters
    */
  var maxLength: js.UndefOr[integer] = js.native
  /**
    * Permitted answer
    */
  var option: js.UndefOr[js.Array[QuestionnaireItemOption]] = js.native
  /**
    * Valueset containing permitted answers
    */
  var options: js.UndefOr[Reference] = js.native
  /**
    * E.g. "1(a)", "2.5.3"
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Don't allow human editing
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
    * Whether the item may repeat
    */
  var repeats: js.UndefOr[Boolean] = js.native
  /**
    * Whether the item must be included in data results
    */
  var required: js.UndefOr[Boolean] = js.native
  /**
    * Primary text for the item
    */
  var text: js.UndefOr[String] = js.native
  /**
    * group | display | boolean | decimal | integer | date | dateTime +
    */
  var `type`: code = js.native
}

object QuestionnaireItem {
  @scala.inline
  def apply(linkId: String, `type`: code): QuestionnaireItem = {
    val __obj = js.Dynamic.literal(linkId = linkId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireItem]
  }
  @scala.inline
  implicit class QuestionnaireItemOps[Self <: QuestionnaireItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_definition(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_definition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_definition")(js.undefined)
        ret
    }
    @scala.inline
    def with_initialBoolean(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_initialBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def with_initialDate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_initialDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialDate")(js.undefined)
        ret
    }
    @scala.inline
    def with_initialDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_initialDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_initialDecimal(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialDecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_initialDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialDecimal")(js.undefined)
        ret
    }
    @scala.inline
    def with_initialInteger(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_initialInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialInteger")(js.undefined)
        ret
    }
    @scala.inline
    def with_initialString(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_initialString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialString")(js.undefined)
        ret
    }
    @scala.inline
    def with_initialTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_initialTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_initialUri(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_initialUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialUri")(js.undefined)
        ret
    }
    @scala.inline
    def with_linkId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_linkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_linkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_linkId")(js.undefined)
        ret
    }
    @scala.inline
    def with_maxLength(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_maxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def with_prefix(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_prefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_prefix")(js.undefined)
        ret
    }
    @scala.inline
    def with_readOnly(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_readOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def with_repeats(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_repeats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_repeats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_repeats")(js.undefined)
        ret
    }
    @scala.inline
    def with_required(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_required: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_required")(js.undefined)
        ret
    }
    @scala.inline
    def with_text(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(js.undefined)
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
    def withCode(value: js.Array[Coding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinition(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableWhen(value: js.Array[QuestionnaireItemEnableWhen]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWhen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableWhen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWhen")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialAttachment(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialAttachment")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialBoolean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialCoding(value: Coding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialCoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialCoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialCoding")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialDate(value: date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDate")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialDecimal(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDecimal")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialInteger(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialInteger")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialQuantity")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialReference")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialString")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialTime(value: time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTime")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialUri(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialUri")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: js.Array[QuestionnaireItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withOption(value: js.Array[QuestionnaireItemOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeats(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeats")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

