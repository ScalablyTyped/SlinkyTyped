package typingsSlinky.highland

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Highland {
  type MappingHint = scala.Double | js.Array[java.lang.String] | js.Function
  type OnFinished = js.Function2[
    /* r */ typingsSlinky.node.NodeJS.ReadableStream, 
    /* cb */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    scala.Unit | js.Function | typingsSlinky.highland.Highland.CleanupObject
  ]
  type PipeableStream[T, R] = typingsSlinky.highland.Highland.Stream[R]
}
