package typingsSlinky.glReactHeadless

import typingsSlinky.glReactHeadless.glviewheadlessMod.GLViewHeadless
import typingsSlinky.glReactHeadless.glviewheadlessMod.GLViewHeadlessProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gl-react-headless", "Surface")
  @js.native
  class Surface protected ()
    extends typingsSlinky.glReact.mod.Surface[GLViewHeadless] {
    def this(props: typingsSlinky.glReact.mod.SurfaceProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsSlinky.glReact.mod.SurfaceProps, context: js.Any) = this()
  }
  
  @js.native
  trait SurfaceProps
    extends typingsSlinky.glReact.mod.SurfaceProps
       with GLViewHeadlessProps
  object SurfaceProps {
    
    @scala.inline
    def apply(height: Double, width: Double): SurfaceProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SurfaceProps]
    }
  }
}
