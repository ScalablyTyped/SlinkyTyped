package typingsSlinky.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashEncryption extends StObject {
  
  var SpekeKeyProvider: typingsSlinky.awsSdk.mediapackagevodMod.SpekeKeyProvider = js.native
}
object DashEncryption {
  
  @scala.inline
  def apply(SpekeKeyProvider: SpekeKeyProvider): DashEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashEncryption]
  }
  
  @scala.inline
  implicit class DashEncryptionMutableBuilder[Self <: DashEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpekeKeyProvider(value: SpekeKeyProvider): Self = StObject.set(x, "SpekeKeyProvider", value.asInstanceOf[js.Any])
  }
}
