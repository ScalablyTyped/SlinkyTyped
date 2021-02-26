package typingsSlinky.cadesplugin.CAPICOM

import typingsSlinky.cadesplugin.cadespluginNumbers.`-1`
import typingsSlinky.cadesplugin.cadespluginNumbers.`0`
import typingsSlinky.cadesplugin.cadespluginNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAPICOM_ENCODING_TYPE extends StObject {
  
  val CAPICOM_ENCODE_ANY: `-1` = js.native
  
  val CAPICOM_ENCODE_BASE64: `0` = js.native
  
  val CAPICOM_ENCODE_BINARY: `1` = js.native
}
object CAPICOM_ENCODING_TYPE {
  
  @scala.inline
  def apply(CAPICOM_ENCODE_ANY: `-1`, CAPICOM_ENCODE_BASE64: `0`, CAPICOM_ENCODE_BINARY: `1`): CAPICOM_ENCODING_TYPE = {
    val __obj = js.Dynamic.literal(CAPICOM_ENCODE_ANY = CAPICOM_ENCODE_ANY.asInstanceOf[js.Any], CAPICOM_ENCODE_BASE64 = CAPICOM_ENCODE_BASE64.asInstanceOf[js.Any], CAPICOM_ENCODE_BINARY = CAPICOM_ENCODE_BINARY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAPICOM_ENCODING_TYPE]
  }
  
  @scala.inline
  implicit class CAPICOM_ENCODING_TYPEMutableBuilder[Self <: CAPICOM_ENCODING_TYPE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAPICOM_ENCODE_ANY(value: `-1`): Self = StObject.set(x, "CAPICOM_ENCODE_ANY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_ENCODE_BASE64(value: `0`): Self = StObject.set(x, "CAPICOM_ENCODE_BASE64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_ENCODE_BINARY(value: `1`): Self = StObject.set(x, "CAPICOM_ENCODE_BINARY", value.asInstanceOf[js.Any])
  }
}
