package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deleted extends StObject {
  
  // Represents the state of the deleted item.
  var state: js.UndefOr[NullableOption[String]] = js.native
}
object Deleted {
  
  @scala.inline
  def apply(): Deleted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deleted]
  }
  
  @scala.inline
  implicit class DeletedMutableBuilder[Self <: Deleted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = StObject.set(x, "state", null)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
