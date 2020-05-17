package typingsSlinky.pulumiQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type Evaluator[TSource, TResult] = js.Function1[
    /* source */ typingsSlinky.pulumiQuery.interfacesMod.AsyncIterableIterator[TSource], 
    js.Promise[TResult]
  ]
  type Operator[TSource, TResult] = js.Function1[
    /* source */ typingsSlinky.pulumiQuery.interfacesMod.AsyncIterableIterator[TSource], 
    typingsSlinky.pulumiQuery.interfacesMod.AsyncIterableIterator[TResult]
  ]
}
