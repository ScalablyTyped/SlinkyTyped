package typingsSlinky.androiduix.android.view.WindowManager

import typingsSlinky.androiduix.android.view.ViewGroup
import typingsSlinky.androiduix.android.widget.FrameLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layout extends FrameLayout {
  
  def getTopFocusableWindowView(): ViewGroup = js.native
  def getTopFocusableWindowView(findParent: Boolean): ViewGroup = js.native
  
  var mWindowManager: js.Any = js.native
}
