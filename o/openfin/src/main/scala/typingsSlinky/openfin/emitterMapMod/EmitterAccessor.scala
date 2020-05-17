package typingsSlinky.openfin.emitterMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openfin.emitterMapMod.SystemEmitterAccessor
  - typingsSlinky.openfin.emitterMapMod.ApplicationEmitterAccessor
  - typingsSlinky.openfin.emitterMapMod.WindowEmitterAccessor
  - typingsSlinky.openfin.emitterMapMod.ExternalWindowEmitterAccessor
  - typingsSlinky.openfin.emitterMapMod.HotkeyEmitterAccessor
  - js.Array[java.lang.String]
*/
trait EmitterAccessor extends js.Object

object EmitterAccessor {
  @scala.inline
  implicit def apply(
    value: ApplicationEmitterAccessor | js.Array[String] | ExternalWindowEmitterAccessor | HotkeyEmitterAccessor | SystemEmitterAccessor
  ): EmitterAccessor = value.asInstanceOf[EmitterAccessor]
  @scala.inline
  implicit def apply(value: WindowEmitterAccessor): EmitterAccessor = value.asInstanceOf[EmitterAccessor]
}

