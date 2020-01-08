package typingsSlinky.reactDashVirtualizedDashAutoDashSizer.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashVirtualizedDashAutoDashSizer.reactDashVirtualizedDashAutoDashSizerMod.AutoSizerProps
import typingsSlinky.reactDashVirtualizedDashAutoDashSizer.reactDashVirtualizedDashAutoDashSizerMod.Size
import typingsSlinky.reactDashVirtualizedDashAutoDashSizer.reactDashVirtualizedDashAutoDashSizerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashVirtualizedDashAutoDashSizer
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-virtualized-auto-sizer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, nonce */
  def apply(
    defaultHeight: Int | Double = null,
    defaultWidth: Int | Double = null,
    disableHeight: js.UndefOr[Boolean] = js.undefined,
    disableWidth: js.UndefOr[Boolean] = js.undefined,
    onResize: /* size */ Size => Unit = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (defaultHeight != null) __obj.updateDynamic("defaultHeight")(defaultHeight.asInstanceOf[js.Any])
    if (defaultWidth != null) __obj.updateDynamic("defaultWidth")(defaultWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHeight)) __obj.updateDynamic("disableHeight")(disableHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWidth)) __obj.updateDynamic("disableWidth")(disableWidth.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashVirtualizedDashAutoDashSizer.reactDashVirtualizedDashAutoDashSizerMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AutoSizerProps
}

