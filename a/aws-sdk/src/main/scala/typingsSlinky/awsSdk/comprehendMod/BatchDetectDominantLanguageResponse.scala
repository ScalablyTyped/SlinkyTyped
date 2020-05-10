package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetectDominantLanguageResponse extends js.Object {
  /**
    * A list containing one object for each document that contained an error. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If there are no errors in the batch, the ErrorList is empty.
    */
  var ErrorList: BatchItemErrorList = js.native
  /**
    * A list of objects containing the results of the operation. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If all of the documents contain an error, the ResultList is empty.
    */
  var ResultList: ListOfDetectDominantLanguageResult = js.native
}

object BatchDetectDominantLanguageResponse {
  @scala.inline
  def apply(ErrorList: BatchItemErrorList, ResultList: ListOfDetectDominantLanguageResult): BatchDetectDominantLanguageResponse = {
    val __obj = js.Dynamic.literal(ErrorList = ErrorList.asInstanceOf[js.Any], ResultList = ResultList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectDominantLanguageResponse]
  }
  @scala.inline
  implicit class BatchDetectDominantLanguageResponseOps[Self <: BatchDetectDominantLanguageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorList(value: BatchItemErrorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultList(value: ListOfDetectDominantLanguageResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

