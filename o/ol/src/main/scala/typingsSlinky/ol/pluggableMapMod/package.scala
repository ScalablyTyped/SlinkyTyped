package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pluggableMapMod {
  type PostRenderFunction = js.Function2[
    /* p0 */ typingsSlinky.ol.pluggableMapMod.PluggableMap, 
    /* p1 */ typingsSlinky.ol.pluggableMapMod.FrameState, 
    js.Any
  ]
}
