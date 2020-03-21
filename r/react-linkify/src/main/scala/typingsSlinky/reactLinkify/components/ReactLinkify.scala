package typingsSlinky.reactLinkify.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactLinkify.mod.MatchInfo
import typingsSlinky.reactLinkify.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactLinkify
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
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactLinkify.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactLinkify.mod.Props
}

