package typingsSlinky.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableRadiusRequest extends StObject {
  
  /**
    * The identifier of the directory for which to enable MFA.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
  
  /**
    * A RadiusSettings object that contains information about the RADIUS server.
    */
  var RadiusSettings: typingsSlinky.awsSdk.directoryserviceMod.RadiusSettings = js.native
}
object EnableRadiusRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId, RadiusSettings: RadiusSettings): EnableRadiusRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], RadiusSettings = RadiusSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableRadiusRequest]
  }
  
  @scala.inline
  implicit class EnableRadiusRequestMutableBuilder[Self <: EnableRadiusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusSettings(value: RadiusSettings): Self = StObject.set(x, "RadiusSettings", value.asInstanceOf[js.Any])
  }
}
