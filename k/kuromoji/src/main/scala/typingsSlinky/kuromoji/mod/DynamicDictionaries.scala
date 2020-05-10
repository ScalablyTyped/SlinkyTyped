package typingsSlinky.kuromoji.mod

import typingsSlinky.doublearray.doublearray.DoubleArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicDictionaries extends js.Object {
  var connection_costs: ConnectionCosts = js.native
  var token_info_dictionary: TokenInfoDictionary = js.native
  var trie: DoubleArray = js.native
  var unknown_dictionary: UnknownDictionary = js.native
  def loadTrie(base_buffer: js.typedarray.Int32Array, check_buffer: js.typedarray.Int32Array): DynamicDictionaries = js.native
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
  @scala.inline
  implicit class DynamicDictionariesOps[Self <: DynamicDictionaries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection_costs(value: ConnectionCosts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_costs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadTrie(value: (js.typedarray.Int32Array, js.typedarray.Int32Array) => DynamicDictionaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTrie")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToken_info_dictionary(value: TokenInfoDictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_info_dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrie(value: DoubleArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown_dictionary(value: UnknownDictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown_dictionary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

