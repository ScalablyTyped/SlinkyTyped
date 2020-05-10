package typingsSlinky.angularCompiler.compilerMod

import typingsSlinky.angularCompiler.compileMetadataMod.CompileInjectableMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NgAnalyzedFile extends js.Object {
  var directives: js.Array[StaticSymbol] = js.native
  var exportsNonSourceFiles: Boolean = js.native
  var fileName: String = js.native
  var injectables: js.Array[CompileInjectableMetadata] = js.native
  var ngModules: js.Array[CompileNgModuleMetadata] = js.native
  var pipes: js.Array[StaticSymbol] = js.native
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
    def withDirectives(value: js.Array[StaticSymbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportsNonSourceFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportsNonSourceFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInjectables(value: js.Array[CompileInjectableMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNgModules(value: js.Array[CompileNgModuleMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipes(value: js.Array[StaticSymbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

