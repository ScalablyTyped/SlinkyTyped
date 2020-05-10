package typingsSlinky.reactNative.components

import typingsSlinky.reactNative.mod.ARTClippingRectangleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ClippingRectangle {
  @JSImport("react-native", "ClippingRectangle")
  @js.native
  object component extends js.Object
  
  def withProps(p: ARTClippingRectangleProps): SharedBuilder_ARTClippingRectangleProps263287481[typingsSlinky.reactNative.mod.ClippingRectangle] = new SharedBuilder_ARTClippingRectangleProps263287481[typingsSlinky.reactNative.mod.ClippingRectangle](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ClippingRectangle.type): SharedBuilder_ARTClippingRectangleProps263287481[typingsSlinky.reactNative.mod.ClippingRectangle] = new SharedBuilder_ARTClippingRectangleProps263287481[typingsSlinky.reactNative.mod.ClippingRectangle](js.Array(this.component, js.Dictionary.empty))()
}

