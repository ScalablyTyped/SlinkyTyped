package typingsSlinky.antvMatrixUtil

import typingsSlinky.glMatrix.mod.mat3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extMod {
  
  @JSImport("@antv/matrix-util/lib/ext", "angleTo")
  @js.native
  def angleTo(v1: js.Tuple2[Double, Double], v2: js.Tuple2[Double, Double], direct: Boolean): Double = js.native
  
  @JSImport("@antv/matrix-util/lib/ext", "direction")
  @js.native
  def direction(v1: js.Array[Double], v2: js.Array[Double]): Double = js.native
  
  @JSImport("@antv/matrix-util/lib/ext", "leftRotate")
  @js.native
  def leftRotate(out: js.Any, a: js.Any, rad: js.Any): mat3 = js.native
  
  @JSImport("@antv/matrix-util/lib/ext", "leftScale")
  @js.native
  def leftScale(out: js.Any, a: js.Any, v: js.Any): mat3 = js.native
  
  @JSImport("@antv/matrix-util/lib/ext", "leftTranslate")
  @js.native
  def leftTranslate(out: js.Any, a: js.Any, v: js.Any): mat3 = js.native
  
  @JSImport("@antv/matrix-util/lib/ext", "transform")
  @js.native
  def transform(m: js.Array[Double], actions: js.Array[js.Array[_]]): js.Array[_] = js.native
  
  @JSImport("@antv/matrix-util/lib/ext", "vertical")
  @js.native
  def vertical(out: js.Array[Double], v: js.Array[Double], flag: Boolean): js.Array[Double] = js.native
}
