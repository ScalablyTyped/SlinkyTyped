package typingsSlinky.cadesplugin.CAdESCOM

import typingsSlinky.cadesplugin.CADESCommon.ValuesOf
import typingsSlinky.cadesplugin.CAPICOM.CAPICOM_HASH_ALGORITHM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CPHashedData extends StObject {
  
  var Algorithm: ValuesOf[CAPICOM_HASH_ALGORITHM] = js.native
  
  var DataEncoding: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE] = js.native
  
  def Hash(newVal: String): Unit = js.native
  
  def SetHashValue(newVal: String): Unit = js.native
  
  var Value: String = js.native
}
object CPHashedData {
  
  @scala.inline
  def apply(
    Algorithm: ValuesOf[CAPICOM_HASH_ALGORITHM],
    DataEncoding: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE],
    Hash: String => Unit,
    SetHashValue: String => Unit,
    Value: String
  ): CPHashedData = {
    val __obj = js.Dynamic.literal(Algorithm = Algorithm.asInstanceOf[js.Any], DataEncoding = DataEncoding.asInstanceOf[js.Any], Hash = js.Any.fromFunction1(Hash), SetHashValue = js.Any.fromFunction1(SetHashValue), Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPHashedData]
  }
  
  @scala.inline
  implicit class CPHashedDataMutableBuilder[Self <: CPHashedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: ValuesOf[CAPICOM_HASH_ALGORITHM]): Self = StObject.set(x, "Algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataEncoding(value: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]): Self = StObject.set(x, "DataEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String => Unit): Self = StObject.set(x, "Hash", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHashValue(value: String => Unit): Self = StObject.set(x, "SetHashValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
