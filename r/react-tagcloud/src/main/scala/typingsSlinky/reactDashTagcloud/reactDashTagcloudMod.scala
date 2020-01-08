package typingsSlinky.reactDashTagcloud

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.reactDashTagcloud.ReactTagCloud.DefaultRendererFactory
import typingsSlinky.reactDashTagcloud.ReactTagCloud.TagCloudClass
import typingsSlinky.reactDashTagcloud.ReactTagCloud.TagCloudProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-tagcloud", JSImport.Namespace)
@js.native
object reactDashTagcloudMod extends js.Object {
  @js.native
  class TagCloud protected ()
    extends Component[TagCloudProps, ComponentState, js.Any] {
    def this(props: TagCloudProps) = this()
    def this(props: TagCloudProps, context: js.Any) = this()
  }
  
  val DefaultRenderer: DefaultRendererFactory = js.native
  @js.native
  object TagCloud extends TopLevel[TagCloudClass]
  
}

