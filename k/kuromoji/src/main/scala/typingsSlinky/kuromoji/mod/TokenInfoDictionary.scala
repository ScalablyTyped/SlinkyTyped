package typingsSlinky.kuromoji.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenInfoDictionary extends js.Object {
  def addMapping(source: Double, target: Double): Unit = js.native
  def buildDictionary(entries: js.Array[js.Array[_]]): NumberDictionary[String] = js.native
  def getFeatures(token_info_id_str: String): String = js.native
  def loadDictionary(array_buffer: js.typedarray.Uint8Array): TokenInfoDictionary = js.native
  def loadPosVector(array_buffer: js.typedarray.Uint8Array): TokenInfoDictionary = js.native
  def loadTargetMap(array_buffer: js.typedarray.Uint8Array): TokenInfoDictionary = js.native
  def put(left_id: Double, right_id: Double, word_cost: Double, surface_form: String, feature: String): Double = js.native
  def targetMapToBuffer(): js.typedarray.Uint8Array = js.native
}

object TokenInfoDictionary {
  @scala.inline
  def apply(
    addMapping: (Double, Double) => Unit,
    buildDictionary: js.Array[js.Array[_]] => NumberDictionary[String],
    getFeatures: String => String,
    loadDictionary: js.typedarray.Uint8Array => TokenInfoDictionary,
    loadPosVector: js.typedarray.Uint8Array => TokenInfoDictionary,
    loadTargetMap: js.typedarray.Uint8Array => TokenInfoDictionary,
    put: (Double, Double, Double, String, String) => Double,
    targetMapToBuffer: () => js.typedarray.Uint8Array
  ): TokenInfoDictionary = {
    val __obj = js.Dynamic.literal(addMapping = js.Any.fromFunction2(addMapping), buildDictionary = js.Any.fromFunction1(buildDictionary), getFeatures = js.Any.fromFunction1(getFeatures), loadDictionary = js.Any.fromFunction1(loadDictionary), loadPosVector = js.Any.fromFunction1(loadPosVector), loadTargetMap = js.Any.fromFunction1(loadTargetMap), put = js.Any.fromFunction5(put), targetMapToBuffer = js.Any.fromFunction0(targetMapToBuffer))
    __obj.asInstanceOf[TokenInfoDictionary]
  }
  @scala.inline
  implicit class TokenInfoDictionaryOps[Self <: TokenInfoDictionary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddMapping(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMapping")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBuildDictionary(value: js.Array[js.Array[_]] => NumberDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildDictionary")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFeatures(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFeatures")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadDictionary(value: js.typedarray.Uint8Array => TokenInfoDictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadDictionary")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadPosVector(value: js.typedarray.Uint8Array => TokenInfoDictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPosVector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadTargetMap(value: js.typedarray.Uint8Array => TokenInfoDictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTargetMap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPut(value: (Double, Double, Double, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withTargetMapToBuffer(value: () => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetMapToBuffer")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

