package typingsSlinky.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Danmaku extends js.Object {
  def clear(): Unit = js.native
  def draw(danmaku: DPlayerDanmakuItem): Unit = js.native
  def hide(): Unit = js.native
  def opacity(percentage: Double): Unit = js.native
  def send(danmaku: DPlayerDanmakuItem, callback: js.Function0[Unit]): Unit = js.native
  def show(): Unit = js.native
}

object Danmaku {
  @scala.inline
  def apply(
    clear: () => Unit,
    draw: DPlayerDanmakuItem => Unit,
    hide: () => Unit,
    opacity: Double => Unit,
    send: (DPlayerDanmakuItem, js.Function0[Unit]) => Unit,
    show: () => Unit
  ): Danmaku = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), draw = js.Any.fromFunction1(draw), hide = js.Any.fromFunction0(hide), opacity = js.Any.fromFunction1(opacity), send = js.Any.fromFunction2(send), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Danmaku]
  }
  @scala.inline
  implicit class DanmakuOps[Self <: Danmaku] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDraw(value: DPlayerDanmakuItem => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpacity(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSend(value: (DPlayerDanmakuItem, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

