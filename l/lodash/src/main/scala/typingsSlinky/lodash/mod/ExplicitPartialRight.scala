package typingsSlinky.lodash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExplicitPartialRight extends js.Object {
  
  // catch-all
  def apply(args: js.Any*): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  // arity 0
  def apply[R](): LoDashExplicitWrapper[Function0[R]] = js.native
  def apply[T1, R](arg1: T1): LoDashExplicitWrapper[Function0[R]] = js.native
  def apply[T1, T2, R](arg1: T1, arg2: T2): LoDashExplicitWrapper[Function0[R]] = js.native
  def apply[T1, T2, R](arg1: T1, plc2: __): LoDashExplicitWrapper[Function1[T2, R]] = js.native
  def apply[T1, T2, T3, R](arg1: T1, arg2: T2, arg3: T3): LoDashExplicitWrapper[Function0[R]] = js.native
  def apply[T1, T2, T3, R](arg1: T1, arg2: T2, plc3: __): LoDashExplicitWrapper[Function1[T3, R]] = js.native
  def apply[T1, T2, T3, R](arg1: T1, plc2: __, arg3: T3): LoDashExplicitWrapper[Function1[T2, R]] = js.native
  def apply[T1, T2, T3, R](arg1: T1, plc2: __, plc3: __): LoDashExplicitWrapper[Function2[T2, T3, R]] = js.native
  def apply[T1, T2, T3, T4, R](arg1: T1, arg2: T2, arg3: T3, arg4: T4): LoDashExplicitWrapper[Function0[R]] = js.native
  def apply[T1, T2, T3, T4, R](arg1: T1, arg2: T2, arg3: T3, plc4: __): LoDashExplicitWrapper[Function1[T4, R]] = js.native
  def apply[T1, T2, T3, T4, R](arg1: T1, arg2: T2, plc3: __, arg4: T4): LoDashExplicitWrapper[Function1[T3, R]] = js.native
  def apply[T1, T2, T3, T4, R](arg1: T1, arg2: T2, plc3: __, plc4: __): LoDashExplicitWrapper[Function2[T3, T4, R]] = js.native
  def apply[T1, T2, T3, T4, R](arg1: T1, plc2: __, arg3: T3, arg4: T4): LoDashExplicitWrapper[Function1[T2, R]] = js.native
  def apply[T1, T2, T3, T4, R](arg1: T1, plc2: __, arg3: T3, plc4: __): LoDashExplicitWrapper[Function2[T2, T4, R]] = js.native
  def apply[T1, T2, T3, T4, R](arg1: T1, plc2: __, plc3: __, arg4: T4): LoDashExplicitWrapper[Function2[T2, T3, R]] = js.native
  def apply[T1, T2, T3, T4, R](arg1: T1, plc2: __, plc3: __, plc4: __): LoDashExplicitWrapper[Function3[T2, T3, T4, R]] = js.native
}
