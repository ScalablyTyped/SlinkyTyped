package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgFocusEventUIParam extends StObject {
  
  /**
    * Gets a reference to the igDialog widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object IgFocusEventUIParam {
  
  @scala.inline
  def apply(): IgFocusEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgFocusEventUIParam]
  }
  
  @scala.inline
  implicit class IgFocusEventUIParamMutableBuilder[Self <: IgFocusEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
