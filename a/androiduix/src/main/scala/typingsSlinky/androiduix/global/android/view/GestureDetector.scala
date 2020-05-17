package typingsSlinky.androiduix.global.android.view

import typingsSlinky.androiduix.android.view.GestureDetector.OnGestureListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.GestureDetector")
@js.native
class GestureDetector protected ()
  extends typingsSlinky.androiduix.android.view.GestureDetector {
  def this(listener: OnGestureListener) = this()
  def this(listener: OnGestureListener, handler: js.Any) = this()
}

/* static members */
@JSGlobal("android.view.GestureDetector")
@js.native
object GestureDetector extends js.Object {
  @js.native
  class GestureHandler protected ()
    extends typingsSlinky.androiduix.android.view.GestureDetector.GestureHandler {
    def this(arg: typingsSlinky.androiduix.android.view.GestureDetector) = this()
  }
  
  @js.native
  class SimpleOnGestureListener ()
    extends typingsSlinky.androiduix.android.view.GestureDetector.SimpleOnGestureListener
  
  var DOUBLE_TAP_MIN_TIME: js.Any = js.native
  var DOUBLE_TAP_TIMEOUT: js.Any = js.native
  var LONGPRESS_TIMEOUT: js.Any = js.native
  var LONG_PRESS: js.Any = js.native
  var SHOW_PRESS: js.Any = js.native
  var TAP: js.Any = js.native
  var TAP_TIMEOUT: js.Any = js.native
}

