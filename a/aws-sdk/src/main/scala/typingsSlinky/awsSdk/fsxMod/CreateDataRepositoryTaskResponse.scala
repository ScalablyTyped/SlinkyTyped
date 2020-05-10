package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataRepositoryTaskResponse extends js.Object {
  /**
    * The description of the data repository task that you just created.
    */
  var DataRepositoryTask: js.UndefOr[typingsSlinky.awsSdk.fsxMod.DataRepositoryTask] = js.native
}

object CreateDataRepositoryTaskResponse {
  @scala.inline
  def apply(): CreateDataRepositoryTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDataRepositoryTaskResponse]
  }
  @scala.inline
  implicit class CreateDataRepositoryTaskResponseOps[Self <: CreateDataRepositoryTaskResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataRepositoryTask(value: DataRepositoryTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataRepositoryTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataRepositoryTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataRepositoryTask")(js.undefined)
        ret
    }
  }
  
}

