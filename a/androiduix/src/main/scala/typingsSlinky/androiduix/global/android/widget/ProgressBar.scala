package typingsSlinky.androiduix.global.android.widget

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.ProgressBar")
@js.native
class ProgressBar protected ()
  extends typingsSlinky.androiduix.android.widget.ProgressBar {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}
/* static members */
@JSGlobal("android.widget.ProgressBar")
@js.native
object ProgressBar extends js.Object {
  
  var MAX_LEVEL: js.Any = js.native
  
  var TIMEOUT_SEND_ACCESSIBILITY_EVENT: js.Any = js.native
  
  @js.native
  class RefreshData ()
    extends typingsSlinky.androiduix.android.widget.ProgressBar.RefreshData
  /* static members */
  @js.native
  object RefreshData extends js.Object {
    
    var POOL_MAX: js.Any = js.native
    
    def obtain(id: String, progress: Double, fromUser: Boolean): typingsSlinky.androiduix.android.widget.ProgressBar.RefreshData = js.native
    
    var sPool: js.Any = js.native
  }
}
