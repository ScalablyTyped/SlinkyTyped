package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptureContentTypeHeader extends js.Object {
  /**
    * 
    */
  var CsvContentTypes: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CsvContentTypes] = js.native
  /**
    * 
    */
  var JsonContentTypes: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.JsonContentTypes] = js.native
}

object CaptureContentTypeHeader {
  @scala.inline
  def apply(): CaptureContentTypeHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureContentTypeHeader]
  }
  @scala.inline
  implicit class CaptureContentTypeHeaderOps[Self <: CaptureContentTypeHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsvContentTypes(value: CsvContentTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CsvContentTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvContentTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CsvContentTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonContentTypes(value: JsonContentTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JsonContentTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonContentTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JsonContentTypes")(js.undefined)
        ret
    }
  }
  
}

