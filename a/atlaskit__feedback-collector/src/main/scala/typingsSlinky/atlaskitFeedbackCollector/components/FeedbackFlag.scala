package typingsSlinky.atlaskitFeedbackCollector.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.atlaskitFeedbackCollector.mod.FeedbackFlagProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FeedbackFlag {
  @JSImport("@atlaskit/feedback-collector", "FeedbackFlag")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.atlaskitFeedbackCollector.mod.FeedbackFlag] {
    @scala.inline
    def isDismissAllowed(value: Boolean): this.type = set("isDismissAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def onDismissed(value: /* repeated */ js.Any => _): this.type = set("onDismissed", js.Any.fromFunction1(value))
  }
  
  def withProps(p: FeedbackFlagProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FeedbackFlag.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

