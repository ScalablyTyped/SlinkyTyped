package typingsSlinky.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ReedSolomonDecoder")
@js.native
class ReedSolomonDecoder protected ()
  extends typingsSlinky.jsqrcode.ReedSolomonDecoder {
  def this(field: typingsSlinky.jsqrcode.GF256) = this()
  /* CompleteClass */
  override var field: typingsSlinky.jsqrcode.GF256 = js.native
  /* CompleteClass */
  override def decode(received: typingsSlinky.jsqrcode.GF256, twoS: js.Array[Double]): Unit = js.native
  /* CompleteClass */
  override def findErrorLocations(errorLocator: typingsSlinky.jsqrcode.GF256Poly): js.Array[Double] = js.native
  /* CompleteClass */
  override def findErrorMagnitudes(
    errorEvaluator: typingsSlinky.jsqrcode.GF256Poly,
    errorLocations: js.Array[Double],
    dataMatrix: Boolean
  ): js.Array[Double] = js.native
  /* CompleteClass */
  override def runEuclideanAlgorithm(a: typingsSlinky.jsqrcode.GF256Poly, b: typingsSlinky.jsqrcode.GF256Poly, R: Double): js.Tuple2[typingsSlinky.jsqrcode.GF256Poly, typingsSlinky.jsqrcode.GF256Poly] = js.native
}

