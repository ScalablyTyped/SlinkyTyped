package typingsSlinky.algoliaClientRecommendation.mod

import typingsSlinky.algoliaClientRecommendation.anon.ReadonlyPromiseSetPersona
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-recommendation", "setPersonalizationStrategy")
@js.native
object setPersonalizationStrategy extends js.Object {
  def apply(base: RecommendationClient): js.Function2[
    /* personalizationStrategy */ PersonalizationStrategy, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseSetPersona
  ] = js.native
}

