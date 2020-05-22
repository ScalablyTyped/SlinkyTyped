package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.ui.dxDateBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDate extends js.Object {
  var component: js.UndefOr[dxDateBox] = js.undefined
  var date: js.UndefOr[js.Date] = js.undefined
  var view: js.UndefOr[String] = js.undefined
}

object ComponentDate {
  @scala.inline
  def apply(component: dxDateBox = null, date: js.Date = null, view: String = null): ComponentDate = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDate]
  }
}

