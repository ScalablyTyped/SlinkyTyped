package typingsSlinky.androiduix.android.view.ScaleGestureDetector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleOnScaleGestureListener extends OnScaleGestureListener
object SimpleOnScaleGestureListener {
  
  @scala.inline
  def apply(
    onScale: typingsSlinky.androiduix.android.view.ScaleGestureDetector => Boolean,
    onScaleBegin: typingsSlinky.androiduix.android.view.ScaleGestureDetector => Boolean,
    onScaleEnd: typingsSlinky.androiduix.android.view.ScaleGestureDetector => Unit
  ): SimpleOnScaleGestureListener = {
    val __obj = js.Dynamic.literal(onScale = js.Any.fromFunction1(onScale), onScaleBegin = js.Any.fromFunction1(onScaleBegin), onScaleEnd = js.Any.fromFunction1(onScaleEnd))
    __obj.asInstanceOf[SimpleOnScaleGestureListener]
  }
}
