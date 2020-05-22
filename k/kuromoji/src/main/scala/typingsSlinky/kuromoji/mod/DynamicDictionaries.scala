package typingsSlinky.kuromoji.mod

import typingsSlinky.doublearray.doublearray.DoubleArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicDictionaries extends js.Object {
  var connection_costs: ConnectionCosts
  var token_info_dictionary: TokenInfoDictionary
  var trie: DoubleArray
  var unknown_dictionary: UnknownDictionary
  def loadTrie(base_buffer: js.typedarray.Int32Array, check_buffer: js.typedarray.Int32Array): DynamicDictionaries
}

object DynamicDictionaries {
  @scala.inline
  def apply(
    connection_costs: ConnectionCosts,
    loadTrie: (js.typedarray.Int32Array, js.typedarray.Int32Array) => DynamicDictionaries,
    token_info_dictionary: TokenInfoDictionary,
    trie: DoubleArray,
    unknown_dictionary: UnknownDictionary
  ): DynamicDictionaries = {
    val __obj = js.Dynamic.literal(connection_costs = connection_costs.asInstanceOf[js.Any], loadTrie = js.Any.fromFunction2(loadTrie), token_info_dictionary = token_info_dictionary.asInstanceOf[js.Any], trie = trie.asInstanceOf[js.Any], unknown_dictionary = unknown_dictionary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicDictionaries]
  }
}

