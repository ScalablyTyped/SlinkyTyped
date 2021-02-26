package typingsSlinky.materialSnackbar

import org.scalajs.dom.raw.Element
import typingsSlinky.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type MDCSnackbarAnnouncer = js.Function2[/* ariaEl */ Element, /* labelEl */ js.UndefOr[Element], Unit]
  
  type MDCSnackbarAnnouncerFactory = js.Function0[MDCSnackbarAnnouncer]
  
  @js.native
  trait MDCSnackbarCloseEvent extends Event {
    
    val detail: MDCSnackbarCloseEventDetail = js.native
  }
  
  @js.native
  trait MDCSnackbarCloseEventDetail extends StObject {
    
    var reason: js.UndefOr[String] = js.native
  }
  object MDCSnackbarCloseEventDetail {
    
    @scala.inline
    def apply(): MDCSnackbarCloseEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MDCSnackbarCloseEventDetail]
    }
    
    @scala.inline
    implicit class MDCSnackbarCloseEventDetailMutableBuilder[Self <: MDCSnackbarCloseEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    }
  }
}
