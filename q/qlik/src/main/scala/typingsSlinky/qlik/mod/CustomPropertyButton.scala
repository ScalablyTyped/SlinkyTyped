package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPropertyButton
  extends CustomPropertyCommon
     with CustomProperty {
  var component: button = js.native
  def action(data: VisualizationOptions): Unit = js.native
}

object CustomPropertyButton {
  @scala.inline
  def apply(action: VisualizationOptions => Unit, component: button): CustomPropertyButton = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyButton]
  }
  @scala.inline
  implicit class CustomPropertyButtonOps[Self <: CustomPropertyButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: VisualizationOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponent(value: button): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

