package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAllocateInfo extends js.Object {
  /**
    * A list of label keys that were unused by the server in processing the
    * request. Thus, for similar requests repeated in a certain future time
    * window, the caller can choose to ignore these labels in the requests to
    * achieve better client-side cache hits and quota aggregation.
    */
  var unusedArguments: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAllocateInfo {
  @scala.inline
  def apply(): SchemaAllocateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocateInfo]
  }
  @scala.inline
  implicit class SchemaAllocateInfoOps[Self <: SchemaAllocateInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnusedArguments(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unusedArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnusedArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unusedArguments")(js.undefined)
        ret
    }
  }
  
}

