package typingsSlinky.reactVirtualized.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactVirtualized.AnonHeight
import typingsSlinky.reactVirtualized.AnonScrollLeft
import typingsSlinky.reactVirtualized.esWindowScrollerMod.WindowScrollerProps
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WindowScroller
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactVirtualized.mod.WindowScroller] {
  @JSImport("react-virtualized", "WindowScroller")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onResize: /* params */ AnonHeight => Unit = null,
    onScroll: /* params */ AnonScrollLeft => Unit = null,
    scrollElement: (Window_ with (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis */ js.Any)) | org.scalajs.dom.raw.Element = null,
    scrollingResetTimeInterval: Int | Double = null,
    serverHeight: Int | Double = null,
    serverWidth: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.WindowScroller] = {
    val __obj = js.Dynamic.literal()
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (scrollElement != null) __obj.updateDynamic("scrollElement")(scrollElement.asInstanceOf[js.Any])
    if (scrollingResetTimeInterval != null) __obj.updateDynamic("scrollingResetTimeInterval")(scrollingResetTimeInterval.asInstanceOf[js.Any])
    if (serverHeight != null) __obj.updateDynamic("serverHeight")(serverHeight.asInstanceOf[js.Any])
    if (serverWidth != null) __obj.updateDynamic("serverWidth")(serverWidth.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.WindowScroller] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactVirtualized.mod.WindowScroller](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = WindowScrollerProps
}

