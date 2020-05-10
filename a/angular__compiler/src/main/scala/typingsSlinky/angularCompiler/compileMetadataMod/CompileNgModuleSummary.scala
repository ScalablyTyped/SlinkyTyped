package typingsSlinky.angularCompiler.compileMetadataMod

import typingsSlinky.angularCompiler.AnonModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileNgModuleSummary extends CompileTypeSummary {
  var entryComponents: js.Array[CompileEntryComponentMetadata] = js.native
  var exportedDirectives: js.Array[CompileIdentifierMetadata] = js.native
  var exportedPipes: js.Array[CompileIdentifierMetadata] = js.native
  var modules: js.Array[CompileTypeMetadata] = js.native
  var providers: js.Array[AnonModule] = js.native
}

object CompileNgModuleSummary {
  @scala.inline
  def apply(
    entryComponents: js.Array[CompileEntryComponentMetadata],
    exportedDirectives: js.Array[CompileIdentifierMetadata],
    exportedPipes: js.Array[CompileIdentifierMetadata],
    modules: js.Array[CompileTypeMetadata],
    providers: js.Array[AnonModule],
    `type`: CompileTypeMetadata
  ): CompileNgModuleSummary = {
    val __obj = js.Dynamic.literal(entryComponents = entryComponents.asInstanceOf[js.Any], exportedDirectives = exportedDirectives.asInstanceOf[js.Any], exportedPipes = exportedPipes.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileNgModuleSummary]
  }
  @scala.inline
  implicit class CompileNgModuleSummaryOps[Self <: CompileNgModuleSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntryComponents(value: js.Array[CompileEntryComponentMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportedDirectives(value: js.Array[CompileIdentifierMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportedDirectives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportedPipes(value: js.Array[CompileIdentifierMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportedPipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModules(value: js.Array[CompileTypeMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviders(value: js.Array[AnonModule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

