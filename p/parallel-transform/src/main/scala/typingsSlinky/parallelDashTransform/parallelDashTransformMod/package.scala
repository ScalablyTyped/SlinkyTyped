package typingsSlinky.parallelDashTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object parallelDashTransformMod {
  import typingsSlinky.node.streamMod.TransformCallback

  type OnTransform = js.Function2[/* chunk */ js.Any, /* callback */ TransformCallback, Unit]
}
