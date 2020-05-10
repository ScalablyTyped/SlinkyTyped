package typingsSlinky.pulumiAws.inputMod.kinesis

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe extends js.Object {
  /**
    * When set to true, which is the default, Kinesis Data Firehose converts JSON keys to lowercase before deserializing them.
    */
  var caseInsensitive: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A map of column names to JSON keys that aren't identical to the column names. This is useful when the JSON contains keys that are Hive keywords. For example, timestamp is a Hive keyword. If you have a JSON key named timestamp, set this parameter to `{ ts = "timestamp" }` to map this key to a column named ts.
    */
  var columnToJsonKeyMappings: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * When set to `true`, specifies that the names of the keys include dots and that you want Kinesis Data Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in column names. For example, if the JSON contains a key whose name is "a.b", you can define the column name to be "aB" when using this option. Defaults to `false`.
    */
  var convertDotsInJsonKeysToUnderscores: js.UndefOr[Input[Boolean]] = js.native
}

object FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe {
  @scala.inline
  def apply(): FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe]
  }
  @scala.inline
  implicit class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeOps[Self <: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseInsensitive(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseInsensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseInsensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseInsensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnToJsonKeyMappings(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnToJsonKeyMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnToJsonKeyMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnToJsonKeyMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertDotsInJsonKeysToUnderscores(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertDotsInJsonKeysToUnderscores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertDotsInJsonKeysToUnderscores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertDotsInJsonKeysToUnderscores")(js.undefined)
        ret
    }
  }
  
}

