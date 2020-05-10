package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputParallelismUpdate extends js.Object {
  /**
    * The number of in-application streams to create for the specified streaming source.
    */
  var CountUpdate: InputParallelismCount = js.native
}

object InputParallelismUpdate {
  @scala.inline
  def apply(CountUpdate: InputParallelismCount): InputParallelismUpdate = {
    val __obj = js.Dynamic.literal(CountUpdate = CountUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParallelismUpdate]
  }
  @scala.inline
  implicit class InputParallelismUpdateOps[Self <: InputParallelismUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountUpdate(value: InputParallelismCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountUpdate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

