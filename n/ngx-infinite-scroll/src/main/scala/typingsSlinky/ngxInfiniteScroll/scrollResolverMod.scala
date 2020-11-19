package typingsSlinky.ngxInfiniteScroll

import typingsSlinky.ngxInfiniteScroll.anon.Fire
import typingsSlinky.ngxInfiniteScroll.modelsMod.IPositionStats
import typingsSlinky.ngxInfiniteScroll.modelsMod.IScrollState
import typingsSlinky.ngxInfiniteScroll.modelsMod.IScrollerDistance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ngx-infinite-scroll/src/services/scroll-resolver", JSImport.Namespace)
@js.native
object scrollResolverMod extends js.Object {
  
  def getScrollStats(lastScrollPosition: Double, container: IPositionStats, distance: IScrollerDistance): Fire = js.native
  
  def isSameTotalToScroll(scrollState: IScrollState): Boolean = js.native
  
  def isScrollingDownwards(lastScrollPosition: Double, container: IPositionStats): Boolean = js.native
  
  def isTriggeredScroll(totalToScroll: js.Any, scrollState: IScrollState, isScrollingDown: Boolean): Boolean = js.native
  
  def shouldFireScrollEvent(container: IPositionStats, distance: IScrollerDistance, scrollingDown: Boolean): Boolean = js.native
  
  def updateScrollPosition(position: Double, scrollState: IScrollState): Double = js.native
  
  def updateScrollState(scrollState: IScrollState, scrolledUntilNow: Double, totalToScroll: Double): Unit = js.native
  
  def updateTotalToScroll(totalToScroll: Double, scrollState: IScrollState): Unit = js.native
  
  def updateTriggeredFlag(scroll: js.Any, scrollState: IScrollState, triggered: Boolean, isScrollingDown: Boolean): Unit = js.native
}
