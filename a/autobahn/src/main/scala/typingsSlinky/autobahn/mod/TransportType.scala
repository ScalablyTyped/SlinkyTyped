package typingsSlinky.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.autobahn.mod.DefaultTransportType
  - typingsSlinky.autobahn.mod.CustomTransportType
*/
trait TransportType extends js.Object

object TransportType {
  @scala.inline
  implicit def apply(value: CustomTransportType): TransportType = value.asInstanceOf[TransportType]
  @scala.inline
  implicit def apply(value: DefaultTransportType): TransportType = value.asInstanceOf[TransportType]
}

