package typingsSlinky.androiduix.global.android.widget

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.ListView")
@js.native
class ListView protected ()
  extends typingsSlinky.androiduix.android.widget.ListView {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}
/* static members */
@JSGlobal("android.widget.ListView")
@js.native
object ListView extends js.Object {
  
  var MAX_SCROLL_FACTOR: js.Any = js.native
  
  var MIN_SCROLL_PREVIEW_PIXELS: js.Any = js.native
  
  var NO_POSITION: Double = js.native
  
  @js.native
  class ArrowScrollFocusResult ()
    extends typingsSlinky.androiduix.android.widget.ListView.ArrowScrollFocusResult
  
  @js.native
  class FixedViewInfo protected ()
    extends typingsSlinky.androiduix.android.widget.ListView.FixedViewInfo {
    def this(arg: typingsSlinky.androiduix.android.widget.ListView) = this()
  }
  
  @js.native
  class FocusSelector protected ()
    extends typingsSlinky.androiduix.android.widget.ListView.FocusSelector {
    def this(arg: typingsSlinky.androiduix.android.widget.ListView) = this()
  }
}
