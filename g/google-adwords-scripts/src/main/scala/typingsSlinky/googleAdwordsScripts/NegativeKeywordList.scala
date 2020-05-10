package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NegativeKeywordList extends AdWordsEntity {
  def addNegativeKeyword(keywordText: String): Unit = js.native
  def addNegativeKeywords(keywordTexts: js.Array[String]): Unit = js.native
  def campaigns(): AdWordsSelector[Campaign] = js.native
  def getId(): Double = js.native
  def getName(): String = js.native
  def negativeKeywords(): AdWordsSelector[SharedNegativeKeyword] = js.native
  def setName(): String = js.native
}

object NegativeKeywordList {
  @scala.inline
  def apply(
    addNegativeKeyword: String => Unit,
    addNegativeKeywords: js.Array[String] => Unit,
    campaigns: () => AdWordsSelector[Campaign],
    getId: () => Double,
    getName: () => String,
    negativeKeywords: () => AdWordsSelector[SharedNegativeKeyword],
    setName: () => String
  ): NegativeKeywordList = {
    val __obj = js.Dynamic.literal(addNegativeKeyword = js.Any.fromFunction1(addNegativeKeyword), addNegativeKeywords = js.Any.fromFunction1(addNegativeKeywords), campaigns = js.Any.fromFunction0(campaigns), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), negativeKeywords = js.Any.fromFunction0(negativeKeywords), setName = js.Any.fromFunction0(setName))
    __obj.asInstanceOf[NegativeKeywordList]
  }
  @scala.inline
  implicit class NegativeKeywordListOps[Self <: NegativeKeywordList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddNegativeKeyword(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNegativeKeyword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddNegativeKeywords(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNegativeKeywords")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCampaigns(value: () => AdWordsSelector[Campaign]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaigns")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNegativeKeywords(value: () => AdWordsSelector[SharedNegativeKeyword]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeKeywords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

