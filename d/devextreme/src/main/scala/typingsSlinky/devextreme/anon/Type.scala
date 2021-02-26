package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.array
import typingsSlinky.devextreme.devextremeStrings.local
import typingsSlinky.devextreme.devextremeStrings.odata
import typingsSlinky.devextreme.devextremeStrings.xmla
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends StObject {
  
  var `type`: js.UndefOr[array | local | odata | xmla] = js.native
}
object Type {
  
  @scala.inline
  def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: array | local | odata | xmla): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
