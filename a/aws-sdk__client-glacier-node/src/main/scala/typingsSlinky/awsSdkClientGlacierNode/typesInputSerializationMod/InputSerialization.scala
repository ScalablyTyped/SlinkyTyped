package typingsSlinky.awsSdkClientGlacierNode.typesInputSerializationMod

import typingsSlinky.awsSdkClientGlacierNode.typesCsvinputMod.CSVInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSerialization extends js.Object {
  /**
    * <p>Describes the serialization of a CSV-encoded object.</p>
    */
  var csv: js.UndefOr[CSVInput] = js.native
}

object InputSerialization {
  @scala.inline
  def apply(): InputSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSerialization]
  }
  @scala.inline
  implicit class InputSerializationOps[Self <: InputSerialization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsv(value: CSVInput): Self = {
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

