package typingsSlinky.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object emitterMapMod {
  type ApplicationEmitterAccessor = js.Tuple2[typingsSlinky.openfin.openfinStrings.application, java.lang.String]
  type ExternalWindowEmitterAccessor = js.Tuple2[typingsSlinky.openfin.openfinStrings.`external-window`, java.lang.String]
  type HotkeyEmitterAccessor = js.Array[typingsSlinky.openfin.openfinStrings.`global-hotkey`]
  type SystemEmitterAccessor = js.Array[typingsSlinky.openfin.openfinStrings.system]
  type WindowEmitterAccessor = js.Tuple3[typingsSlinky.openfin.openfinStrings.window, java.lang.String, java.lang.String]
}
