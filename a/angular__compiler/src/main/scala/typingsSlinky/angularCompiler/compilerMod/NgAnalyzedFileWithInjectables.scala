package typingsSlinky.angularCompiler.compilerMod

import typingsSlinky.angularCompiler.compileMetadataMod.CompileInjectableMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileShallowModuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NgAnalyzedFileWithInjectables extends js.Object {
  var fileName: String = js.native
  var injectables: js.Array[CompileInjectableMetadata] = js.native
  var shallowModules: js.Array[CompileShallowModuleMetadata] = js.native
}

object NgAnalyzedFileWithInjectables {
  @scala.inline
  def apply(
    fileName: String,
    injectables: js.Array[CompileInjectableMetadata],
    shallowModules: js.Array[CompileShallowModuleMetadata]
  ): NgAnalyzedFileWithInjectables = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], injectables = injectables.asInstanceOf[js.Any], shallowModules = shallowModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgAnalyzedFileWithInjectables]
  }
  @scala.inline
  implicit class NgAnalyzedFileWithInjectablesOps[Self <: NgAnalyzedFileWithInjectables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withShallowModules(value: js.Array[CompileShallowModuleMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shallowModules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

