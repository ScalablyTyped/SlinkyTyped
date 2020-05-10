package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBuiltInVariableResponse extends js.Object {
  /** List of created built-in variables. */
  var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.native
}

object CreateBuiltInVariableResponse {
  @scala.inline
  def apply(): CreateBuiltInVariableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBuiltInVariableResponse]
  }
  @scala.inline
  implicit class CreateBuiltInVariableResponseOps[Self <: CreateBuiltInVariableResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuiltInVariable(value: js.Array[BuiltInVariable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtInVariable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuiltInVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtInVariable")(js.undefined)
        ret
    }
  }
  
}

