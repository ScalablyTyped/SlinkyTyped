package typingsSlinky.node.anon

import typingsSlinky.node.nodeStrings.pkcs1
import typingsSlinky.node.nodeStrings.pkcs8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends StObject {
  
  var `type`: pkcs1 | pkcs8 = js.native
}
object Type {
  
  @scala.inline
  def apply(`type`: pkcs1 | pkcs8): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: pkcs1 | pkcs8): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
