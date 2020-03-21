package typingsSlinky.reactTagcloud

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.reactTagcloud.ReactTagCloud_.DefaultRendererFactory
import typingsSlinky.reactTagcloud.ReactTagCloud_.TagCloudClass
import typingsSlinky.reactTagcloud.ReactTagCloud_.TagCloudProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-tagcloud", JSImport.Namespace)
@js.native
object mod extends js.Object {
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

