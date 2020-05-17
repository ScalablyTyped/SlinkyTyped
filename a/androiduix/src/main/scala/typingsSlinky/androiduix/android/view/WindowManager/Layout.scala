package typingsSlinky.androiduix.android.view.WindowManager

import typingsSlinky.androiduix.android.view.ViewGroup
import typingsSlinky.androiduix.android.widget.FrameLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout extends FrameLayout {
  var mWindowManager: js.Any = js.native
  def getTopFocusableWindowView(): ViewGroup = js.native
  def getTopFocusableWindowView(findParent: Boolean): ViewGroup = js.native
}

