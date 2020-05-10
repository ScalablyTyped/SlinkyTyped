package typingsSlinky.kuromoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tokenizer[T] extends js.Object {
  var formatter: Formatter[T] = js.native
  var token_info_dictionary: TokenInfoDictionary = js.native
  var unknown_dictionary: UnknownDictionary = js.native
  var viterbi_builder: ViterbiBuilder = js.native
  var viterbi_searcher: ViterbiSearcher = js.native
  def getLattice(text: String): ViterbiLattice = js.native
  def tokenize(text: String): js.Array[T] = js.native
}

object Tokenizer {
  @scala.inline
  def apply[T](
    formatter: Formatter[T],
    getLattice: String => ViterbiLattice,
    token_info_dictionary: TokenInfoDictionary,
    tokenize: String => js.Array[T],
    unknown_dictionary: UnknownDictionary,
    viterbi_builder: ViterbiBuilder,
    viterbi_searcher: ViterbiSearcher
  ): Tokenizer[T] = {
    val __obj = js.Dynamic.literal(formatter = formatter.asInstanceOf[js.Any], getLattice = js.Any.fromFunction1(getLattice), token_info_dictionary = token_info_dictionary.asInstanceOf[js.Any], tokenize = js.Any.fromFunction1(tokenize), unknown_dictionary = unknown_dictionary.asInstanceOf[js.Any], viterbi_builder = viterbi_builder.asInstanceOf[js.Any], viterbi_searcher = viterbi_searcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tokenizer[T]]
  }
  @scala.inline
  implicit class TokenizerOps[Self[t] <: Tokenizer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFormatter(value: Formatter[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLattice(value: String => ViterbiLattice): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLattice")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToken_info_dictionary(value: TokenInfoDictionary): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_info_dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenize(value: String => js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnknown_dictionary(value: UnknownDictionary): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown_dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViterbi_builder(value: ViterbiBuilder): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viterbi_builder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViterbi_searcher(value: ViterbiSearcher): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viterbi_searcher")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

