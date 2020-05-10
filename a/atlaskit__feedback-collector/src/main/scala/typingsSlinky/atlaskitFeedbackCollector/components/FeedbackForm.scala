package typingsSlinky.atlaskitFeedbackCollector.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.atlaskitFeedbackCollector.mod.FeedbackFormProps
import typingsSlinky.atlaskitFeedbackCollector.mod.FormFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FeedbackForm {
  @JSImport("@atlaskit/feedback-collector", "FeedbackForm")
  @js.native
  object component extends js.Object
  
  def withProps(p: FeedbackFormProps): Default[tag.type, typingsSlinky.atlaskitFeedbackCollector.mod.FeedbackForm] = new Default[tag.type, typingsSlinky.atlaskitFeedbackCollector.mod.FeedbackForm](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onClose: () => Unit, onSubmit: FormFields => Unit): Default[tag.type, typingsSlinky.atlaskitFeedbackCollector.mod.FeedbackForm] = {
    val __props = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), onSubmit = js.Any.fromFunction1(onSubmit))
    new Default[tag.type, typingsSlinky.atlaskitFeedbackCollector.mod.FeedbackForm](js.Array(this.component, __props.asInstanceOf[FeedbackFormProps]))
  }
}

