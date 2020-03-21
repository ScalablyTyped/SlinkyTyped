package typingsSlinky.randomJs

import typingsSlinky.randomJs.typesMod.Distribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/die", JSImport.Namespace)
@js.native
object dieMod extends js.Object {
  def die(sideCount: Double): Distribution[Double] = js.native
}

