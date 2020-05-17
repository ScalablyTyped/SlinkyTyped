package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.ui.dxSpeedDialAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionElementComponent extends js.Object {
  var actionElement: js.UndefOr[dxElement] = js.native
  var component: js.UndefOr[dxSpeedDialAction] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var model: js.UndefOr[js.Any] = js.native
}

object ActionElementComponent {
  @scala.inline
  def apply(): ActionElementComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionElementComponent]
  }
  @scala.inline
  implicit class ActionElementComponentOps[Self <: ActionElementComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionElement(value: dxElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionElement")(js.undefined)
        ret
    }
    @scala.inline
    def withComponent(value: dxSpeedDialAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: dxElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
  }
  
}

