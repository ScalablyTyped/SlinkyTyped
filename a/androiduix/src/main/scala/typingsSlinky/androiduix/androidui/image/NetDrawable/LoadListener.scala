package typingsSlinky.androiduix.androidui.image.NetDrawable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadListener extends js.Object {
  def onError(drawable: typingsSlinky.androiduix.androidui.image.NetDrawable): js.Any
  def onLoad(drawable: typingsSlinky.androiduix.androidui.image.NetDrawable): js.Any
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
}

