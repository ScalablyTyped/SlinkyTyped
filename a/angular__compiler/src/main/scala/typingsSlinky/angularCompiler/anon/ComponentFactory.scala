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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentFactory extends js.Object {
  
  var changeDetection: ChangeDetectionStrategy | Null = js.native
  
  var componentFactory: StaticSymbol | js.Object | Null = js.native
  
  var componentViewType: StaticSymbol | ProxyClass | Null = js.native
  
  var entryComponents: js.Array[CompileEntryComponentMetadata] = js.native
  
  var exportAs: String | Null = js.native
  
  var guards: StringDictionary[js.Any] = js.native
  
  var hostAttributes: StringDictionary[String] = js.native
  
  var hostListeners: StringDictionary[String] = js.native
  
  var hostProperties: StringDictionary[String] = js.native
  
  var inputs: StringDictionary[String] = js.native
  
  var isComponent: Boolean = js.native
  
  var isHost: Boolean = js.native
  
  var outputs: StringDictionary[String] = js.native
  
  var providers: js.Array[CompileProviderMetadata] = js.native
  
  var queries: js.Array[CompileQueryMetadata] = js.native
  
  var rendererType: StaticSymbol | js.Object | Null = js.native
  
  var selector: String | Null = js.native
  
  var template: CompileTemplateMetadata | Null = js.native
  
  var `type`: CompileTypeMetadata = js.native
  
  var viewProviders: js.Array[CompileProviderMetadata] = js.native
  
  var viewQueries: js.Array[CompileQueryMetadata] = js.native
}
object ComponentFactory {
  
  @scala.inline
  def apply(
    entryComponents: js.Array[CompileEntryComponentMetadata],
    guards: StringDictionary[js.Any],
    hostAttributes: StringDictionary[String],
    hostListeners: StringDictionary[String],
    hostProperties: StringDictionary[String],
    inputs: StringDictionary[String],
    isComponent: Boolean,
    isHost: Boolean,
    outputs: StringDictionary[String],
    providers: js.Array[CompileProviderMetadata],
    queries: js.Array[CompileQueryMetadata],
    `type`: CompileTypeMetadata,
    viewProviders: js.Array[CompileProviderMetadata],
    viewQueries: js.Array[CompileQueryMetadata]
  ): ComponentFactory = {
    val __obj = js.Dynamic.literal(entryComponents = entryComponents.asInstanceOf[js.Any], guards = guards.asInstanceOf[js.Any], hostAttributes = hostAttributes.asInstanceOf[js.Any], hostListeners = hostListeners.asInstanceOf[js.Any], hostProperties = hostProperties.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isHost = isHost.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], viewProviders = viewProviders.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentFactory]
  }
  
  @scala.inline
  implicit class ComponentFactoryOps[Self <: ComponentFactory] (val x: Self) extends AnyVal {
    
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
    def setEntryComponentsVarargs(value: CompileEntryComponentMetadata*): Self = this.set("entryComponents", js.Array(value :_*))
    
    @scala.inline
    def setEntryComponents(value: js.Array[CompileEntryComponentMetadata]): Self = this.set("entryComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuards(value: StringDictionary[js.Any]): Self = this.set("guards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostAttributes(value: StringDictionary[String]): Self = this.set("hostAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostListeners(value: StringDictionary[String]): Self = this.set("hostListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostProperties(value: StringDictionary[String]): Self = this.set("hostProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: StringDictionary[String]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComponent(value: Boolean): Self = this.set("isComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHost(value: Boolean): Self = this.set("isHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputs(value: StringDictionary[String]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersVarargs(value: CompileProviderMetadata*): Self = this.set("providers", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[CompileProviderMetadata]): Self = this.set("providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesVarargs(value: CompileQueryMetadata*): Self = this.set("queries", js.Array(value :_*))
    
    @scala.inline
    def setQueries(value: js.Array[CompileQueryMetadata]): Self = this.set("queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CompileTypeMetadata): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewProvidersVarargs(value: CompileProviderMetadata*): Self = this.set("viewProviders", js.Array(value :_*))
    
    @scala.inline
    def setViewProviders(value: js.Array[CompileProviderMetadata]): Self = this.set("viewProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewQueriesVarargs(value: CompileQueryMetadata*): Self = this.set("viewQueries", js.Array(value :_*))
    
    @scala.inline
    def setViewQueries(value: js.Array[CompileQueryMetadata]): Self = this.set("viewQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeDetection(value: ChangeDetectionStrategy): Self = this.set("changeDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeDetectionNull: Self = this.set("changeDetection", null)
    
    @scala.inline
    def setComponentFactory(value: StaticSymbol | js.Object): Self = this.set("componentFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentFactoryNull: Self = this.set("componentFactory", null)
    
    @scala.inline
    def setComponentViewType(value: StaticSymbol | ProxyClass): Self = this.set("componentViewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentViewTypeNull: Self = this.set("componentViewType", null)
    
    @scala.inline
    def setExportAs(value: String): Self = this.set("exportAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportAsNull: Self = this.set("exportAs", null)
    
    @scala.inline
    def setRendererType(value: StaticSymbol | js.Object): Self = this.set("rendererType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererTypeNull: Self = this.set("rendererType", null)
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorNull: Self = this.set("selector", null)
    
    @scala.inline
    def setTemplate(value: CompileTemplateMetadata): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateNull: Self = this.set("template", null)
  }
}
