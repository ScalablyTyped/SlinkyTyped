package typingsSlinky.reactNative.components

import typingsSlinky.reactNative.mod.ART.ClippingRectangleCls
import typingsSlinky.reactNative.mod.ARTClippingRectangleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ARTClippingRectangle {
  @JSImport("react-native", "ART.ClippingRectangle")
  @js.native
  object component extends js.Object
  
  def withProps(p: ARTClippingRectangleProps): SharedBuilder_ARTClippingRectangleProps263287481[ClippingRectangleCls] = new SharedBuilder_ARTClippingRectangleProps263287481[ClippingRectangleCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ARTClippingRectangle.type): SharedBuilder_ARTClippingRectangleProps263287481[ClippingRectangleCls] = new SharedBuilder_ARTClippingRectangleProps263287481[ClippingRectangleCls](js.Array(this.component, js.Dictionary.empty))()
}

