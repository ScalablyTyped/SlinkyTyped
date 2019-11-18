package typingsSlinky.reactDashRouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.history.historyMod.Location
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.reactDashRouter.reactDashRouterMod.PromptProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Prompt
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashRouter.reactDashRouterMod.Prompt] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.reactDashRouter.reactDashRouterMod.Prompt].asInstanceOf[String | js.Object]
  def apply(
    message: String | (js.Function1[/* location */ Location[LocationState], String | Boolean]),
    when: js.UndefOr[Boolean] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashRouter.reactDashRouterMod.Prompt] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (!js.isUndefined(when)) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PromptProps
}

