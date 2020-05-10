package typingsSlinky.androiduix.android.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.BaseAdapter")
@js.native
abstract class BaseAdapter ()
  extends ListAdapter
     with SpinnerAdapter {
  var mDataSetObservable: js.Any = js.native
  def notifyDataSetChanged(): Unit = js.native
  def notifyDataSetInvalidated(): Unit = js.native
}

