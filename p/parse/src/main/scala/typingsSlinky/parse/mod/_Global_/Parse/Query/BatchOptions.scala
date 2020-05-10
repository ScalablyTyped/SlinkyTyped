package typingsSlinky.parse.mod._Global_.Parse.Query

import typingsSlinky.parse.mod._Global_.Parse.FullOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchOptions extends FullOptions {
  var batchSize: js.UndefOr[Double] = js.native
}

object BatchOptions {
  @scala.inline
  def apply(): BatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchOptions]
  }
  @scala.inline
  implicit class BatchOptionsOps[Self <: BatchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(js.undefined)
        ret
    }
  }
  
}

