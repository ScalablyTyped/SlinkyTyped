package typingsSlinky.androiduix.global.android.widget

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.RadioGroup")
@js.native
class RadioGroup protected ()
  extends typingsSlinky.androiduix.android.widget.RadioGroup {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}

@JSGlobal("android.widget.RadioGroup")
@js.native
object RadioGroup extends js.Object {
  @js.native
  class CheckedStateTracker protected ()
    extends typingsSlinky.androiduix.android.widget.RadioGroup.CheckedStateTracker {
    def this(arg: typingsSlinky.androiduix.android.widget.RadioGroup) = this()
  }
  
  @js.native
  class LayoutParams ()
    extends typingsSlinky.androiduix.android.widget.RadioGroup.LayoutParams
  
  @js.native
  class PassThroughHierarchyChangeListener protected ()
    extends typingsSlinky.androiduix.android.widget.RadioGroup.PassThroughHierarchyChangeListener {
    def this(arg: typingsSlinky.androiduix.android.widget.RadioGroup) = this()
  }
  
}

