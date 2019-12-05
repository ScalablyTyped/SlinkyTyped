package typingsSlinky.reactDashResizeDashDetector.reactDashResizeDashDetectorMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashResizeDashDetector.reactDashResizeDashDetectorStrings.height
import typingsSlinky.reactDashResizeDashDetector.reactDashResizeDashDetectorStrings.width
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-resize-detector", "withResizeDetector")
@js.native
object withResizeDetector extends js.Object {
  def apply[T /* <: Partial[ReactResizeDetectorDimensions] */](WrappedComponent: ReactComponentClass[T]): ReactComponentClass[Omit[T, height | width]] = js.native
  def apply[T /* <: Partial[ReactResizeDetectorDimensions] */](WrappedComponent: ReactComponentClass[T], props: ReactResizeDetectorProps): ReactComponentClass[Omit[T, height | width]] = js.native
}

