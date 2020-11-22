package typingsSlinky.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object algoliasearchMod {
  
  type AlgoliaSearchOptions = typingsSlinky.std.Partial[typingsSlinky.algoliaClientCommon.mod.ClientTransporterOptions] with typingsSlinky.algoliasearch.anon.WithoutCredentialsSearchC
  
  type InitAnalyticsOptions = typingsSlinky.std.Partial[typingsSlinky.algoliaClientCommon.mod.ClientTransporterOptions] with typingsSlinky.algoliasearch.anon.OptionalCredentialsAnalyt
  
  type InitRecommendationOptions = typingsSlinky.std.Partial[typingsSlinky.algoliaClientCommon.mod.ClientTransporterOptions] with typingsSlinky.algoliasearch.anon.OptionalCredentialsRecomm
  
  type OptionalCredentials[TClientOptions /* <: typingsSlinky.algoliasearch.algoliasearchMod.Credentials */] = (typingsSlinky.std.Omit[
    TClientOptions, 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch.Credentials */ typingsSlinky.algoliasearch.algoliasearchStrings.appId | typingsSlinky.algoliasearch.algoliasearchStrings.apiKey
  ]) with (typingsSlinky.std.Pick[
    typingsSlinky.std.Partial[TClientOptions], 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch.Credentials */ typingsSlinky.algoliasearch.algoliasearchStrings.appId | typingsSlinky.algoliasearch.algoliasearchStrings.apiKey
  ])
  
  type WithoutCredentials[TClientOptions /* <: typingsSlinky.algoliasearch.algoliasearchMod.Credentials */] = typingsSlinky.std.Omit[
    TClientOptions, 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch.Credentials */ typingsSlinky.algoliasearch.algoliasearchStrings.appId | typingsSlinky.algoliasearch.algoliasearchStrings.apiKey
  ]
}
