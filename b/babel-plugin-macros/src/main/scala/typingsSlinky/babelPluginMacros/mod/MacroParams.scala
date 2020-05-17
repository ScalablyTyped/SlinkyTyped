package typingsSlinky.babelPluginMacros.mod

import typingsSlinky.babelPluginMacros.anon.TypeofBabel
import typingsSlinky.babelPluginMacros.anon.defaultArrayNodePathNodeR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MacroParams extends js.Object {
  var babel: TypeofBabel = js.native
  var references: defaultArrayNodePathNodeR = js.native
  var state: js.Any = js.native
}

object MacroParams {
  @scala.inline
  def apply(babel: TypeofBabel, references: defaultArrayNodePathNodeR, state: js.Any): MacroParams = {
    val __obj = js.Dynamic.literal(babel = babel.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacroParams]
  }
  @scala.inline
  implicit class MacroParamsOps[Self <: MacroParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBabel(value: TypeofBabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("babel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferences(value: defaultArrayNodePathNodeR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

