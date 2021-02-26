package typingsSlinky.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataInfo extends StObject {
  
  var fullName: String = js.native
}
object MetadataInfo {
  
  @scala.inline
  def apply(fullName: String): MetadataInfo = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataInfo]
  }
  
  @scala.inline
  implicit class MetadataInfoMutableBuilder[Self <: MetadataInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
  }
}
