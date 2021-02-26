package typingsSlinky.apolloProtobufjs.descriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOneofDescriptorProto extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[js.Any] = js.native
}
object IOneofDescriptorProto {
  
  @scala.inline
  def apply(): IOneofDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOneofDescriptorProto]
  }
  
  @scala.inline
  implicit class IOneofDescriptorProtoMutableBuilder[Self <: IOneofDescriptorProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
