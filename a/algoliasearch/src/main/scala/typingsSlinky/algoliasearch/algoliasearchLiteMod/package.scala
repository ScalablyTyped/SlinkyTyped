package typingsSlinky.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object algoliasearchLiteMod {
  
  type AlgoliaSearchOptions = typingsSlinky.std.Partial[typingsSlinky.algoliaClientCommon.mod.ClientTransporterOptions] with typingsSlinky.algoliasearch.anon.WithoutCredentialsSearchC
  
  type WithoutCredentials[TClientOptions /* <: typingsSlinky.algoliasearch.algoliasearchLiteMod.Credentials */] = typingsSlinky.std.Omit[
    TClientOptions, 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch-lite.Credentials */ typingsSlinky.algoliasearch.algoliasearchStrings.appId | typingsSlinky.algoliasearch.algoliasearchStrings.apiKey
  ]
}
