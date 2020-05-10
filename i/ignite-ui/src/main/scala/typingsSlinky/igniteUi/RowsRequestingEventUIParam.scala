package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowsRequestingEventUIParam extends js.Object {
  /**
  	 * Gets the next chunk index.
  	 */
  var chunkIndex: js.UndefOr[Double] = js.native
  /**
  	 * Gets the chunk size.
  	 */
  var chunkSize: js.UndefOr[Double] = js.native
  /**
  	 * Gets a reference to igGridAppendRowsOnDemand.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object RowsRequestingEventUIParam {
  @scala.inline
  def apply(): RowsRequestingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowsRequestingEventUIParam]
  }
  @scala.inline
  implicit class RowsRequestingEventUIParamOps[Self <: RowsRequestingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

