package typingsSlinky.materialUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.materialUi.MaterialUI.Table.TableRowColumnProps
import typingsSlinky.materialUi.tableRowColumnMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableRowColumn
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/Table/TableRowColumn", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, colSpan, rowSpan, style */
  def apply(
    columnNumber: Int | Double = null,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* e */ SyntheticMouseEvent[js.Object], /* column */ Double) => Unit = null,
    onHover: (/* e */ SyntheticMouseEvent[js.Object], /* column */ Double) => Unit = null,
    onHoverExit: (/* e */ SyntheticMouseEvent[js.Object], /* column */ Double) => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction2(onHover))
    if (onHoverExit != null) __obj.updateDynamic("onHoverExit")(js.Any.fromFunction2(onHoverExit))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.materialUi.tableRowColumnMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TableRowColumnProps
}

