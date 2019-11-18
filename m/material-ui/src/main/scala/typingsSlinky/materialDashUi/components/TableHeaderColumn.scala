package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.Table.TableHeaderColumnProps
import typingsSlinky.materialDashUi.tableTableHeaderColumnMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, colSpan, rowSpan */
object TableHeaderColumn
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.materialDashUi.tableTableHeaderColumnMod.default].asInstanceOf[String | js.Object]
  def apply(
    columnNumber: Int | Double = null,
    onClick: (/* e */ SyntheticMouseEvent[js.Object], /* column */ Double) => Unit = null,
    style: CSSProperties = null,
    tooltip: String = null,
    tooltipStyle: CSSProperties = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipStyle != null) __obj.updateDynamic("tooltipStyle")(tooltipStyle.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TableHeaderColumnProps
}

