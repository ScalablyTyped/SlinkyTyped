package typingsSlinky.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputDataConfig extends StObject {
  
  /**
    * The URI of the S3 folder that contains a translation job's output file. The folder must be in the same Region as the API endpoint that you are calling.
    */
  var S3Uri: typingsSlinky.awsSdk.translateMod.S3Uri = js.native
}
object OutputDataConfig {
  
  @scala.inline
  def apply(S3Uri: S3Uri): OutputDataConfig = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDataConfig]
  }
  
  @scala.inline
  implicit class OutputDataConfigMutableBuilder[Self <: OutputDataConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
