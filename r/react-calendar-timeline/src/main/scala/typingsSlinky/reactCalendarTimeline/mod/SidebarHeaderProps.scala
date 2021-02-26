package typingsSlinky.reactCalendarTimeline.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SidebarHeaderProps[Data] extends StObject {
  
  def children(props: SidebarHeaderChildrenFnProps[Data]): ReactElement = js.native
  
  var headerData: js.UndefOr[Data] = js.native
  
  var variant: js.UndefOr[left | right] = js.native
}
object SidebarHeaderProps {
  
  @scala.inline
  def apply[Data](children: SidebarHeaderChildrenFnProps[Data] => ReactElement): SidebarHeaderProps[Data] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[SidebarHeaderProps[Data]]
  }
  
  @scala.inline
  implicit class SidebarHeaderPropsMutableBuilder[Self <: SidebarHeaderProps[_], Data] (val x: Self with SidebarHeaderProps[Data]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: SidebarHeaderChildrenFnProps[Data] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderData(value: Data): Self = StObject.set(x, "headerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderDataUndefined: Self = StObject.set(x, "headerData", js.undefined)
    
    @scala.inline
    def setVariant(value: left | right): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
