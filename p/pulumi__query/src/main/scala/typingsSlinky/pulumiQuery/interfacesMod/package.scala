package typingsSlinky.pulumiQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interfacesMod {
  
  type AsyncQuerySource[TSource] = js.Iterable[TSource] | typingsSlinky.pulumiQuery.interfacesMod.AsyncIterable[TSource] | (js.Promise[
    typingsSlinky.pulumiQuery.interfacesMod.AsyncIterable[TSource] | js.Iterable[TSource]
  ])
  
  type Evaluator[TSource, TResult] = js.Function1[
    /* source */ typingsSlinky.pulumiQuery.interfacesMod.AsyncIterableIterator[TSource], 
    js.Promise[TResult]
  ]
  
  type Operator[TSource, TResult] = js.Function1[
    /* source */ typingsSlinky.pulumiQuery.interfacesMod.AsyncIterableIterator[TSource], 
    typingsSlinky.pulumiQuery.interfacesMod.AsyncIterableIterator[TResult]
  ]
  
  type OrderKey = java.lang.String | scala.Double
}
