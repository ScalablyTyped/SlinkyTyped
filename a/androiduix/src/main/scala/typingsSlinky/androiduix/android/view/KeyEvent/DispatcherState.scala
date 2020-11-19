package typingsSlinky.androiduix.android.view.KeyEvent

import typingsSlinky.androiduix.android.util.SparseArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DispatcherState extends js.Object {
  
  def handleUpEvent(event: typingsSlinky.androiduix.android.view.KeyEvent): Unit = js.native
  
  def isTracking(event: typingsSlinky.androiduix.android.view.KeyEvent): Boolean = js.native
  
  var mActiveLongPresses: SparseArray[Double] = js.native
  
  var mDownKeyCode: Double = js.native
  
  var mDownTarget: js.Any = js.native
  
  def performedLongPress(event: typingsSlinky.androiduix.android.view.KeyEvent): Unit = js.native
  
  def reset(target: js.Any): Unit = js.native
  
  def startTracking(event: typingsSlinky.androiduix.android.view.KeyEvent, target: js.Any): Unit = js.native
}
object DispatcherState {
  
  @scala.inline
  def apply(
    handleUpEvent: typingsSlinky.androiduix.android.view.KeyEvent => Unit,
    isTracking: typingsSlinky.androiduix.android.view.KeyEvent => Boolean,
    mActiveLongPresses: SparseArray[Double],
    mDownKeyCode: Double,
    mDownTarget: js.Any,
    performedLongPress: typingsSlinky.androiduix.android.view.KeyEvent => Unit,
    reset: js.Any => Unit,
    startTracking: (typingsSlinky.androiduix.android.view.KeyEvent, js.Any) => Unit
  ): DispatcherState = {
    val __obj = js.Dynamic.literal(handleUpEvent = js.Any.fromFunction1(handleUpEvent), isTracking = js.Any.fromFunction1(isTracking), mActiveLongPresses = mActiveLongPresses.asInstanceOf[js.Any], mDownKeyCode = mDownKeyCode.asInstanceOf[js.Any], mDownTarget = mDownTarget.asInstanceOf[js.Any], performedLongPress = js.Any.fromFunction1(performedLongPress), reset = js.Any.fromFunction1(reset), startTracking = js.Any.fromFunction2(startTracking))
    __obj.asInstanceOf[DispatcherState]
  }
  
  @scala.inline
  implicit class DispatcherStateOps[Self <: DispatcherState] (val x: Self) extends AnyVal {
    
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
    def setHandleUpEvent(value: typingsSlinky.androiduix.android.view.KeyEvent => Unit): Self = this.set("handleUpEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsTracking(value: typingsSlinky.androiduix.android.view.KeyEvent => Boolean): Self = this.set("isTracking", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMActiveLongPresses(value: SparseArray[Double]): Self = this.set("mActiveLongPresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDownKeyCode(value: Double): Self = this.set("mDownKeyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDownTarget(value: js.Any): Self = this.set("mDownTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformedLongPress(value: typingsSlinky.androiduix.android.view.KeyEvent => Unit): Self = this.set("performedLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: js.Any => Unit): Self = this.set("reset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartTracking(value: (typingsSlinky.androiduix.android.view.KeyEvent, js.Any) => Unit): Self = this.set("startTracking", js.Any.fromFunction2(value))
  }
}
