package typingsSlinky.iobroker.mod.global.ioBroker

import typingsSlinky.iobroker.anon.SettableObjectWorkerChann
import typingsSlinky.iobroker.anon.SettableObjectWorkerDevic
import typingsSlinky.iobroker.anon.SettableObjectWorkerFolde
import typingsSlinky.iobroker.anon.SettableObjectWorkerOther
import typingsSlinky.iobroker.anon.SettableObjectWorkerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// In set[Foreign]Object[NotExists] methods, the ID and acl of the object is optional
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.iobroker.anon.SettableObjectWorkerState
  - typingsSlinky.iobroker.anon.SettableObjectWorkerChann
  - typingsSlinky.iobroker.anon.SettableObjectWorkerDevic
  - typingsSlinky.iobroker.anon.SettableObjectWorkerFolde
  - typingsSlinky.iobroker.anon.SettableObjectWorkerOther
*/
trait SettableObject extends js.Object

object SettableObject {
  @scala.inline
  implicit def apply(value: SettableObjectWorkerChann): SettableObject = value.asInstanceOf[SettableObject]
  @scala.inline
  implicit def apply(value: SettableObjectWorkerDevic): SettableObject = value.asInstanceOf[SettableObject]
  @scala.inline
  implicit def apply(value: SettableObjectWorkerFolde): SettableObject = value.asInstanceOf[SettableObject]
  @scala.inline
  implicit def apply(value: SettableObjectWorkerOther): SettableObject = value.asInstanceOf[SettableObject]
  @scala.inline
  implicit def apply(value: SettableObjectWorkerState): SettableObject = value.asInstanceOf[SettableObject]
}

