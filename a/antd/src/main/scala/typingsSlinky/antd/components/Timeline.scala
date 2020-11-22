package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdStrings.alternate
import typingsSlinky.antd.antdStrings.left
import typingsSlinky.antd.antdStrings.right
import typingsSlinky.antd.timelineItemMod.TimelineItemProps
import typingsSlinky.antd.timelineTimelineMod.TimelineProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Timeline {
  
  @JSImport("antd", "Timeline")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: left | alternate | right): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pendingReactElement(value: ReactElement): this.type = set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pending(value: ReactElement): this.type = set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pendingDotReactElement(value: ReactElement): this.type = set("pendingDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pendingDot(value: ReactElement): this.type = set("pendingDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TimelineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Timeline.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object Item {
    
    @JSImport("antd", "Timeline.Item")
    @js.native
    object component extends js.Object
    
    def withProps(p: TimelineItemProps): SharedBuilder_TimelineItemProps2085129910 = new SharedBuilder_TimelineItemProps2085129910(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Item.type): SharedBuilder_TimelineItemProps2085129910 = new SharedBuilder_TimelineItemProps2085129910(js.Array(this.component, js.Dictionary.empty))()
  }
}
