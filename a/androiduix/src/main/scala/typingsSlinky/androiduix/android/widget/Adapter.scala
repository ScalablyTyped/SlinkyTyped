package typingsSlinky.androiduix.android.widget

import typingsSlinky.androiduix.android.database.DataSetObserver
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adapter extends js.Object {
  def getCount(): Double = js.native
  def getItem(position: Double): js.Any = js.native
  def getItemId(position: Double): Double = js.native
  def getItemViewType(position: Double): Double = js.native
  def getView(position: Double, convertView: View, parent: ViewGroup): View = js.native
  def getViewTypeCount(): Double = js.native
  def hasStableIds(): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def registerDataSetObserver(observer: DataSetObserver): Unit = js.native
  def unregisterDataSetObserver(observer: DataSetObserver): Unit = js.native
}

@JSGlobal("android.widget.Adapter")
@js.native
object Adapter extends js.Object {
  var IGNORE_ITEM_VIEW_TYPE: Double = js.native
  var NO_SELECTION: Double = js.native
}

