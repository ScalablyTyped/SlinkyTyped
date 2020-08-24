package typingsSlinky.androiduix.global.android.widget

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.AbsSpinner")
@js.native
abstract class AbsSpinner protected ()
  extends typingsSlinky.androiduix.android.widget.AbsSpinner {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}

@JSGlobal("android.widget.AbsSpinner")
@js.native
object AbsSpinner extends js.Object {
  @js.native
  class RecycleBin protected ()
    extends typingsSlinky.androiduix.android.widget.AbsSpinner.RecycleBin {
    def this(arg: typingsSlinky.androiduix.android.widget.AbsSpinner) = this()
  }
  
}

