package typingsSlinky.ngxInfiniteScroll

import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ngx-infinite-scroll/public_api", JSImport.Namespace)
@js.native
object publicApiMod extends js.Object {
  @js.native
  class InfiniteScrollDirective protected ()
    extends typingsSlinky.ngxInfiniteScroll.ngxInfiniteScrollMod.InfiniteScrollDirective {
    def this(element: ElementRef[_], zone: NgZone) = this()
  }
  
  @js.native
  class InfiniteScrollModule ()
    extends typingsSlinky.ngxInfiniteScroll.ngxInfiniteScrollModuleMod.InfiniteScrollModule
  
}

