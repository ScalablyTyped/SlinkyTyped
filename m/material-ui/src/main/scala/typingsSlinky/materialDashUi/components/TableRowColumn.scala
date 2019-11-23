package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.Table.TableRowColumnProps
import typingsSlinky.materialDashUi.tableTableRowColumnMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableRowColumn
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.materialDashUi.tableTableRowColumnMod.default].asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: className, colSpan, rowSpan */
  def apply(
    columnNumber: Int | Double = null,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* e */ SyntheticMouseEvent[js.Object], /* column */ Double) => Unit = null,
    onHover: (/* e */ SyntheticMouseEvent[js.Object], /* column */ Double) => Unit = null,
    onHoverExit: (/* e */ SyntheticMouseEvent[js.Object], /* column */ Double) => Unit = null,
    style: CSSProperties = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction2(onHover))
    if (onHoverExit != null) __obj.updateDynamic("onHoverExit")(js.Any.fromFunction2(onHoverExit))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TableRowColumnProps
}

