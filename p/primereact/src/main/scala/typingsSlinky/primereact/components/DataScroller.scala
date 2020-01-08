package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.Anon_First
import typingsSlinky.primereact.componentsDatascrollerDataScrollerMod.DataScrollerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DataScroller
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.datascrollerMod.DataScroller] {
  @JSImport("primereact/datascroller", "DataScroller")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, rows */
  def apply(
    buffer: Int | Double = null,
    footer: js.Any = null,
    header: js.Any = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    itemTemplate: /* item */ js.Any => js.UndefOr[typingsSlinky.react.reactMod._Global_.JSX.Element] = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    loader: js.Any = null,
    onLazyLoad: /* e */ Anon_First => Unit = null,
    scrollHeight: js.Any = null,
    style: js.Object = null,
    value: js.Array[_] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.datascrollerMod.DataScroller] = {
    val __obj = js.Dynamic.literal()
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (onLazyLoad != null) __obj.updateDynamic("onLazyLoad")(js.Any.fromFunction1(onLazyLoad))
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.datascrollerMod.DataScroller] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.datascrollerMod.DataScroller](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DataScrollerProps
}

