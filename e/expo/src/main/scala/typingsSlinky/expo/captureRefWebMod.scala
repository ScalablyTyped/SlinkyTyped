package typingsSlinky.expo

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.Element
import typingsSlinky.reactNativeViewShot.mod.CaptureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/takeSnapshotAsync/captureRef.web", JSImport.Namespace)
@js.native
object captureRefWebMod extends js.Object {
  def default(component: Element): js.Promise[String | js.typedarray.Uint8ClampedArray | Blob] = js.native
  def default(component: Element, options: CaptureOptions): js.Promise[String | js.typedarray.Uint8ClampedArray | Blob] = js.native
}

