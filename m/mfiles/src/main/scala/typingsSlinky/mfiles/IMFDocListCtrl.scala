package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMFDocListCtrl extends StObject {
  
  def AttachToListingWindow(shellListing: js.Any): Unit = js.native
}
object IMFDocListCtrl {
  
  @scala.inline
  def apply(AttachToListingWindow: js.Any => Unit): IMFDocListCtrl = {
    val __obj = js.Dynamic.literal(AttachToListingWindow = js.Any.fromFunction1(AttachToListingWindow))
    __obj.asInstanceOf[IMFDocListCtrl]
  }
  
  @scala.inline
  implicit class IMFDocListCtrlMutableBuilder[Self <: IMFDocListCtrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachToListingWindow(value: js.Any => Unit): Self = StObject.set(x, "AttachToListingWindow", js.Any.fromFunction1(value))
  }
}
