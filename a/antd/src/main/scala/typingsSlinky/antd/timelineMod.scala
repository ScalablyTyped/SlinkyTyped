package typingsSlinky.antd

import slinky.core.ReactComponentClass
import typingsSlinky.antd.anon.Mode
import typingsSlinky.antd.timelineItemMod.TimeLineItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/timeline", JSImport.Namespace)
@js.native
object timelineMod extends js.Object {
  @js.native
  class default ()
    extends typingsSlinky.antd.timelineTimelineMod.default
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Item: ReactComponentClass[TimeLineItemProps] = js.native
    var defaultProps: Mode = js.native
  }
  
}

