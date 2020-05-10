package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptBootstrapActionConfig extends js.Object {
  /**
    * A list of command line arguments to pass to the bootstrap action script.
    */
  var Args: js.UndefOr[XmlStringList] = js.native
  /**
    * Location of the script to run during a bootstrap action. Can be either a location in Amazon S3 or on a local file system.
    */
  var Path: XmlString = js.native
}

object ScriptBootstrapActionConfig {
  @scala.inline
  def apply(Path: XmlString): ScriptBootstrapActionConfig = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptBootstrapActionConfig]
  }
  @scala.inline
  implicit class ScriptBootstrapActionConfigOps[Self <: ScriptBootstrapActionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: XmlStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Args")(js.undefined)
        ret
    }
  }
  
}

