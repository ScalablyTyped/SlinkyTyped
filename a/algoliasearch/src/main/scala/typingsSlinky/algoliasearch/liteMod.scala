package typingsSlinky.algoliasearch

import typingsSlinky.algoliasearch.algoliasearchLiteMod.AlgoliaSearchOptions
import typingsSlinky.algoliasearch.algoliasearchLiteMod.SearchClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("algoliasearch/lite", JSImport.Namespace)
@js.native
object liteMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(appId: String, apiKey: String): SearchClient = js.native
    def apply(appId: String, apiKey: String, options: AlgoliaSearchOptions): SearchClient = js.native
    
    var version: String = js.native
  }
}
