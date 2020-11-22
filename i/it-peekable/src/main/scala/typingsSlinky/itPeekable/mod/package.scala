package typingsSlinky.itPeekable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * <T>
    */
  type AsyncPeekable[T] = typingsSlinky.std.AsyncIterable[T] with typingsSlinky.itPeekable.mod.AsyncPeek[T] with typingsSlinky.itPeekable.mod.Push[T] with (typingsSlinky.std.AsyncIterator[T, _, js.UndefOr[scala.Nothing]])
  
  /**
    * <T>
    */
  type Peekable[T] = js.Iterable[T] with typingsSlinky.itPeekable.mod.Peek[T] with typingsSlinky.itPeekable.mod.Push[T] with js.Iterator[T]
}
