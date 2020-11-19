package typingsSlinky.androiduix.global.android.widget

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.FrameLayout")
@js.native
class FrameLayout protected ()
  extends typingsSlinky.androiduix.android.widget.FrameLayout {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}
/* static members */
@JSGlobal("android.widget.FrameLayout")
@js.native
object FrameLayout extends js.Object {
  
  var DEFAULT_CHILD_GRAVITY: Double = js.native
  
  @js.native
  class LayoutParams ()
    extends typingsSlinky.androiduix.android.widget.FrameLayout.LayoutParams {
    def this(source: typingsSlinky.androiduix.android.view.ViewGroup.LayoutParams) = this()
    def this(context: Context, attrs: HTMLElement) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, gravity: Double) = this()
  }
}
