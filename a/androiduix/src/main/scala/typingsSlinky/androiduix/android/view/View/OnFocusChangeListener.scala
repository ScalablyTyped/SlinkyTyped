package typingsSlinky.androiduix.android.view.View

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnFocusChangeListener extends js.Object {
  def onFocusChange(v: typingsSlinky.androiduix.android.view.View, hasFocus: Boolean): Unit = js.native
}

@JSGlobal("android.view.View.OnFocusChangeListener")
@js.native
object OnFocusChangeListener extends js.Object {
  def fromFunction(
    func: js.Function2[/* v */ typingsSlinky.androiduix.android.view.View, /* hasFocus */ Boolean, Unit]
  ): OnFocusChangeListener = js.native
}

