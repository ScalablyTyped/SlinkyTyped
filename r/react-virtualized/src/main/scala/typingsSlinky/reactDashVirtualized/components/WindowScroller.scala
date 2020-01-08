package typingsSlinky.reactDashVirtualized.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Window
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashVirtualized.Anon_Height
import typingsSlinky.reactDashVirtualized.distEsWindowScrollerMod.WindowScrollerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WindowScroller
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashVirtualized.distEsWindowScrollerMod.WindowScroller
    ] {
  @JSImport("react-virtualized/dist/es/WindowScroller", "WindowScroller")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onScroll */
  def apply(
    onResize: /* params */ Anon_Height => Unit = null,
    scrollElement: (Window with (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis */ js.Any)) | org.scalajs.dom.raw.Element = null,
    scrollingResetTimeInterval: Int | Double = null,
    serverHeight: Int | Double = null,
    serverWidth: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashVirtualized.distEsWindowScrollerMod.WindowScroller
  ] = {
    val __obj = js.Dynamic.literal()
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (scrollElement != null) __obj.updateDynamic("scrollElement")(scrollElement.asInstanceOf[js.Any])
    if (scrollingResetTimeInterval != null) __obj.updateDynamic("scrollingResetTimeInterval")(scrollingResetTimeInterval.asInstanceOf[js.Any])
    if (serverHeight != null) __obj.updateDynamic("serverHeight")(serverHeight.asInstanceOf[js.Any])
    if (serverWidth != null) __obj.updateDynamic("serverWidth")(serverWidth.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashVirtualized.distEsWindowScrollerMod.WindowScroller
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashVirtualized.distEsWindowScrollerMod.WindowScroller](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = WindowScrollerProps
}

