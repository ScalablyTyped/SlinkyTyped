package typingsSlinky.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferOptions extends js.Object {
  /**
    * Whether objects should be deleted from the source after they are
    * transferred to the sink.  Note that this option and
    * `deleteObjectsUniqueInSink` are mutually exclusive.
    */
  var deleteObjectsFromSourceAfterTransfer: js.UndefOr[Boolean] = js.native
  /**
    * Whether objects that exist only in the sink should be deleted.  Note that
    * this option and `deleteObjectsFromSourceAfterTransfer` are mutually
    * exclusive.
    */
  var deleteObjectsUniqueInSink: js.UndefOr[Boolean] = js.native
  /** Whether overwriting objects that already exist in the sink is allowed. */
  var overwriteObjectsAlreadyExistingInSink: js.UndefOr[Boolean] = js.native
}

object TransferOptions {
  @scala.inline
  def apply(): TransferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferOptions]
  }
  @scala.inline
  implicit class TransferOptionsOps[Self <: TransferOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteObjectsFromSourceAfterTransfer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteObjectsFromSourceAfterTransfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteObjectsFromSourceAfterTransfer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteObjectsFromSourceAfterTransfer")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteObjectsUniqueInSink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteObjectsUniqueInSink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteObjectsUniqueInSink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteObjectsUniqueInSink")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwriteObjectsAlreadyExistingInSink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwriteObjectsAlreadyExistingInSink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwriteObjectsAlreadyExistingInSink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwriteObjectsAlreadyExistingInSink")(js.undefined)
        ret
    }
  }
  
}

