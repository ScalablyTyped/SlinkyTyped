package typingsSlinky.parallelTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type OnTransform = js.Function2[
    /* chunk */ js.Any, 
    /* callback */ typingsSlinky.node.streamMod.TransformCallback, 
    scala.Unit
  ]
}
