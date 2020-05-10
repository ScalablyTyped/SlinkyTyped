package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputParallelism extends js.Object {
  /**
    * Number of in-application streams to create. For more information, see Limits. 
    */
  var Count: js.UndefOr[InputParallelismCount] = js.native
}

object InputParallelism {
  @scala.inline
  def apply(): InputParallelism = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputParallelism]
  }
  @scala.inline
  implicit class InputParallelismOps[Self <: InputParallelism] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: InputParallelismCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(js.undefined)
        ret
    }
  }
  
}

