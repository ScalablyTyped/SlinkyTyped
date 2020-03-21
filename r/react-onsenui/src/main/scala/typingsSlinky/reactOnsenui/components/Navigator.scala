package typingsSlinky.reactOnsenui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactOnsenui.HTMLAttributesidclassNameAnimationOptions
import typingsSlinky.reactOnsenui.mod.AnimationOptions
import typingsSlinky.reactOnsenui.mod.NavigatorAnimationTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Navigator
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactOnsenui.mod.Navigator] {
  @JSImport("react-onsenui", "Navigator")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, style */
  def apply(
    renderPage: (js.Any, js.UndefOr[typingsSlinky.reactOnsenui.mod.Navigator]) => ReactElement,
    animation: NavigatorAnimationTypes = null,
    animationOptions: AnimationOptions = null,
    initialRoute: js.Any = null,
    initialRouteStack: js.Array[String] = null,
    onPostPop: () => Unit = null,
    onPostPush: () => Unit = null,
    onPrePop: () => Unit = null,
    onPrePush: () => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.Navigator] = {
    val __obj = js.Dynamic.literal(renderPage = js.Any.fromFunction2(renderPage))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    if (initialRoute != null) __obj.updateDynamic("initialRoute")(initialRoute.asInstanceOf[js.Any])
    if (initialRouteStack != null) __obj.updateDynamic("initialRouteStack")(initialRouteStack.asInstanceOf[js.Any])
    if (onPostPop != null) __obj.updateDynamic("onPostPop")(js.Any.fromFunction0(onPostPop))
    if (onPostPush != null) __obj.updateDynamic("onPostPush")(js.Any.fromFunction0(onPostPush))
    if (onPrePop != null) __obj.updateDynamic("onPrePop")(js.Any.fromFunction0(onPrePop))
    if (onPrePush != null) __obj.updateDynamic("onPrePush")(js.Any.fromFunction0(onPrePush))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = HTMLAttributesidclassNameAnimationOptions
}

