package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataFormatConversionConfiguration extends js.Object {
  /**
    * Defaults to true. Set it to false if you want to disable format conversion while preserving the configuration details.
    */
  var Enabled: js.UndefOr[BooleanObject] = js.native
  /**
    * Specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data from JSON.
    */
  var InputFormatConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.InputFormatConfiguration] = js.native
  /**
    * Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to the Parquet or ORC format.
    */
  var OutputFormatConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.OutputFormatConfiguration] = js.native
  /**
    * Specifies the AWS Glue Data Catalog table that contains the column information.
    */
  var SchemaConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.SchemaConfiguration] = js.native
}

object DataFormatConversionConfiguration {
  @scala.inline
  def apply(): DataFormatConversionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFormatConversionConfiguration]
  }
  @scala.inline
  implicit class DataFormatConversionConfigurationOps[Self <: DataFormatConversionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFormatConfiguration(value: InputFormatConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputFormatConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFormatConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputFormatConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFormatConfiguration(value: OutputFormatConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputFormatConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFormatConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputFormatConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaConfiguration(value: SchemaConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaConfiguration")(js.undefined)
        ret
    }
  }
  
}

