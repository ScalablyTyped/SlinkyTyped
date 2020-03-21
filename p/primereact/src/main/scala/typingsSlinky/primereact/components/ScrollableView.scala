package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.scrollableViewMod.ScrollableViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollableView
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.scrollableViewMod.ScrollableView] {
  @JSImport("primereact/components/datatable/ScrollableView", "ScrollableView")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: rows */
  def apply(
    body: js.Any = null,
    footer: js.Any = null,
    frozen: js.UndefOr[Boolean] = js.undefined,
    frozenBody: js.Any = null,
    frozenWidth: String = null,
    header: js.Any = null,
    onVirtualScroll: /* page */ Double => Unit = null,
    totalRcords: Int | Double = null,
    unfrozenWidth: String = null,
    virtualScroll: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.scrollableViewMod.ScrollableView] = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(frozen)) __obj.updateDynamic("frozen")(frozen.asInstanceOf[js.Any])
    if (frozenBody != null) __obj.updateDynamic("frozenBody")(frozenBody.asInstanceOf[js.Any])
    if (frozenWidth != null) __obj.updateDynamic("frozenWidth")(frozenWidth.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (onVirtualScroll != null) __obj.updateDynamic("onVirtualScroll")(js.Any.fromFunction1(onVirtualScroll))
    if (totalRcords != null) __obj.updateDynamic("totalRcords")(totalRcords.asInstanceOf[js.Any])
    if (unfrozenWidth != null) __obj.updateDynamic("unfrozenWidth")(unfrozenWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualScroll)) __obj.updateDynamic("virtualScroll")(virtualScroll.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.scrollableViewMod.ScrollableView] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.scrollableViewMod.ScrollableView](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ScrollableViewProps
}

