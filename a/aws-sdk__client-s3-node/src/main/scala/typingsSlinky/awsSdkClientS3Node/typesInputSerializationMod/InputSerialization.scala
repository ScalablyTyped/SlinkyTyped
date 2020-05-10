package typingsSlinky.awsSdkClientS3Node.typesInputSerializationMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BZIP2
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.GZIP
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NONE
import typingsSlinky.awsSdkClientS3Node.typesCsvinputMod.CSVInput
import typingsSlinky.awsSdkClientS3Node.typesJsoninputMod.JSONInput
import typingsSlinky.awsSdkClientS3Node.typesParquetInputMod.ParquetInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSerialization extends js.Object {
  /**
    * <p>Describes the serialization of a CSV-encoded object.</p>
    */
  var CSV: js.UndefOr[CSVInput] = js.native
  /**
    * <p>Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.</p>
    */
  var CompressionType: js.UndefOr[NONE | GZIP | BZIP2 | String] = js.native
  /**
    * <p>Specifies JSON as object's input serialization format.</p>
    */
  var JSON: js.UndefOr[JSONInput] = js.native
  /**
    * <p>Specifies Parquet as object's input serialization format.</p>
    */
  var Parquet: js.UndefOr[ParquetInput] = js.native
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
    def withCSV(value: CSVInput): Self = {
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
    def withCompressionType(value: NONE | GZIP | BZIP2 | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompressionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompressionType")(js.undefined)
        ret
    }
    @scala.inline
    def withJSON(value: JSONInput): Self = {
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
    def withParquet(value: ParquetInput): Self = {
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

