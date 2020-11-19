package typingsSlinky.reactTagcloud

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactTagcloud.ReactTagCloud_.DefaultRendererFactory
import typingsSlinky.reactTagcloud.ReactTagCloud_.TagCloudProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-tagcloud", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val DefaultRenderer: DefaultRendererFactory = js.native
  
  @js.native
  class TagCloud protected ()
    extends Component[TagCloudProps, js.Object, js.Any] {
    def this(props: TagCloudProps) = this()
    def this(props: TagCloudProps, context: js.Any) = this()
  }
  @js.native
  object TagCloud extends TopLevel[ReactComponentClass[TagCloudProps]]
}
