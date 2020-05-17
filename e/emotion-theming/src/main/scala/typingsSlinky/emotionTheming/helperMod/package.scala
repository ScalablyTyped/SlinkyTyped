package typingsSlinky.emotionTheming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object helperMod {
  type AddOptionalTo[T, U] = (typingsSlinky.emotionTheming.helperMod.Omit[T, U]) with (typingsSlinky.std.Partial[
    typingsSlinky.std.Pick[T, typingsSlinky.std.Extract[/* keyof T */ java.lang.String, U]]
  ])
  type Omit[T, U] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, U]]
  type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] = typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes[C, typingsSlinky.react.mod.ComponentPropsWithRef[C]]
}
