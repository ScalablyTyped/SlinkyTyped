package typingsSlinky.androiduix.android.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.BaseExpandableListAdapter")
@js.native
abstract class BaseExpandableListAdapter ()
  extends ExpandableListAdapter
     with HeterogeneousExpandableList {
  var mDataSetObservable: js.Any = js.native
  def notifyDataSetChanged(): Unit = js.native
  def notifyDataSetInvalidated(): Unit = js.native
}

