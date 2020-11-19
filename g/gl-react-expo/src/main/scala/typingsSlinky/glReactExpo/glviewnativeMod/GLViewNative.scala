package typingsSlinky.glReactExpo.glviewnativeMod

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.glReactExpo.anon.Height
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gl-react-expo/GLViewNative", "GLViewNative")
@js.native
class GLViewNative ()
  extends Component[GLViewNativeProps, js.Object, js.Any] {
  
  var afterDraw: js.UndefOr[js.Function0[Unit]] = js.native
  
  def capture(opt: js.Any): js.Promise[Height] = js.native
  
  def onContextCreate(gl: WebGLRenderingContext): Unit = js.native
  
  def onRef(ref: js.Any): Unit = js.native
  
  var ref: js.UndefOr[js.Any] = js.native
}
