package typingsSlinky.androiduix.global.android.widget

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.androiduix.android.widget.SpinnerAdapter
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.Spinner")
@js.native
class Spinner protected ()
  extends typingsSlinky.androiduix.android.widget.Spinner {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String], mode: Double) = this()
}

/* static members */
@JSGlobal("android.widget.Spinner")
@js.native
object Spinner extends js.Object {
  @js.native
  class DialogPopup protected ()
    extends typingsSlinky.androiduix.android.widget.Spinner.DialogPopup {
    def this(arg: typingsSlinky.androiduix.android.widget.Spinner) = this()
  }
  
  @js.native
  class DropDownAdapter protected ()
    extends typingsSlinky.androiduix.android.widget.Spinner.DropDownAdapter {
    def this(adapter: SpinnerAdapter) = this()
  }
  
  @js.native
  class DropdownPopup protected ()
    extends typingsSlinky.androiduix.android.widget.Spinner.DropdownPopup {
    def this(
      context: Context,
      defStyleRes: Map[String, String],
      arg: typingsSlinky.androiduix.android.widget.Spinner
    ) = this()
  }
  
  var MAX_ITEMS_MEASURED: js.Any = js.native
  var MODE_DIALOG: Double = js.native
  var MODE_DROPDOWN: Double = js.native
  var MODE_THEME: js.Any = js.native
  var TAG: String = js.native
}

