package typingsSlinky.officeUiFabricReact.hoverCardEventListenerTargetExampleMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHoverCardExampleState extends js.Object {
  var eventListenerTarget: HTMLElement | Null = js.native
  var target: HTMLElement | Null = js.native
}

object IHoverCardExampleState {
  @scala.inline
  def apply(): IHoverCardExampleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHoverCardExampleState]
  }
  @scala.inline
  implicit class IHoverCardExampleStateOps[Self <: IHoverCardExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventListenerTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventListenerTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventListenerTargetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventListenerTarget")(null)
        ret
    }
    @scala.inline
    def withTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(null)
        ret
    }
  }
  
}

