package typingsSlinky.glReactHeadless.mod

import typingsSlinky.glReactHeadless.glviewheadlessMod.GLViewHeadlessProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
