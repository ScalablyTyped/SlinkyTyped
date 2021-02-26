package typingsSlinky.rethinkdb.mod

import typingsSlinky.rethinkdb.rethinkdbStrings.hard
import typingsSlinky.rethinkdb.rethinkdbStrings.soft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateOptions extends StObject {
  
  var durability: js.UndefOr[hard | soft] = js.native
  
  var nonAtomic: js.UndefOr[Boolean] = js.native
  
  var returnChanges: js.UndefOr[Boolean] = js.native
}
object UpdateOptions {
  
  @scala.inline
  def apply(): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOptions]
  }
  
  @scala.inline
  implicit class UpdateOptionsMutableBuilder[Self <: UpdateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurability(value: hard | soft): Self = StObject.set(x, "durability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurabilityUndefined: Self = StObject.set(x, "durability", js.undefined)
    
    @scala.inline
    def setNonAtomic(value: Boolean): Self = StObject.set(x, "nonAtomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonAtomicUndefined: Self = StObject.set(x, "nonAtomic", js.undefined)
    
    @scala.inline
    def setReturnChanges(value: Boolean): Self = StObject.set(x, "returnChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnChangesUndefined: Self = StObject.set(x, "returnChanges", js.undefined)
  }
}
