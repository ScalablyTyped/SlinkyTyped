package typingsSlinky.reactNative.components

import typingsSlinky.reactNative.mod.ART.SurfaceCls
import typingsSlinky.reactNative.mod.ARTSurfaceProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ARTSurface {
  @JSImport("react-native", "ART.Surface")
  @js.native
  object component extends js.Object
  
  def withProps(p: ARTSurfaceProps): SharedBuilder_ARTSurfaceProps_879443392[SurfaceCls] = new SharedBuilder_ARTSurfaceProps_879443392[SurfaceCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(height: Double, width: Double): SharedBuilder_ARTSurfaceProps_879443392[SurfaceCls] = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new SharedBuilder_ARTSurfaceProps_879443392[SurfaceCls](js.Array(this.component, __props.asInstanceOf[ARTSurfaceProps]))
  }
}

