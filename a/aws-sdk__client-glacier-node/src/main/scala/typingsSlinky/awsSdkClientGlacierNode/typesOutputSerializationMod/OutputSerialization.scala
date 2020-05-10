package typingsSlinky.awsSdkClientGlacierNode.typesOutputSerializationMod

import typingsSlinky.awsSdkClientGlacierNode.typesCsvoutputMod.CSVOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputSerialization extends js.Object {
  /**
    * <p>Describes the serialization of CSV-encoded query results.</p>
    */
  var csv: js.UndefOr[CSVOutput] = js.native
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
    def withCsv(value: CSVOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csv")(js.undefined)
        ret
    }
  }
  
}

