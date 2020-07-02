package typingsSlinky.antd.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var action: String
  var visibilityToggle: Boolean
  def iconRender(visible: Boolean): ReactElement
}

object Action {
  @scala.inline
  def apply(action: String, iconRender: Boolean => ReactElement, visibilityToggle: Boolean): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], iconRender = js.Any.fromFunction1(iconRender), visibilityToggle = visibilityToggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconRender(value: Boolean => ReactElement): Self = this.set("iconRender", js.Any.fromFunction1(value))
    @scala.inline
    def setVisibilityToggle(value: Boolean): Self = this.set("visibilityToggle", value.asInstanceOf[js.Any])
  }
  
}

