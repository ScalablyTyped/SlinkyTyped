package typingsSlinky.atlaskitFeedbackCollector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedbackCollectorProps extends js.Object {
  /**  Additional fields to send to the widget service */
  var additionalFields: js.UndefOr[js.Array[FieldType]] = js.native
  /**  Override the default value for the "can be contacted" custom field in your widget service */
  var canBeContactedDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default id for the "can be contacted" custom field in your widget service */
  var canBeContactedFieldId: js.UndefOr[String] = js.native
  /**  Override the default value for the "customer name" custom field in your widget service */
  var customerNameDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default id for the "customer name" custom field in your widget service */
  var customerNameFieldId: js.UndefOr[String] = js.native
  /**  Override the default value for the "description" custom field in your widget service */
  var descriptionDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default id for the "description" custom field in your widget service */
  var descriptionFieldId: js.UndefOr[String] = js.native
  /** The customer email */
  var email: String = js.native
  /**  Override the default value for the "email" custom field in your widget service */
  var emailDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default id for the "email" custom field in your widget service */
  var emailFieldId: js.UndefOr[String] = js.native
  /** The embeddable key to access the widget service */
  var embeddableKey: String = js.native
  /**  Override the default value for the "enroll in research" custom field in your widget service */
  var enrollInResearchDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default id for the "enroll in research" custom field in your widget service */
  var enrollInResearchFieldId: js.UndefOr[String] = js.native
  /** The customer name */
  var name: String = js.native
  /** Function that will be called to initiate the exit transition. */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  /** Function that will be called optimistically after a delay when the feedback is submitted. */
  var onSubmit: js.UndefOr[js.Function0[Unit]] = js.native
  /** The request id to access the widget service */
  var requestTypeId: String = js.native
  /**  Override the default value for the "summary" custom field in your widget service */
  var summaryDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default id for the "summary" custom field in your widget service */
  var summaryFieldId: js.UndefOr[String] = js.native
  /**  Number of characters that the "summary" field accepts, the rest will be truncated */
  var summaryTruncateLength: js.UndefOr[Double] = js.native
  /** After this delay the onSubmit callback will be triggered optimistically */
  var timeoutOnSubmit: js.UndefOr[Double] = js.native
  /**  Override the default value for the "Bug" type of response in your widget service */
  var typeBugDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default value for the "Comment" type of response in your widget service */
  var typeCommentDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default value for the "Empty" type of response in your widget service */
  var typeEmptyDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default id for the "type" custom field in your widget service */
  var typeFieldId: js.UndefOr[String] = js.native
  /**  Override the default value for the "Question" type of response in your widget service */
  var typeQuestionDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default value for the "Suggestion" type of response in your widget service */
  var typeSuggestionDefaultValue: js.UndefOr[FieldValueType] = js.native
}

object FeedbackCollectorProps {
  @scala.inline
  def apply(email: String, embeddableKey: String, name: String, requestTypeId: String): FeedbackCollectorProps = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], embeddableKey = embeddableKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requestTypeId = requestTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedbackCollectorProps]
  }
  @scala.inline
  implicit class FeedbackCollectorPropsOps[Self <: FeedbackCollectorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmbeddableKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddableKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestTypeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalFields(value: js.Array[FieldType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalFields")(js.undefined)
        ret
    }
    @scala.inline
    def withCanBeContactedDefaultValue(value: FieldValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canBeContactedDefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanBeContactedDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canBeContactedDefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withCanBeContactedFieldId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canBeContactedFieldId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanBeContactedFieldId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canBeContactedFieldId")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerNameDefaultValue(value: FieldValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerNameDefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerNameDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerNameDefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerNameFieldId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerNameFieldId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerNameFieldId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerNameFieldId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionDefaultValue(value: FieldValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionDefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptionDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionDefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionFieldId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionFieldId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptionFieldId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionFieldId")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailDefaultValue(value: FieldValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailDefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailDefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailFieldId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailFieldId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailFieldId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailFieldId")(js.undefined)
        ret
    }
    @scala.inline
    def withEnrollInResearchDefaultValue(value: FieldValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollInResearchDefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnrollInResearchDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollInResearchDefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withEnrollInResearchFieldId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollInResearchFieldId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnrollInResearchFieldId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollInResearchFieldId")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryDefaultValue(value: FieldValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryDefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryDefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryFieldId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryFieldId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryFieldId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryFieldId")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryTruncateLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryTruncateLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryTruncateLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryTruncateLength")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutOnSubmit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutOnSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutOnSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeBugDefaultValue(value: FieldValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeBugDefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeBugDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeBugDefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeCommentDefaultValue(value: FieldValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeCommentDefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeCommentDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeCommentDefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeEmptyDefaultValue(value: FieldValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeEmptyDefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeEmptyDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeEmptyDefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeFieldId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeFieldId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeFieldId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeFieldId")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeQuestionDefaultValue(value: FieldValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeQuestionDefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeQuestionDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeQuestionDefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeSuggestionDefaultValue(value: FieldValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeSuggestionDefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeSuggestionDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeSuggestionDefaultValue")(js.undefined)
        ret
    }
  }
  
}

