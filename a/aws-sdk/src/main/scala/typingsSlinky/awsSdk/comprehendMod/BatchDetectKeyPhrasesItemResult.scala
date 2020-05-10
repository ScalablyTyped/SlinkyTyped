package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetectKeyPhrasesItemResult extends js.Object {
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.native
  /**
    * One or more KeyPhrase objects, one for each key phrase detected in the document.
    */
  var KeyPhrases: js.UndefOr[ListOfKeyPhrases] = js.native
}

object BatchDetectKeyPhrasesItemResult {
  @scala.inline
  def apply(): BatchDetectKeyPhrasesItemResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetectKeyPhrasesItemResult]
  }
  @scala.inline
  implicit class BatchDetectKeyPhrasesItemResultOps[Self <: BatchDetectKeyPhrasesItemResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPhrases(value: ListOfKeyPhrases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPhrases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPhrases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPhrases")(js.undefined)
        ret
    }
  }
  
}

