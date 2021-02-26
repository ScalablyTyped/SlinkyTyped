package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DriveInfo...
  */
@js.native
trait IDriveInfo extends StObject {
  
  /**
    * Value of the drive
    *
    * Examples:
    * C:\\, E:\\
    */
  var qDrive: String = js.native
  
  /**
    * Name of the drive.
    */
  var qName: String = js.native
  
  /**
    * Type of the drive.
    * Fixed means physical drive.
    */
  var qType: String = js.native
  
  /**
    * Information about the drive type.
    */
  var qTypeIdentifier: DriveType = js.native
}
object IDriveInfo {
  
  @scala.inline
  def apply(qDrive: String, qName: String, qType: String, qTypeIdentifier: DriveType): IDriveInfo = {
    val __obj = js.Dynamic.literal(qDrive = qDrive.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qTypeIdentifier = qTypeIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDriveInfo]
  }
  
  @scala.inline
  implicit class IDriveInfoMutableBuilder[Self <: IDriveInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDrive(value: String): Self = StObject.set(x, "qDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: String): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTypeIdentifier(value: DriveType): Self = StObject.set(x, "qTypeIdentifier", value.asInstanceOf[js.Any])
  }
}
