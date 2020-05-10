package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParquetSerDe extends js.Object {
  /**
    * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding calculations.
    */
  var BlockSizeBytes: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.BlockSizeBytes] = js.native
  /**
    * The compression code to use over data blocks. The possible values are UNCOMPRESSED, SNAPPY, and GZIP, with the default being SNAPPY. Use SNAPPY for higher decompression speed. Use GZIP if the compression ratio is more important than speed.
    */
  var Compression: js.UndefOr[ParquetCompression] = js.native
  /**
    * Indicates whether to enable dictionary compression.
    */
  var EnableDictionaryCompression: js.UndefOr[BooleanObject] = js.native
  /**
    * The maximum amount of padding to apply. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 0.
    */
  var MaxPaddingBytes: js.UndefOr[NonNegativeIntegerObject] = js.native
  /**
    * The Parquet page size. Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
    */
  var PageSizeBytes: js.UndefOr[ParquetPageSizeBytes] = js.native
  /**
    * Indicates the version of row format to output. The possible values are V1 and V2. The default is V1.
    */
  var WriterVersion: js.UndefOr[ParquetWriterVersion] = js.native
}

object ParquetSerDe {
  @scala.inline
  def apply(): ParquetSerDe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParquetSerDe]
  }
  @scala.inline
  implicit class ParquetSerDeOps[Self <: ParquetSerDe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockSizeBytes(value: BlockSizeBytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockSizeBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withCompression(value: ParquetCompression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Compression")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDictionaryCompression(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDictionaryCompression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDictionaryCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDictionaryCompression")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPaddingBytes(value: NonNegativeIntegerObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxPaddingBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPaddingBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxPaddingBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSizeBytes(value: ParquetPageSizeBytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSizeBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withWriterVersion(value: ParquetWriterVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriterVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriterVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriterVersion")(js.undefined)
        ret
    }
  }
  
}

