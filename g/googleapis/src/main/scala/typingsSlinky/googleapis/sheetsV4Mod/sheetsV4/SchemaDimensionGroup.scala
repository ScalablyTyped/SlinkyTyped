package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A group over an interval of rows or columns on a sheet, which can contain
  * or be contained within other groups. A group can be collapsed or expanded
  * as a unit on the sheet.
  */
@js.native
trait SchemaDimensionGroup extends StObject {
  
  /**
    * This field is true if this group is collapsed. A collapsed group remains
    * collapsed if an overlapping group at a shallower depth is expanded.  A
    * true value does not imply that all dimensions within the group are
    * hidden, since a dimension&#39;s visibility can change independently from
    * this group property. However, when this property is updated, all
    * dimensions within it are set to hidden if this field is true, or set to
    * visible if this field is false.
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  
  /**
    * The depth of the group, representing how many groups have a range that
    * wholly contains the range of this group.
    */
  var depth: js.UndefOr[Double] = js.native
  
  /**
    * The range over which this group exists.
    */
  var range: js.UndefOr[SchemaDimensionRange] = js.native
}
object SchemaDimensionGroup {
  
  @scala.inline
  def apply(): SchemaDimensionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionGroup]
  }
  
  @scala.inline
  implicit class SchemaDimensionGroupMutableBuilder[Self <: SchemaDimensionGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setRange(value: SchemaDimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
