package typingsSlinky.agGrid.exportParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportParams[T] extends BaseExportParams {
  var customFooter: js.UndefOr[T] = js.native
  var customHeader: js.UndefOr[T] = js.native
}

object ExportParams {
  @scala.inline
  def apply[T](): ExportParams[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportParams[T]]
  }
  @scala.inline
  implicit class ExportParamsOps[Self[t] <: ExportParams[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCustomFooter(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFooter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomHeader(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomHeader: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeader")(js.undefined)
        ret
    }
  }
  
}

