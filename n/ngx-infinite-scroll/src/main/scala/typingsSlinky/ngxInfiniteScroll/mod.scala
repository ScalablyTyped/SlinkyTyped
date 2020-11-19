package typingsSlinky.ngxInfiniteScroll

import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ngx-infinite-scroll", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class InfiniteScrollDirective protected ()
    extends typingsSlinky.ngxInfiniteScroll.publicApiMod.InfiniteScrollDirective {
    def this(element: ElementRef[_], zone: NgZone) = this()
  }
  
  @js.native
  class InfiniteScrollModule ()
    extends typingsSlinky.ngxInfiniteScroll.ngxInfiniteScrollModuleMod.InfiniteScrollModule
}
