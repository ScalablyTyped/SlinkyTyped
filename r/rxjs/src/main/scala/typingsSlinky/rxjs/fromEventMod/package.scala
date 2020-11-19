package typingsSlinky.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fromEventMod {
  
  type FromEventTarget[T] = typingsSlinky.rxjs.fromEventMod.EventTargetLike[T] | typingsSlinky.std.ArrayLike[typingsSlinky.rxjs.fromEventMod.EventTargetLike[T]]
  
  type NodeEventHandler = js.Function1[/* repeated */ js.Any, scala.Unit]
}
