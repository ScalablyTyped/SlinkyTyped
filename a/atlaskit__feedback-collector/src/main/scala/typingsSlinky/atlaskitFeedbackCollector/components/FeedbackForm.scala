package typingsSlinky.atlaskitFeedbackCollector.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atlaskitFeedbackCollector.mod.FeedbackFormProps
import typingsSlinky.atlaskitFeedbackCollector.mod.FormFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FeedbackForm
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atlaskitFeedbackCollector.mod.FeedbackForm] {
  @JSImport("@atlaskit/feedback-collector", "FeedbackForm")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(onClose: () => Unit, onSubmit: FormFields => Unit, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.atlaskitFeedbackCollector.mod.FeedbackForm] = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), onSubmit = js.Any.fromFunction1(onSubmit))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FeedbackFormProps
}

