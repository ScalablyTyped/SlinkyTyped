package typingsSlinky.mangopay2NodejsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends StObject {
  
  var Type: String = js.native
}
object Type {
  
  @scala.inline
  def apply(Type: String): Type = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
