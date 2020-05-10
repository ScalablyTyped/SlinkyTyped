package typingsSlinky.nodeSnap7.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiVarsReadResult extends js.Object {
   //Error Code
  var Data: Buffer = js.native
  var Result: Double = js.native
}

object MultiVarsReadResult {
  @scala.inline
  def apply(Data: Buffer, Result: Double): MultiVarsReadResult = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiVarsReadResult]
  }
  @scala.inline
  implicit class MultiVarsReadResultOps[Self <: MultiVarsReadResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

