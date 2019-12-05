package typingsSlinky.gestalt.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.gestalt.gestaltMod.MasonryProps
import typingsSlinky.gestalt.gestaltStrings.MasonryDefaultLayout
import typingsSlinky.gestalt.gestaltStrings.MasonryUniformRowLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Masonry
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.gestalt.gestaltMod.Masonry] {
  @JSImport("gestalt", "Masonry")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    comp: ReactComponentClass[js.Object],
    items: js.Array[_],
    columnWidth: Int | Double = null,
    flexible: js.UndefOr[Boolean] = js.undefined,
    gutterWidth: Int | Double = null,
    layout: MasonryDefaultLayout | MasonryUniformRowLayout = null,
    loadItems: () => Unit = null,
    measurementStore: js.Any = null,
    minCols: Int | Double = null,
    scrollContainer: () => HTMLElement = null,
    virtualize: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.gestalt.gestaltMod.Masonry] = {
    val __obj = js.Dynamic.literal(comp = comp.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(flexible)) __obj.updateDynamic("flexible")(flexible.asInstanceOf[js.Any])
    if (gutterWidth != null) __obj.updateDynamic("gutterWidth")(gutterWidth.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (loadItems != null) __obj.updateDynamic("loadItems")(js.Any.fromFunction0(loadItems))
    if (measurementStore != null) __obj.updateDynamic("measurementStore")(measurementStore.asInstanceOf[js.Any])
    if (minCols != null) __obj.updateDynamic("minCols")(minCols.asInstanceOf[js.Any])
    if (scrollContainer != null) __obj.updateDynamic("scrollContainer")(js.Any.fromFunction0(scrollContainer))
    if (!js.isUndefined(virtualize)) __obj.updateDynamic("virtualize")(virtualize.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MasonryProps
}

