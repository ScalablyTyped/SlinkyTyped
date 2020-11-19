package typingsSlinky.reactPrimitives.mod

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.StyleSheet.AbsoluteFillStyle
import typingsSlinky.reactNative.mod.StyleSheet.NamedStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-primitives", "StyleSheet")
@js.native
object StyleSheet extends js.Object {
  
  val absoluteFill: RegisteredStyle[AbsoluteFillStyle] = js.native
  
  val absoluteFillObject: AbsoluteFillStyle = js.native
  
  def compose[T](style1: js.Array[StyleProp[T]], style2: js.Array[StyleProp[T]]): StyleProp[T] = js.native
  def compose[T](style1: js.Array[StyleProp[T]], style2: StyleProp[T]): StyleProp[T] = js.native
  def compose[T](style1: StyleProp[T], style2: js.Array[StyleProp[T]]): StyleProp[T] = js.native
  def compose[T](style1: StyleProp[T], style2: StyleProp[T]): StyleProp[T] = js.native
  
  def create[T /* <: NamedStyles[_ | T] */](styles: T): T = js.native
  def create[T /* <: NamedStyles[_ | T] */](styles: NamedStyles[T]): T = js.native
  
  def flatten[T](): T = js.native
  def flatten[T](style: StyleProp[T]): T = js.native
  
  val hairlineWidth: Double = js.native
  
  def setStyleAttributePreprocessor(property: String, process: js.Function1[/* nextProp */ js.Any, _]): Unit = js.native
}
