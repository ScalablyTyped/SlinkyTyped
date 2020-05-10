package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetectDominantLanguageItemResult extends js.Object {
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.native
  /**
    * One or more DominantLanguage objects describing the dominant languages in the document.
    */
  var Languages: js.UndefOr[ListOfDominantLanguages] = js.native
}

object BatchDetectDominantLanguageItemResult {
  @scala.inline
  def apply(): BatchDetectDominantLanguageItemResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetectDominantLanguageItemResult]
  }
  @scala.inline
  implicit class BatchDetectDominantLanguageItemResultOps[Self <: BatchDetectDominantLanguageItemResult] (val x: Self) extends AnyVal {
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
    def withLanguages(value: ListOfDominantLanguages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Languages")(js.undefined)
        ret
    }
  }
  
}

