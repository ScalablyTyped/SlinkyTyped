package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecLoggingAccessLogFile extends StObject {
  
  /**
    * The file path to write access logs to. You can use `/dev/stdout` to send access logs to standard out. Must be between 1 and 255 characters in length.
    */
  var path: Input[String] = js.native
}
object VirtualNodeSpecLoggingAccessLogFile {
  
  @scala.inline
  def apply(path: Input[String]): VirtualNodeSpecLoggingAccessLogFile = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecLoggingAccessLogFile]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecLoggingAccessLogFileMutableBuilder[Self <: VirtualNodeSpecLoggingAccessLogFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
