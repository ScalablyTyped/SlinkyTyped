package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NegativeKeywordListBuilder[NegativeKeywordList] extends AdWordsBuilder[NegativeKeywordList] {
  def withName(name: String): NegativeKeywordListBuilder[NegativeKeywordList] = js.native
}

object NegativeKeywordListBuilder {
  @scala.inline
  def apply[NegativeKeywordList](
    build: () => AdWordsOperation[NegativeKeywordList],
    withName: String => NegativeKeywordListBuilder[NegativeKeywordList]
  ): NegativeKeywordListBuilder[NegativeKeywordList] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[NegativeKeywordListBuilder[NegativeKeywordList]]
  }
  @scala.inline
  implicit class NegativeKeywordListBuilderOps[Self[negativekeywordlist] <: NegativeKeywordListBuilder[negativekeywordlist], NegativeKeywordList] (val x: Self[NegativeKeywordList]) extends AnyVal {
    @scala.inline
    def duplicate: Self[NegativeKeywordList] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[NegativeKeywordList]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[NegativeKeywordList] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[NegativeKeywordList] with Other]
    @scala.inline
    def withWithName(value: String => NegativeKeywordListBuilder[NegativeKeywordList]): Self[NegativeKeywordList] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

