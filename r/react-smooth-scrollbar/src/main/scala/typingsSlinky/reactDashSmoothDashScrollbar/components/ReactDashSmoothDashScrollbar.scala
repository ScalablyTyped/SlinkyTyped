package typingsSlinky.reactDashSmoothDashScrollbar.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashSmoothDashScrollbar.reactDashSmoothDashScrollbarMod.ScrollbarProps
import typingsSlinky.reactDashSmoothDashScrollbar.reactDashSmoothDashScrollbarMod.^
import typingsSlinky.smoothDashScrollbar.interfacesScrollbarMod.ScrollStatus
import typingsSlinky.smoothDashScrollbar.smoothDashScrollbarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashSmoothDashScrollbar
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-smooth-scrollbar", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    alwaysShowTracks: js.UndefOr[Boolean] = js.undefined,
    onScroll: (/* status */ ScrollStatus, /* scrollbarInstance */ default) => Unit = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowTracks)) __obj.updateDynamic("alwaysShowTracks")(alwaysShowTracks.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction2(onScroll))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ScrollbarProps
}

