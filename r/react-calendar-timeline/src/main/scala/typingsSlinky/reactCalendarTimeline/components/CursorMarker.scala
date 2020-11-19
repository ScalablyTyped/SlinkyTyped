package typingsSlinky.reactCalendarTimeline.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCalendarTimeline.mod.CursorMarkerProps
import typingsSlinky.reactCalendarTimeline.mod.CustomMarkerChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CursorMarker {
  
  @JSImport("react-calendar-timeline", "CursorMarker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactCalendarTimeline.mod.CursorMarker] {
    
    @scala.inline
    def children(value: /* props */ CustomMarkerChildrenProps => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
  }
  
  def withProps(p: CursorMarkerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: CursorMarker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
