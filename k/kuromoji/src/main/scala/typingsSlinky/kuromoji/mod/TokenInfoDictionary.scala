package typingsSlinky.kuromoji.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenInfoDictionary extends StObject {
  
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
  implicit class TokenInfoDictionaryMutableBuilder[Self <: TokenInfoDictionary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddMapping(value: (Double, Double) => Unit): Self = StObject.set(x, "addMapping", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBuildDictionary(value: js.Array[js.Array[_]] => NumberDictionary[String]): Self = StObject.set(x, "buildDictionary", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFeatures(value: String => String): Self = StObject.set(x, "getFeatures", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadDictionary(value: js.typedarray.Uint8Array => TokenInfoDictionary): Self = StObject.set(x, "loadDictionary", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadPosVector(value: js.typedarray.Uint8Array => TokenInfoDictionary): Self = StObject.set(x, "loadPosVector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadTargetMap(value: js.typedarray.Uint8Array => TokenInfoDictionary): Self = StObject.set(x, "loadTargetMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPut(value: (Double, Double, Double, String, String) => Double): Self = StObject.set(x, "put", js.Any.fromFunction5(value))
    
    @scala.inline
    def setTargetMapToBuffer(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "targetMapToBuffer", js.Any.fromFunction0(value))
  }
}
