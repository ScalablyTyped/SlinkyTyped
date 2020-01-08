package typingsSlinky.atAtlaskitFeedbackDashCollector.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atAtlaskitFeedbackDashCollector.atAtlaskitFeedbackDashCollectorMod.FeedbackFlagProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FeedbackFlag
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.atAtlaskitFeedbackDashCollector.atAtlaskitFeedbackDashCollectorMod.FeedbackFlag
    ] {
  @JSImport("@atlaskit/feedback-collector", "FeedbackFlag")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    isDismissAllowed: js.UndefOr[Boolean] = js.undefined,
    onDismissed: /* repeated */ js.Any => _ = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.atAtlaskitFeedbackDashCollector.atAtlaskitFeedbackDashCollectorMod.FeedbackFlag
  ] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDismissAllowed)) __obj.updateDynamic("isDismissAllowed")(isDismissAllowed.asInstanceOf[js.Any])
    if (onDismissed != null) __obj.updateDynamic("onDismissed")(js.Any.fromFunction1(onDismissed))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.atAtlaskitFeedbackDashCollector.atAtlaskitFeedbackDashCollectorMod.FeedbackFlag
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atAtlaskitFeedbackDashCollector.atAtlaskitFeedbackDashCollectorMod.FeedbackFlag](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FeedbackFlagProps
}

