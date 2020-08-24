package typingsSlinky.algoliasearchHelper.anon

import typingsSlinky.algoliasearch.algoliasearchMod.AlgoliaSearchOptions
import typingsSlinky.algoliasearch.algoliasearchMod.SearchClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofalgoliasearch extends js.Object {
  var version: String = js.native
  def apply(appId: String, apiKey: String): SearchClient = js.native
  def apply(appId: String, apiKey: String, options: AlgoliaSearchOptions): SearchClient = js.native
}

