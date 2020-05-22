package typingsSlinky.emotionStyledBase

import typingsSlinky.react.mod.ComponentPropsWithRef
import typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes
import typingsSlinky.std.Exclude
import typingsSlinky.std.Extract
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/styled-base/types/helper", JSImport.Namespace)
@js.native
object helperMod extends js.Object {
  type Omit[T, U] = Pick[T, Exclude[/* keyof T */ String, U]]
  type Overwrapped[T, U] = Pick[T, Extract[/* keyof T */ String, /* keyof U */ String]]
  type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] = LibraryManagedAttributes[C, ComponentPropsWithRef[C]]
}

