package typingsSlinky.frecency.frecencyMod

import typingsSlinky.frecency.Anon_ExactQueryMatchWeight
import typingsSlinky.frecency.Anon_FrecencyScore
import typingsSlinky.frecency.Anon_KeepScores
import typingsSlinky.frecency.Anon_SearchQuery
import typingsSlinky.frecency.Anon_SearchQuerySearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("frecency", JSImport.Default)
@js.native
class default[T] protected () extends Frecency[T] {
  def this(constructOpts: Anon_ExactQueryMatchWeight) = this()
  /* CompleteClass */
  override var sort: js.Function1[
    (/* arg */ Anon_KeepScores[T]) | (/* arg */ Anon_SearchQuerySearchResults[T]), 
    js.Array[(T with Anon_FrecencyScore) | T]
  ] = js.native
  /* CompleteClass */
  override def save(arg: Anon_SearchQuery[T]): Unit = js.native
}

