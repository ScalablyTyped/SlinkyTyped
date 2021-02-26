package typingsSlinky.cadesplugin.CAPICOM

import typingsSlinky.cadesplugin.cadespluginNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreOpenModePlugin extends StObject {
  
  val CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED: `2` = js.native
}
object StoreOpenModePlugin {
  
  @scala.inline
  def apply(CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED: `2`): StoreOpenModePlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED = CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreOpenModePlugin]
  }
  
  @scala.inline
  implicit class StoreOpenModePluginMutableBuilder[Self <: StoreOpenModePlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAPICOM_STORE_OPEN_MAXIMUM_ALLOWED(value: `2`): Self = StObject.set(x, "CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED", value.asInstanceOf[js.Any])
  }
}
