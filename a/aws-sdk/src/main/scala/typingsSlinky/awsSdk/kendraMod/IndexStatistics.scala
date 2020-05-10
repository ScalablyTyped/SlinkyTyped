package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexStatistics extends js.Object {
  /**
    * The number of question and answer topics in the index.
    */
  var FaqStatistics: typingsSlinky.awsSdk.kendraMod.FaqStatistics = js.native
  /**
    * The number of text documents indexed.
    */
  var TextDocumentStatistics: typingsSlinky.awsSdk.kendraMod.TextDocumentStatistics = js.native
}

object IndexStatistics {
  @scala.inline
  def apply(FaqStatistics: FaqStatistics, TextDocumentStatistics: TextDocumentStatistics): IndexStatistics = {
    val __obj = js.Dynamic.literal(FaqStatistics = FaqStatistics.asInstanceOf[js.Any], TextDocumentStatistics = TextDocumentStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexStatistics]
  }
  @scala.inline
  implicit class IndexStatisticsOps[Self <: IndexStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFaqStatistics(value: FaqStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaqStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextDocumentStatistics(value: TextDocumentStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextDocumentStatistics")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

