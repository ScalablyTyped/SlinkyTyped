package typingsSlinky.randomJs

import typingsSlinky.randomJs.typesMod.Engine
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/sample", JSImport.Namespace)
@js.native
object sampleMod extends js.Object {
  def sample[T](engine: Engine, population: ArrayLike[T], sampleSize: Double): js.Array[T] = js.native
}

