package typingsSlinky.atlaskitFeedbackCollector.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atlaskitFeedbackCollector.mod.FeedbackCollectorProps
import typingsSlinky.atlaskitFeedbackCollector.mod.FieldType
import typingsSlinky.atlaskitFeedbackCollector.mod.FieldValueType
import typingsSlinky.atlaskitFeedbackCollector.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FeedbackCollector
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@atlaskit/feedback-collector", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    email: String,
    embeddableKey: String,
    name: String,
    requestTypeId: String,
    additionalFields: js.Array[FieldType] = null,
    canBeContactedDefaultValue: FieldValueType = null,
    canBeContactedFieldId: String = null,
    customerNameDefaultValue: FieldValueType = null,
    customerNameFieldId: String = null,
    descriptionDefaultValue: FieldValueType = null,
    descriptionFieldId: String = null,
    emailDefaultValue: FieldValueType = null,
    emailFieldId: String = null,
    enrollInResearchDefaultValue: FieldValueType = null,
    enrollInResearchFieldId: String = null,
    onClose: () => Unit = null,
    onSubmit: () => Unit = null,
    summaryDefaultValue: FieldValueType = null,
    summaryFieldId: String = null,
    summaryTruncateLength: Int | Double = null,
    timeoutOnSubmit: Int | Double = null,
    typeBugDefaultValue: FieldValueType = null,
    typeCommentDefaultValue: FieldValueType = null,
    typeEmptyDefaultValue: FieldValueType = null,
    typeFieldId: String = null,
    typeQuestionDefaultValue: FieldValueType = null,
    typeSuggestionDefaultValue: FieldValueType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], embeddableKey = embeddableKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requestTypeId = requestTypeId.asInstanceOf[js.Any])
    if (additionalFields != null) __obj.updateDynamic("additionalFields")(additionalFields.asInstanceOf[js.Any])
    if (canBeContactedDefaultValue != null) __obj.updateDynamic("canBeContactedDefaultValue")(canBeContactedDefaultValue.asInstanceOf[js.Any])
    if (canBeContactedFieldId != null) __obj.updateDynamic("canBeContactedFieldId")(canBeContactedFieldId.asInstanceOf[js.Any])
    if (customerNameDefaultValue != null) __obj.updateDynamic("customerNameDefaultValue")(customerNameDefaultValue.asInstanceOf[js.Any])
    if (customerNameFieldId != null) __obj.updateDynamic("customerNameFieldId")(customerNameFieldId.asInstanceOf[js.Any])
    if (descriptionDefaultValue != null) __obj.updateDynamic("descriptionDefaultValue")(descriptionDefaultValue.asInstanceOf[js.Any])
    if (descriptionFieldId != null) __obj.updateDynamic("descriptionFieldId")(descriptionFieldId.asInstanceOf[js.Any])
    if (emailDefaultValue != null) __obj.updateDynamic("emailDefaultValue")(emailDefaultValue.asInstanceOf[js.Any])
    if (emailFieldId != null) __obj.updateDynamic("emailFieldId")(emailFieldId.asInstanceOf[js.Any])
    if (enrollInResearchDefaultValue != null) __obj.updateDynamic("enrollInResearchDefaultValue")(enrollInResearchDefaultValue.asInstanceOf[js.Any])
    if (enrollInResearchFieldId != null) __obj.updateDynamic("enrollInResearchFieldId")(enrollInResearchFieldId.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction0(onSubmit))
    if (summaryDefaultValue != null) __obj.updateDynamic("summaryDefaultValue")(summaryDefaultValue.asInstanceOf[js.Any])
    if (summaryFieldId != null) __obj.updateDynamic("summaryFieldId")(summaryFieldId.asInstanceOf[js.Any])
    if (summaryTruncateLength != null) __obj.updateDynamic("summaryTruncateLength")(summaryTruncateLength.asInstanceOf[js.Any])
    if (timeoutOnSubmit != null) __obj.updateDynamic("timeoutOnSubmit")(timeoutOnSubmit.asInstanceOf[js.Any])
    if (typeBugDefaultValue != null) __obj.updateDynamic("typeBugDefaultValue")(typeBugDefaultValue.asInstanceOf[js.Any])
    if (typeCommentDefaultValue != null) __obj.updateDynamic("typeCommentDefaultValue")(typeCommentDefaultValue.asInstanceOf[js.Any])
    if (typeEmptyDefaultValue != null) __obj.updateDynamic("typeEmptyDefaultValue")(typeEmptyDefaultValue.asInstanceOf[js.Any])
    if (typeFieldId != null) __obj.updateDynamic("typeFieldId")(typeFieldId.asInstanceOf[js.Any])
    if (typeQuestionDefaultValue != null) __obj.updateDynamic("typeQuestionDefaultValue")(typeQuestionDefaultValue.asInstanceOf[js.Any])
    if (typeSuggestionDefaultValue != null) __obj.updateDynamic("typeSuggestionDefaultValue")(typeSuggestionDefaultValue.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FeedbackCollectorProps
}

