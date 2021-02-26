package typingsSlinky.randomJs

import typingsSlinky.randomJs.typesMod.Engine
import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sampleMod {
  
  @JSImport("random-js/dist/distribution/sample", "sample")
  @js.native
  def sample[T](engine: Engine, population: ArrayLike[T], sampleSize: Double): js.Array[T] = js.native
}
