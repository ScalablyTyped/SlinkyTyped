package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.timelineItemMod.TimeLineItemProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimelineItem {
  @JSImport("antd/lib/timeline/TimelineItem", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def dotReactElement(value: ReactElement): this.type = set("dot", value.asInstanceOf[js.Any])
    @scala.inline
    def dot(value: ReactElement): this.type = set("dot", value.asInstanceOf[js.Any])
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def pending(value: Boolean): this.type = set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TimeLineItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TimelineItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

