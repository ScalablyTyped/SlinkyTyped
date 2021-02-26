package typingsSlinky.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// -------------------------------------
// Document
// -------------------------------------
@js.native
trait MaybeIdentifiedDocument extends StObject {
  
  var _id: js.UndefOr[String] = js.native
}
object MaybeIdentifiedDocument {
  
  @scala.inline
  def apply(): MaybeIdentifiedDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaybeIdentifiedDocument]
  }
  
  @scala.inline
  implicit class MaybeIdentifiedDocumentMutableBuilder[Self <: MaybeIdentifiedDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
