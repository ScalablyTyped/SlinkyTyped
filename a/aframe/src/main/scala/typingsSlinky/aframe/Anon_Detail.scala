package typingsSlinky.aframe

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.aframe.aframeMod.Component
import typingsSlinky.aframe.aframeMod.Entity
import typingsSlinky.aframe.aframeMod.ObjectMap
import typingsSlinky.aframe.aframeMod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Detail[D] extends js.Object {
  var detail: D
  var target: EventTarget with (Entity[ObjectMap[Component[_, System[_]]]])
}

object Anon_Detail {
  @scala.inline
  def apply[D](detail: D, target: EventTarget with (Entity[ObjectMap[Component[_, System[_]]]])): Anon_Detail[D] = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Detail[D]]
  }
}

