package typingsSlinky.angularCompiler.compilerMod

import typingsSlinky.angularCompiler.compileMetadataMod.CompileInjectableMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgAnalyzedFile extends js.Object {
  var directives: js.Array[StaticSymbol]
  var exportsNonSourceFiles: Boolean
  var fileName: String
  var injectables: js.Array[CompileInjectableMetadata]
  var ngModules: js.Array[CompileNgModuleMetadata]
  var pipes: js.Array[StaticSymbol]
}

object NgAnalyzedFile {
  @scala.inline
  def apply(
    directives: js.Array[StaticSymbol],
    exportsNonSourceFiles: Boolean,
    fileName: String,
    injectables: js.Array[CompileInjectableMetadata],
    ngModules: js.Array[CompileNgModuleMetadata],
    pipes: js.Array[StaticSymbol]
  ): NgAnalyzedFile = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], exportsNonSourceFiles = exportsNonSourceFiles.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], injectables = injectables.asInstanceOf[js.Any], ngModules = ngModules.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgAnalyzedFile]
  }
  @scala.inline
  implicit class NgAnalyzedFileOps[Self <: NgAnalyzedFile] (val x: Self) extends AnyVal {
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
    def setDirectives(value: js.Array[StaticSymbol]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportsNonSourceFiles(value: Boolean): Self = this.set("exportsNonSourceFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setInjectables(value: js.Array[CompileInjectableMetadata]): Self = this.set("injectables", value.asInstanceOf[js.Any])
    @scala.inline
    def setNgModules(value: js.Array[CompileNgModuleMetadata]): Self = this.set("ngModules", value.asInstanceOf[js.Any])
    @scala.inline
    def setPipes(value: js.Array[StaticSymbol]): Self = this.set("pipes", value.asInstanceOf[js.Any])
  }
  
}

