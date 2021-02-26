package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEditItemSelectedChangedEventArgs extends ProcessingModeEventArgs {
  
  val index: Double = js.native
  
  val isSelected: Boolean = js.native
}
object ListEditItemSelectedChangedEventArgs {
  
  @scala.inline
  def apply(index: Double, isSelected: Boolean, processOnServer: Boolean, sender: Control): ListEditItemSelectedChangedEventArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEditItemSelectedChangedEventArgs]
  }
  
  @scala.inline
  implicit class ListEditItemSelectedChangedEventArgsMutableBuilder[Self <: ListEditItemSelectedChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
  }
}
