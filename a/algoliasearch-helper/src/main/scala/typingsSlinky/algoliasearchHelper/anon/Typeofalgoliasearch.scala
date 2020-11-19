package typingsSlinky.algoliasearchHelper.anon

import typingsSlinky.algoliasearch.algoliasearchMod.AlgoliaSearchOptions
import typingsSlinky.algoliasearch.algoliasearchMod.SearchClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofalgoliasearch extends js.Object {
  
  def apply(appId: String, apiKey: String): SearchClient = js.native
  def apply(appId: String, apiKey: String, options: AlgoliaSearchOptions): SearchClient = js.native
  
  var version: String = js.native
}
