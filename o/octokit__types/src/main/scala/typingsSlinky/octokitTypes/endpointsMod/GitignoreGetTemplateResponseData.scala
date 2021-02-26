package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitignoreGetTemplateResponseData extends StObject {
  
  var name: String = js.native
  
  var source: String = js.native
}
object GitignoreGetTemplateResponseData {
  
  @scala.inline
  def apply(name: String, source: String): GitignoreGetTemplateResponseData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitignoreGetTemplateResponseData]
  }
  
  @scala.inline
  implicit class GitignoreGetTemplateResponseDataMutableBuilder[Self <: GitignoreGetTemplateResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
