package typingsSlinky.emotionStyledBase

import typingsSlinky.react.mod.ComponentPropsWithRef
import typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes
import typingsSlinky.std.Exclude
import typingsSlinky.std.Extract
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  type Omit[T, U] = Pick[T, Exclude[/* keyof T */ String, U]]
  
  type Overwrapped[T, U] = Pick[T, Extract[/* keyof T */ String, /* keyof U */ String]]
  
  type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] = LibraryManagedAttributes[C, ComponentPropsWithRef[C]]
}
