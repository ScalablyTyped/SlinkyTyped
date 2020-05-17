package typingsSlinky.angularCompiler.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.compileMetadataMod.CompileEntryComponentMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileQueryMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileTemplateMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileTypeMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.ProxyClass
import typingsSlinky.angularCompiler.coreMod.ChangeDetectionStrategy
import typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeDetection extends js.Object {
  var changeDetection: ChangeDetectionStrategy | Null = js.native
  var componentFactory: StaticSymbol | js.Object | Null = js.native
  var componentViewType: StaticSymbol | ProxyClass | Null = js.native
  var entryComponents: js.Array[CompileEntryComponentMetadata] = js.native
  var exportAs: String | Null = js.native
  var guards: StringDictionary[js.Any] = js.native
  var host: StringDictionary[String] = js.native
  var inputs: js.Array[String] = js.native
  var isComponent: Boolean = js.native
  var isHost: Boolean = js.native
  var outputs: js.Array[String] = js.native
  var providers: js.Array[CompileProviderMetadata] = js.native
  var queries: js.Array[CompileQueryMetadata] = js.native
  var rendererType: StaticSymbol | js.Object | Null = js.native
  var selector: String | Null = js.native
  var template: CompileTemplateMetadata = js.native
  var `type`: CompileTypeMetadata = js.native
  var viewProviders: js.Array[CompileProviderMetadata] = js.native
  var viewQueries: js.Array[CompileQueryMetadata] = js.native
}

object ChangeDetection {
  @scala.inline
  def apply(
    entryComponents: js.Array[CompileEntryComponentMetadata],
    guards: StringDictionary[js.Any],
    host: StringDictionary[String],
    inputs: js.Array[String],
    isComponent: Boolean,
    isHost: Boolean,
    outputs: js.Array[String],
    providers: js.Array[CompileProviderMetadata],
    queries: js.Array[CompileQueryMetadata],
    template: CompileTemplateMetadata,
    `type`: CompileTypeMetadata,
    viewProviders: js.Array[CompileProviderMetadata],
    viewQueries: js.Array[CompileQueryMetadata]
  ): ChangeDetection = {
    val __obj = js.Dynamic.literal(entryComponents = entryComponents.asInstanceOf[js.Any], guards = guards.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isHost = isHost.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], viewProviders = viewProviders.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeDetection]
  }
  @scala.inline
  implicit class ChangeDetectionOps[Self <: ChangeDetection] (val x: Self) extends AnyVal {
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
    def withGuards(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsComponent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviders(value: js.Array[CompileProviderMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueries(value: js.Array[CompileQueryMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: CompileTemplateMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: CompileTypeMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewProviders(value: js.Array[CompileProviderMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewQueries(value: js.Array[CompileQueryMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeDetection(value: ChangeDetectionStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeDetectionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeDetection")(null)
        ret
    }
    @scala.inline
    def withComponentFactory(value: StaticSymbol | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentFactoryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentFactory")(null)
        ret
    }
    @scala.inline
    def withComponentViewType(value: StaticSymbol | ProxyClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentViewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentViewTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentViewType")(null)
        ret
    }
    @scala.inline
    def withExportAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportAsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportAs")(null)
        ret
    }
    @scala.inline
    def withRendererType(value: StaticSymbol | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendererType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendererTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendererType")(null)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(null)
        ret
    }
  }
  
}

