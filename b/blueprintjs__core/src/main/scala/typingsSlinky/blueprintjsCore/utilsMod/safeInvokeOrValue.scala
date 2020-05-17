package typingsSlinky.blueprintjsCore.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/utils", "safeInvokeOrValue")
@js.native
object safeInvokeOrValue extends js.Object {
  def apply[R](): R = js.native
  def apply[R](funcOrValue: R): R = js.native
  def apply[R](funcOrValue: js.Function0[R]): R = js.native
  def apply[A, R](funcOrValue: js.UndefOr[(js.Function1[/* arg1 */ A, R]) | R], arg1: A): R = js.native
  def apply[A, B, R](funcOrValue: js.UndefOr[(js.Function2[/* arg1 */ A, /* arg2 */ B, R]) | R], arg1: A, arg2: B): R = js.native
  def apply[A, B, C, R](
    funcOrValue: js.UndefOr[(js.Function3[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, R]) | R],
    arg1: A,
    arg2: B,
    arg3: C
  ): R = js.native
  def apply[A, B, C, D, R](
    funcOrValue: js.UndefOr[(js.Function4[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, /* arg4 */ D, R]) | R],
    arg1: A,
    arg2: B,
    arg3: C,
    arg4: D
  ): R = js.native
}

