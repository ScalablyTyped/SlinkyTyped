package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDocumentStatistics extends js.Object {
  /**
    * The number of text documents indexed.
    */
  var IndexedTextDocumentsCount: typingsSlinky.awsSdk.kendraMod.IndexedTextDocumentsCount = js.native
}

object TextDocumentStatistics {
  @scala.inline
  def apply(IndexedTextDocumentsCount: IndexedTextDocumentsCount): TextDocumentStatistics = {
    val __obj = js.Dynamic.literal(IndexedTextDocumentsCount = IndexedTextDocumentsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentStatistics]
  }
  @scala.inline
  implicit class TextDocumentStatisticsOps[Self <: TextDocumentStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexedTextDocumentsCount(value: IndexedTextDocumentsCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexedTextDocumentsCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

