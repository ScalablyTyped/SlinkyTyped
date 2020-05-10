package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPlanResponse extends js.Object {
  /**
    * A Python script to perform the mapping.
    */
  var PythonScript: js.UndefOr[typingsSlinky.awsSdk.glueMod.PythonScript] = js.native
  /**
    * The Scala code to perform the mapping.
    */
  var ScalaCode: js.UndefOr[typingsSlinky.awsSdk.glueMod.ScalaCode] = js.native
}

object GetPlanResponse {
  @scala.inline
  def apply(): GetPlanResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPlanResponse]
  }
  @scala.inline
  implicit class GetPlanResponseOps[Self <: GetPlanResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withScalaCode(value: ScalaCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalaCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalaCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalaCode")(js.undefined)
        ret
    }
  }
  
}

