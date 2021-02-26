package typingsSlinky.materialTabBar

import typingsSlinky.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCTabBarActivatedEvent extends Event {
    
    val detail: MDCTabBarActivatedEventDetail = js.native
  }
  
  @js.native
  trait MDCTabBarActivatedEventDetail extends StObject {
    
    var index: Double = js.native
  }
  object MDCTabBarActivatedEventDetail {
    
    @scala.inline
    def apply(index: Double): MDCTabBarActivatedEventDetail = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCTabBarActivatedEventDetail]
    }
    
    @scala.inline
    implicit class MDCTabBarActivatedEventDetailMutableBuilder[Self <: MDCTabBarActivatedEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
}
