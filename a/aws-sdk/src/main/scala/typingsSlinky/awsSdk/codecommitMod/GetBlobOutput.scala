package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBlobOutput extends StObject {
  
  /**
    * The content of the blob, usually a file.
    */
  var content: blob = js.native
}
object GetBlobOutput {
  
  @scala.inline
  def apply(content: blob): GetBlobOutput = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlobOutput]
  }
  
  @scala.inline
  implicit class GetBlobOutputMutableBuilder[Self <: GetBlobOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: blob): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
