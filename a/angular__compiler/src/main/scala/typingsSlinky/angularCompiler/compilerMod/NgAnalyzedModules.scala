package typingsSlinky.angularCompiler.compilerMod

import typingsSlinky.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NgAnalyzedModules extends js.Object {
  var files: js.Array[NgAnalyzedFile] = js.native
  var ngModuleByPipeOrDirective: Map[StaticSymbol, CompileNgModuleMetadata] = js.native
  var ngModules: js.Array[CompileNgModuleMetadata] = js.native
  var symbolsMissingModule: js.UndefOr[js.Array[StaticSymbol]] = js.native
}

object NgAnalyzedModules {
  @scala.inline
  def apply(
    files: js.Array[NgAnalyzedFile],
    ngModuleByPipeOrDirective: Map[StaticSymbol, CompileNgModuleMetadata],
    ngModules: js.Array[CompileNgModuleMetadata]
  ): NgAnalyzedModules = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], ngModuleByPipeOrDirective = ngModuleByPipeOrDirective.asInstanceOf[js.Any], ngModules = ngModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgAnalyzedModules]
  }
  @scala.inline
  implicit class NgAnalyzedModulesOps[Self <: NgAnalyzedModules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: js.Array[NgAnalyzedFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNgModuleByPipeOrDirective(value: Map[StaticSymbol, CompileNgModuleMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngModuleByPipeOrDirective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNgModules(value: js.Array[CompileNgModuleMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbolsMissingModule(value: js.Array[StaticSymbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolsMissingModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolsMissingModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolsMissingModule")(js.undefined)
        ret
    }
  }
  
}

