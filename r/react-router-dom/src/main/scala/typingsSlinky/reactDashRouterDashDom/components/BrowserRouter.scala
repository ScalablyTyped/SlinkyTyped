package typingsSlinky.reactDashRouterDashDom.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashRouterDashDom.reactDashRouterDashDomMod.BrowserRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BrowserRouter
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashRouterDashDom.reactDashRouterDashDomMod.BrowserRouter
    ] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.reactDashRouterDashDom.reactDashRouterDashDomMod.BrowserRouter].asInstanceOf[String | js.Object]
  def apply(
    basename: String = null,
    forceRefresh: js.UndefOr[Boolean] = js.undefined,
    getUserConfirmation: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit = null,
    keyLength: Int | Double = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashRouterDashDom.reactDashRouterDashDomMod.BrowserRouter
  ] = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRefresh)) __obj.updateDynamic("forceRefresh")(forceRefresh.asInstanceOf[js.Any])
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2(getUserConfirmation))
    if (keyLength != null) __obj.updateDynamic("keyLength")(keyLength.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BrowserRouterProps
}

