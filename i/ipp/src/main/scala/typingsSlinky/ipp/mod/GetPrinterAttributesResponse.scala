package typingsSlinky.ipp.mod

import typingsSlinky.ipp.AnonAttributesnaturallanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPrinterAttributesResponse extends js.Object {
  var id: Double = js.native
  var `operation-attributes-tag`: AnonAttributesnaturallanguage = js.native
  var `printer-attributes-tag`: js.Object = js.native
  var statusCode: StatusCode = js.native
  var `unsupported-attributes`: js.UndefOr[js.Array[String]] = js.native
  var version: IPPVersion = js.native
}

object GetPrinterAttributesResponse {
  @scala.inline
  def apply(
    id: Double,
    `operation-attributes-tag`: AnonAttributesnaturallanguage,
    `printer-attributes-tag`: js.Object,
    statusCode: StatusCode,
    version: IPPVersion
  ): GetPrinterAttributesResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.updateDynamic("printer-attributes-tag")(`printer-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPrinterAttributesResponse]
  }
  @scala.inline
  implicit class GetPrinterAttributesResponseOps[Self <: GetPrinterAttributesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOperation-attributes-tag`(value: AnonAttributesnaturallanguage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation-attributes-tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPrinter-attributes-tag`(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-attributes-tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: StatusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: IPPVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withUnsupported-attributes`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsupported-attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUnsupported-attributes`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsupported-attributes")(js.undefined)
        ret
    }
  }
  
}

