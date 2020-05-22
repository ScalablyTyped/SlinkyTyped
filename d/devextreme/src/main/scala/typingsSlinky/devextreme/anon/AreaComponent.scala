package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.data.PivotGridDataSourceField
import typingsSlinky.devextreme.mod.DevExpress.event
import typingsSlinky.devextreme.mod.DevExpress.ui.dxPivotGridFieldChooser
import typingsSlinky.devextreme.mod.global.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaComponent extends js.Object {
  var area: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[dxPivotGridFieldChooser] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.event] = js.undefined
  var field: js.UndefOr[PivotGridDataSourceField] = js.undefined
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var jQueryEvent: js.UndefOr[JQueryEventObject] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object AreaComponent {
  @scala.inline
  def apply(
    area: String = null,
    component: dxPivotGridFieldChooser = null,
    element: dxElement = null,
    event: event = null,
    field: PivotGridDataSourceField = null,
    items: js.Array[_] = null,
    jQueryEvent: JQueryEventObject = null,
    model: js.Any = null
  ): AreaComponent = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (jQueryEvent != null) __obj.updateDynamic("jQueryEvent")(jQueryEvent.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaComponent]
  }
}

