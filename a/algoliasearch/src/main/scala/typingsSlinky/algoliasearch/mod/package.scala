package typingsSlinky.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AlgoliasearchInstance = js.Function3[
    /* applicationId */ java.lang.String, 
    /* apiKey */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.algoliasearch.mod.ClientOptions], 
    typingsSlinky.algoliasearch.mod.Client
  ]
  type Omit[T, K /* <: java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[java.lang.String, K]]
}
