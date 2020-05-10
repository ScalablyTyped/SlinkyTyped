package typingsSlinky.androiduix.android.view.View

import typingsSlinky.androiduix.android.view.MotionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnGenericMotionListener extends js.Object {
  def onGenericMotion(v: typingsSlinky.androiduix.android.view.View, event: MotionEvent): js.Any = js.native
}

@JSGlobal("android.view.View.OnGenericMotionListener")
@js.native
object OnGenericMotionListener extends js.Object {
  def fromFunction(
    func: js.Function2[/* v */ typingsSlinky.androiduix.android.view.View, /* event */ MotionEvent, Unit]
  ): OnGenericMotionListener = js.native
}

