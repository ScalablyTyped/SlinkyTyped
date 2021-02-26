package typingsSlinky.betterScroll.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.betterScroll.betterScrollStrings.beforeScrollStart
import typingsSlinky.betterScroll.betterScrollStrings.destroy
import typingsSlinky.betterScroll.betterScrollStrings.flick
import typingsSlinky.betterScroll.betterScrollStrings.pullingDown
import typingsSlinky.betterScroll.betterScrollStrings.pullingUp
import typingsSlinky.betterScroll.betterScrollStrings.refresh
import typingsSlinky.betterScroll.betterScrollStrings.scroll
import typingsSlinky.betterScroll.betterScrollStrings.scrollCancel
import typingsSlinky.betterScroll.betterScrollStrings.scrollEnd
import typingsSlinky.betterScroll.betterScrollStrings.scrollStart
import typingsSlinky.betterScroll.betterScrollStrings.touchEnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BScroll extends StObject {
  
  def destroy(): Unit = js.native
  
  var directionX: Double = js.native
  
  var directionY: Double = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  var enabled: Boolean = js.native
  
  def finishPullDown(): Unit = js.native
  
  def finishPullUp(): Unit = js.native
  
  def getCurrentPage(): PageOption = js.native
  
  def getSelectedIndex(): Double = js.native
  
  def goToPage(x: Double, y: Double): Unit = js.native
  def goToPage(x: Double, y: Double, time: js.UndefOr[scala.Nothing], easing: js.Object): Unit = js.native
  def goToPage(x: Double, y: Double, time: Double): Unit = js.native
  def goToPage(x: Double, y: Double, time: Double, easing: js.Object): Unit = js.native
  
  var isAnimating: Boolean = js.native
  
  var isInTransition: Boolean = js.native
  
  var maxScrollX: Double = js.native
  
  var maxScrollY: Double = js.native
  
  var movingDirectionX: Double = js.native
  
  var movingDirectionY: Double = js.native
  
  def next(): Unit = js.native
  def next(time: js.UndefOr[scala.Nothing], easing: js.Object): Unit = js.native
  def next(time: Double): Unit = js.native
  def next(time: Double, easing: js.Object): Unit = js.native
  
  @JSName("off")
  def off_beforeScrollStart(`type`: beforeScrollStart, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_destroy(`type`: destroy, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_flick(`type`: flick, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_pullingDown(`type`: pullingDown, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_pullingUp(`type`: pullingUp, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_refresh(`type`: refresh, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_scroll(`type`: scroll, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_scrollCancel(`type`: scrollCancel, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_scrollEnd(`type`: scrollEnd, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_scrollStart(`type`: scrollStart, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_touchEnd(`type`: touchEnd, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  @JSName("on")
  def on_beforeScrollStart(`type`: beforeScrollStart, fn: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_destroy(`type`: destroy, fn: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_flick(`type`: flick, fn: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_pullingDown(`type`: pullingDown, fn: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_pullingUp(`type`: pullingUp, fn: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_refresh(`type`: refresh, fn: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_scroll(`type`: scroll, fn: js.Function1[/* pos */ Position, _]): Unit = js.native
  @JSName("on")
  def on_scrollCancel(`type`: scrollCancel, fn: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_scrollEnd(`type`: scrollEnd, fn: js.Function1[/* pos */ Position, _]): Unit = js.native
  @JSName("on")
  def on_scrollStart(`type`: scrollStart, fn: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_touchEnd(`type`: touchEnd, fn: js.Function1[/* pos */ Position, _]): Unit = js.native
  
  var options: BsOption = js.native
  
  def prev(): Unit = js.native
  def prev(time: js.UndefOr[scala.Nothing], easing: js.Object): Unit = js.native
  def prev(time: Double): Unit = js.native
  def prev(time: Double, easing: js.Object): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def scrollBy(x: Double, y: Double): Unit = js.native
  def scrollBy(x: Double, y: Double, time: js.UndefOr[scala.Nothing], easing: js.Object): Unit = js.native
  def scrollBy(x: Double, y: Double, time: Double): Unit = js.native
  def scrollBy(x: Double, y: Double, time: Double, easing: js.Object): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  def scrollTo(x: Double, y: Double, time: js.UndefOr[scala.Nothing], easing: js.Object): Unit = js.native
  def scrollTo(x: Double, y: Double, time: Double): Unit = js.native
  def scrollTo(x: Double, y: Double, time: Double, easing: js.Object): Unit = js.native
  
  def scrollToElement(
    el: HTMLElement | String,
    time: js.UndefOr[Double],
    offsetX: js.UndefOr[Double | Boolean],
    offsetY: js.UndefOr[Double | Boolean],
    easing: js.UndefOr[js.Object]
  ): Unit = js.native
  
  def stop(): Unit = js.native
  
  def trigger(`type`: String): Unit = js.native
  
  def wheelTo(index: Double): Unit = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
