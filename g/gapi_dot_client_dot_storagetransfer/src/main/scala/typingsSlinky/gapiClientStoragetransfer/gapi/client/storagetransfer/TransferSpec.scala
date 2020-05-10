package typingsSlinky.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferSpec extends js.Object {
  /** An AWS S3 data source. */
  var awsS3DataSource: js.UndefOr[AwsS3Data] = js.native
  /** A Google Cloud Storage data sink. */
  var gcsDataSink: js.UndefOr[GcsData] = js.native
  /** A Google Cloud Storage data source. */
  var gcsDataSource: js.UndefOr[GcsData] = js.native
  /** An HTTP URL data source. */
  var httpDataSource: js.UndefOr[HttpData] = js.native
  /**
    * Only objects that satisfy these object conditions are included in the set
    * of data source and data sink objects.  Object conditions based on
    * objects' `lastModificationTime` do not exclude objects in a data sink.
    */
  var objectConditions: js.UndefOr[ObjectConditions] = js.native
  /**
    * If the option `deleteObjectsUniqueInSink` is `true`, object conditions
    * based on objects' `lastModificationTime` are ignored and do not exclude
    * objects in a data source or a data sink.
    */
  var transferOptions: js.UndefOr[TransferOptions] = js.native
}

object TransferSpec {
  @scala.inline
  def apply(): TransferSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferSpec]
  }
  @scala.inline
  implicit class TransferSpecOps[Self <: TransferSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsS3DataSource(value: AwsS3Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsS3DataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsS3DataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsS3DataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withGcsDataSink(value: GcsData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsDataSink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcsDataSink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsDataSink")(js.undefined)
        ret
    }
    @scala.inline
    def withGcsDataSource(value: GcsData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsDataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcsDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsDataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpDataSource(value: HttpData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpDataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpDataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectConditions(value: ObjectConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectConditions")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferOptions(value: TransferOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferOptions")(js.undefined)
        ret
    }
  }
  
}

