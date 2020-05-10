package typingsSlinky.androiduix.android.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAdapter extends Adapter {
  def areAllItemsEnabled(): Boolean = js.native
  def isEnabled(position: Double): Boolean = js.native
}

@JSGlobal("android.widget.ListAdapter")
@js.native
object ListAdapter extends js.Object {
  def isImpl(obj: js.Any): js.Any = js.native
}

