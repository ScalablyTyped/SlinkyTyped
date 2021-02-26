package typingsSlinky.reactVerticalTimelineComponent.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactVerticalTimelineComponent.mod.VerticalTimelineProps
import typingsSlinky.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`1-column`
import typingsSlinky.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`2-columns`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VerticalTimeline {
  
  @JSImport("react-vertical-timeline-component", "VerticalTimeline")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactVerticalTimelineComponent.mod.VerticalTimeline] {
    
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def layout(value: `1-column` | `2-columns`): this.type = set("layout", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VerticalTimeline.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VerticalTimelineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
