package typingsSlinky.globWatcher.mod

import typingsSlinky.globWatcher.anon.Subscribe
import typingsSlinky.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.NodeJS.EventEmitter
  - js.Thenable[js.Any]
  - typingsSlinky.globWatcher.anon.Subscribe
*/
trait AsyncType extends js.Object

object AsyncType {
  @scala.inline
  implicit def apply(value: EventEmitter): AsyncType = value.asInstanceOf[AsyncType]
  @scala.inline
  implicit def apply(value: Subscribe): AsyncType = value.asInstanceOf[AsyncType]
  @scala.inline
  implicit def apply(value: js.Thenable[js.Any]): AsyncType = value.asInstanceOf[AsyncType]
}

