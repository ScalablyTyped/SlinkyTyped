package typingsSlinky.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecodeConfig extends StObject {
  
  /**
    * Unvalidated JSON of a decode Config.
    */
  var unvalidatedJSON: JsonString = js.native
}
object DecodeConfig {
  
  @scala.inline
  def apply(unvalidatedJSON: JsonString): DecodeConfig = {
    val __obj = js.Dynamic.literal(unvalidatedJSON = unvalidatedJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeConfig]
  }
  
  @scala.inline
  implicit class DecodeConfigMutableBuilder[Self <: DecodeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnvalidatedJSON(value: JsonString): Self = StObject.set(x, "unvalidatedJSON", value.asInstanceOf[js.Any])
  }
}
