package typingsSlinky.reactTable.anon

import typingsSlinky.reactTable.mod.IdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdIdType[D /* <: js.Object */] extends StObject {
  
  var id: IdType[D] = js.native
}
object IdIdType {
  
  @scala.inline
  def apply[D /* <: js.Object */](id: IdType[D]): IdIdType[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdIdType[D]]
  }
  
  @scala.inline
  implicit class IdIdTypeMutableBuilder[Self <: IdIdType[_], D /* <: js.Object */] (val x: Self with IdIdType[D]) extends AnyVal {
    
    @scala.inline
    def setId(value: IdType[D]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
