package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ɵDirectiveDef[T] extends StObject {
  
  /**
    * Function to create and refresh content queries associated with a given directive.
    */
  var contentQueries: ContentQueriesFunction[T] | Null = js.native
  
  /**
    * @deprecated This is only here because `NgOnChanges` incorrectly uses declared name instead of
    * public or minified name.
    */
  val declaredInputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typingsSlinky.angularCore.angularCoreStrings.ɵDirectiveDef with TopLevel[js.Any] = js.native
  
  /**
    * Name under which the directive is exported (for use with local references in template)
    */
  val exportAs: js.Array[String] | Null = js.native
  
  /**
    * Factory function used to create a new directive instance. Will be null initially.
    * Populated when the factory is first requested by directive instantiation logic.
    */
  val factory: FactoryFn[T] | Null = js.native
  
  /**
    * The features applied to this directive
    */
  val features: js.Array[DirectiveDefFeature] | Null = js.native
  
  /**
    * Assign static attribute values to a host element.
    *
    * This property will assign static attribute values as well as class and style
    * values to a host element. Since attribute values can consist of different types of values, the
    * `hostAttrs` array must include the values in the following format:
    *
    * attrs = [
    *   // static attributes (like `title`, `name`, `id`...)
    *   attr1, value1, attr2, value,
    *
    *   // a single namespace value (like `x:id`)
    *   NAMESPACE_MARKER, namespaceUri1, name1, value1,
    *
    *   // another single namespace value (like `x:name`)
    *   NAMESPACE_MARKER, namespaceUri2, name2, value2,
    *
    *   // a series of CSS classes that will be applied to the element (no spaces)
    *   CLASSES_MARKER, class1, class2, class3,
    *
    *   // a series of CSS styles (property + value) that will be applied to the element
    *   STYLES_MARKER, prop1, value1, prop2, value2
    * ]
    *
    * All non-class and non-style attributes must be defined at the start of the list
    * first before all class and style values are set. When there is a change in value
    * type (like when classes and styles are introduced) a marker must be used to separate
    * the entries. The marker values themselves are set via entries found in the
    * [AttributeMarker] enum.
    */
  val hostAttrs: TAttributes | Null = js.native
  
  /**
    * Refreshes host bindings on the associated directive.
    */
  val hostBindings: HostBindingsFunction[T] | Null = js.native
  
  /**
    * The number of bindings in this directive `hostBindings` (including pure fn bindings).
    *
    * Used to calculate the length of the component's LView array, so we
    * can pre-fill the array and set the host binding start index.
    */
  val hostVars: Double = js.native
  
  /**
    * A dictionary mapping the inputs' minified property names to their public API names, which
    * are their aliases if any, or their original unminified property names
    * (as in `@Input('alias') propertyName: any;`).
    */
  val inputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typingsSlinky.angularCore.angularCoreStrings.ɵDirectiveDef with TopLevel[js.Any] = js.native
  
  /**
    * A dictionary mapping the outputs' minified property names to their public API names, which
    * are their aliases if any, or their original unminified property names
    * (as in `@Output('alias') propertyName: any;`).
    */
  val outputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typingsSlinky.angularCore.angularCoreStrings.ɵDirectiveDef with TopLevel[js.Any] = js.native
  
  /** Function that resolves providers and publishes them into the DI system. */
  var providersResolver: (js.Function2[
    /* def */ ɵDirectiveDef[T], 
    /* processProvidersFn */ js.UndefOr[ProcessProvidersFunction], 
    Unit
  ]) | Null = js.native
  
  /** The selectors that will be used to match nodes to this directive. */
  val selectors: ɵCssSelectorList = js.native
  
  var setInput: (js.ThisFunction4[
    /* this */ ɵDirectiveDef[T], 
    /* instance */ T, 
    /* value */ js.Any, 
    /* publicName */ String, 
    /* privateName */ String, 
    Unit
  ]) | Null = js.native
  
  /** Token representing the directive. Used by DI. */
  val `type`: typingsSlinky.angularCore.mod.Type[T] = js.native
  
  /**
    * Query-related instructions for a directive. Note that while directives don't have a
    * view and as such view queries won't necessarily do anything, there might be
    * components that extend the directive.
    */
  var viewQuery: ViewQueriesFunction[T] | Null = js.native
}
object ɵDirectiveDef {
  
