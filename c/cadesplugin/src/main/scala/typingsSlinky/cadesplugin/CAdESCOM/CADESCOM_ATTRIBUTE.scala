package typingsSlinky.cadesplugin.CAdESCOM

import typingsSlinky.cadesplugin.cadespluginNumbers.`-1`
import typingsSlinky.cadesplugin.cadespluginNumbers.`0`
import typingsSlinky.cadesplugin.cadespluginNumbers.`1`
import typingsSlinky.cadesplugin.cadespluginNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADESCOM_ATTRIBUTE extends StObject {
  
  val CADESCOM_ATTRIBUTE_OTHER: `-1` = js.native
  
  val CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION: `2` = js.native
  
  val CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME: `1` = js.native
  
  val CADESCOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME: `0` = js.native
}
object CADESCOM_ATTRIBUTE {
  
  @scala.inline
  def apply(
    CADESCOM_ATTRIBUTE_OTHER: `-1`,
    CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION: `2`,
    CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME: `1`,
    CADESCOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME: `0`
  ): CADESCOM_ATTRIBUTE = {
    val __obj = js.Dynamic.literal(CADESCOM_ATTRIBUTE_OTHER = CADESCOM_ATTRIBUTE_OTHER.asInstanceOf[js.Any], CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION = CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION.asInstanceOf[js.Any], CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME = CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME.asInstanceOf[js.Any], CADESCOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME = CADESCOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME.asInstanceOf[js.Any])
    __obj.asInstanceOf[CADESCOM_ATTRIBUTE]
  }
  
  @scala.inline
  implicit class CADESCOM_ATTRIBUTEMutableBuilder[Self <: CADESCOM_ATTRIBUTE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCADESCOM_ATTRIBUTE_OTHER(value: `-1`): Self = StObject.set(x, "CADESCOM_ATTRIBUTE_OTHER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION(value: `2`): Self = StObject.set(x, "CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_DESCRIPTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME(value: `1`): Self = StObject.set(x, "CADESCOM_AUTHENTICATED_ATTRIBUTE_DOCUMENT_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME(value: `0`): Self = StObject.set(x, "CADESCOM_AUTHENTICATED_ATTRIBUTE_SIGNING_TIME", value.asInstanceOf[js.Any])
  }
}
