package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetectSyntaxItemResult extends js.Object {
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.native
  /**
    * The syntax tokens for the words in the document, one token for each word.
    */
  var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens] = js.native
}

object BatchDetectSyntaxItemResult {
  @scala.inline
  def apply(): BatchDetectSyntaxItemResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetectSyntaxItemResult]
  }
  @scala.inline
  implicit class BatchDetectSyntaxItemResultOps[Self <: BatchDetectSyntaxItemResult] (val x: Self) extends AnyVal {
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
    def withSyntaxTokens(value: ListOfSyntaxTokens): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyntaxTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyntaxTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyntaxTokens")(js.undefined)
        ret
    }
  }
  
}