  @scala.inline
  def apply[T](
    declaredInputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typingsSlinky.angularCore.angularCoreStrings.ɵDirectiveDef with TopLevel[js.Any],
    hostVars: Double,
    inputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typingsSlinky.angularCore.angularCoreStrings.ɵDirectiveDef with TopLevel[js.Any],
    outputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typingsSlinky.angularCore.angularCoreStrings.ɵDirectiveDef with TopLevel[js.Any],
    selectors: ɵCssSelectorList,
    `type`: typingsSlinky.angularCore.mod.Type[T]
  ): ɵDirectiveDef[T] = {
    val __obj = js.Dynamic.literal(declaredInputs = declaredInputs.asInstanceOf[js.Any], hostVars = hostVars.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵDirectiveDef[T]]
  }
  
  @scala.inline
  implicit class ɵDirectiveDefMutableBuilder[Self <: ɵDirectiveDef[_], T] (val x: Self with ɵDirectiveDef[T]) extends AnyVal {
    
    @scala.inline
    def setContentQueries(value: (/* rf */ ɵRenderFlags, T, /* directiveIndex */ Double) => Unit): Self = StObject.set(x, "contentQueries", js.Any.fromFunction3(value))
    
    @scala.inline
    def setContentQueriesNull: Self = StObject.set(x, "contentQueries", null)
    
    @scala.inline
    def setDeclaredInputs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: string}
      */ typingsSlinky.angularCore.angularCoreStrings.ɵDirectiveDef with TopLevel[js.Any]
    ): Self = StObject.set(x, "declaredInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportAs(value: js.Array[String]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportAsNull: Self = StObject.set(x, "exportAs", null)
    
    @scala.inline
    def setExportAsVarargs(value: String*): Self = StObject.set(x, "exportAs", js.Array(value :_*))
    
    @scala.inline
    def setFactory(value: FactoryFn[T]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactoryNull: Self = StObject.set(x, "factory", null)
    
    @scala.inline
    def setFeatures(value: js.Array[DirectiveDefFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesNull: Self = StObject.set(x, "features", null)
    
    @scala.inline
    def setFeaturesVarargs(value: DirectiveDefFeature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setHostAttrs(value: TAttributes): Self = StObject.set(x, "hostAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostAttrsNull: Self = StObject.set(x, "hostAttrs", null)
    
    @scala.inline
    def setHostAttrsVarargs(value: (String | ɵAttributeMarker | CssSelector)*): Self = StObject.set(x, "hostAttrs", js.Array(value :_*))
    
    @scala.inline
    def setHostBindings(value: (/* rf */ ɵRenderFlags, T) => Unit): Self = StObject.set(x, "hostBindings", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHostBindingsNull: Self = StObject.set(x, "hostBindings", null)
    
    @scala.inline
    def setHostVars(value: Double): Self = StObject.set(x, "hostVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: string}
      */ typingsSlinky.angularCore.angularCoreStrings.ɵDirectiveDef with TopLevel[js.Any]
    ): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: string}
      */ typingsSlinky.angularCore.angularCoreStrings.ɵDirectiveDef with TopLevel[js.Any]
    ): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersResolver(
      value: (/* def */ ɵDirectiveDef[T], /* processProvidersFn */ js.UndefOr[ProcessProvidersFunction]) => Unit
    ): Self = StObject.set(x, "providersResolver", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProvidersResolverNull: Self = StObject.set(x, "providersResolver", null)
    
    @scala.inline
    def setSelectors(value: ɵCssSelectorList): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorsVarargs(value: CssSelector*): Self = StObject.set(x, "selectors", js.Array(value :_*))
    
    @scala.inline
    def setSetInput(
      value: js.ThisFunction4[
          /* this */ ɵDirectiveDef[T], 
          /* instance */ T, 
          /* value */ js.Any, 
          /* publicName */ String, 
          /* privateName */ String, 
          Unit
        ]
    ): Self = StObject.set(x, "setInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetInputNull: Self = StObject.set(x, "setInput", null)
    
    @scala.inline
    def setType(value: typingsSlinky.angularCore.mod.Type[T]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewQuery(value: (/* rf */ ɵRenderFlags, T) => Unit): Self = StObject.set(x, "viewQuery", js.Any.fromFunction2(value))
    
    @scala.inline
    def setViewQueryNull: Self = StObject.set(x, "viewQuery", null)
  }
}
