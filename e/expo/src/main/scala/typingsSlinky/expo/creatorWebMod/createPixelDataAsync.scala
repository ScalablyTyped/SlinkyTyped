package typingsSlinky.expo.creatorWebMod

import org.scalajs.dom.raw.Element
import typingsSlinky.reactNativeViewShot.mod.CaptureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/takeSnapshotAsync/Creator.web", "createPixelDataAsync")
@js.native
object createPixelDataAsync extends js.Object {
  def apply(element: Element, options: CaptureOptions): js.Promise[scala.scalajs.js.typedarray.Uint8ClampedArray] = js.native
}

