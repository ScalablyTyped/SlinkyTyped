package typingsSlinky.androiduix.global.android.widget

import typingsSlinky.androiduix.android.content.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.Toast")
@js.native
class Toast protected ()
  extends typingsSlinky.androiduix.android.widget.Toast {
  def this(context: Context) = this()
}
/* static members */
@JSGlobal("android.widget.Toast")
@js.native
object Toast extends js.Object {
  
  var LENGTH_LONG: Double = js.native
  
  var LENGTH_SHORT: Double = js.native
  
  var TAG: String = js.native
  
  var localLOGV: Boolean = js.native
  
  def makeText(context: Context, text: String, duration: Double): typingsSlinky.androiduix.android.widget.Toast = js.native
  
  @js.native
  class TN ()
    extends typingsSlinky.androiduix.android.widget.Toast.TN
}
