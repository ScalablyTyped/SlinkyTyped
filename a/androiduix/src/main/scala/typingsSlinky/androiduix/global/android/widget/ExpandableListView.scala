package typingsSlinky.androiduix.global.android.widget

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ExpandableListView")
@js.native
class ExpandableListView protected ()
  extends typingsSlinky.androiduix.android.widget.ExpandableListView {
  def this(context: Context) = this()
  def this(context: Context, attrs: HTMLElement) = this()
  def this(context: Context, attrs: HTMLElement, defStyle: Map[String, String]) = this()
}

/* static members */
@JSGlobal("android.widget.ExpandableListView")
@js.native
object ExpandableListView extends js.Object {
  var CHILD_INDICATOR_INHERIT: Double = js.native
  var CHILD_LAST_STATE_SET: js.Any = js.native
  var GROUP_EMPTY_STATE_SET: js.Any = js.native
  var GROUP_EXPANDED_EMPTY_STATE_SET: js.Any = js.native
  var GROUP_EXPANDED_STATE_SET: js.Any = js.native
  var GROUP_STATE_SETS: js.Any = js.native
  var INDICATOR_UNDEFINED: js.Any = js.native
  var PACKED_POSITION_INT_MASK_CHILD: js.Any = js.native
  var PACKED_POSITION_INT_MASK_GROUP: js.Any = js.native
  var PACKED_POSITION_MASK_CHILD: js.Any = js.native
  var PACKED_POSITION_MASK_GROUP: js.Any = js.native
  var PACKED_POSITION_MASK_TYPE: js.Any = js.native
  var PACKED_POSITION_SHIFT_GROUP: js.Any = js.native
  var PACKED_POSITION_SHIFT_TYPE: js.Any = js.native
  var PACKED_POSITION_TYPE_CHILD: Double = js.native
  var PACKED_POSITION_TYPE_GROUP: Double = js.native
  var PACKED_POSITION_TYPE_NULL: Double = js.native
  var PACKED_POSITION_VALUE_NULL: Double = js.native
  def getPackedPositionChild(packedPosition: Double): Double = js.native
  def getPackedPositionForChild(groupPosition: Double, childPosition: Double): Double = js.native
  def getPackedPositionForGroup(groupPosition: Double): Double = js.native
  def getPackedPositionGroup(packedPosition: Double): Double = js.native
  def getPackedPositionType(packedPosition: Double): Double = js.native
}

