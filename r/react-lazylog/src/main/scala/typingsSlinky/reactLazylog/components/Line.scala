package typingsSlinky.reactLazylog.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.a.tag
import typingsSlinky.reactLazylog.AnonText
import typingsSlinky.reactLazylog.lineMod.LineProps
import typingsSlinky.reactLazylog.lineMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Line
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-lazylog/build/Line", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: style */
  def apply(
    data: js.Array[AnonText],
    number: Double,
    rowHeight: Double,
    formatPart: /* text */ String => TagMod[Any] = null,
    highlight: js.UndefOr[Boolean] = js.undefined,
    onLineNumberClick: SyntheticMouseEvent[HTMLAnchorElement] => Unit = null,
    onRowClick: () => _ = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any])
    if (formatPart != null) __obj.updateDynamic("formatPart")(js.Any.fromFunction1(formatPart))
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (onLineNumberClick != null) __obj.updateDynamic("onLineNumberClick")(js.Any.fromFunction1(onLineNumberClick))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction0(onRowClick))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LineProps
}

