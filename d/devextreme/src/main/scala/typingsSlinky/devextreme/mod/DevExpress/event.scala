package typingsSlinky.devextreme.mod.DevExpress

import typingsSlinky.devextreme.mod.global.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.devextreme.mod.DevExpress.dxEvent
  - typingsSlinky.devextreme.mod.global.JQueryEventObject
*/
trait event extends js.Object

object event {
  @scala.inline
  implicit def apply(value: JQueryEventObject): event = value.asInstanceOf[event]
  @scala.inline
  implicit def apply(value: dxEvent): event = value.asInstanceOf[event]
}

