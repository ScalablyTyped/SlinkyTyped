package typingsSlinky.reactCalendarTimeline.mod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.both
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineItemBase[DateType] extends StObject {
  
  var canChangeGroup: js.UndefOr[Boolean] = js.native
  
  var canMove: js.UndefOr[Boolean] = js.native
  
  var canResize: js.UndefOr[Boolean | left | right | both] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var end_time: DateType = js.native
  
  var group: Id = js.native
  
  var id: Id = js.native
  
  var itemProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  
  var start_time: DateType = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var title: js.UndefOr[ReactElement] = js.native
}
object TimelineItemBase {
  
  @scala.inline
  def apply[DateType](end_time: DateType, group: Id, id: Id, start_time: DateType): TimelineItemBase[DateType] = {
    val __obj = js.Dynamic.literal(end_time = end_time.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineItemBase[DateType]]
  }
  
  @scala.inline
  implicit class TimelineItemBaseMutableBuilder[Self <: TimelineItemBase[_], DateType] (val x: Self with TimelineItemBase[DateType]) extends AnyVal {
    
    @scala.inline
    def setCanChangeGroup(value: Boolean): Self = StObject.set(x, "canChangeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanChangeGroupUndefined: Self = StObject.set(x, "canChangeGroup", js.undefined)
    
    @scala.inline
    def setCanMove(value: Boolean): Self = StObject.set(x, "canMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMoveUndefined: Self = StObject.set(x, "canMove", js.undefined)
    
    @scala.inline
    def setCanResize(value: Boolean | left | right | both): Self = StObject.set(x, "canResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanResizeUndefined: Self = StObject.set(x, "canResize", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setEnd_time(value: DateType): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: Id): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "itemProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemPropsUndefined: Self = StObject.set(x, "itemProps", js.undefined)
    
    @scala.inline
    def setStart_time(value: DateType): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
