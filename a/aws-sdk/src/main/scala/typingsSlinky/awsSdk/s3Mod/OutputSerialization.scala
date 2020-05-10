package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputSerialization extends js.Object {
  /**
    * Describes the serialization of CSV-encoded Select results.
    */
  var CSV: js.UndefOr[CSVOutput] = js.native
  /**
    * Specifies JSON as request's output serialization format.
    */
  var JSON: js.UndefOr[JSONOutput] = js.native
}

object OutputSerialization {
  @scala.inline
  def apply(): OutputSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputSerialization]
  }
  @scala.inline
  implicit class OutputSerializationOps[Self <: OutputSerialization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCSV(value: CSVOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCSV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSV")(js.undefined)
        ret
    }
    @scala.inline
    def withJSON(value: JSONOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JSON")(js.undefined)
        ret
    }
  }
  
}

