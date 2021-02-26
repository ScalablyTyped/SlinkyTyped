package typingsSlinky.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDocumentPathResponse extends StObject {
  
  /**
    * The path information.
    */
  var Path: js.UndefOr[ResourcePath] = js.native
}
object GetDocumentPathResponse {
  
  @scala.inline
  def apply(): GetDocumentPathResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDocumentPathResponse]
  }
  
  @scala.inline
  implicit class GetDocumentPathResponseMutableBuilder[Self <: GetDocumentPathResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: ResourcePath): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
  }
}
