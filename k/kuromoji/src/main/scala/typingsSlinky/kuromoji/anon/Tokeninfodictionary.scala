package typingsSlinky.kuromoji.anon

import typingsSlinky.doublearray.doublearray.DoubleArray
import typingsSlinky.kuromoji.mod.TokenInfoDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tokeninfodictionary extends js.Object {
  var token_info_dictionary: TokenInfoDictionary = js.native
  var trie: DoubleArray = js.native
}

object Tokeninfodictionary {
  @scala.inline
  def apply(token_info_dictionary: TokenInfoDictionary, trie: DoubleArray): Tokeninfodictionary = {
    val __obj = js.Dynamic.literal(token_info_dictionary = token_info_dictionary.asInstanceOf[js.Any], trie = trie.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tokeninfodictionary]
  }
  @scala.inline
  implicit class TokeninfodictionaryOps[Self <: Tokeninfodictionary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

