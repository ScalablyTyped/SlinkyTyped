package typingsSlinky.flipsnap

import org.scalajs.dom.raw.Event
import typingsSlinky.flipsnap.flipsnapStrings.fstouchend
import typingsSlinky.flipsnap.flipsnapStrings.fstouchmove
import typingsSlinky.flipsnap.flipsnapStrings.fstouchstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLElement extends StObject {
  
  @JSName("addEventListener")
  def addEventListener_fstouchend(`type`: fstouchend, listener: js.Function1[/* ev */ FlipsnapTouchEndEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchend(`type`: fstouchend, listener: js.Function1[/* ev */ FlipsnapTouchEndEvent, _], useCapture: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchmove(`type`: fstouchmove, listener: js.Function1[/* ev */ FlipsnapTouchMoveEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchmove(
    `type`: fstouchmove,
    listener: js.Function1[/* ev */ FlipsnapTouchMoveEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchstart(`type`: fstouchstart, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchstart(`type`: fstouchstart, listener: js.Function1[/* ev */ Event, _], useCapture: Boolean): Unit = js.native
}
