package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.collapsed
import typingsSlinky.devextreme.devextremeStrings.containers
import typingsSlinky.devextreme.devextremeStrings.custom
import typingsSlinky.devextreme.devextremeStrings.disabled
import typingsSlinky.devextreme.devextremeStrings.flowchart
import typingsSlinky.devextreme.devextremeStrings.general
import typingsSlinky.devextreme.devextremeStrings.orgChart
import typingsSlinky.devextreme.devextremeStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeIconsPerRow extends StObject {
  
  var groups: js.UndefOr[js.Array[general | flowchart | orgChart | containers | custom | DisplayMode]] = js.native
  
  var shapeIconsPerRow: js.UndefOr[Double] = js.native
  
  var showSearch: js.UndefOr[Boolean] = js.native
  
  var visibility: js.UndefOr[auto | visible | collapsed | disabled] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ShapeIconsPerRow {
  
  @scala.inline
  def apply(): ShapeIconsPerRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeIconsPerRow]
  }
  
  @scala.inline
  implicit class ShapeIconsPerRowMutableBuilder[Self <: ShapeIconsPerRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: js.Array[general | flowchart | orgChart | containers | custom | DisplayMode]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: (general | flowchart | orgChart | containers | custom | DisplayMode)*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setShapeIconsPerRow(value: Double): Self = StObject.set(x, "shapeIconsPerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeIconsPerRowUndefined: Self = StObject.set(x, "shapeIconsPerRow", js.undefined)
    
    @scala.inline
    def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
    
    @scala.inline
    def setVisibility(value: auto | visible | collapsed | disabled): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
