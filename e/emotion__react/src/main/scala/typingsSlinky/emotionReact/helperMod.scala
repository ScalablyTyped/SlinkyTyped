package typingsSlinky.emotionReact

import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  type DistributiveOmit[T, U] = Pick[T, Exclude[/* keyof T */ String, U]]
  
  type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] = LibraryManagedAttributes[C, ComponentProps[C]]
}
