package typingsSlinky.jsSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITfIdfUidMetadata extends js.Object {
  @JSName("$document")
  var $document: js.Object = js.native
  @JSName("$numTokenOccurrences")
  var $numTokenOccurrences: Double = js.native
}

object ITfIdfUidMetadata {
  @scala.inline
  def apply($document: js.Object, $numTokenOccurrences: Double): ITfIdfUidMetadata = {
    val __obj = js.Dynamic.literal($document = $document.asInstanceOf[js.Any], $numTokenOccurrences = $numTokenOccurrences.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITfIdfUidMetadata]
  }
  @scala.inline
  implicit class ITfIdfUidMetadataOps[Self <: ITfIdfUidMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$document(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$numTokenOccurrences(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$numTokenOccurrences")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

