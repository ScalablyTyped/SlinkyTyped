package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.compilerMod.NgAnalyzedFileWithInjectables
import typingsSlinky.angularCompiler.compilerMod.NgAnalyzedModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyzedInjectables extends js.Object {
  var analyzedInjectables: js.Array[NgAnalyzedFileWithInjectables] = js.native
  var analyzedModules: NgAnalyzedModules = js.native
}

object AnalyzedInjectables {
  @scala.inline
  def apply(analyzedInjectables: js.Array[NgAnalyzedFileWithInjectables], analyzedModules: NgAnalyzedModules): AnalyzedInjectables = {
    val __obj = js.Dynamic.literal(analyzedInjectables = analyzedInjectables.asInstanceOf[js.Any], analyzedModules = analyzedModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzedInjectables]
  }
  @scala.inline
  implicit class AnalyzedInjectablesOps[Self <: AnalyzedInjectables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyzedInjectables(value: js.Array[NgAnalyzedFileWithInjectables]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzedInjectables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnalyzedModules(value: NgAnalyzedModules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzedModules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

