package typingsSlinky.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChamferableBodyDefinition extends IBodyDefinition {
  
  var chamfer: js.UndefOr[IChamfer] = js.native
}
object IChamferableBodyDefinition {
  
  @scala.inline
  def apply(): IChamferableBodyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChamferableBodyDefinition]
  }
  
  @scala.inline
  implicit class IChamferableBodyDefinitionMutableBuilder[Self <: IChamferableBodyDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChamfer(value: IChamfer): Self = StObject.set(x, "chamfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChamferUndefined: Self = StObject.set(x, "chamfer", js.undefined)
  }
}
