package typingsSlinky.lodashDecorators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonMod {
  type BiTypedDecorator = js.Function0[typingsSlinky.lodashDecorators.commonMod.LodashDecorator] with typingsSlinky.lodashDecorators.commonMod.LodashDecorator
  type BiTypedDecorator1[T] = (js.Function1[/* arg */ js.UndefOr[T], typingsSlinky.lodashDecorators.commonMod.LodashDecorator]) with typingsSlinky.lodashDecorators.commonMod.LodashDecorator
  type BiTypedDecorator2[T, T2] = (js.Function2[
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[T2], 
    typingsSlinky.lodashDecorators.commonMod.LodashDecorator
  ]) with typingsSlinky.lodashDecorators.commonMod.LodashDecorator
  type BiTypedDecorator3[T, T2, T3] = (js.Function3[
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[T2], 
    /* arg3 */ js.UndefOr[T3], 
    typingsSlinky.lodashDecorators.commonMod.LodashDecorator
  ]) with typingsSlinky.lodashDecorators.commonMod.LodashDecorator
  type BiTypedDecoratorN = (js.Function1[/* repeated */ js.Any, typingsSlinky.lodashDecorators.commonMod.LodashDecorator]) with typingsSlinky.lodashDecorators.commonMod.LodashDecorator
  type BiTypedMethodDecorator = js.Function0[typingsSlinky.lodashDecorators.commonMod.LodashMethodDecorator] with typingsSlinky.lodashDecorators.commonMod.LodashMethodDecorator
  type BiTypedMethodDecorator1[T] = (js.Function1[
    /* arg */ js.UndefOr[T], 
    typingsSlinky.lodashDecorators.commonMod.LodashMethodDecorator
  ]) with typingsSlinky.lodashDecorators.commonMod.LodashMethodDecorator
  type BiTypedMethodDecorator2[T, T2] = (js.Function2[
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[T2], 
    typingsSlinky.lodashDecorators.commonMod.LodashMethodDecorator
  ]) with typingsSlinky.lodashDecorators.commonMod.LodashMethodDecorator
  type BiTypedMethodDecorator3[T, T2, T3] = (js.Function3[
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[T2], 
    /* arg3 */ js.UndefOr[T3], 
    typingsSlinky.lodashDecorators.commonMod.LodashMethodDecorator
  ]) with typingsSlinky.lodashDecorators.commonMod.LodashMethodDecorator
  type BiTypedMethodDecoratorN = (js.Function1[
    /* repeated */ js.Any, 
    typingsSlinky.lodashDecorators.commonMod.LodashMethodDecorator
  ]) with typingsSlinky.lodashDecorators.commonMod.LodashMethodDecorator
  type LodashDecorator = typingsSlinky.std.MethodDecorator with typingsSlinky.std.PropertyDecorator
  type LodashMethodDecorator = typingsSlinky.std.MethodDecorator
  type ResolvableFunction = java.lang.String | js.Function
}
