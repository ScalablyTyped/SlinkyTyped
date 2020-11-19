package typingsSlinky.androiduix.androidui.image.NetDrawable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnError(value: typingsSlinky.androiduix.androidui.image.NetDrawable => js.Any): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoad(value: typingsSlinky.androiduix.androidui.image.NetDrawable => js.Any): Self = this.set("onLoad", js.Any.fromFunction1(value))
  }
}
