package typingsSlinky.ngxDashInfiniteDashScroll

import typingsSlinky.ngxDashInfiniteDashScroll.srcModelsMod.IInfiniteScrollAction
import typingsSlinky.ngxDashInfiniteDashScroll.srcModelsMod.IPositionStats
import typingsSlinky.ngxDashInfiniteDashScroll.srcModelsMod.IScrollParams
import typingsSlinky.ngxDashInfiniteDashScroll.srcModelsMod.IScrollRegisterConfig
import typingsSlinky.ngxDashInfiniteDashScroll.srcModelsMod.IScroller
import typingsSlinky.ngxDashInfiniteDashScroll.srcModelsMod.IScrollerDistance
import typingsSlinky.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ngx-infinite-scroll/src/services/scroll-register", JSImport.Namespace)
@js.native
object srcServicesScrollDashRegisterMod extends js.Object {
  def attachScrollEvent(options: IScrollRegisterConfig): Observable[js.Object] = js.native
  def createScroller(config: IScroller): Observable[IInfiniteScrollAction] = js.native
  def toInfiniteScrollAction(response: IScrollParams): IInfiniteScrollAction = js.native
  def toInfiniteScrollParams(lastScrollPosition: Double, stats: IPositionStats, distance: IScrollerDistance): IScrollParams = js.native
  @js.native
  object InfiniteScrollActions extends js.Object {
    var DOWN: String = js.native
    var UP: String = js.native
  }
  
}

