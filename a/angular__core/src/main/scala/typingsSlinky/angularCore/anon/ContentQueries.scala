package typingsSlinky.angularCore.anon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.angularCore.mod.ContentQueriesFunction
import typingsSlinky.angularCore.mod.CssSelector
import typingsSlinky.angularCore.mod.DirectiveDefFeature
import typingsSlinky.angularCore.mod.HostBindingsFunction
import typingsSlinky.angularCore.mod.TAttributes
import typingsSlinky.angularCore.mod.Type
import typingsSlinky.angularCore.mod.ViewQueriesFunction
import typingsSlinky.angularCore.mod.ɵAttributeMarker
import typingsSlinky.angularCore.mod.ɵCssSelectorList
import typingsSlinky.angularCore.mod.ɵRenderFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentQueries[T] extends js.Object {
  
  /**
    * Function to create instances of content queries associated with a given directive.
    */
  var contentQueries: js.UndefOr[ContentQueriesFunction[T]] = js.native
  
  /**
    * Defines the name that can be used in the template to assign this directive to a variable.
    *
    * See: {@link Directive.exportAs}
    */
  var exportAs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of optional features to apply.
    *
    * See: {@link NgOnChangesFeature}, {@link ProvidersFeature}, {@link InheritDefinitionFeature}
    */
  var features: js.UndefOr[js.Array[DirectiveDefFeature]] = js.native
  
  /**
    * Assign static attribute values to a host element.
    *
    * This property will assign static attribute values as well as class and style
    * values to a host element. Since attribute values can consist of different types of values,
    * the `hostAttrs` array must include the values in the following format:
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
  var hostAttrs: js.UndefOr[TAttributes] = js.native
  
  /**
    * Function executed by the parent template to allow child directive to apply host bindings.
    */
  var hostBindings: js.UndefOr[HostBindingsFunction[T]] = js.native
  
  /**
    * The number of bindings in this directive `hostBindings` (including pure fn bindings).
    *
    * Used to calculate the length of the component's LView array, so we
    * can pre-fill the array and set the host binding start index.
    */
  var hostVars: js.UndefOr[Double] = js.native
  
  /**
    * A map of input names.
    *
    * The format is in: `{[actualPropertyName: string]:(string|[string, string])}`.
    *
    * Given:
    * ```
    * class MyComponent {
    *   @Input()
    *   publicInput1: string;
    *
    *   @Input('publicInput2')
    *   declaredInput2: string;
    * }
    * ```
    *
    * is described as:
    * ```
    * {
    *   publicInput1: 'publicInput1',
    *   declaredInput2: ['declaredInput2', 'publicInput2'],
    * }
    * ```
    *
    * Which the minifier may translate to:
    * ```
    * {
    *   minifiedPublicInput1: 'publicInput1',
    *   minifiedDeclaredInput2: [ 'publicInput2', 'declaredInput2'],
    * }
    * ```
    *
    * This allows the render to re-construct the minified, public, and declared names
    * of properties.
    *
    * NOTE:
    *  - Because declared and public name are usually same we only generate the array
    *    `['declared', 'public']` format when they differ.
    *  - The reason why this API and `outputs` API is not the same is that `NgOnChanges` has
    *    inconsistent behavior in that it uses declared names rather than minified or public. For
    *    this reason `NgOnChanges` will be deprecated and removed in future version and this
    *    API will be simplified to be consistent with `output`.
    */
  var inputs: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | [string, string] | undefined}
    */ typingsSlinky.angularCore.angularCoreStrings.ContentQueries with TopLevel[js.Any]
  ] = js.native
  
  /**
    * A map of output names.
    *
    * The format is in: `{[actualPropertyName: string]:string}`.
    *
    * Which the minifier may translate to: `{[minifiedPropertyName: string]:string}`.
    *
    * This allows the render to re-construct the minified and non-minified names
    * of properties.
    */
  var outputs: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P_1 in keyof T ]:? string | undefined}
    */ typingsSlinky.angularCore.angularCoreStrings.ContentQueries with TopLevel[js.Any]
  ] = js.native
  
  /** The selectors that will be used to match nodes to this directive. */
  var selectors: js.UndefOr[ɵCssSelectorList] = js.native
  
  /**
    * Directive type, needed to configure the injector.
    */
  var `type`: Type[T] = js.native
  
  /**
    * Additional set of instructions specific to view query processing. This could be seen as a
    * set of instructions to be inserted into the template function.
    */
  var viewQuery: js.UndefOr[ViewQueriesFunction[T] | Null] = js.native
}
object ContentQueries {
  
  @scala.inline
  def apply[T](`type`: Type[T]): ContentQueries[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentQueries[T]]
  }
  
  @scala.inline
  implicit class ContentQueriesOps[Self <: ContentQueries[_], T] (val x: Self with ContentQueries[T]) extends AnyVal {
    
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
    def setType(value: Type[T]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentQueries(value: (/* rf */ ɵRenderFlags, T, /* directiveIndex */ Double) => Unit): Self = this.set("contentQueries", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteContentQueries: Self = this.set("contentQueries", js.undefined)
    
    @scala.inline
    def setExportAsVarargs(value: String*): Self = this.set("exportAs", js.Array(value :_*))
    
    @scala.inline
    def setExportAs(value: js.Array[String]): Self = this.set("exportAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportAs: Self = this.set("exportAs", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: DirectiveDefFeature*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[DirectiveDefFeature]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setHostAttrsVarargs(value: (String | ɵAttributeMarker | CssSelector)*): Self = this.set("hostAttrs", js.Array(value :_*))
    
    @scala.inline
    def setHostAttrs(value: TAttributes): Self = this.set("hostAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostAttrs: Self = this.set("hostAttrs", js.undefined)
    
    @scala.inline
    def setHostBindings(value: (/* rf */ ɵRenderFlags, T) => Unit): Self = this.set("hostBindings", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHostBindings: Self = this.set("hostBindings", js.undefined)
    
    @scala.inline
    def setHostVars(value: Double): Self = this.set("hostVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostVars: Self = this.set("hostVars", js.undefined)
    
    @scala.inline
    def setInputs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? string | [string, string] | undefined}
      */ typingsSlinky.angularCore.angularCoreStrings.ContentQueries with TopLevel[js.Any]
    ): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    
    @scala.inline
    def setOutputs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P_1 in keyof T ]:? string | undefined}
      */ typingsSlinky.angularCore.angularCoreStrings.ContentQueries with TopLevel[js.Any]
    ): Self = this.set("outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
    
    @scala.inline
    def setSelectorsVarargs(value: CssSelector*): Self = this.set("selectors", js.Array(value :_*))
    
    @scala.inline
    def setSelectors(value: ɵCssSelectorList): Self = this.set("selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectors: Self = this.set("selectors", js.undefined)
    
    @scala.inline
    def setViewQuery(value: (/* rf */ ɵRenderFlags, T) => Unit): Self = this.set("viewQuery", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteViewQuery: Self = this.set("viewQuery", js.undefined)
    
    @scala.inline
    def setViewQueryNull: Self = this.set("viewQuery", null)
  }
}
