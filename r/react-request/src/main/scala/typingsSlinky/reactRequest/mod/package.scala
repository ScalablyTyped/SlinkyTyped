package typingsSlinky.reactRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DoFetch[T] = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.reactRequest.mod.DoFetchOptions], 
    js.Promise[typingsSlinky.reactRequest.mod.FetchResponse[T]]
  ]
}
