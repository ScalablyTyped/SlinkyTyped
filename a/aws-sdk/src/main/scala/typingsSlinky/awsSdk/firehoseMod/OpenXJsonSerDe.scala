package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenXJsonSerDe extends js.Object {
  /**
    * When set to true, which is the default, Kinesis Data Firehose converts JSON keys to lowercase before deserializing them.
    */
  var CaseInsensitive: js.UndefOr[BooleanObject] = js.native
  /**
    * Maps column names to JSON keys that aren't identical to the column names. This is useful when the JSON contains keys that are Hive keywords. For example, timestamp is a Hive keyword. If you have a JSON key named timestamp, set this parameter to {"ts": "timestamp"} to map this key to a column named ts.
    */
  var ColumnToJsonKeyMappings: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ColumnToJsonKeyMappings] = js.native
  /**
    * When set to true, specifies that the names of the keys include dots and that you want Kinesis Data Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in column names. For example, if the JSON contains a key whose name is "a.b", you can define the column name to be "a_b" when using this option. The default is false.
    */
  var ConvertDotsInJsonKeysToUnderscores: js.UndefOr[BooleanObject] = js.native
}

object OpenXJsonSerDe {
  @scala.inline
  def apply(): OpenXJsonSerDe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenXJsonSerDe]
  }
  @scala.inline
  implicit class OpenXJsonSerDeOps[Self <: OpenXJsonSerDe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseInsensitive(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaseInsensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseInsensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaseInsensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnToJsonKeyMappings(value: ColumnToJsonKeyMappings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnToJsonKeyMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnToJsonKeyMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnToJsonKeyMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertDotsInJsonKeysToUnderscores(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConvertDotsInJsonKeysToUnderscores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertDotsInJsonKeysToUnderscores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConvertDotsInJsonKeysToUnderscores")(js.undefined)
        ret
    }
  }
  
}

