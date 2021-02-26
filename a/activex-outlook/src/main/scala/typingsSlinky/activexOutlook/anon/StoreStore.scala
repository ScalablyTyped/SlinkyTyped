package typingsSlinky.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreStore extends StObject {
  
  val Store: typingsSlinky.activexOutlook.Outlook.Store = js.native
}
object StoreStore {
  
  @scala.inline
  def apply(Store: typingsSlinky.activexOutlook.Outlook.Store): StoreStore = {
    val __obj = js.Dynamic.literal(Store = Store.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreStore]
  }
  
  @scala.inline
  implicit class StoreStoreMutableBuilder[Self <: StoreStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStore(value: typingsSlinky.activexOutlook.Outlook.Store): Self = StObject.set(x, "Store", value.asInstanceOf[js.Any])
  }
}
