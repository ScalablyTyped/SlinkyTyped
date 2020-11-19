package typingsSlinky.betterCurry.BetterCurryModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BetterCurry extends js.Object {
  
  var MAX_OPTIMIZED: Double = js.native
  
  def delegate[T](proto: T, target: String): Delegate[T] = js.native
  
  def flatten(args: (js.Array[_] | js.Any)*): js.Array[_] = js.native
  
  def predefine[T /* <: js.Function */](fn: T, args: js.Array[_]): OriginalFunctionReminder[T] = js.native
  def predefine[T /* <: js.Function */](
    fn: T,
    args: js.Array[_],
    context: js.UndefOr[scala.Nothing],
    len: js.UndefOr[scala.Nothing],
    checkArguments: Boolean
  ): OriginalFunctionReminder[T] = js.native
  def predefine[T /* <: js.Function */](fn: T, args: js.Array[_], context: js.UndefOr[scala.Nothing], len: Double): OriginalFunctionReminder[T] = js.native
  def predefine[T /* <: js.Function */](fn: T, args: js.Array[_], context: js.UndefOr[scala.Nothing], len: Double, checkArguments: Boolean): OriginalFunctionReminder[T] = js.native
  def predefine[T /* <: js.Function */](fn: T, args: js.Array[_], context: js.Object): OriginalFunctionReminder[T] = js.native
  def predefine[T /* <: js.Function */](
    fn: T,
    args: js.Array[_],
    context: js.Object,
    len: js.UndefOr[scala.Nothing],
    checkArguments: Boolean
  ): OriginalFunctionReminder[T] = js.native
  def predefine[T /* <: js.Function */](fn: T, args: js.Array[_], context: js.Object, len: Double): OriginalFunctionReminder[T] = js.native
  def predefine[T /* <: js.Function */](fn: T, args: js.Array[_], context: js.Object, len: Double, checkArguments: Boolean): OriginalFunctionReminder[T] = js.native
  
  def wrap[T /* <: js.Function */](fn: T): OriginalFunctionReminder[T] = js.native
  def wrap[T /* <: js.Function */](fn: T, context: js.UndefOr[scala.Nothing], len: js.UndefOr[scala.Nothing], checkArguments: Boolean): OriginalFunctionReminder[T] = js.native
  def wrap[T /* <: js.Function */](fn: T, context: js.UndefOr[scala.Nothing], len: Double): OriginalFunctionReminder[T] = js.native
  def wrap[T /* <: js.Function */](fn: T, context: js.UndefOr[scala.Nothing], len: Double, checkArguments: Boolean): OriginalFunctionReminder[T] = js.native
  def wrap[T /* <: js.Function */](fn: T, context: js.Object): OriginalFunctionReminder[T] = js.native
  def wrap[T /* <: js.Function */](fn: T, context: js.Object, len: js.UndefOr[scala.Nothing], checkArguments: Boolean): OriginalFunctionReminder[T] = js.native
  def wrap[T /* <: js.Function */](fn: T, context: js.Object, len: Double): OriginalFunctionReminder[T] = js.native
  def wrap[T /* <: js.Function */](fn: T, context: js.Object, len: Double, checkArguments: Boolean): OriginalFunctionReminder[T] = js.native
}
