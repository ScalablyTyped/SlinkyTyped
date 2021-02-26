package typingsSlinky.atlaskitFeedbackCollector.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.atlaskitFeedbackCollector.mod.FeedbackCollectorProps
import typingsSlinky.atlaskitFeedbackCollector.mod.FieldType
import typingsSlinky.atlaskitFeedbackCollector.mod.FieldValueType
import typingsSlinky.atlaskitFeedbackCollector.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FeedbackCollector {
  
  @scala.inline
  def apply(email: String, embeddableKey: String, name: String, requestTypeId: String): Builder = {
    val __props = js.Dynamic.literal(email = email.asInstanceOf[js.Any], embeddableKey = embeddableKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requestTypeId = requestTypeId.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FeedbackCollectorProps]))
  }
  
  @JSImport("@atlaskit/feedback-collector", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def additionalFields(value: js.Array[FieldType]): this.type = set("additionalFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def additionalFieldsVarargs(value: FieldType*): this.type = set("additionalFields", js.Array(value :_*))
    
    @scala.inline
    def canBeContactedDefaultValue(value: FieldValueType): this.type = set("canBeContactedDefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def canBeContactedDefaultValueVarargs(value: js.Object*): this.type = set("canBeContactedDefaultValue", js.Array(value :_*))
    
    @scala.inline
    def canBeContactedFieldId(value: String): this.type = set("canBeContactedFieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customerNameDefaultValue(value: FieldValueType): this.type = set("customerNameDefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customerNameDefaultValueVarargs(value: js.Object*): this.type = set("customerNameDefaultValue", js.Array(value :_*))
    
    @scala.inline
    def customerNameFieldId(value: String): this.type = set("customerNameFieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def descriptionDefaultValue(value: FieldValueType): this.type = set("descriptionDefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def descriptionDefaultValueVarargs(value: js.Object*): this.type = set("descriptionDefaultValue", js.Array(value :_*))
    
    @scala.inline
    def descriptionFieldId(value: String): this.type = set("descriptionFieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def emailDefaultValue(value: FieldValueType): this.type = set("emailDefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def emailDefaultValueVarargs(value: js.Object*): this.type = set("emailDefaultValue", js.Array(value :_*))
    
    @scala.inline
    def emailFieldId(value: String): this.type = set("emailFieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enrollInResearchDefaultValue(value: FieldValueType): this.type = set("enrollInResearchDefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enrollInResearchDefaultValueVarargs(value: js.Object*): this.type = set("enrollInResearchDefaultValue", js.Array(value :_*))
    
    @scala.inline
    def enrollInResearchFieldId(value: String): this.type = set("enrollInResearchFieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def onSubmit(value: () => Unit): this.type = set("onSubmit", js.Any.fromFunction0(value))
    
    @scala.inline
    def summaryDefaultValue(value: FieldValueType): this.type = set("summaryDefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def summaryDefaultValueVarargs(value: js.Object*): this.type = set("summaryDefaultValue", js.Array(value :_*))
    
    @scala.inline
    def summaryFieldId(value: String): this.type = set("summaryFieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def summaryTruncateLength(value: Double): this.type = set("summaryTruncateLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeoutOnSubmit(value: Double): this.type = set("timeoutOnSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeBugDefaultValue(value: FieldValueType): this.type = set("typeBugDefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeBugDefaultValueVarargs(value: js.Object*): this.type = set("typeBugDefaultValue", js.Array(value :_*))
    
    @scala.inline
    def typeCommentDefaultValue(value: FieldValueType): this.type = set("typeCommentDefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeCommentDefaultValueVarargs(value: js.Object*): this.type = set("typeCommentDefaultValue", js.Array(value :_*))
    
    @scala.inline
    def typeEmptyDefaultValue(value: FieldValueType): this.type = set("typeEmptyDefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeEmptyDefaultValueVarargs(value: js.Object*): this.type = set("typeEmptyDefaultValue", js.Array(value :_*))
    
    @scala.inline
    def typeFieldId(value: String): this.type = set("typeFieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeQuestionDefaultValue(value: FieldValueType): this.type = set("typeQuestionDefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeQuestionDefaultValueVarargs(value: js.Object*): this.type = set("typeQuestionDefaultValue", js.Array(value :_*))
    
    @scala.inline
    def typeSuggestionDefaultValue(value: FieldValueType): this.type = set("typeSuggestionDefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeSuggestionDefaultValueVarargs(value: js.Object*): this.type = set("typeSuggestionDefaultValue", js.Array(value :_*))
  }
  
  def withProps(p: FeedbackCollectorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
