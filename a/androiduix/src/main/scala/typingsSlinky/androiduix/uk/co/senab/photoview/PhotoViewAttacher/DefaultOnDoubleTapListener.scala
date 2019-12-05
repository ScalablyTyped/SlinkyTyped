package typingsSlinky.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import typingsSlinky.androiduix.android.view.GestureDetector.OnDoubleTapListener
import typingsSlinky.androiduix.android.view.MotionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.DefaultOnDoubleTapListener")
@js.native
class DefaultOnDoubleTapListener protected () extends OnDoubleTapListener {
  def this(photoViewAttacher: typingsSlinky.androiduix.uk.co.senab.photoview.PhotoViewAttacher) = this()
  var photoViewAttacher: js.Any = js.native
  /* CompleteClass */
  override def onDoubleTap(e: MotionEvent): Boolean = js.native
  /* CompleteClass */
  override def onDoubleTapEvent(e: MotionEvent): Boolean = js.native
  /* CompleteClass */
  override def onSingleTapConfirmed(e: MotionEvent): Boolean = js.native
  def setPhotoViewAttacher(newPhotoViewAttacher: typingsSlinky.androiduix.uk.co.senab.photoview.PhotoViewAttacher): Unit = js.native
}

