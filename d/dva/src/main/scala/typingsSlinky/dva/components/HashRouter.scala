package typingsSlinky.dva.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactRouterDom.mod.HashRouterProps
import typingsSlinky.reactRouterDom.reactRouterDomStrings.hashbang
import typingsSlinky.reactRouterDom.reactRouterDomStrings.noslash
import typingsSlinky.reactRouterDom.reactRouterDomStrings.slash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HashRouter
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.dva.routerMod.HashRouter] {
  @JSImport("dva/router", "HashRouter")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    basename: String = null,
    getUserConfirmation: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit = null,
    hashType: slash | noslash | hashbang = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.dva.routerMod.HashRouter] = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2(getUserConfirmation))
    if (hashType != null) __obj.updateDynamic("hashType")(hashType.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.dva.routerMod.HashRouter] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.dva.routerMod.HashRouter](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HashRouterProps
}

