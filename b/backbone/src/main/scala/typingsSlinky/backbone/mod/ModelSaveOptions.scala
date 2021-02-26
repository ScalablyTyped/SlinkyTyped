package typingsSlinky.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelSaveOptions
  extends Silenceable
     with Waitable
     with Validable
     with Parseable
     with PersistenceOptions {
  
  var patch: js.UndefOr[Boolean] = js.native
}
object ModelSaveOptions {
  
  @scala.inline
  def apply(): ModelSaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelSaveOptions]
  }
  
  @scala.inline
  implicit class ModelSaveOptionsMutableBuilder[Self <: ModelSaveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPatch(value: Boolean): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
  }
}
