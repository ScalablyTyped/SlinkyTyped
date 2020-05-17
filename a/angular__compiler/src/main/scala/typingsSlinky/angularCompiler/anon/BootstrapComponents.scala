package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.compileMetadataMod.CompileEntryComponentMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileIdentifierMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileNgModuleSummary
import typingsSlinky.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileTypeMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.TransitiveCompileNgModuleMetadata
import typingsSlinky.angularCompiler.coreMod.SchemaMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapComponents extends js.Object {
  var bootstrapComponents: js.Array[CompileIdentifierMetadata] = js.native
  var declaredDirectives: js.Array[CompileIdentifierMetadata] = js.native
  var declaredPipes: js.Array[CompileIdentifierMetadata] = js.native
  var entryComponents: js.Array[CompileEntryComponentMetadata] = js.native
  var exportedDirectives: js.Array[CompileIdentifierMetadata] = js.native
  var exportedModules: js.Array[CompileNgModuleSummary] = js.native
  var exportedPipes: js.Array[CompileIdentifierMetadata] = js.native
  var id: String | Null = js.native
  var importedModules: js.Array[CompileNgModuleSummary] = js.native
  var providers: js.Array[CompileProviderMetadata] = js.native
  var schemas: js.Array[SchemaMetadata] = js.native
  var transitiveModule: TransitiveCompileNgModuleMetadata = js.native
  var `type`: CompileTypeMetadata = js.native
}

object BootstrapComponents {
  @scala.inline
  def apply(
    bootstrapComponents: js.Array[CompileIdentifierMetadata],
    declaredDirectives: js.Array[CompileIdentifierMetadata],
    declaredPipes: js.Array[CompileIdentifierMetadata],
    entryComponents: js.Array[CompileEntryComponentMetadata],
    exportedDirectives: js.Array[CompileIdentifierMetadata],
    exportedModules: js.Array[CompileNgModuleSummary],
    exportedPipes: js.Array[CompileIdentifierMetadata],
    importedModules: js.Array[CompileNgModuleSummary],
    providers: js.Array[CompileProviderMetadata],
    schemas: js.Array[SchemaMetadata],
    transitiveModule: TransitiveCompileNgModuleMetadata,
    `type`: CompileTypeMetadata
  ): BootstrapComponents = {
    val __obj = js.Dynamic.literal(bootstrapComponents = bootstrapComponents.asInstanceOf[js.Any], declaredDirectives = declaredDirectives.asInstanceOf[js.Any], declaredPipes = declaredPipes.asInstanceOf[js.Any], entryComponents = entryComponents.asInstanceOf[js.Any], exportedDirectives = exportedDirectives.asInstanceOf[js.Any], exportedModules = exportedModules.asInstanceOf[js.Any], exportedPipes = exportedPipes.asInstanceOf[js.Any], importedModules = importedModules.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], transitiveModule = transitiveModule.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapComponents]
  }
  @scala.inline
  implicit class BootstrapComponentsOps[Self <: BootstrapComponents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBootstrapComponents(value: js.Array[CompileIdentifierMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclaredDirectives(value: js.Array[CompileIdentifierMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaredDirectives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclaredPipes(value: js.Array[CompileIdentifierMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaredPipes")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withExportedModules(value: js.Array[CompileNgModuleSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportedModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportedPipes(value: js.Array[CompileIdentifierMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportedPipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportedModules(value: js.Array[CompileNgModuleSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importedModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviders(value: js.Array[CompileProviderMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemas(value: js.Array[SchemaMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitiveModule(value: TransitiveCompileNgModuleMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitiveModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: CompileTypeMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(null)
        ret
    }
  }
  
}

