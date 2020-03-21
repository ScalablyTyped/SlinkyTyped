package typingsSlinky.flipsnap

import typingsSlinky.flipsnap.flipsnapStrings.fstouchend
import typingsSlinky.flipsnap.flipsnapStrings.fstouchmove
import typingsSlinky.flipsnap.flipsnapStrings.fstouchstart
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElement extends js.Object {
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
  def addEventListener_fstouchstart(`type`: fstouchstart, listener: js.Function1[/* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchstart(`type`: fstouchstart, listener: js.Function1[/* ev */ Event_, _], useCapture: Boolean): Unit = js.native
}

