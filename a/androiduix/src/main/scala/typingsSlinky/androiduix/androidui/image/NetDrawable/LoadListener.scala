package typingsSlinky.androiduix.androidui.image.NetDrawable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadListener extends js.Object {
  def onError(drawable: typingsSlinky.androiduix.androidui.image.NetDrawable): js.Any = js.native
  def onLoad(drawable: typingsSlinky.androiduix.androidui.image.NetDrawable): js.Any = js.native
}

object LoadListener {
  @scala.inline
  def apply(
    onError: typingsSlinky.androiduix.androidui.image.NetDrawable => js.Any,
    onLoad: typingsSlinky.androiduix.androidui.image.NetDrawable => js.Any
  ): LoadListener = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError), onLoad = js.Any.fromFunction1(onLoad))
    __obj.asInstanceOf[LoadListener]
  }
  @scala.inline
  implicit class LoadListenerOps[Self <: LoadListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnError(value: typingsSlinky.androiduix.androidui.image.NetDrawable => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnLoad(value: typingsSlinky.androiduix.androidui.image.NetDrawable => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

