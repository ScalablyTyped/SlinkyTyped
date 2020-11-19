package typingsSlinky.reactResizeDetector.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactResizeDetector.anon.PartialReactResizeDetecto
import typingsSlinky.reactResizeDetector.reactResizeDetectorStrings.height
import typingsSlinky.reactResizeDetector.reactResizeDetectorStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-resize-detector", "withResizeDetector")
@js.native
object withResizeDetector extends js.Object {
  
  def apply[T /* <: PartialReactResizeDetecto */](WrappedComponent: ReactComponentClass[T]): ReactComponentClass[Omit[T, height | width]] = js.native
  def apply[T /* <: PartialReactResizeDetecto */](WrappedComponent: ReactComponentClass[T], props: ReactResizeDetectorProps): ReactComponentClass[Omit[T, height | width]] = js.native
}
