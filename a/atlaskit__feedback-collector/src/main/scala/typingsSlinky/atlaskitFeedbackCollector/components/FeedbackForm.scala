package typingsSlinky.atlaskitFeedbackCollector.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.atlaskitFeedbackCollector.mod.FeedbackFormProps
import typingsSlinky.atlaskitFeedbackCollector.mod.FormFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FeedbackForm {
  
  @scala.inline
  def apply(onClose: () => Unit, onSubmit: FormFields => Unit): Default[tag.type, typingsSlinky.atlaskitFeedbackCollector.mod.FeedbackForm] = {
    val __props = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), onSubmit = js.Any.fromFunction1(onSubmit))
    new Default[tag.type, typingsSlinky.atlaskitFeedbackCollector.mod.FeedbackForm](js.Array(this.component, __props.asInstanceOf[FeedbackFormProps]))
  }
  
  @JSImport("@atlaskit/feedback-collector", "FeedbackForm")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FeedbackFormProps): Default[tag.type, typingsSlinky.atlaskitFeedbackCollector.mod.FeedbackForm] = new Default[tag.type, typingsSlinky.atlaskitFeedbackCollector.mod.FeedbackForm](js.Array(this.component, p.asInstanceOf[js.Any]))
}
