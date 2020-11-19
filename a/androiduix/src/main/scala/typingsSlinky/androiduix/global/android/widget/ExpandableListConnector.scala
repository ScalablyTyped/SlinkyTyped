package typingsSlinky.androiduix.global.android.widget

import typingsSlinky.androiduix.android.widget.ExpandableListAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.ExpandableListConnector")
@js.native
class ExpandableListConnector protected ()
  extends typingsSlinky.androiduix.android.widget.ExpandableListConnector {
  def this(expandableListAdapter: ExpandableListAdapter) = this()
}
@JSGlobal("android.widget.ExpandableListConnector")
@js.native
object ExpandableListConnector extends js.Object {
  
  @js.native
  class GroupMetadata ()
    extends typingsSlinky.androiduix.android.widget.ExpandableListConnector.GroupMetadata
  /* static members */
  @js.native
  object GroupMetadata extends js.Object {
    
    var REFRESH: Double = js.native
    
    def obtain(flPos: Double, lastChildFlPos: Double, gPos: Double, gId: Double): typingsSlinky.androiduix.android.widget.ExpandableListConnector.GroupMetadata = js.native
  }
  
  @js.native
  class MyDataSetObserver protected ()
    extends typingsSlinky.androiduix.android.widget.ExpandableListConnector.MyDataSetObserver {
    def this(arg: typingsSlinky.androiduix.android.widget.ExpandableListConnector) = this()
  }
  
  @js.native
  class PositionMetadata ()
    extends typingsSlinky.androiduix.android.widget.ExpandableListConnector.PositionMetadata
  /* static members */
  @js.native
  object PositionMetadata extends js.Object {
    
    var MAX_POOL_SIZE: js.Any = js.native
    
    /* private */ def getRecycledOrCreate(): js.Any = js.native
    
    def obtain(
      flatListPos: Double,
      `type`: Double,
      groupPos: Double,
      childPos: Double,
      groupMetadata: typingsSlinky.androiduix.android.widget.ExpandableListConnector.GroupMetadata,
      groupInsertIndex: Double
    ): typingsSlinky.androiduix.android.widget.ExpandableListConnector.PositionMetadata = js.native
    
    var sPool: js.Any = js.native
  }
}
