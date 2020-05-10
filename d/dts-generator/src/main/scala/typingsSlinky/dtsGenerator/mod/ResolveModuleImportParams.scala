package typingsSlinky.dtsGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveModuleImportParams extends js.Object {
  /** The identifier of the enclosing module currently being declared in the generated d.ts */
  var currentModuleId: String = js.native
  /** The identifier of the module currently being imported in the generated d.ts */
  var importedModuleId: String = js.native
  /** True if the imported module id is declared as a module in the input files. */
  var isDeclaredExternalModule: Boolean = js.native
}

object ResolveModuleImportParams {
  @scala.inline
  def apply(currentModuleId: String, importedModuleId: String, isDeclaredExternalModule: Boolean): ResolveModuleImportParams = {
    val __obj = js.Dynamic.literal(currentModuleId = currentModuleId.asInstanceOf[js.Any], importedModuleId = importedModuleId.asInstanceOf[js.Any], isDeclaredExternalModule = isDeclaredExternalModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveModuleImportParams]
  }
  @scala.inline
  implicit class ResolveModuleImportParamsOps[Self <: ResolveModuleImportParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentModuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentModuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportedModuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importedModuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDeclaredExternalModule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeclaredExternalModule")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

