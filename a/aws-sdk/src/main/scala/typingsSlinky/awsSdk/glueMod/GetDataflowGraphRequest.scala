package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataflowGraphRequest extends js.Object {
  /**
    * The Python script to transform.
    */
  var PythonScript: js.UndefOr[typingsSlinky.awsSdk.glueMod.PythonScript] = js.native
}

object GetDataflowGraphRequest {
  @scala.inline
  def apply(): GetDataflowGraphRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataflowGraphRequest]
  }
  @scala.inline
  implicit class GetDataflowGraphRequestOps[Self <: GetDataflowGraphRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPythonScript(value: PythonScript): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PythonScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPythonScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PythonScript")(js.undefined)
        ret
    }
  }
  
}

