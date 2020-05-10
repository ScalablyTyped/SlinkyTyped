package typingsSlinky.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictionarymatches extends js.Object {
  var `dictionary matches`: Double = js.native
  var `fast-path pages deleted`: Double = js.native
  var `internal page key bytes discarded using suffix compression`: Double = js.native
  var `internal page multi-block writes`: Double = js.native
  var `internal-page overflow keys`: Double = js.native
  var `leaf page key bytes discarded using prefix compression`: Double = js.native
  var `leaf page multi-block writes`: Double = js.native
  var `leaf-page overflow keys`: Double = js.native
  var `maximum blocks required for a page`: Double = js.native
  var `overflow values written`: Double = js.native
  var `page checksum matches`: Double = js.native
  var `page reconciliation calls`: Double = js.native
  var `page reconciliation calls for eviction`: Double = js.native
  var `pages deleted`: Double = js.native
}

object AnonDictionarymatches {
  @scala.inline
  def apply(
    `dictionary matches`: Double,
    `fast-path pages deleted`: Double,
    `internal page key bytes discarded using suffix compression`: Double,
    `internal page multi-block writes`: Double,
    `internal-page overflow keys`: Double,
    `leaf page key bytes discarded using prefix compression`: Double,
    `leaf page multi-block writes`: Double,
    `leaf-page overflow keys`: Double,
    `maximum blocks required for a page`: Double,
    `overflow values written`: Double,
    `page checksum matches`: Double,
    `page reconciliation calls`: Double,
    `page reconciliation calls for eviction`: Double,
    `pages deleted`: Double
  ): AnonDictionarymatches = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dictionary matches")((`dictionary matches`).asInstanceOf[js.Any])
    __obj.updateDynamic("fast-path pages deleted")((`fast-path pages deleted`).asInstanceOf[js.Any])
    __obj.updateDynamic("internal page key bytes discarded using suffix compression")((`internal page key bytes discarded using suffix compression`).asInstanceOf[js.Any])
    __obj.updateDynamic("internal page multi-block writes")((`internal page multi-block writes`).asInstanceOf[js.Any])
    __obj.updateDynamic("internal-page overflow keys")((`internal-page overflow keys`).asInstanceOf[js.Any])
    __obj.updateDynamic("leaf page key bytes discarded using prefix compression")((`leaf page key bytes discarded using prefix compression`).asInstanceOf[js.Any])
    __obj.updateDynamic("leaf page multi-block writes")((`leaf page multi-block writes`).asInstanceOf[js.Any])
    __obj.updateDynamic("leaf-page overflow keys")((`leaf-page overflow keys`).asInstanceOf[js.Any])
    __obj.updateDynamic("maximum blocks required for a page")((`maximum blocks required for a page`).asInstanceOf[js.Any])
    __obj.updateDynamic("overflow values written")((`overflow values written`).asInstanceOf[js.Any])
    __obj.updateDynamic("page checksum matches")((`page checksum matches`).asInstanceOf[js.Any])
    __obj.updateDynamic("page reconciliation calls")((`page reconciliation calls`).asInstanceOf[js.Any])
    __obj.updateDynamic("page reconciliation calls for eviction")((`page reconciliation calls for eviction`).asInstanceOf[js.Any])
    __obj.updateDynamic("pages deleted")((`pages deleted`).asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictionarymatches]
  }
  @scala.inline
  implicit class AnonDictionarymatchesOps[Self <: AnonDictionarymatches] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withDictionary matches`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFast-path pages deleted`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fast-path pages deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withInternal page key bytes discarded using suffix compression`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal page key bytes discarded using suffix compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withInternal page multi-block writes`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal page multi-block writes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withInternal-page overflow keys`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal-page overflow keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLeaf page key bytes discarded using prefix compression`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaf page key bytes discarded using prefix compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLeaf page multi-block writes`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaf page multi-block writes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLeaf-page overflow keys`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaf-page overflow keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMaximum blocks required for a page`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum blocks required for a page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOverflow values written`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow values written")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPage checksum matches`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page checksum matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPage reconciliation calls`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page reconciliation calls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPage reconciliation calls for eviction`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page reconciliation calls for eviction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPages deleted`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages deleted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

