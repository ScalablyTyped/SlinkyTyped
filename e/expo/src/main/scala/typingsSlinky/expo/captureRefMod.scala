package typingsSlinky.expo

import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.reactNativeViewShot.mod.CaptureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/takeSnapshotAsync/captureRef", JSImport.Namespace)
@js.native
object captureRefMod extends js.Object {
  def default[T](viewRef: ReactInstance): js.Promise[String] = js.native
  def default[T](viewRef: ReactInstance, options: CaptureOptions): js.Promise[String] = js.native
  def default[T](viewRef: ReactRef[T]): js.Promise[String] = js.native
  def default[T](viewRef: ReactRef[T], options: CaptureOptions): js.Promise[String] = js.native
}

