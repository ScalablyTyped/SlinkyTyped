package typingsSlinky.ngxInfiniteScroll

import typingsSlinky.ngxInfiniteScroll.modelsMod.IInfiniteScrollAction
import typingsSlinky.ngxInfiniteScroll.modelsMod.IPositionStats
import typingsSlinky.ngxInfiniteScroll.modelsMod.IScrollParams
import typingsSlinky.ngxInfiniteScroll.modelsMod.IScrollRegisterConfig
import typingsSlinky.ngxInfiniteScroll.modelsMod.IScroller
import typingsSlinky.ngxInfiniteScroll.modelsMod.IScrollerDistance
import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ngx-infinite-scroll/src/services/scroll-register", JSImport.Namespace)
@js.native
object scrollRegisterMod extends js.Object {
  def attachScrollEvent(options: IScrollRegisterConfig): Observable_[js.Object] = js.native
  def createScroller(config: IScroller): Observable_[IInfiniteScrollAction] = js.native
  def toInfiniteScrollAction(response: IScrollParams): IInfiniteScrollAction = js.native
  def toInfiniteScrollParams(lastScrollPosition: Double, stats: IPositionStats, distance: IScrollerDistance): IScrollParams = js.native
  @js.native
  object InfiniteScrollActions extends js.Object {
    var DOWN: String = js.native
    var UP: String = js.native
  }
  
}

