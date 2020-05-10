package typingsSlinky.artillery.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScenarioContext extends js.Object {
  var vars: StringDictionary[js.Any] = js.native
}

object ScenarioContext {
  @scala.inline
  def apply(vars: StringDictionary[js.Any]): ScenarioContext = {
    val __obj = js.Dynamic.literal(vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScenarioContext]
  }
  @scala.inline
  implicit class ScenarioContextOps[Self <: ScenarioContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVars(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vars")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

