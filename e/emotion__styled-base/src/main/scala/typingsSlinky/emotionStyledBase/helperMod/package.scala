package typingsSlinky.emotionStyledBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object helperMod {
  type Omit[T, U] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, U]]
  type Overwrapped[T, U] = typingsSlinky.std.Pick[
    T, 
    typingsSlinky.std.Extract[/* keyof T */ java.lang.String, /* keyof U */ java.lang.String]
  ]
  type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] = typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes[C, typingsSlinky.react.mod.ComponentPropsWithRef[C]]
}
