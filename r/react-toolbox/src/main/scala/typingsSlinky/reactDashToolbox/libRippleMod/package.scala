package typingsSlinky.reactDashToolbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRippleMod {
  import slinky.core.ReactComponentClass

  type RippledComponentFactory = js.Function1[
    /* component */ ReactComponentClass[js.Any] | ReactComponentClass[js.Any], 
    ReactComponentClass[js.Any] | ReactComponentClass[js.Any]
  ]
}
