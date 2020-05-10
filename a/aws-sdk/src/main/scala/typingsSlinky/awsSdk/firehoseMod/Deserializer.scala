package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deserializer extends js.Object {
  /**
    * The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose, depending on which one offers the functionality you need. The other option is the OpenX SerDe.
    */
  var HiveJsonSerDe: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.HiveJsonSerDe] = js.native
  /**
    * The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose, depending on which one offers the functionality you need. The other option is the native Hive / HCatalog JsonSerDe.
    */
  var OpenXJsonSerDe: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.OpenXJsonSerDe] = js.native
}

object Deserializer {
  @scala.inline
  def apply(): Deserializer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deserializer]
  }
  @scala.inline
  implicit class DeserializerOps[Self <: Deserializer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHiveJsonSerDe(value: HiveJsonSerDe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HiveJsonSerDe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiveJsonSerDe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HiveJsonSerDe")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenXJsonSerDe(value: OpenXJsonSerDe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenXJsonSerDe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenXJsonSerDe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenXJsonSerDe")(js.undefined)
        ret
    }
  }
  
}

