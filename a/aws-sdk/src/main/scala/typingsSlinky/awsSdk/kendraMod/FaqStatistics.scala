package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaqStatistics extends js.Object {
  /**
    * The total number of FAQ questions and answers contained in the index.
    */
  var IndexedQuestionAnswersCount: typingsSlinky.awsSdk.kendraMod.IndexedQuestionAnswersCount = js.native
}

object FaqStatistics {
  @scala.inline
  def apply(IndexedQuestionAnswersCount: IndexedQuestionAnswersCount): FaqStatistics = {
    val __obj = js.Dynamic.literal(IndexedQuestionAnswersCount = IndexedQuestionAnswersCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaqStatistics]
  }
  @scala.inline
  implicit class FaqStatisticsOps[Self <: FaqStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexedQuestionAnswersCount(value: IndexedQuestionAnswersCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexedQuestionAnswersCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

