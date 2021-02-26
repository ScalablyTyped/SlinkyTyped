package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnenoteEntityBaseModel extends Entity {
  
  // The endpoint where you can get details about the page. Read-only.
  var self: js.UndefOr[NullableOption[String]] = js.native
}
object OnenoteEntityBaseModel {
  
  @scala.inline
  def apply(): OnenoteEntityBaseModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenoteEntityBaseModel]
  }
  
  @scala.inline
  implicit class OnenoteEntityBaseModelMutableBuilder[Self <: OnenoteEntityBaseModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelf(value: NullableOption[String]): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfNull: Self = StObject.set(x, "self", null)
    
    @scala.inline
    def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
  }
}
