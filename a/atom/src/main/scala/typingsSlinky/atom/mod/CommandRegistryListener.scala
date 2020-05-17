package typingsSlinky.atom.mod

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.atom.anon.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.atom.anon.Description[TargetType]
  - js.Function1[
/ * event * / typingsSlinky.atom.mod.CommandEvent[TargetType], 
scala.Unit | js.Promise[scala.Unit]]
*/
trait CommandRegistryListener[TargetType /* <: EventTarget */] extends js.Object

object CommandRegistryListener {
  @scala.inline
  implicit def apply[TargetType](value: Description[TargetType]): CommandRegistryListener[TargetType] = value.asInstanceOf[CommandRegistryListener[TargetType]]
  @scala.inline
  implicit def apply[TargetType](value: js.Function1[/* event */ CommandEvent[TargetType], Unit | js.Promise[Unit]]): CommandRegistryListener[TargetType] = value.asInstanceOf[CommandRegistryListener[TargetType]]
}

