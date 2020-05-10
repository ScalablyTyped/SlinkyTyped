package typingsSlinky.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferCounters extends js.Object {
  /** Bytes that are copied to the data sink. */
  var bytesCopiedToSink: js.UndefOr[String] = js.native
  /** Bytes that are deleted from the data sink. */
  var bytesDeletedFromSink: js.UndefOr[String] = js.native
  /** Bytes that are deleted from the data source. */
  var bytesDeletedFromSource: js.UndefOr[String] = js.native
  /** Bytes that failed to be deleted from the data sink. */
  var bytesFailedToDeleteFromSink: js.UndefOr[String] = js.native
  /**
    * Bytes found in the data source that are scheduled to be transferred,
    * which will be copied, excluded based on conditions, or skipped due to
    * failures.
    */
  var bytesFoundFromSource: js.UndefOr[String] = js.native
  /** Bytes found only in the data sink that are scheduled to be deleted. */
  var bytesFoundOnlyFromSink: js.UndefOr[String] = js.native
  /** Bytes in the data source that failed during the transfer. */
  var bytesFromSourceFailed: js.UndefOr[String] = js.native
  /**
    * Bytes in the data source that are not transferred because they already
    * exist in the data sink.
    */
  var bytesFromSourceSkippedBySync: js.UndefOr[String] = js.native
  /** Objects that are copied to the data sink. */
  var objectsCopiedToSink: js.UndefOr[String] = js.native
  /** Objects that are deleted from the data sink. */
  var objectsDeletedFromSink: js.UndefOr[String] = js.native
  /** Objects that are deleted from the data source. */
  var objectsDeletedFromSource: js.UndefOr[String] = js.native
  /** Objects that failed to be deleted from the data sink. */
  var objectsFailedToDeleteFromSink: js.UndefOr[String] = js.native
  /**
    * Objects found in the data source that are scheduled to be transferred,
    * which will be copied, excluded based on conditions, or skipped due to
    * failures.
    */
  var objectsFoundFromSource: js.UndefOr[String] = js.native
  /** Objects found only in the data sink that are scheduled to be deleted. */
  var objectsFoundOnlyFromSink: js.UndefOr[String] = js.native
  /** Objects in the data source that failed during the transfer. */
  var objectsFromSourceFailed: js.UndefOr[String] = js.native
  /**
    * Objects in the data source that are not transferred because they already
    * exist in the data sink.
    */
  var objectsFromSourceSkippedBySync: js.UndefOr[String] = js.native
}

object TransferCounters {
  @scala.inline
  def apply(): TransferCounters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferCounters]
  }
  @scala.inline
  implicit class TransferCountersOps[Self <: TransferCounters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesCopiedToSink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesCopiedToSink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesCopiedToSink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesCopiedToSink")(js.undefined)
        ret
    }
    @scala.inline
    def withBytesDeletedFromSink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesDeletedFromSink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesDeletedFromSink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesDeletedFromSink")(js.undefined)
        ret
    }
    @scala.inline
    def withBytesDeletedFromSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesDeletedFromSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesDeletedFromSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesDeletedFromSource")(js.undefined)
        ret
    }
    @scala.inline
    def withBytesFailedToDeleteFromSink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesFailedToDeleteFromSink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesFailedToDeleteFromSink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesFailedToDeleteFromSink")(js.undefined)
        ret
    }
    @scala.inline
    def withBytesFoundFromSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesFoundFromSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesFoundFromSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesFoundFromSource")(js.undefined)
        ret
    }
    @scala.inline
    def withBytesFoundOnlyFromSink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesFoundOnlyFromSink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesFoundOnlyFromSink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesFoundOnlyFromSink")(js.undefined)
        ret
    }
    @scala.inline
    def withBytesFromSourceFailed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesFromSourceFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesFromSourceFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesFromSourceFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withBytesFromSourceSkippedBySync(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesFromSourceSkippedBySync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesFromSourceSkippedBySync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesFromSourceSkippedBySync")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectsCopiedToSink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectsCopiedToSink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectsCopiedToSink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectsCopiedToSink")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectsDeletedFromSink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectsDeletedFromSink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectsDeletedFromSink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectsDeletedFromSink")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectsDeletedFromSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectsDeletedFromSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectsDeletedFromSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectsDeletedFromSource")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectsFailedToDeleteFromSink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectsFailedToDeleteFromSink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectsFailedToDeleteFromSink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectsFailedToDeleteFromSink")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectsFoundFromSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectsFoundFromSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectsFoundFromSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectsFoundFromSource")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectsFoundOnlyFromSink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectsFoundOnlyFromSink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectsFoundOnlyFromSink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectsFoundOnlyFromSink")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectsFromSourceFailed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectsFromSourceFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectsFromSourceFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectsFromSourceFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectsFromSourceSkippedBySync(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectsFromSourceSkippedBySync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectsFromSourceSkippedBySync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectsFromSourceSkippedBySync")(js.undefined)
        ret
    }
  }
  
}

