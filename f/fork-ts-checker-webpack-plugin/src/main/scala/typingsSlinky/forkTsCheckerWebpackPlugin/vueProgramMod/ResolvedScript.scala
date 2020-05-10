package typingsSlinky.forkTsCheckerWebpackPlugin.vueProgramMod

import typingsSlinky.typescript.mod.ScriptKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedScript extends js.Object {
  var content: String = js.native
  var scriptKind: ScriptKind = js.native
}

object ResolvedScript {
  @scala.inline
  def apply(content: String, scriptKind: ScriptKind): ResolvedScript = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], scriptKind = scriptKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedScript]
  }
  @scala.inline
  implicit class ResolvedScriptOps[Self <: ResolvedScript] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptKind(value: ScriptKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptKind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

