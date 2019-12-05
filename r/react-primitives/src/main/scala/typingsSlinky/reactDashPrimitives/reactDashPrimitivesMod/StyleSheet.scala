package typingsSlinky.reactDashPrimitives.reactDashPrimitivesMod

import typingsSlinky.reactDashNative.reactDashNativeMod.RegisteredStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleSheet.AbsoluteFillStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleSheet.NamedStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-primitives", "StyleSheet")
@js.native
object StyleSheet extends js.Object {
  val absoluteFill: RegisteredStyle[AbsoluteFillStyle] = js.native
  val absoluteFillObject: AbsoluteFillStyle = js.native
  val hairlineWidth: Double = js.native
  def create[T /* <: NamedStyles[_ | T] */](styles: T): T = js.native
  def create[T /* <: NamedStyles[_ | T] */](styles: NamedStyles[T]): T = js.native
  def flatten[T](): T = js.native
  def flatten[T](style: StyleProp[T]): T = js.native
  def setStyleAttributePreprocessor(property: String, process: js.Function1[/* nextProp */ js.Any, _]): Unit = js.native
}

