package typingsSlinky.reactToolbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRippleMod {
  type RippledComponentFactory = js.Function1[
    /* component */ slinky.core.ReactComponentClass[js.Any], 
    slinky.core.ReactComponentClass[js.Any]
  ]
}
