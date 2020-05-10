package typingsSlinky.reactNative.components

import typingsSlinky.reactNative.mod.ART.ShapeCls
import typingsSlinky.reactNative.mod.ARTShapeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ARTShape {
  @JSImport("react-native", "ART.Shape")
  @js.native
  object component extends js.Object
  
  def withProps(p: ARTShapeProps): SharedBuilder_ARTShapeProps1152261087[ShapeCls] = new SharedBuilder_ARTShapeProps1152261087[ShapeCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(d: String): SharedBuilder_ARTShapeProps1152261087[ShapeCls] = {
    val __props = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
    new SharedBuilder_ARTShapeProps1152261087[ShapeCls](js.Array(this.component, __props.asInstanceOf[ARTShapeProps]))
  }
}

