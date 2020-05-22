package typingsSlinky.motionSensorsPolyfill

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventHandler = js.Function1[/* event */ org.scalajs.dom.raw.Event, scala.Unit]
  type RotationMatrixType = js.typedarray.Float32Array | js.typedarray.Float64Array | typingsSlinky.std.DOMMatrix
}
