package typingsSlinky.awsSdkClientS3Node.typesInputSerializationMod

import typingsSlinky.awsSdkClientS3Node.typesCsvinputMod.UnmarshalledCSVInput
import typingsSlinky.awsSdkClientS3Node.typesJsoninputMod.UnmarshalledJSONInput
import typingsSlinky.awsSdkClientS3Node.typesParquetInputMod.UnmarshalledParquetInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledInputSerialization extends InputSerialization {
  /**
    * <p>Describes the serialization of a CSV-encoded object.</p>
    */
  @JSName("CSV")
  var CSV_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledCSVInput] = js.native
  /**
    * <p>Specifies JSON as object's input serialization format.</p>
    */
  @JSName("JSON")
  var JSON_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledJSONInput] = js.native
  /**
    * <p>Specifies Parquet as object's input serialization format.</p>
    */
  @JSName("Parquet")
  var Parquet_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledParquetInput] = js.native
}

object UnmarshalledInputSerialization {
  @scala.inline
  def apply(): UnmarshalledInputSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledInputSerialization]
  }
  @scala.inline
  implicit class UnmarshalledInputSerializationOps[Self <: UnmarshalledInputSerialization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCSV(value: UnmarshalledCSVInput): Self = {
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
    def withJSON(value: UnmarshalledJSONInput): Self = {
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
    @scala.inline
    def withParquet(value: UnmarshalledParquetInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parquet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParquet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parquet")(js.undefined)
        ret
    }
  }
  
}

