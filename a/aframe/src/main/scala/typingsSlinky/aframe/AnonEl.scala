package typingsSlinky.aframe

import org.scalajs.dom.raw.Element
import typingsSlinky.aframe.mod.Component
import typingsSlinky.aframe.mod.Entity
import typingsSlinky.aframe.mod.ObjectMap
import typingsSlinky.aframe.mod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEl extends js.Object {
  var el: Element | (Entity[ObjectMap[Component[_, System[_]]]])
}

object AnonEl {
  @scala.inline
  def apply(el: Element | (Entity[ObjectMap[Component[_, System[_]]]])): AnonEl = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEl]
  }
}

