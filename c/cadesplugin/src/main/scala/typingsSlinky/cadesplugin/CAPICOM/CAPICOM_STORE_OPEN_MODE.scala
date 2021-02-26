package typingsSlinky.cadesplugin.CAPICOM

import typingsSlinky.cadesplugin.cadespluginNumbers.`0`
import typingsSlinky.cadesplugin.cadespluginNumbers.`128`
import typingsSlinky.cadesplugin.cadespluginNumbers.`1`
import typingsSlinky.cadesplugin.cadespluginNumbers.`256`
import typingsSlinky.cadesplugin.cadespluginNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAPICOM_STORE_OPEN_MODE extends StoreOpenModePlugin {
  
  val CAPICOM_STORE_OPEN_EXISTING_ONLY: `128` = js.native
  
  val CAPICOM_STORE_OPEN_INCLUDE_ARCHIVED: `256` = js.native
  
  val CAPICOM_STORE_OPEN_READ_ONLY: `0` = js.native
  
  val CAPICOM_STORE_OPEN_READ_WRITE: `1` = js.native
}
object CAPICOM_STORE_OPEN_MODE {
  
  @scala.inline
  def apply(
    CAPICOM_STORE_OPEN_EXISTING_ONLY: `128`,
    CAPICOM_STORE_OPEN_INCLUDE_ARCHIVED: `256`,
    CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED: `2`,
    CAPICOM_STORE_OPEN_READ_ONLY: `0`,
    CAPICOM_STORE_OPEN_READ_WRITE: `1`
  ): CAPICOM_STORE_OPEN_MODE = {
    val __obj = js.Dynamic.literal(CAPICOM_STORE_OPEN_EXISTING_ONLY = CAPICOM_STORE_OPEN_EXISTING_ONLY.asInstanceOf[js.Any], CAPICOM_STORE_OPEN_INCLUDE_ARCHIVED = CAPICOM_STORE_OPEN_INCLUDE_ARCHIVED.asInstanceOf[js.Any], CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED = CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED.asInstanceOf[js.Any], CAPICOM_STORE_OPEN_READ_ONLY = CAPICOM_STORE_OPEN_READ_ONLY.asInstanceOf[js.Any], CAPICOM_STORE_OPEN_READ_WRITE = CAPICOM_STORE_OPEN_READ_WRITE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAPICOM_STORE_OPEN_MODE]
  }
  
  @scala.inline
  implicit class CAPICOM_STORE_OPEN_MODEMutableBuilder[Self <: CAPICOM_STORE_OPEN_MODE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAPICOM_STORE_OPEN_EXISTING_ONLY(value: `128`): Self = StObject.set(x, "CAPICOM_STORE_OPEN_EXISTING_ONLY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_STORE_OPEN_INCLUDE_ARCHIVED(value: `256`): Self = StObject.set(x, "CAPICOM_STORE_OPEN_INCLUDE_ARCHIVED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_STORE_OPEN_READ_ONLY(value: `0`): Self = StObject.set(x, "CAPICOM_STORE_OPEN_READ_ONLY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_STORE_OPEN_READ_WRITE(value: `1`): Self = StObject.set(x, "CAPICOM_STORE_OPEN_READ_WRITE", value.asInstanceOf[js.Any])
  }
}
