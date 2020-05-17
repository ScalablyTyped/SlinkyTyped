package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushpinTool extends js.Object {
  def close(): Boolean = js.native
  def getCursor(): String = js.native
  def getIcon(): Icon = js.native
  def onmarkend(event: typingsSlinky.baidumapWebSdk.anon.Marker): Unit = js.native
  def open(): Boolean = js.native
  def setCursor(cursor: String): String = js.native
  def setIcon(icon: Icon): Icon = js.native
}

object PushpinTool {
  @scala.inline
  def apply(
    close: () => Boolean,
    getCursor: () => String,
    getIcon: () => Icon,
    onmarkend: typingsSlinky.baidumapWebSdk.anon.Marker => Unit,
    open: () => Boolean,
    setCursor: String => String,
    setIcon: Icon => Icon
  ): PushpinTool = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getCursor = js.Any.fromFunction0(getCursor), getIcon = js.Any.fromFunction0(getIcon), onmarkend = js.Any.fromFunction1(onmarkend), open = js.Any.fromFunction0(open), setCursor = js.Any.fromFunction1(setCursor), setIcon = js.Any.fromFunction1(setIcon))
    __obj.asInstanceOf[PushpinTool]
  }
  @scala.inline
  implicit class PushpinToolOps[Self <: PushpinTool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCursor(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCursor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIcon(value: () => Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIcon")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnmarkend(value: typingsSlinky.baidumapWebSdk.anon.Marker => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmarkend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpen(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCursor(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCursor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIcon(value: Icon => Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIcon")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

