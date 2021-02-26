package typingsSlinky.algoliasearchHelper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * The algoliasearchHelper module is the function that will let its
    * contains everything needed to use the Algoliasearch
    * Helper. It is a also a function that instantiate the helper.
    * To use the helper, you also need the Algolia JS client v3.
    * @param client an AlgoliaSearch client
    * @param index the name of the index to query
    * @param opts
    */
  @scala.inline
  def apply(client: typingsSlinky.algoliasearchHelper.mod.SearchClient, index: java.lang.String): typingsSlinky.algoliasearchHelper.mod.AlgoliaSearchHelper = (typingsSlinky.algoliasearchHelper.mod.^.asInstanceOf[js.Dynamic].apply(client.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.algoliasearchHelper.mod.AlgoliaSearchHelper]
  @scala.inline
  def apply(
    client: typingsSlinky.algoliasearchHelper.mod.SearchClient,
    index: java.lang.String,
    opts: typingsSlinky.algoliasearchHelper.mod.PlainSearchParameters
  ): typingsSlinky.algoliasearchHelper.mod.AlgoliaSearchHelper = (typingsSlinky.algoliasearchHelper.mod.^.asInstanceOf[js.Dynamic].apply(client.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.algoliasearchHelper.mod.AlgoliaSearchHelper]
  
  type Client = typingsSlinky.algoliasearch.algoliasearchMod.SearchClient
  
  type SearchOptions = typingsSlinky.algoliaClientSearch.mod.SearchOptions
  
  type SearchResponse[T] = org.scalajs.dom.experimental.Response | typingsSlinky.algoliaClientSearch.mod.SearchResponse[T]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.algoliasearchHelper.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
