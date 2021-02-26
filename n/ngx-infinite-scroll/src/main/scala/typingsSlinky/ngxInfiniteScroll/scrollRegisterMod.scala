package typingsSlinky.ngxInfiniteScroll

import typingsSlinky.ngxInfiniteScroll.modelsMod.IInfiniteScrollAction
import typingsSlinky.ngxInfiniteScroll.modelsMod.IPositionStats
import typingsSlinky.ngxInfiniteScroll.modelsMod.IScrollParams
import typingsSlinky.ngxInfiniteScroll.modelsMod.IScrollRegisterConfig
import typingsSlinky.ngxInfiniteScroll.modelsMod.IScroller
import typingsSlinky.ngxInfiniteScroll.modelsMod.IScrollerDistance
import typingsSlinky.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollRegisterMod {
  
  object InfiniteScrollActions {
    
    @JSImport("ngx-infinite-scroll/src/services/scroll-register", "InfiniteScrollActions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ngx-infinite-scroll/src/services/scroll-register", "InfiniteScrollActions.DOWN")
    @js.native
    def DOWN: String = js.native
    @scala.inline
    def DOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("ngx-infinite-scroll/src/services/scroll-register", "InfiniteScrollActions.UP")
    @js.native
    def UP: String = js.native
    @scala.inline
    def UP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UP")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ngx-infinite-scroll/src/services/scroll-register", "attachScrollEvent")
  @js.native
  def attachScrollEvent(options: IScrollRegisterConfig): Observable_[js.Object] = js.native
  
  @JSImport("ngx-infinite-scroll/src/services/scroll-register", "createScroller")
  @js.native
  def createScroller(config: IScroller): Observable_[IInfiniteScrollAction] = js.native
  
  @JSImport("ngx-infinite-scroll/src/services/scroll-register", "toInfiniteScrollAction")
  @js.native
  def toInfiniteScrollAction(response: IScrollParams): IInfiniteScrollAction = js.native
  
  @JSImport("ngx-infinite-scroll/src/services/scroll-register", "toInfiniteScrollParams")
  @js.native
  def toInfiniteScrollParams(lastScrollPosition: Double, stats: IPositionStats, distance: IScrollerDistance): IScrollParams = js.native
}
