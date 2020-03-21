package typingsSlinky.reactVirtualizedAutoSizer.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactVirtualizedAutoSizer.mod.AutoSizerProps
import typingsSlinky.reactVirtualizedAutoSizer.mod.Size
import typingsSlinky.reactVirtualizedAutoSizer.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactVirtualizedAutoSizer
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-virtualized-auto-sizer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, nonce, style */
  def apply(
    defaultHeight: Int | Double = null,
    defaultWidth: Int | Double = null,
    disableHeight: js.UndefOr[Boolean] = js.undefined,
    disableWidth: js.UndefOr[Boolean] = js.undefined,
    onResize: /* size */ Size => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (defaultHeight != null) __obj.updateDynamic("defaultHeight")(defaultHeight.asInstanceOf[js.Any])
    if (defaultWidth != null) __obj.updateDynamic("defaultWidth")(defaultWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHeight)) __obj.updateDynamic("disableHeight")(disableHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWidth)) __obj.updateDynamic("disableWidth")(disableWidth.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactVirtualizedAutoSizer.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AutoSizerProps
}

