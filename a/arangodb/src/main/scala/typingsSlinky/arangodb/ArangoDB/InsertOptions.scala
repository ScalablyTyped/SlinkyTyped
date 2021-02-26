package typingsSlinky.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertOptions extends StObject {
  
  var returnNew: js.UndefOr[Boolean] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
  
  var waitForSync: js.UndefOr[Boolean] = js.native
}
object InsertOptions {
  
  @scala.inline
  def apply(): InsertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertOptions]
  }
  
  @scala.inline
  implicit class InsertOptionsMutableBuilder[Self <: InsertOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturnNew(value: Boolean): Self = StObject.set(x, "returnNew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnNewUndefined: Self = StObject.set(x, "returnNew", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setWaitForSync(value: Boolean): Self = StObject.set(x, "waitForSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForSyncUndefined: Self = StObject.set(x, "waitForSync", js.undefined)
  }
}
