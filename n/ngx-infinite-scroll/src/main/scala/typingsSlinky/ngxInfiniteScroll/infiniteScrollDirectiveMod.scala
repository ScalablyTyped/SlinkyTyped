package typingsSlinky.ngxInfiniteScroll

import typingsSlinky.angularCore.mod.AfterViewInit
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.EventEmitter
import typingsSlinky.angularCore.mod.NgZone
import typingsSlinky.angularCore.mod.OnChanges
import typingsSlinky.angularCore.mod.OnDestroy
import typingsSlinky.ngxInfiniteScroll.modelsMod.IInfiniteScrollAction
import typingsSlinky.ngxInfiniteScroll.modelsMod.IInfiniteScrollEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ngx-infinite-scroll/src/modules/infinite-scroll.directive", JSImport.Namespace)
@js.native
object infiniteScrollDirectiveMod extends js.Object {
  
  @js.native
  class InfiniteScrollDirective protected ()
    extends OnDestroy
       with OnChanges
       with AfterViewInit {
    def this(element: ElementRef[_], zone: NgZone) = this()
    
    var alwaysCallback: Boolean = js.native
    
    def destroyScroller(): Unit = js.native
    
    var disposeScroller: js.Any = js.native
    
    var element: js.Any = js.native
    
    var fromRoot: Boolean = js.native
    
    def handleOnScroll(hasTypePayload: IInfiniteScrollAction): Unit = js.native
    
    var horizontal: Boolean = js.native
    
    var immediateCheck: Boolean = js.native
    
    var infiniteScrollContainer: js.Any = js.native
    
    var infiniteScrollDisabled: Boolean = js.native
    
    var infiniteScrollDistance: Double = js.native
    
    var infiniteScrollThrottle: Double = js.native
    
    var infiniteScrollUpDistance: Double = js.native
    
    var scrollWindow: Boolean = js.native
    
    var scrolled: EventEmitter[IInfiniteScrollEvent] = js.native
    
    var scrolledUp: EventEmitter[IInfiniteScrollEvent] = js.native
    
    def setup(): Unit = js.native
    
    var zone: js.Any = js.native
  }
}
