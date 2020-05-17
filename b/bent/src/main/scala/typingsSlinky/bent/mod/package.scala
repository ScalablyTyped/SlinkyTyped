package typingsSlinky.bent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BaseUrl = java.lang.String
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RequestFunction[T /* <: typingsSlinky.bent.mod.ValidResponse */] = js.Function3[
    /* url */ java.lang.String, 
    /* body */ js.UndefOr[typingsSlinky.bent.mod.RequestBody], 
    /* headers */ js.UndefOr[typingsSlinky.bent.mod.Headers], 
    js.Promise[T]
  ]
  type StatusCode = scala.Double
}
