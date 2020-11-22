package typingsSlinky.abortableIterator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Signals[T] = js.Array[typingsSlinky.abortableIterator.anon.Options[T]]
  
  type Sink_[TSource, TReturn] = js.Function1[/* source */ typingsSlinky.abortableIterator.mod.Source_[TSource], TReturn]
  
  type Source_[T] = typingsSlinky.std.AsyncIterable[T] | js.Iterable[T]
  
  type Transform_[TSourceIn, TSourceOut] = js.Function1[
    /* source */ typingsSlinky.abortableIterator.mod.Source_[TSourceIn], 
    typingsSlinky.abortableIterator.mod.Source_[TSourceOut]
  ]
}
