package typingsSlinky.androiduix.android.view.ScaleGestureDetector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnScaleGestureListener extends js.Object {
  
  def onScale(detector: typingsSlinky.androiduix.android.view.ScaleGestureDetector): Boolean = js.native
  
  def onScaleBegin(detector: typingsSlinky.androiduix.android.view.ScaleGestureDetector): Boolean = js.native
  
  def onScaleEnd(detector: typingsSlinky.androiduix.android.view.ScaleGestureDetector): Unit = js.native
}
object OnScaleGestureListener {
  
  @scala.inline
  def apply(
    onScale: typingsSlinky.androiduix.android.view.ScaleGestureDetector => Boolean,
    onScaleBegin: typingsSlinky.androiduix.android.view.ScaleGestureDetector => Boolean,
    onScaleEnd: typingsSlinky.androiduix.android.view.ScaleGestureDetector => Unit
  ): OnScaleGestureListener = {
    val __obj = js.Dynamic.literal(onScale = js.Any.fromFunction1(onScale), onScaleBegin = js.Any.fromFunction1(onScaleBegin), onScaleEnd = js.Any.fromFunction1(onScaleEnd))
    __obj.asInstanceOf[OnScaleGestureListener]
  }
  
  @scala.inline
  implicit class OnScaleGestureListenerOps[Self <: OnScaleGestureListener] (val x: Self) extends AnyVal {
    
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
    def setOnScale(value: typingsSlinky.androiduix.android.view.ScaleGestureDetector => Boolean): Self = this.set("onScale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScaleBegin(value: typingsSlinky.androiduix.android.view.ScaleGestureDetector => Boolean): Self = this.set("onScaleBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScaleEnd(value: typingsSlinky.androiduix.android.view.ScaleGestureDetector => Unit): Self = this.set("onScaleEnd", js.Any.fromFunction1(value))
  }
}
