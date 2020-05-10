package typingsSlinky.aframe

import org.scalajs.dom.raw.Element
import typingsSlinky.aframe.mod.Component
import typingsSlinky.aframe.mod.Entity
import typingsSlinky.aframe.mod.ObjectMap
import typingsSlinky.aframe.mod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEl extends js.Object {
  var el: Element | (Entity[ObjectMap[Component[_, System[_]]]]) = js.native
}

object AnonEl {
  @scala.inline
  def apply(el: Element | (Entity[ObjectMap[Component[_, System[_]]]])): AnonEl = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEl]
  }
  @scala.inline
  implicit class AnonElOps[Self <: AnonEl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEl(value: Element | (Entity[ObjectMap[Component[_, System[_]]]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

