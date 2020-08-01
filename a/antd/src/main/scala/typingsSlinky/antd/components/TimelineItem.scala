package typingsSlinky.antd.components

import typingsSlinky.antd.timelineItemMod.TimeLineItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimelineItem {
  @JSImport("antd/lib/timeline/TimelineItem", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TimeLineItemProps): SharedBuilder_TimeLineItemProps_1225119422 = new SharedBuilder_TimeLineItemProps_1225119422(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TimelineItem.type): SharedBuilder_TimeLineItemProps_1225119422 = new SharedBuilder_TimeLineItemProps_1225119422(js.Array(this.component, js.Dictionary.empty))()
}

