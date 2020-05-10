package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedNegativeKeyword extends AdWordsEntity {
  def getMatchType(): MatchType = js.native
  def getNegativeKeywordList(): NegativeKeywordList = js.native
  def getText(): String = js.native
  def remove(): Unit = js.native
}

object SharedNegativeKeyword {
  @scala.inline
  def apply(
    getMatchType: () => MatchType,
    getNegativeKeywordList: () => NegativeKeywordList,
    getText: () => String,
    remove: () => Unit
  ): SharedNegativeKeyword = {
    val __obj = js.Dynamic.literal(getMatchType = js.Any.fromFunction0(getMatchType), getNegativeKeywordList = js.Any.fromFunction0(getNegativeKeywordList), getText = js.Any.fromFunction0(getText), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[SharedNegativeKeyword]
  }
  @scala.inline
  implicit class SharedNegativeKeywordOps[Self <: SharedNegativeKeyword] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMatchType(value: () => MatchType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMatchType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNegativeKeywordList(value: () => NegativeKeywordList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNegativeKeywordList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

