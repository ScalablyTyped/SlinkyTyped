package typingsSlinky.asynciterator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncIteratorOrArray[T] = js.Array[T] | typingsSlinky.asynciterator.mod.AsyncIterator[T]
  
  type AsyncIteratorOrPromise[T] = typingsSlinky.asynciterator.mod.AsyncIterator[T] | js.Promise[typingsSlinky.asynciterator.mod.AsyncIterator[T]]
  
  type SourceExpression[T] = typingsSlinky.asynciterator.mod.AsyncIteratorOrPromise[T] | js.Function0[typingsSlinky.asynciterator.mod.AsyncIteratorOrPromise[T]]
}
