package typingsSlinky.reactDashLinkify.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashLinkify.reactDashLinkifyMod.MatchInfo
import typingsSlinky.reactDashLinkify.reactDashLinkifyMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashLinkify
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-linkify", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    componentDecorator: (/* decoratedHref */ String, /* decoratedText */ String, /* key */ Double) => TagMod[Any] = null,
    hrefDecorator: /* urlHref */ String => String = null,
    matchDecorator: /* text */ String => js.Array[MatchInfo] | Null = null,
    textDecorator: /* urlText */ String => String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (componentDecorator != null) __obj.updateDynamic("componentDecorator")(js.Any.fromFunction3(componentDecorator))
    if (hrefDecorator != null) __obj.updateDynamic("hrefDecorator")(js.Any.fromFunction1(hrefDecorator))
    if (matchDecorator != null) __obj.updateDynamic("matchDecorator")(js.Any.fromFunction1(matchDecorator))
    if (textDecorator != null) __obj.updateDynamic("textDecorator")(js.Any.fromFunction1(textDecorator))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashLinkify.reactDashLinkifyMod.Props
}

