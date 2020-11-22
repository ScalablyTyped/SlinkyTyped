package typingsSlinky.algoliasearch.algoliasearchMod

import typingsSlinky.algoliaClientRecommendation.mod.PersonalizationStrategy
import typingsSlinky.algoliaTransporter.mod.RequestOptions
import typingsSlinky.algoliaTransporter.mod.Transporter
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseGetPersona
import typingsSlinky.algoliasearch.anon.ReadonlyPromiseSetPersona
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @algolia/client-recommendation.@algolia/client-recommendation.RecommendationClient & {readonly getPersonalizationStrategy (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-recommendation.@algolia/client-recommendation.GetPersonalizationStrategyResponse>>, readonly setPersonalizationStrategy (personalizationStrategy : @algolia/client-recommendation.@algolia/client-recommendation.PersonalizationStrategy, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-recommendation.@algolia/client-recommendation.SetPersonalizationStrategyResponse>>} */
@js.native
trait RecommendationClient extends js.Object {
  
  /**
    * The application id.
    */
  val appId: String = js.native
  
  def getPersonalizationStrategy(): ReadonlyPromiseGetPersona = js.native
  def getPersonalizationStrategy(requestOptions: RequestOptions): ReadonlyPromiseGetPersona = js.native
  
  def setPersonalizationStrategy(personalizationStrategy: PersonalizationStrategy): ReadonlyPromiseSetPersona = js.native
  def setPersonalizationStrategy(personalizationStrategy: PersonalizationStrategy, requestOptions: RequestOptions): ReadonlyPromiseSetPersona = js.native
  
  /**
    * The underlying transporter.
    */
  val transporter: Transporter = js.native
}
