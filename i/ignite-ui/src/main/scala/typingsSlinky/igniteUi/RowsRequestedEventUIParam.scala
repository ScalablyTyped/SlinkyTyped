package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowsRequestedEventUIParam extends js.Object {
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
  /**
  	 * Gets the requested rows.
  	 */
  var rows: js.UndefOr[js.Array[_]] = js.native
}

object RowsRequestedEventUIParam {
  @scala.inline
  def apply(): RowsRequestedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowsRequestedEventUIParam]
  }
  @scala.inline
  implicit class RowsRequestedEventUIParamOps[Self <: RowsRequestedEventUIParam] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withRows(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
  }
  
}

