package typingsSlinky.androiduix.android.view.View

import typingsSlinky.androiduix.android.view.KeyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnKeyListener extends js.Object {
  def onKey(v: typingsSlinky.androiduix.android.view.View, keyCode: Double, event: KeyEvent): Unit
}

@JSGlobal("android.view.View.OnKeyListener")
@js.native
object OnKeyListener extends js.Object {
  def fromFunction(
    func: js.Function3[
      /* v */ typingsSlinky.androiduix.android.view.View, 
      /* keyCode */ Double, 
      /* event */ KeyEvent, 
      Unit
    ]
  ): OnKeyListener = js.native
}

