package typingsSlinky.kuromoji.mod

import typingsSlinky.doublearray.doublearray.DoubleArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViterbiBuilder extends js.Object {
  var token_info_dictionary: TokenInfoDictionary = js.native
  var trie: DoubleArray = js.native
  var unknown_dictionary: UnknownDictionary = js.native
  def build(sentence_str: String): ViterbiLattice = js.native
}

object ViterbiBuilder {
  @scala.inline
  def apply(
    build: String => ViterbiLattice,
    token_info_dictionary: TokenInfoDictionary,
    trie: DoubleArray,
    unknown_dictionary: UnknownDictionary
  ): ViterbiBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build), token_info_dictionary = token_info_dictionary.asInstanceOf[js.Any], trie = trie.asInstanceOf[js.Any], unknown_dictionary = unknown_dictionary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViterbiBuilder]
  }
  @scala.inline
  implicit class ViterbiBuilderOps[Self <: ViterbiBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: String => ViterbiLattice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction1(value))
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

