package typingsSlinky.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object algoliasearchMod {
  import typingsSlinky.algoliasearch.algoliasearchStrings.attributesToHighlight
  import typingsSlinky.algoliasearch.algoliasearchStrings.attributesToSnippet
  import typingsSlinky.algoliasearch.algoliasearchStrings.distinct
  import typingsSlinky.algoliasearch.algoliasearchStrings.facets
  import typingsSlinky.algoliasearch.algoliasearchStrings.getRankingInfo
  import typingsSlinky.algoliasearch.algoliasearchStrings.typoTolerance
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type AlgoliasearchInstance = js.Function3[
    /* applicationId */ String, 
    /* apiKey */ String, 
    /* options */ js.UndefOr[ClientOptions], 
    Client
  ]
  type BrowseParameters = Omit[
    QueryParameters, 
    typoTolerance | distinct | facets | getRankingInfo | attributesToHighlight | attributesToSnippet
  ]
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
