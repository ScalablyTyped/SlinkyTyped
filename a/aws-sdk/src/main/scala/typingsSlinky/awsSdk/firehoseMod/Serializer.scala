package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Serializer extends js.Object {
  /**
    * A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more information, see Apache ORC.
    */
  var OrcSerDe: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.OrcSerDe] = js.native
  /**
    * A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more information, see Apache Parquet.
    */
  var ParquetSerDe: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ParquetSerDe] = js.native
}

object Serializer {
  @scala.inline
  def apply(): Serializer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Serializer]
  }
  @scala.inline
  implicit class SerializerOps[Self <: Serializer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrcSerDe(value: OrcSerDe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrcSerDe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrcSerDe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrcSerDe")(js.undefined)
        ret
    }
    @scala.inline
    def withParquetSerDe(value: ParquetSerDe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParquetSerDe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParquetSerDe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParquetSerDe")(js.undefined)
        ret
    }
  }
  
}

