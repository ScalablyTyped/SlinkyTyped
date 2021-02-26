package typingsSlinky.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRefDataMeta extends StObject {
  
  var extension: BaseAttributesExtensionObject = js.native
}
object CreateRefDataMeta {
  
  @scala.inline
  def apply(extension: BaseAttributesExtensionObject): CreateRefDataMeta = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRefDataMeta]
  }
  
  @scala.inline
  implicit class CreateRefDataMetaMutableBuilder[Self <: CreateRefDataMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: BaseAttributesExtensionObject): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
  }
}
