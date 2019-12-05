package typingsSlinky.androiduix.android.widget

import typingsSlinky.androiduix.android.database.DataSetObserver
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  def getCount(): Double
  def getItem(position: Double): js.Any
  def getItemId(position: Double): Double
  def getItemViewType(position: Double): Double
  def getView(position: Double, convertView: View, parent: ViewGroup): View
  def getViewTypeCount(): Double
  def hasStableIds(): Boolean
  def isEmpty(): Boolean
  def registerDataSetObserver(observer: DataSetObserver): Unit
  def unregisterDataSetObserver(observer: DataSetObserver): Unit
}

@JSGlobal("android.widget.Adapter")
@js.native
object Adapter extends js.Object {
  var IGNORE_ITEM_VIEW_TYPE: Double = js.native
  var NO_SELECTION: Double = js.native
}

