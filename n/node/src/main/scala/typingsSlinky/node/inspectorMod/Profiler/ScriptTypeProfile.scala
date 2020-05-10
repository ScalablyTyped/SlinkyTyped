package typingsSlinky.node.inspectorMod.Profiler

import typingsSlinky.node.inspectorMod.Runtime.ScriptId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type profile data collected during runtime for a JavaScript script.
  * @experimental
  */
@js.native
trait ScriptTypeProfile extends js.Object {
  /**
    * Type profile entries for parameters and return values of the functions in the script.
    */
  var entries: js.Array[TypeProfileEntry] = js.native
  /**
    * JavaScript script id.
    */
  var scriptId: ScriptId = js.native
  /**
    * JavaScript script name or url.
    */
  var url: String = js.native
}

object ScriptTypeProfile {
  @scala.inline
  def apply(entries: js.Array[TypeProfileEntry], scriptId: ScriptId, url: String): ScriptTypeProfile = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptTypeProfile]
  }
  @scala.inline
  implicit class ScriptTypeProfileOps[Self <: ScriptTypeProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: js.Array[TypeProfileEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptId(value: ScriptId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

