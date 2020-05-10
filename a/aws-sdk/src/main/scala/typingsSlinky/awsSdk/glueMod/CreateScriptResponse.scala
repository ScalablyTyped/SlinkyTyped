package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateScriptResponse extends js.Object {
  /**
    * The Python script generated from the DAG.
    */
  var PythonScript: js.UndefOr[typingsSlinky.awsSdk.glueMod.PythonScript] = js.native
  /**
    * The Scala code generated from the DAG.
    */
  var ScalaCode: js.UndefOr[typingsSlinky.awsSdk.glueMod.ScalaCode] = js.native
}

object CreateScriptResponse {
  @scala.inline
  def apply(): CreateScriptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateScriptResponse]
  }
  @scala.inline
  implicit class CreateScriptResponseOps[Self <: CreateScriptResponse] (val x: Self) extends AnyVal {
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

