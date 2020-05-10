package typingsSlinky.awsSdkClientS3Browser.typesOutputSerializationMod

import typingsSlinky.awsSdkClientS3Browser.typesCsvoutputMod.UnmarshalledCSVOutput
import typingsSlinky.awsSdkClientS3Browser.typesJsonoutputMod.UnmarshalledJSONOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledOutputSerialization extends OutputSerialization {
  /**
    * <p>Describes the serialization of CSV-encoded Select results.</p>
    */
  @JSName("CSV")
  var CSV_UnmarshalledOutputSerialization: js.UndefOr[UnmarshalledCSVOutput] = js.native
  /**
    * <p>Specifies JSON as request's output serialization format.</p>
    */
  @JSName("JSON")
  var JSON_UnmarshalledOutputSerialization: js.UndefOr[UnmarshalledJSONOutput] = js.native
}

object UnmarshalledOutputSerialization {
  @scala.inline
  def apply(): UnmarshalledOutputSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledOutputSerialization]
  }
  @scala.inline
  implicit class UnmarshalledOutputSerializationOps[Self <: UnmarshalledOutputSerialization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCSV(value: UnmarshalledCSVOutput): Self = {
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
    def withJSON(value: UnmarshalledJSONOutput): Self = {
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

