package typingsSlinky.reactSortableTree.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeItem
  extends /* x */ StringDictionary[js.Any] {
  
  var children: js.UndefOr[js.Array[TreeItem] | GetTreeItemChildrenFn] = js.native
  
  var expanded: js.UndefOr[Boolean] = js.native
  
  var subtitle: js.UndefOr[ReactElement] = js.native
  
  var title: js.UndefOr[ReactElement] = js.native
}
object TreeItem {
  
  @scala.inline
  def apply(): TreeItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeItem]
  }
  
  @scala.inline
  implicit class TreeItemMutableBuilder[Self <: TreeItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[TreeItem] | GetTreeItemChildrenFn): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* data */ GetTreeItemChildren => Unit): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: TreeItem*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setSubtitle(value: ReactElement): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleReactElement(value: ReactElement): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
