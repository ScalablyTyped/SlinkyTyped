package typingsSlinky.kuromoji.kuromojiMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenInfoDictionary extends js.Object {
  def addMapping(source: Double, target: Double): Unit
  def buildDictionary(entries: js.Array[js.Array[_]]): NumberDictionary[String]
  def getFeatures(token_info_id_str: String): String
  def loadDictionary(array_buffer: scala.scalajs.js.typedarray.Uint8Array): TokenInfoDictionary
  def loadPosVector(array_buffer: scala.scalajs.js.typedarray.Uint8Array): TokenInfoDictionary
  def loadTargetMap(array_buffer: scala.scalajs.js.typedarray.Uint8Array): TokenInfoDictionary
  def put(left_id: Double, right_id: Double, word_cost: Double, surface_form: String, feature: String): Double
  def targetMapToBuffer(): scala.scalajs.js.typedarray.Uint8Array
}

object TokenInfoDictionary {
  @scala.inline
  def apply(
    addMapping: (Double, Double) => Unit,
    buildDictionary: js.Array[js.Array[_]] => NumberDictionary[String],
    getFeatures: String => String,
    loadDictionary: scala.scalajs.js.typedarray.Uint8Array => TokenInfoDictionary,
    loadPosVector: scala.scalajs.js.typedarray.Uint8Array => TokenInfoDictionary,
    loadTargetMap: scala.scalajs.js.typedarray.Uint8Array => TokenInfoDictionary,
    put: (Double, Double, Double, String, String) => Double,
    targetMapToBuffer: () => scala.scalajs.js.typedarray.Uint8Array
  ): TokenInfoDictionary = {
    val __obj = js.Dynamic.literal(addMapping = js.Any.fromFunction2(addMapping), buildDictionary = js.Any.fromFunction1(buildDictionary), getFeatures = js.Any.fromFunction1(getFeatures), loadDictionary = js.Any.fromFunction1(loadDictionary), loadPosVector = js.Any.fromFunction1(loadPosVector), loadTargetMap = js.Any.fromFunction1(loadTargetMap), put = js.Any.fromFunction5(put), targetMapToBuffer = js.Any.fromFunction0(targetMapToBuffer))
  
    __obj.asInstanceOf[TokenInfoDictionary]
  }
}

