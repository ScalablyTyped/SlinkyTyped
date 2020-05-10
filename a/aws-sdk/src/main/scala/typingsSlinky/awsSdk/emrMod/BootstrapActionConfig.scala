package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapActionConfig extends js.Object {
  /**
    * The name of the bootstrap action.
    */
  var Name: XmlStringMaxLen256 = js.native
  /**
    * The script run by the bootstrap action.
    */
  var ScriptBootstrapAction: ScriptBootstrapActionConfig = js.native
}

object BootstrapActionConfig {
  @scala.inline
  def apply(Name: XmlStringMaxLen256, ScriptBootstrapAction: ScriptBootstrapActionConfig): BootstrapActionConfig = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ScriptBootstrapAction = ScriptBootstrapAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapActionConfig]
  }
  @scala.inline
  implicit class BootstrapActionConfigOps[Self <: BootstrapActionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptBootstrapAction(value: ScriptBootstrapActionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScriptBootstrapAction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

