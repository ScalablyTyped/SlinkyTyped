package typingsSlinky.plottable.renderControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* keyof plottable.anon.AnimationFrame */ /* Rewritten from type alias, can be one of: 
  - typingsSlinky.plottable.plottableStrings.immediate
  - typingsSlinky.plottable.plottableStrings.animationFrame
  - typingsSlinky.plottable.plottableStrings.timeout
*/
trait Policy extends js.Object

@JSImport("plottable/build/src/core/renderController", "Policy")
@js.native
object Policy extends js.Object {
  var animationFrame: typingsSlinky.plottable.plottableStrings.animationFrame = js.native
  var immediate: typingsSlinky.plottable.plottableStrings.immediate = js.native
  var timeout: typingsSlinky.plottable.plottableStrings.timeout = js.native
}

