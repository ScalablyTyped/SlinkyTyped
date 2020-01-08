package typingsSlinky.emotionDashTheming

import typingsSlinky.react.reactMod.ComponentPropsWithRef
import typingsSlinky.react.reactMod._Global_.JSX.LibraryManagedAttributes
import typingsSlinky.std.Exclude
import typingsSlinky.std.Extract
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emotion-theming/types/helper", JSImport.Namespace)
@js.native
object typesHelperMod extends js.Object {
  type AddOptionalTo[T, U] = (Omit[T, U]) with (Partial[Pick[T, Extract[String, U]]])
  type Omit[T, U] = Pick[T, Exclude[String, U]]
  type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] = LibraryManagedAttributes[C, ComponentPropsWithRef[C]]
}

