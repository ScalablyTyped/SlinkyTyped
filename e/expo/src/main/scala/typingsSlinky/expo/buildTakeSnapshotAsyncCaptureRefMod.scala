package typingsSlinky.expo

import typingsSlinky.react.reactMod.ReactInstance
import typingsSlinky.react.reactMod.RefObject
import typingsSlinky.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotMod.CaptureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/takeSnapshotAsync/captureRef", JSImport.Namespace)
@js.native
object buildTakeSnapshotAsyncCaptureRefMod extends js.Object {
  def default[T](viewRef: ReactInstance): js.Promise[String] = js.native
  def default[T](viewRef: ReactInstance, options: CaptureOptions): js.Promise[String] = js.native
  def default[T](viewRef: RefObject[T]): js.Promise[String] = js.native
  def default[T](viewRef: RefObject[T], options: CaptureOptions): js.Promise[String] = js.native
}

