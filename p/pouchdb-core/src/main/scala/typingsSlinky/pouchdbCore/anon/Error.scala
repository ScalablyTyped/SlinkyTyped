package typingsSlinky.pouchdbCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends StObject {
  
  var error: typingsSlinky.pouchdbCore.PouchDB.Core.Error = js.native
}
object Error {
  
  @scala.inline
  def apply(error: typingsSlinky.pouchdbCore.PouchDB.Core.Error): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: typingsSlinky.pouchdbCore.PouchDB.Core.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
