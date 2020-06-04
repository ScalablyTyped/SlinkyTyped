package typingsSlinky.angularCompiler.compilerMod

import typingsSlinky.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgAnalyzedModules extends js.Object {
  var files: js.Array[NgAnalyzedFile]
  var ngModuleByPipeOrDirective: Map[StaticSymbol, CompileNgModuleMetadata]
  var ngModules: js.Array[CompileNgModuleMetadata]
  var symbolsMissingModule: js.UndefOr[js.Array[StaticSymbol]] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFiles(value: js.Array[NgAnalyzedFile]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setNgModuleByPipeOrDirective(value: Map[StaticSymbol, CompileNgModuleMetadata]): Self = this.set("ngModuleByPipeOrDirective", value.asInstanceOf[js.Any])
    @scala.inline
    def setNgModules(value: js.Array[CompileNgModuleMetadata]): Self = this.set("ngModules", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbolsMissingModule(value: js.Array[StaticSymbol]): Self = this.set("symbolsMissingModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolsMissingModule: Self = this.set("symbolsMissingModule", js.undefined)
  }
  
}

