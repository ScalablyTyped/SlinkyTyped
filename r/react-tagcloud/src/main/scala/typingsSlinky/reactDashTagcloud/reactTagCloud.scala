package typingsSlinky.reactDashTagcloud

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.reactDashTagcloud.ReactTagCloud.DefaultRendererFactory
import typingsSlinky.reactDashTagcloud.ReactTagCloud.TagCloudProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// export = TagCloud
@JSGlobal("reactTagCloud")
@js.native
object reactTagCloud extends js.Object {
  @js.native
  class TagCloud protected ()
    extends Component[TagCloudProps, ComponentState, js.Any] {
    def this(props: TagCloudProps) = this()
    def this(props: TagCloudProps, context: js.Any) = this()
  }
  
  val DefaultRenderer: DefaultRendererFactory = js.native
  val TagCloud: ReactComponentClass[TagCloudProps] = js.native
}

