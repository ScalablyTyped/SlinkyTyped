package typingsSlinky.androiduix.android.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeterogeneousExpandableList extends js.Object {
  def getChildType(groupPosition: Double, childPosition: Double): Double = js.native
  def getChildTypeCount(): Double = js.native
  def getGroupType(groupPosition: Double): Double = js.native
  def getGroupTypeCount(): Double = js.native
}

@JSGlobal("android.widget.HeterogeneousExpandableList")
@js.native
object HeterogeneousExpandableList extends js.Object {
  def isImpl(obj: js.Any): Boolean = js.native
}

