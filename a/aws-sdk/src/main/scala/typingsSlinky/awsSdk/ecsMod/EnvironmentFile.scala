package typingsSlinky.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentFile extends StObject {
  
  /**
    * The file type to use. The only supported value is s3.
    */
  var `type`: EnvironmentFileType = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon S3 object containing the environment variable file.
    */
  var value: String = js.native
}
object EnvironmentFile {
  
  @scala.inline
  def apply(`type`: EnvironmentFileType, value: String): EnvironmentFile = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentFile]
  }
  
  @scala.inline
  implicit class EnvironmentFileMutableBuilder[Self <: EnvironmentFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EnvironmentFileType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
