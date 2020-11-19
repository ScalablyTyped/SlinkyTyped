package typingsSlinky.androiduix.global.android.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.ExpandableListPosition")
@js.native
class ExpandableListPosition ()
  extends typingsSlinky.androiduix.android.widget.ExpandableListPosition
/* static members */
@JSGlobal("android.widget.ExpandableListPosition")
@js.native
object ExpandableListPosition extends js.Object {
  
  var CHILD: Double = js.native
  
  var GROUP: Double = js.native
  
  var MAX_POOL_SIZE: js.Any = js.native
  
  /* private */ def getRecycledOrCreate(): js.Any = js.native
  
  def obtain(`type`: Double, groupPos: Double, childPos: Double, flatListPos: Double): typingsSlinky.androiduix.android.widget.ExpandableListPosition = js.native
  
  def obtainChildPosition(groupPosition: Double, childPosition: Double): typingsSlinky.androiduix.android.widget.ExpandableListPosition = js.native
  
  def obtainGroupPosition(groupPosition: Double): typingsSlinky.androiduix.android.widget.ExpandableListPosition = js.native
  
  def obtainPosition(packedPosition: Double): typingsSlinky.androiduix.android.widget.ExpandableListPosition = js.native
  
  var sPool: js.Any = js.native
}
