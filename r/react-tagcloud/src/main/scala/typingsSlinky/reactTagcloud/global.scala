package typingsSlinky.reactTagcloud

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactTagcloud.ReactTagCloud_.DefaultRendererFactory
import typingsSlinky.reactTagcloud.ReactTagCloud_.TagCloudProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  // export = TagCloud
  object reactTagCloud {
    
    @JSGlobal("reactTagCloud.DefaultRenderer")
    @js.native
    val DefaultRenderer: DefaultRendererFactory = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("reactTagCloud.TagCloud")
    @js.native
    class TagCloud protected ()
      extends Component[TagCloudProps, js.Object, js.Any] {
      def this(props: TagCloudProps) = this()
      def this(props: TagCloudProps, context: js.Any) = this()
    }
    @JSGlobal("reactTagCloud.TagCloud")
    @js.native
    val TagCloud: ReactComponentClass[TagCloudProps] = js.native
  }
}
