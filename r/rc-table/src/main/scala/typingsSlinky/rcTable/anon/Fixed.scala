package typingsSlinky.rcTable.anon

import typingsSlinky.rcTable.interfaceMod.FixedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fixed extends StObject {
  
  var fixed: js.UndefOr[FixedType] = js.native
}
object Fixed {
  
  @scala.inline
  def apply(): Fixed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fixed]
  }
  
  @scala.inline
  implicit class FixedMutableBuilder[Self <: Fixed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixed(value: FixedType): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
  }
}
