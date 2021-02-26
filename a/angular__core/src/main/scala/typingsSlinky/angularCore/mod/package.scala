package typingsSlinky.angularCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def ANALYZE_FOR_ENTRY_COMPONENTS: typingsSlinky.angularCore.mod.InjectionToken[js.Any] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ANALYZE_FOR_ENTRY_COMPONENTS").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[js.Any]]
  
  @scala.inline
  def APP_BOOTSTRAP_LISTENER: typingsSlinky.angularCore.mod.InjectionToken[
    js.Array[
      js.Function1[/* compRef */ typingsSlinky.angularCore.mod.ComponentRef[js.Any], scala.Unit]
    ]
  ] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("APP_BOOTSTRAP_LISTENER").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[
    js.Array[
      js.Function1[/* compRef */ typingsSlinky.angularCore.mod.ComponentRef[js.Any], scala.Unit]
    ]
  ]]
  
  @scala.inline
  def APP_ID: typingsSlinky.angularCore.mod.InjectionToken[java.lang.String] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("APP_ID").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[java.lang.String]]
  
  @scala.inline
  def APP_INITIALIZER: typingsSlinky.angularCore.mod.InjectionToken[js.Array[js.Function0[scala.Unit]]] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("APP_INITIALIZER").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[js.Array[js.Function0[scala.Unit]]]]
  
  @scala.inline
  def COMPILER_OPTIONS: typingsSlinky.angularCore.mod.InjectionToken[js.Array[typingsSlinky.angularCore.mod.CompilerOptions]] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("COMPILER_OPTIONS").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[js.Array[typingsSlinky.angularCore.mod.CompilerOptions]]]
  
  @scala.inline
  def CUSTOM_ELEMENTS_SCHEMA: typingsSlinky.angularCore.mod.SchemaMetadata = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CUSTOM_ELEMENTS_SCHEMA").asInstanceOf[typingsSlinky.angularCore.mod.SchemaMetadata]
  
  type ComponentInstance = js.Object
  
  /**
    * Definition of what a template rendering function should look like for a component.
    */
  type ComponentTemplate[T] = js.Function2[/* rf */ typingsSlinky.angularCore.mod.ɵRenderFlags, /* ctx */ T, scala.Unit]
  
  @scala.inline
  def ContentChild: typingsSlinky.angularCore.mod.ContentChildDecorator = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ContentChild").asInstanceOf[typingsSlinky.angularCore.mod.ContentChildDecorator]
  type ContentChild = typingsSlinky.angularCore.mod.Query
  
  @scala.inline
  def ContentChildren: typingsSlinky.angularCore.mod.ContentChildrenDecorator = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ContentChildren").asInstanceOf[typingsSlinky.angularCore.mod.ContentChildrenDecorator]
  type ContentChildren = typingsSlinky.angularCore.mod.Query
  
  /**
    * Definition of what a content queries function should look like.
    */
  type ContentQueriesFunction[T] = js.Function3[
    /* rf */ typingsSlinky.angularCore.mod.ɵRenderFlags, 
    /* ctx */ T, 
    /* directiveIndex */ scala.Double, 
    scala.Unit
  ]
  
  /**
    * Expresses a single CSS Selector.
    *
    * Beginning of array
    * - First index: element name
    * - Subsequent odd indices: attr keys
    * - Subsequent even indices: attr values
    *
    * After SelectorFlags.CLASS flag
    * - Class name values
    *
    * SelectorFlags.NOT flag
    * - Changes the mode to NOT
    * - Can be combined with other flags to set the element / attr / class mode
    *
    * e.g. SelectorFlags.NOT | SelectorFlags.ELEMENT
    *
    * Example:
    * Original: `div.foo.bar[attr1=val1][attr2]`
    * Parsed: ['div', 'attr1', 'val1', 'attr2', '', SelectorFlags.CLASS, 'foo', 'bar']
    *
    * Original: 'div[attr1]:not(.foo[attr2])
    * Parsed: [
    *  'div', 'attr1', '',
    *  SelectorFlags.NOT | SelectorFlags.ATTRIBUTE 'attr2', '', SelectorFlags.CLASS, 'foo'
    * ]
    *
    * See more examples in node_selector_matcher_spec.ts
    */
  type CssSelector = js.Array[java.lang.String | typingsSlinky.angularCore.mod.SelectorFlags]
  
  /**
    * An object literal of this type is used to represent the metadata of a constructor dependency.
    * The type itself is never referred to from generated code.
    */
  type CtorDependency = typingsSlinky.angularCore.anon.Attribute | scala.Null
  
  @scala.inline
  def DEFAULT_CURRENCY_CODE: typingsSlinky.angularCore.mod.InjectionToken[java.lang.String] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_CURRENCY_CODE").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[java.lang.String]]
  
  /**
    * Factory for ViewDefinitions/NgModuleDefinitions.
    * We use a function so we can reexeute it in case an error happens and use the given logger
    * function to log the error from the definition of the node, which is shown in all browser
    * logs.
    */
  type DefinitionFactory[D /* <: typingsSlinky.angularCore.mod.Definition[_] */] = js.Function1[/* logger */ typingsSlinky.angularCore.mod.NodeLogger, D]
  
  /**
    * Array of destroy hooks that should be executed for a view and their directive indices.
    *
    * The array is set up as a series of number/function or number/(number|function)[]:
    * - Even indices represent the context with which hooks should be called.
    * - Odd indices are the hook functions themselves. If a value at an odd index is an array,
    *   it represents the destroy hooks of a `multi` provider where:
    *     - Even indices represent the index of the provider for which we've registered a destroy hook,
    *       inside of the `multi` provider array.
    *     - Odd indices are the destroy hook functions.
    * For example:
    * LView: `[0, 1, 2, AService, 4, [BService, CService, DService]]`
    * destroyHooks: `[3, AService.ngOnDestroy, 5, [0, BService.ngOnDestroy, 2, DService.ngOnDestroy]]`
    *
    * In the example above `AService` is a type provider with an `ngOnDestroy`, whereas `BService`,
    * `CService` and `DService` are part of a `multi` provider where only `BService` and `DService`
    * have an `ngOnDestroy` hook.
    */
  type DestroyHookData = js.Array[typingsSlinky.angularCore.mod.HookEntry | typingsSlinky.angularCore.mod.HookData]
  
  type DirectiveDefList = js.Array[
    typingsSlinky.angularCore.mod.ɵDirectiveDef[js.Any] | typingsSlinky.angularCore.mod.ɵComponentDef[js.Any]
  ]
  
  /**
    * Type used for directiveDefs on component definition.
    *
    * The function is necessary to be able to support forward declarations.
    */
  type DirectiveDefListOrFactory = js.Function0[typingsSlinky.angularCore.mod.DirectiveDefList] | typingsSlinky.angularCore.mod.DirectiveDefList
  
  type DirectiveInstance = js.Object
  
  type DirectiveTypeList = js.Array[
    typingsSlinky.angularCore.mod.ɵDirectiveType[js.Any] | typingsSlinky.angularCore.mod.ɵComponentType[js.Any] | typingsSlinky.angularCore.mod.Type[js.Any]
  ]
  
  type DirectiveTypesOrFactory = js.Function0[typingsSlinky.angularCore.mod.DirectiveTypeList] | typingsSlinky.angularCore.mod.DirectiveTypeList
  
  type DisposableFn = js.Function0[scala.Unit]
  
  type ElementHandleEventFn = js.Function3[
    /* view */ typingsSlinky.angularCore.mod.ViewData, 
    /* eventName */ java.lang.String, 
    /* event */ js.Any, 
    scala.Boolean
  ]
  
  type ForwardRefFn = js.Function0[js.Any]
  
  type GlobalTargetResolver = js.Function1[/* element */ js.Any, typingsSlinky.angularCore.anon.Name]
  
  /**
    * Array of hooks that should be executed for a view and their directive indices.
    *
    * For each node of the view, the following data is stored:
    * 1) Node index (optional)
    * 2) A series of number/function pairs where:
    *  - even indices are directive indices
    *  - odd indices are hook functions
    *
    * Special cases:
    *  - a negative directive index flags an init hook (ngOnInit, ngAfterContentInit, ngAfterViewInit)
    */
  type HookData = js.Array[typingsSlinky.angularCore.mod.HookEntry]
  
  /**
    * Information necessary to call a hook. E.g. the callback that
    * needs to invoked and the index at which to find its context.
    */
  type HookEntry = scala.Double | typingsSlinky.angularCore.mod.HookFn
  
  /** Single hook callback function. */
  type HookFn = js.Function0[scala.Unit]
  
  @scala.inline
  def Host: typingsSlinky.angularCore.mod.HostDecorator = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Host").asInstanceOf[typingsSlinky.angularCore.mod.HostDecorator]
  
  type HostBindingsFunction[T] = js.Function2[/* rf */ typingsSlinky.angularCore.mod.ɵRenderFlags, /* ctx */ T, scala.Unit]
  
  /** See CreateComponentOptions.hostFeatures */
  type HostFeature = js.Function2[
    /* component */ js.Any, 
    /* componentDef */ typingsSlinky.angularCore.mod.ɵComponentDef[js.Any], 
    scala.Unit
  ]
  
  @scala.inline
  def INJECTOR_ : typingsSlinky.angularCore.mod.InjectionToken[typingsSlinky.angularCore.mod.Injector] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("INJECTOR").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[typingsSlinky.angularCore.mod.Injector]]
  
  /**
    * This array contains information about input properties that
    * need to be set once from attribute data. It's ordered by
    * directive index (relative to element) so it's simple to
    * look up a specific directive's initial input data.
    *
    * Within each sub-array:
    *
    * i+0: attribute name
    * i+1: minified/internal input name
    * i+2: initial value
    *
    * If a directive on a node does not have any input properties
    * that should be set from attributes, its index is set to null
    * to avoid a sparse array.
    *
    * e.g. [null, ['role-min', 'minified-input', 'button']]
    */
  type InitialInputData = js.Array[typingsSlinky.angularCore.mod.InitialInputs | scala.Null]
  
  /**
    * Used by InitialInputData to store input properties
    * that should be set once from attributes.
    *
    * i+0: attribute name
    * i+1: minified/internal input name
    * i+2: initial value
    *
    * e.g. ['role-min', 'minified-input', 'button']
    */
  type InitialInputs = js.Array[java.lang.String]
  
  /**
    * See `TNode.insertBeforeIndex`
    */
  type InsertBeforeIndex = scala.Null | scala.Double | js.Array[scala.Double]
  
  @scala.inline
  def LOCALE_ID: typingsSlinky.angularCore.mod.InjectionToken[java.lang.String] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("LOCALE_ID").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[java.lang.String]]
  
  /**
    * Type for a function that extracts a value for a local refs.
    * Example:
    * - `<div #nativeDivEl>` - `nativeDivEl` should point to the native `<div>` element;
    * - `<ng-template #tplRef>` - `tplRef` should point to the `TemplateRef` instance;
    */
  type LocalRefExtractor = js.Function2[
    /* tNode */ typingsSlinky.angularCore.mod.TNodeWithLocalRefs, 
    /* currentView */ typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv, 
    js.Any
  ]
  
  @scala.inline
  def NO_ERRORS_SCHEMA: typingsSlinky.angularCore.mod.SchemaMetadata = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NO_ERRORS_SCHEMA").asInstanceOf[typingsSlinky.angularCore.mod.SchemaMetadata]
  
  type NgIterable[T] = js.Array[T] | js.Iterable[T]
  
  /**
    * Function to call console.error at the right source location. This is an indirection
    * via another function as browser will log the location that actually called
    * `console.error`.
    */
  type NodeLogger = js.Function0[js.Function0[scala.Unit]]
  
  @scala.inline
  def Optional: typingsSlinky.angularCore.mod.OptionalDecorator = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Optional").asInstanceOf[typingsSlinky.angularCore.mod.OptionalDecorator]
  
  @scala.inline
  def PACKAGE_ROOT_URL: typingsSlinky.angularCore.mod.InjectionToken[java.lang.String] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PACKAGE_ROOT_URL").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[java.lang.String]]
  
  @scala.inline
  def PLATFORM_ID: typingsSlinky.angularCore.mod.InjectionToken[js.Object] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PLATFORM_ID").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[js.Object]]
  
  @scala.inline
  def PLATFORM_INITIALIZER: typingsSlinky.angularCore.mod.InjectionToken[js.Array[js.Function0[scala.Unit]]] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PLATFORM_INITIALIZER").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[js.Array[js.Function0[scala.Unit]]]]
  
  type PipeDefList = js.Array[typingsSlinky.angularCore.mod.ɵPipeDef[js.Any]]
  
  /**
    * Type used for PipeDefs on component definition.
    *
    * The function is necessary to be able to support forward declarations.
    */
  type PipeDefListOrFactory = js.Function0[typingsSlinky.angularCore.mod.PipeDefList] | typingsSlinky.angularCore.mod.PipeDefList
  
  type PipeTypeList = js.Array[
    typingsSlinky.angularCore.mod.PipeType[js.Any] | typingsSlinky.angularCore.mod.Type[js.Any]
  ]
  
  type PipeTypesOrFactory = js.Function0[typingsSlinky.angularCore.mod.PipeTypeList] | typingsSlinky.angularCore.mod.PipeTypeList
  
  type Predicate[T] = js.Function1[/* value */ T, scala.Boolean]
  
  /**
    * Describes a function that is used to process provider lists (such as provider
    * overrides).
    */
  type ProcessProvidersFunction = js.Function1[
    /* providers */ js.Array[typingsSlinky.angularCore.mod.Provider], 
    js.Array[typingsSlinky.angularCore.mod.Provider]
  ]
  
  /**
    * List of slots for a projection. A slot can be either based on a parsed CSS selector
    * which will be used to determine nodes which are projected into that slot.
    *
    * When set to "*", the slot is reserved and can be used for multi-slot projection
    * using {@link ViewContainerRef#createComponent}. The last slot that specifies the
    * wildcard selector will retrieve all projectable nodes which do not match any selector.
    */
  type ProjectionSlots = js.Array[
    typingsSlinky.angularCore.mod.ɵCssSelectorList | typingsSlinky.angularCore.angularCoreStrings.Asterisk
  ]
  
  /**
    * Store the runtime input or output names for all the directives.
    *
    * i+0: directive instance index
    * i+1: privateName
    *
    * e.g. [0, 'change-minified']
    */
  type PropertyAliasValue = js.Array[scala.Double | java.lang.String]
  
  /**
    * This mapping is necessary so we can set input properties and output listeners
    * properly at runtime when property names are minified or aliased.
    *
    * Key: unminified / public input or output name
    * Value: array containing minified / internal name and related directive index
    *
    * The value must be an array to support inputs and outputs with the same name
    * on the same node.
    */
  type PropertyAliases = org.scalablytyped.runtime.StringDictionary[typingsSlinky.angularCore.mod.PropertyAliasValue]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.angularCore.mod.TypeProvider
    - typingsSlinky.angularCore.mod.ValueProvider
    - typingsSlinky.angularCore.mod.ClassProvider
    - typingsSlinky.angularCore.mod.ConstructorProvider
    - typingsSlinky.angularCore.mod.ExistingProvider
    - typingsSlinky.angularCore.mod.FactoryProvider
    - js.Array[js.Any]
  */
  type Provider = typingsSlinky.angularCore.mod._Provider | js.Array[js.Any] | typingsSlinky.angularCore.mod.TypeProvider
  
  /**
    * Function used to sanitize the value before writing it into the renderer.
    */
  type SanitizerFn = js.Function3[
    /* value */ js.Any, 
    /* tagName */ js.UndefOr[java.lang.String], 
    /* propName */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  
  @scala.inline
  def Self: typingsSlinky.angularCore.mod.SelfDecorator = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Self").asInstanceOf[typingsSlinky.angularCore.mod.SelfDecorator]
  
  type SimpleChanges = org.scalablytyped.runtime.StringDictionary[typingsSlinky.angularCore.mod.SimpleChange]
  
  @scala.inline
  def SkipSelf: typingsSlinky.angularCore.mod.SkipSelfDecorator = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SkipSelf").asInstanceOf[typingsSlinky.angularCore.mod.SkipSelfDecorator]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.angularCore.mod.ValueProvider
    - typingsSlinky.angularCore.mod.ExistingProvider
    - typingsSlinky.angularCore.mod.StaticClassProvider
    - typingsSlinky.angularCore.mod.ConstructorProvider
    - typingsSlinky.angularCore.mod.FactoryProvider
    - js.Array[js.Any]
  */
  type StaticProvider = typingsSlinky.angularCore.mod._StaticProvider | js.Array[js.Any]
  
  /**
    * A combination of:
    * - Attribute names and values.
    * - Special markers acting as flags to alter attributes processing.
    * - Parsed ngProjectAs selectors.
    */
  type TAttributes = js.Array[
    java.lang.String | typingsSlinky.angularCore.mod.ɵAttributeMarker | typingsSlinky.angularCore.mod.CssSelector
  ]
  
  /**
    * Constants that are associated with a view. Includes:
    * - Attribute arrays.
    * - Local definition arrays.
    * - Translated messages (i18n).
    */
  type TConstants = js.Array[typingsSlinky.angularCore.mod.TAttributes | java.lang.String]
  
  /**
    * Factory function that returns an array of consts. Consts can be represented as a function in
    * case any additional statements are required to define consts in the list. An example is i18n
    * where additional i18n calls are generated, which should be executed when consts are requested
    * for the first time.
    */
  type TConstantsFactory = js.Function0[typingsSlinky.angularCore.mod.TConstants]
  
  /**
    * TConstants type that describes how the `consts` field is generated on ComponentDef: it can be
    * either an array or a factory function that returns that array.
    */
  type TConstantsOrFactory = typingsSlinky.angularCore.mod.TConstants | typingsSlinky.angularCore.mod.TConstantsFactory
  
  /**
    * Static data that corresponds to the instance-specific data array on an LView.
    *
    * Each node's static data is stored in tData at the same index that it's stored
    * in the data array.  Any nodes that do not have static data store a null value in
    * tData to avoid a sparse array.
    *
    * Each pipe's definition is stored here at the same index as its pipe instance in
    * the data array.
    *
    * Each host property's name is stored here at the same index as its value in the
    * data array.
    *
    * Each property binding name is stored here at the same index as its value in
    * the data array. If the binding is an interpolation, the static string values
    * are stored parallel to the dynamic values. Example:
    *
    * id="prefix {{ v0 }} a {{ v1 }} b {{ v2 }} suffix"
    *
    * LView       |   TView.data
    *------------------------
    *  v0 value   |   'a'
    *  v1 value   |   'b'
    *  v2 value   |   id � prefix � suffix
    *
    * Injector bloom filters are also stored here.
    */
  type TData = js.Array[
    typingsSlinky.angularCore.mod.TNode | typingsSlinky.angularCore.mod.ɵPipeDef[js.Any] | typingsSlinky.angularCore.mod.ɵDirectiveDef[js.Any] | typingsSlinky.angularCore.mod.ɵComponentDef[js.Any] | scala.Double | typingsSlinky.angularCore.mod.TStylingRange | typingsSlinky.angularCore.mod.TStylingKey | typingsSlinky.angularCore.mod.Type[js.Any] | typingsSlinky.angularCore.mod.InjectionToken[js.Any] | typingsSlinky.angularCore.mod.TI18n | typingsSlinky.angularCore.mod.I18nUpdateOpCodes | typingsSlinky.angularCore.mod.TIcu | scala.Null | java.lang.String
  ]
  
  @scala.inline
  def TRANSLATIONS: typingsSlinky.angularCore.mod.InjectionToken[java.lang.String] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TRANSLATIONS").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[java.lang.String]]
  
  @scala.inline
  def TRANSLATIONS_FORMAT: typingsSlinky.angularCore.mod.InjectionToken[java.lang.String] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TRANSLATIONS_FORMAT").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[java.lang.String]]
  
  /**
    * Value stored in the `TData` which is needed to re-concatenate the styling.
    *
    * See: `TStylingKeyPrimitive` and `TStylingStatic`
    */
  type TStylingKey = typingsSlinky.angularCore.mod.TStylingKeyPrimitive | typingsSlinky.angularCore.mod.TStylingStatic
  
  /**
    * The primitive portion (`TStylingStatic` removed) of the value stored in the `TData` which is
    * needed to re-concatenate the styling.
    *
    * - `string`: Stores the property name. Used with `ɵɵstyleProp`/`ɵɵclassProp` instruction.
    * - `null`: Represents map, so there is no name. Used with `ɵɵstyleMap`/`ɵɵclassMap`.
    * - `false`: Represents an ignore case. This happens when `ɵɵstyleProp`/`ɵɵclassProp` instruction
    *   is combined with directive which shadows its input `@Input('class')`. That way the binding
    *   should not participate in the styling resolution.
    */
  type TStylingKeyPrimitive = java.lang.String | scala.Null | typingsSlinky.angularCore.angularCoreBooleans.`false`
  
  /**
    * Store the static values for the styling binding.
    *
    * The `TStylingStatic` is just `KeyValueArray` where key `""` (stored at location 0) contains the
    * `TStylingKey` (stored at location 1). In other words this wraps the `TStylingKey` such that the
    * `""` contains the wrapped value.
    *
    * When instructions are resolving styling they may need to look forward or backwards in the linked
    * list to resolve the value. For this reason we have to make sure that he linked list also contains
    * the static values. However the list only has space for one item per styling instruction. For this
    * reason we store the static values here as part of the `TStylingKey`. This means that the
    * resolution function when looking for a value needs to first look at the binding value, and than
    * at `TStylingKey` (if it exists).
    *
    * Imagine we have:
    *
    * ```
    * <div class="TEMPLATE" my-dir>
    *
    * @Directive({
    *   host: {
    *     class: 'DIR',
    *     '[class.dynamic]': 'exp' // ɵɵclassProp('dynamic', ctx.exp);
    *   }
    * })
    * ```
    *
    * In the above case the linked list will contain one item:
    *
    * ```
    *   // assume binding location: 10 for `ɵɵclassProp('dynamic', ctx.exp);`
    *   tData[10] = <TStylingStatic>[
    *     '': 'dynamic', // This is the wrapped value of `TStylingKey`
    *     'DIR': true,   // This is the default static value of directive binding.
    *   ];
    *   tData[10 + 1] = 0; // We don't have prev/next.
    *
    *   lView[10] = undefined;     // assume `ctx.exp` is `undefined`
    *   lView[10 + 1] = undefined; // Just normalized `lView[10]`
    * ```
    *
    * So when the function is resolving styling value, it first needs to look into the linked list
    * (there is none) and than into the static `TStylingStatic` too see if there is a default value for
    * `dynamic` (there is not). Therefore it is safe to remove it.
    *
    * If setting `true` case:
    * ```
    *   lView[10] = true;     // assume `ctx.exp` is `true`
    *   lView[10 + 1] = true; // Just normalized `lView[10]`
    * ```
    * So when the function is resolving styling value, it first needs to look into the linked list
    * (there is none) and than into `TNode.residualClass` (TNode.residualStyle) which contains
    * ```
    *   tNode.residualClass = [
    *     'TEMPLATE': true,
    *   ];
    * ```
    *
    * This means that it is safe to add class.
    */
  type TStylingStatic = typingsSlinky.angularCore.mod.KeyValueArray[js.Any]
  
  type TrackByFunction[T] = js.Function2[/* index */ scala.Double, /* item */ T, js.Any]
  
  @scala.inline
  def Type: typingsSlinky.std.FunctionConstructor = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Type").asInstanceOf[typingsSlinky.std.FunctionConstructor]
  
  type TypeProvider = typingsSlinky.angularCore.mod.Type[js.Any]
  
  @scala.inline
  def VERSION_ : typingsSlinky.angularCore.mod.Version = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[typingsSlinky.angularCore.mod.Version]
  
  @scala.inline
  def ViewChild: typingsSlinky.angularCore.mod.ViewChildDecorator = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ViewChild").asInstanceOf[typingsSlinky.angularCore.mod.ViewChildDecorator]
  type ViewChild = typingsSlinky.angularCore.mod.Query
  
  @scala.inline
  def ViewChildren: typingsSlinky.angularCore.mod.ViewChildrenDecorator = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ViewChildren").asInstanceOf[typingsSlinky.angularCore.mod.ViewChildrenDecorator]
  type ViewChildren = typingsSlinky.angularCore.mod.Query
  
  type ViewHandleEventFn = js.Function4[
    /* view */ typingsSlinky.angularCore.mod.ViewData, 
    /* nodeIndex */ scala.Double, 
    /* eventName */ java.lang.String, 
    /* event */ js.Any, 
    scala.Boolean
  ]
  
  /**
    * Definition of what a view queries function should look like.
    */
  type ViewQueriesFunction[T] = js.Function2[/* rf */ typingsSlinky.angularCore.mod.ɵRenderFlags, /* ctx */ T, scala.Unit]
  
  type ViewUpdateFn = js.Function2[
    /* check */ typingsSlinky.angularCore.mod.NodeCheckFn, 
    /* view */ typingsSlinky.angularCore.mod.ViewData, 
    scala.Unit
  ]
  
  @scala.inline
  def asNativeElements(debugEls: js.Array[typingsSlinky.angularCore.mod.DebugElement]): js.Any = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("asNativeElements")(debugEls.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def assertPlatform(requiredToken: js.Any): typingsSlinky.angularCore.mod.PlatformRef = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assertPlatform")(requiredToken.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.PlatformRef]
  
  @scala.inline
  def createPlatform(injector: typingsSlinky.angularCore.mod.Injector): typingsSlinky.angularCore.mod.PlatformRef = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPlatform")(injector.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.PlatformRef]
  
  @scala.inline
  def createPlatformFactory(
    parentPlatformFactory: js.Function1[
      /* extraProviders */ js.UndefOr[js.Array[typingsSlinky.angularCore.mod.StaticProvider]], 
      typingsSlinky.angularCore.mod.PlatformRef
    ],
    name: java.lang.String
  ): js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[typingsSlinky.angularCore.mod.StaticProvider]], 
    typingsSlinky.angularCore.mod.PlatformRef
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPlatformFactory")(parentPlatformFactory.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[typingsSlinky.angularCore.mod.StaticProvider]], 
    typingsSlinky.angularCore.mod.PlatformRef
  ]]
  @scala.inline
  def createPlatformFactory(
    parentPlatformFactory: js.Function1[
      /* extraProviders */ js.UndefOr[js.Array[typingsSlinky.angularCore.mod.StaticProvider]], 
      typingsSlinky.angularCore.mod.PlatformRef
    ],
    name: java.lang.String,
    providers: js.Array[typingsSlinky.angularCore.mod.StaticProvider]
  ): js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[typingsSlinky.angularCore.mod.StaticProvider]], 
    typingsSlinky.angularCore.mod.PlatformRef
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPlatformFactory")(parentPlatformFactory.asInstanceOf[js.Any], name.asInstanceOf[js.Any], providers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[typingsSlinky.angularCore.mod.StaticProvider]], 
    typingsSlinky.angularCore.mod.PlatformRef
  ]]
  @scala.inline
  def createPlatformFactory(parentPlatformFactory: scala.Null, name: java.lang.String): js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[typingsSlinky.angularCore.mod.StaticProvider]], 
    typingsSlinky.angularCore.mod.PlatformRef
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPlatformFactory")(parentPlatformFactory.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[typingsSlinky.angularCore.mod.StaticProvider]], 
    typingsSlinky.angularCore.mod.PlatformRef
  ]]
  @scala.inline
  def createPlatformFactory(
    parentPlatformFactory: scala.Null,
    name: java.lang.String,
    providers: js.Array[typingsSlinky.angularCore.mod.StaticProvider]
  ): js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[typingsSlinky.angularCore.mod.StaticProvider]], 
    typingsSlinky.angularCore.mod.PlatformRef
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPlatformFactory")(parentPlatformFactory.asInstanceOf[js.Any], name.asInstanceOf[js.Any], providers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[typingsSlinky.angularCore.mod.StaticProvider]], 
    typingsSlinky.angularCore.mod.PlatformRef
  ]]
  
  @scala.inline
  def defineInjectable[T](opts: typingsSlinky.angularCore.anon.Factory[T]): scala.Nothing = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineInjectable")(opts.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def destroyPlatform(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("destroyPlatform")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def enableProdMode(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("enableProdMode")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def forwardRef(forwardRefFn: typingsSlinky.angularCore.mod.ForwardRefFn): typingsSlinky.angularCore.mod.Type[_] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(forwardRefFn.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.Type[_]]
  
  @scala.inline
  def getDebugNode(nativeNode: js.Any): typingsSlinky.angularCore.mod.DebugNode | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDebugNode")(nativeNode.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.DebugNode | scala.Null]
  
  @scala.inline
  def getModuleFactory(id: java.lang.String): typingsSlinky.angularCore.mod.NgModuleFactory[_] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getModuleFactory")(id.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.NgModuleFactory[_]]
  
  @scala.inline
  def getPlatform(): typingsSlinky.angularCore.mod.PlatformRef | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getPlatform")().asInstanceOf[typingsSlinky.angularCore.mod.PlatformRef | scala.Null]
  
  @scala.inline
  def inject[T](token: typingsSlinky.angularCore.mod.InjectionToken[T]): T | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T | scala.Null]
  @scala.inline
  def inject[T](
    token: typingsSlinky.angularCore.mod.InjectionToken[T],
    flags: typingsSlinky.angularCore.mod.InjectFlags
  ): T | scala.Null = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | scala.Null]
  @scala.inline
  def inject[T](token: typingsSlinky.angularCore.mod.Type[T]): T | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T | scala.Null]
  @scala.inline
  def inject[T](token: typingsSlinky.angularCore.mod.Type[T], flags: typingsSlinky.angularCore.mod.InjectFlags): T | scala.Null = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | scala.Null]
  
  @scala.inline
  def inject_T_T[T](token: typingsSlinky.angularCore.mod.InjectionToken[T]): T = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def inject_T_T[T](token: typingsSlinky.angularCore.mod.Type[T]): T = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def isDevMode(): scala.Boolean = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isDevMode")().asInstanceOf[scala.Boolean]
  
  @scala.inline
  def platformCore(): typingsSlinky.angularCore.mod.PlatformRef = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("platformCore")().asInstanceOf[typingsSlinky.angularCore.mod.PlatformRef]
  @scala.inline
  def platformCore(extraProviders: js.Array[typingsSlinky.angularCore.mod.StaticProvider]): typingsSlinky.angularCore.mod.PlatformRef = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("platformCore")(extraProviders.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.PlatformRef]
  
  @scala.inline
  def resolveForwardRef[T](`type`: T): T = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resolveForwardRef")(`type`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def setTestabilityGetter(getter: typingsSlinky.angularCore.mod.GetTestability): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setTestabilityGetter")(getter.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  type viewEngineChangeDetectorRefInterface = typingsSlinky.angularCore.mod.ChangeDetectorRef
  
  @scala.inline
  def ɵALLOWMULTIPLEPLATFORMS: typingsSlinky.angularCore.mod.InjectionToken[scala.Boolean] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275ALLOW_MULTIPLE_PLATFORMS").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[scala.Boolean]]
  
  @scala.inline
  def ɵCompilerCompileModuleAndAllComponentsAsyncPOSTR3[T](moduleType: typingsSlinky.angularCore.mod.Type[T]): js.Promise[typingsSlinky.angularCore.mod.ModuleWithComponentFactories[T]] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275Compiler_compileModuleAndAllComponentsAsync__POST_R3__")(moduleType.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.angularCore.mod.ModuleWithComponentFactories[T]]]
  
  @scala.inline
  def ɵCompilerCompileModuleAndAllComponentsSyncPOSTR3[T](moduleType: typingsSlinky.angularCore.mod.Type[T]): typingsSlinky.angularCore.mod.ModuleWithComponentFactories[T] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275Compiler_compileModuleAndAllComponentsSync__POST_R3__")(moduleType.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.ModuleWithComponentFactories[T]]
  
  @scala.inline
  def ɵCompilerCompileModuleAsyncPOSTR3[T](moduleType: typingsSlinky.angularCore.mod.Type[T]): js.Promise[typingsSlinky.angularCore.mod.NgModuleFactory[T]] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275Compiler_compileModuleAsync__POST_R3__")(moduleType.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.angularCore.mod.NgModuleFactory[T]]]
  
  @scala.inline
  def ɵCompilerCompileModuleSyncPOSTR3[T](moduleType: typingsSlinky.angularCore.mod.Type[T]): typingsSlinky.angularCore.mod.NgModuleFactory[T] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275Compiler_compileModuleSync__POST_R3__")(moduleType.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.NgModuleFactory[T]]
  
  type ɵCssSelectorList = js.Array[typingsSlinky.angularCore.mod.CssSelector]
  
  @scala.inline
  def ɵDEFAULTLOCALEID: /* "en-US" */ java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275DEFAULT_LOCALE_ID").asInstanceOf[/* "en-US" */ java.lang.String]
  
  @scala.inline
  def ɵEMPTYARRAY: js.Array[js.Any] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275EMPTY_ARRAY").asInstanceOf[js.Array[js.Any]]
  
  type ɵGetterFn = js.Function1[/* obj */ js.Any, js.Any]
  
  @scala.inline
  def ɵINJECTORIMPLPOSTR3(
    providers: js.Array[typingsSlinky.angularCore.mod.StaticProvider],
    parent: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typingsSlinky.angularCore.mod.Injector = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275INJECTOR_IMPL__POST_R3__")(providers.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.Injector]
  @scala.inline
  def ɵINJECTORIMPLPOSTR3(
    providers: js.Array[typingsSlinky.angularCore.mod.StaticProvider],
    parent: typingsSlinky.angularCore.mod.Injector,
    name: java.lang.String
  ): typingsSlinky.angularCore.mod.Injector = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275INJECTOR_IMPL__POST_R3__")(providers.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.Injector]
  
  @scala.inline
  def ɵINJECTORSCOPE: typingsSlinky.angularCore.mod.InjectionToken[
    typingsSlinky.angularCore.angularCoreStrings.root | typingsSlinky.angularCore.angularCoreStrings.platform | scala.Null
  ] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275INJECTOR_SCOPE").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[
    typingsSlinky.angularCore.angularCoreStrings.root | typingsSlinky.angularCore.angularCoreStrings.platform | scala.Null
  ]]
  
  @scala.inline
  def ɵLifecycleHooksFeature(component: js.Any, `def`: typingsSlinky.angularCore.mod.ɵComponentDef[_]): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275LifecycleHooksFeature")(component.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  type ɵMethodFn = js.Function2[/* obj */ js.Any, /* args */ js.Array[js.Any], js.Any]
  
  @scala.inline
  def ɵNGCOMPDEF: java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_COMP_DEF").asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵNGDIRDEF: java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_DIR_DEF").asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵNGELEMENTID: java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_ELEMENT_ID").asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵNGINJDEF: java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_INJ_DEF").asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵNGMODDEF: java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_MOD_DEF").asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵNGPIPEDEF: java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_PIPE_DEF").asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵNGPROVDEF: java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275NG_PROV_DEF").asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵSWITCHCHANGEDETECTORREFFACTORYPOSTR3: js.Function1[
    /* isPipe */ js.UndefOr[scala.Boolean], 
    typingsSlinky.angularCore.mod.ChangeDetectorRef
  ] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_CHANGE_DETECTOR_REF_FACTORY__POST_R3__").asInstanceOf[js.Function1[
    /* isPipe */ js.UndefOr[scala.Boolean], 
    typingsSlinky.angularCore.mod.ChangeDetectorRef
  ]]
  
  @scala.inline
  def ɵSWITCHCOMPILECOMPONENTPOSTR3: js.Function2[
    /* type */ typingsSlinky.angularCore.mod.Type[js.Any], 
    /* metadata */ typingsSlinky.angularCore.mod.Component, 
    scala.Unit
  ] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_COMPILE_COMPONENT__POST_R3__").asInstanceOf[js.Function2[
    /* type */ typingsSlinky.angularCore.mod.Type[js.Any], 
    /* metadata */ typingsSlinky.angularCore.mod.Component, 
    scala.Unit
  ]]
  
  @scala.inline
  def ɵSWITCHCOMPILEDIRECTIVEPOSTR3: js.Function2[
    /* type */ typingsSlinky.angularCore.mod.Type[js.Any], 
    /* directive */ typingsSlinky.angularCore.mod.Directive | scala.Null, 
    scala.Unit
  ] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_COMPILE_DIRECTIVE__POST_R3__").asInstanceOf[js.Function2[
    /* type */ typingsSlinky.angularCore.mod.Type[js.Any], 
    /* directive */ typingsSlinky.angularCore.mod.Directive | scala.Null, 
    scala.Unit
  ]]
  
  @scala.inline
  def ɵSWITCHCOMPILEINJECTABLEPOSTR3: js.Function2[
    /* type */ typingsSlinky.angularCore.mod.Type[js.Any], 
    /* srcMeta */ js.UndefOr[typingsSlinky.angularCore.mod.Injectable], 
    scala.Unit
  ] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_COMPILE_INJECTABLE__POST_R3__").asInstanceOf[js.Function2[
    /* type */ typingsSlinky.angularCore.mod.Type[js.Any], 
    /* srcMeta */ js.UndefOr[typingsSlinky.angularCore.mod.Injectable], 
    scala.Unit
  ]]
  
  @scala.inline
  def ɵSWITCHCOMPILENGMODULEPOSTR3: js.Function2[
    /* moduleType */ typingsSlinky.angularCore.mod.Type[js.Any], 
    /* ngModule */ js.UndefOr[typingsSlinky.angularCore.mod.NgModule], 
    scala.Unit
  ] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_COMPILE_NGMODULE__POST_R3__").asInstanceOf[js.Function2[
    /* moduleType */ typingsSlinky.angularCore.mod.Type[js.Any], 
    /* ngModule */ js.UndefOr[typingsSlinky.angularCore.mod.NgModule], 
    scala.Unit
  ]]
  
  @scala.inline
  def ɵSWITCHCOMPILEPIPEPOSTR3: js.Function2[
    /* type */ typingsSlinky.angularCore.mod.Type[js.Any], 
    /* meta */ typingsSlinky.angularCore.mod.Pipe, 
    scala.Unit
  ] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_COMPILE_PIPE__POST_R3__").asInstanceOf[js.Function2[
    /* type */ typingsSlinky.angularCore.mod.Type[js.Any], 
    /* meta */ typingsSlinky.angularCore.mod.Pipe, 
    scala.Unit
  ]]
  
  @scala.inline
  def ɵSWITCHELEMENTREFFACTORYPOSTR3: js.Function0[typingsSlinky.angularCore.mod.ElementRef[js.Any]] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_ELEMENT_REF_FACTORY__POST_R3__").asInstanceOf[js.Function0[typingsSlinky.angularCore.mod.ElementRef[js.Any]]]
  
  @scala.inline
  def ɵSWITCHIVYENABLEDPOSTR3: /* true */ scala.Boolean = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_IVY_ENABLED__POST_R3__").asInstanceOf[/* true */ scala.Boolean]
  
  @scala.inline
  def ɵSWITCHRENDERER2FACTORYPOSTR3: js.Function0[typingsSlinky.angularCore.mod.Renderer2] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_RENDERER2_FACTORY__POST_R3__").asInstanceOf[js.Function0[typingsSlinky.angularCore.mod.Renderer2]]
  
  @scala.inline
  def ɵSWITCHTEMPLATEREFFACTORYPOSTR3[T](): typingsSlinky.angularCore.mod.TemplateRef[T] | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275SWITCH_TEMPLATE_REF_FACTORY__POST_R3__")().asInstanceOf[typingsSlinky.angularCore.mod.TemplateRef[T] | scala.Null]
  
  @scala.inline
  def ɵSWITCHVIEWCONTAINERREFFACTORYPOSTR3: js.Function0[typingsSlinky.angularCore.mod.ViewContainerRef] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275SWITCH_VIEW_CONTAINER_REF_FACTORY__POST_R3__").asInstanceOf[js.Function0[typingsSlinky.angularCore.mod.ViewContainerRef]]
  
  type ɵSafeHtml = typingsSlinky.angularCore.mod.ɵSafeValue
  
  type ɵSafeResourceUrl = typingsSlinky.angularCore.mod.ɵSafeValue
  
  type ɵSafeScript = typingsSlinky.angularCore.mod.ɵSafeValue
  
  type ɵSafeStyle = typingsSlinky.angularCore.mod.ɵSafeValue
  
  type ɵSafeUrl = typingsSlinky.angularCore.mod.ɵSafeValue
  
  @scala.inline
  def ɵSanitizeHtml(defaultDoc: js.Any, unsafeHtmlInput: java.lang.String): java.lang.String = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275_sanitizeHtml")(defaultDoc.asInstanceOf[js.Any], unsafeHtmlInput.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵSanitizeUrl(url: java.lang.String): java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275_sanitizeUrl")(url.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  type ɵSetterFn = js.Function2[/* obj */ js.Any, /* value */ js.Any, scala.Unit]
  
  @scala.inline
  def ɵallowSanitizationBypassAndThrow(value: js.Any, `type`: typingsSlinky.angularCore.mod.ɵBypassType): scala.Boolean = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowSanitizationBypassAndThrow")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def ɵallowSanitizationBypassAndThrow_HTML(value: js.Any, `type`: typingsSlinky.angularCore.angularCoreStrings.HTML): /* is @angular/core.@angular/core.ɵSafeHtml */ scala.Boolean = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowSanitizationBypassAndThrow")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/core.@angular/core.ɵSafeHtml */ scala.Boolean]
  
  @scala.inline
  def ɵallowSanitizationBypassAndThrow_ResourceURL(value: js.Any, `type`: typingsSlinky.angularCore.angularCoreStrings.ResourceURL): /* is @angular/core.@angular/core.ɵSafeResourceUrl */ scala.Boolean = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowSanitizationBypassAndThrow")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/core.@angular/core.ɵSafeResourceUrl */ scala.Boolean]
  
  @scala.inline
  def ɵallowSanitizationBypassAndThrow_Script(value: js.Any, `type`: typingsSlinky.angularCore.angularCoreStrings.Script): /* is @angular/core.@angular/core.ɵSafeScript */ scala.Boolean = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowSanitizationBypassAndThrow")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/core.@angular/core.ɵSafeScript */ scala.Boolean]
  
  @scala.inline
  def ɵallowSanitizationBypassAndThrow_Style(value: js.Any, `type`: typingsSlinky.angularCore.angularCoreStrings.Style): /* is @angular/core.@angular/core.ɵSafeStyle */ scala.Boolean = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowSanitizationBypassAndThrow")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/core.@angular/core.ɵSafeStyle */ scala.Boolean]
  
  @scala.inline
  def ɵallowSanitizationBypassAndThrow_URL(value: js.Any, `type`: typingsSlinky.angularCore.angularCoreStrings.URL): /* is @angular/core.@angular/core.ɵSafeUrl */ scala.Boolean = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowSanitizationBypassAndThrow")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/core.@angular/core.ɵSafeUrl */ scala.Boolean]
  
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[scala.Double | java.lang.String, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Double,
    childCount: scala.Double
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: js.UndefOr[scala.Nothing],
    templateFactory: typingsSlinky.angularCore.mod.ViewDefinitionFactory
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: scala.Null,
    templateFactory: typingsSlinky.angularCore.mod.ViewDefinitionFactory
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: typingsSlinky.angularCore.mod.ElementHandleEventFn
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: typingsSlinky.angularCore.mod.ElementHandleEventFn,
    templateFactory: typingsSlinky.angularCore.mod.ViewDefinitionFactory
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[scala.Double | java.lang.String, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Null,
    childCount: scala.Double
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: js.UndefOr[scala.Nothing],
    templateFactory: typingsSlinky.angularCore.mod.ViewDefinitionFactory
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: scala.Null,
    templateFactory: typingsSlinky.angularCore.mod.ViewDefinitionFactory
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: typingsSlinky.angularCore.mod.ElementHandleEventFn
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: typingsSlinky.angularCore.mod.ElementHandleEventFn,
    templateFactory: typingsSlinky.angularCore.mod.ViewDefinitionFactory
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Double,
    childCount: scala.Double
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: js.UndefOr[scala.Nothing],
    templateFactory: typingsSlinky.angularCore.mod.ViewDefinitionFactory
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: scala.Null,
    templateFactory: typingsSlinky.angularCore.mod.ViewDefinitionFactory
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: typingsSlinky.angularCore.mod.ElementHandleEventFn
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Double,
    childCount: scala.Double,
    handleEvent: typingsSlinky.angularCore.mod.ElementHandleEventFn,
    templateFactory: typingsSlinky.angularCore.mod.ViewDefinitionFactory
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Null,
    childCount: scala.Double
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: js.UndefOr[scala.Nothing],
    templateFactory: typingsSlinky.angularCore.mod.ViewDefinitionFactory
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: scala.Null,
    templateFactory: typingsSlinky.angularCore.mod.ViewDefinitionFactory
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: typingsSlinky.angularCore.mod.ElementHandleEventFn
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵand(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    ngContentIndex: scala.Null,
    childCount: scala.Double,
    handleEvent: typingsSlinky.angularCore.mod.ElementHandleEventFn,
    templateFactory: typingsSlinky.angularCore.mod.ViewDefinitionFactory
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275and")(flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], templateFactory.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵangularPackagesCoreCoreA(fn: js.Any): scala.Boolean = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_a")(fn.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def ɵangularPackagesCoreCoreB[T](token: typingsSlinky.angularCore.mod.InjectionToken[T]): T | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_b")(token.asInstanceOf[js.Any]).asInstanceOf[T | scala.Null]
  @scala.inline
  def ɵangularPackagesCoreCoreB[T](
    token: typingsSlinky.angularCore.mod.InjectionToken[T],
    flags: typingsSlinky.angularCore.mod.InjectFlags
  ): T | scala.Null = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_b")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | scala.Null]
  @scala.inline
  def ɵangularPackagesCoreCoreB[T](token: typingsSlinky.angularCore.mod.Type[T]): T | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_b")(token.asInstanceOf[js.Any]).asInstanceOf[T | scala.Null]
  @scala.inline
  def ɵangularPackagesCoreCoreB[T](token: typingsSlinky.angularCore.mod.Type[T], flags: typingsSlinky.angularCore.mod.InjectFlags): T | scala.Null = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_b")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | scala.Null]
  
  @scala.inline
  def ɵangularPackagesCoreCoreB_T_T[T](token: typingsSlinky.angularCore.mod.InjectionToken[T]): T = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_b")(token.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def ɵangularPackagesCoreCoreB_T_T[T](token: typingsSlinky.angularCore.mod.Type[T]): T = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_b")(token.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBb[T](definition: typingsSlinky.angularCore.mod.ɵDirectiveDef[T]): js.ThisFunction0[/* this */ typingsSlinky.angularCore.mod.OnChanges, scala.Unit] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bb")(definition.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction0[/* this */ typingsSlinky.angularCore.mod.OnChanges, scala.Unit]]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBc: typingsSlinky.angularCore.mod.InjectionToken[js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit]] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275angular_packages_core_core_bc").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit]]]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBd(tNode: typingsSlinky.angularCore.mod.TNode, attrNameToInject: java.lang.String): java.lang.String | scala.Null = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bd")(tNode.asInstanceOf[js.Any], attrNameToInject.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBe(): typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_be")().asInstanceOf[typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBf(): scala.Double = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bf")().asInstanceOf[scala.Double]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBg[T](level: scala.Double): T = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bg")(level.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBi(
    lView: typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function1[/* v */ js.Any, _],
    exp: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bi")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBi(
    lView: typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function1[/* v */ js.Any, _],
    exp: js.Any,
    thisArg: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bi")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBj(
    lView: typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function2[/* v1 */ js.Any, /* v2 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bj")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBj(
    lView: typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function2[/* v1 */ js.Any, /* v2 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    thisArg: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bj")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBk(
    lView: typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function3[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bk")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBk(
    lView: typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function3[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    thisArg: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bk")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBl(
    lView: typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function4[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bl")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBl(
    lView: typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function4[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    thisArg: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bl")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBm(
    lView: typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function1[/* repeated */ js.Any, _],
    exps: js.Array[_]
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bm")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exps.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBm(
    lView: typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv,
    bindingRoot: scala.Double,
    slotOffset: scala.Double,
    pureFn: js.Function1[/* repeated */ js.Any, _],
    exps: js.Array[_],
    thisArg: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bm")(lView.asInstanceOf[js.Any], bindingRoot.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exps.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBn(tag: java.lang.String, prop: java.lang.String): js.Function1[/* unsafeResourceUrl */ js.Any, java.lang.String] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bn")(tag.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* unsafeResourceUrl */ js.Any, java.lang.String]]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBo(name: java.lang.String): js.Any = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBo(name: java.lang.String, props: js.UndefOr[scala.Nothing], parentClass: js.Any): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bo")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBo(name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _]): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bo")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBo(name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _], parentClass: js.Any): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bo")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBp(name: java.lang.String): js.Any = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bp")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBp(
    name: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    parentClass: js.UndefOr[scala.Nothing],
    additionalProcessing: js.Function3[/* target */ js.Any, /* name */ java.lang.String, /* repeated */ js.Any, scala.Unit]
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bp")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBp(name: java.lang.String, props: js.UndefOr[scala.Nothing], parentClass: js.Any): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bp")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBp(
    name: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    parentClass: js.Any,
    additionalProcessing: js.Function3[/* target */ js.Any, /* name */ java.lang.String, /* repeated */ js.Any, scala.Unit]
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bp")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBp(name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _]): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bp")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBp(
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.UndefOr[scala.Nothing],
    additionalProcessing: js.Function3[/* target */ js.Any, /* name */ java.lang.String, /* repeated */ js.Any, scala.Unit]
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bp")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBp(name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _], parentClass: js.Any): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bp")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵangularPackagesCoreCoreBp(
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function3[/* target */ js.Any, /* name */ java.lang.String, /* repeated */ js.Any, scala.Unit]
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bp")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBq[T](objWithPropertyToExtract: T): java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bq")(objWithPropertyToExtract.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBs(): js.UndefOr[
    js.Function2[
      /* token */ typingsSlinky.angularCore.mod.Type[_] | typingsSlinky.angularCore.mod.InjectionToken[_], 
      /* flags */ js.UndefOr[typingsSlinky.angularCore.mod.InjectFlags], 
      _ | scala.Null
    ]
  ] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bs")().asInstanceOf[js.UndefOr[
    js.Function2[
      /* token */ typingsSlinky.angularCore.mod.Type[_] | typingsSlinky.angularCore.mod.InjectionToken[_], 
      /* flags */ js.UndefOr[typingsSlinky.angularCore.mod.InjectFlags], 
      _ | scala.Null
    ]
  ]]
  
  type ɵangularPackagesCoreCoreBt = typingsSlinky.angularCore.angularCoreNumbers.`-1`
  
  @scala.inline
  def ɵangularPackagesCoreCoreBu(
    tNode: typingsSlinky.angularCore.mod.TNode,
    lView: typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv
  ): typingsSlinky.angularCore.mod.RNode = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bu")(tNode.asInstanceOf[js.Any], lView.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.RNode]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBw(viewOrComponent: js.Object): typingsSlinky.angularCore.mod.RootContext = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bw")(viewOrComponent.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.RootContext]
  @scala.inline
  def ɵangularPackagesCoreCoreBw(viewOrComponent: typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv): typingsSlinky.angularCore.mod.RootContext = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bw")(viewOrComponent.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.RootContext]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBx(message: java.lang.String): java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bx")(message.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def ɵangularPackagesCoreCoreBx(
    message: java.lang.String,
    replacements: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ): java.lang.String = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bx")(message.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBy(html: java.lang.String): typingsSlinky.angularCore.mod.TrustedHTML | java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_by")(html.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.TrustedHTML | java.lang.String]
  
  @scala.inline
  def ɵangularPackagesCoreCoreBz(url: java.lang.String): typingsSlinky.angularCore.mod.TrustedScriptURL | java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_bz")(url.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.TrustedScriptURL | java.lang.String]
  
  @scala.inline
  def ɵangularPackagesCoreCoreCa(script: java.lang.String): typingsSlinky.angularCore.mod.TrustedScript | java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_ca")(script.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.TrustedScript | java.lang.String]
  
  @scala.inline
  def ɵangularPackagesCoreCoreE(providers: js.Array[typingsSlinky.angularCore.mod.Provider]): js.Array[typingsSlinky.angularCore.mod.ResolvedReflectiveProvider] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_e")(providers.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.angularCore.mod.ResolvedReflectiveProvider]]
  
  @scala.inline
  def ɵangularPackagesCoreCoreF(): java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_f")().asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵangularPackagesCoreCoreG(): typingsSlinky.angularCore.mod.Renderer2 = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_g")().asInstanceOf[typingsSlinky.angularCore.mod.Renderer2]
  
  @scala.inline
  def ɵangularPackagesCoreCoreH(): typingsSlinky.angularCore.mod.ElementRef[_] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_h")().asInstanceOf[typingsSlinky.angularCore.mod.ElementRef[_]]
  
  @scala.inline
  def ɵangularPackagesCoreCoreI(
    tNode: typingsSlinky.angularCore.mod.TNode,
    lView: typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv
  ): typingsSlinky.angularCore.mod.ElementRef[_] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_i")(tNode.asInstanceOf[js.Any], lView.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.ElementRef[_]]
  
  @scala.inline
  def ɵangularPackagesCoreCoreJ(id: java.lang.String): typingsSlinky.angularCore.mod.NgModuleFactory[_] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_j")(id.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.NgModuleFactory[_]]
  
  @scala.inline
  def ɵangularPackagesCoreCoreK[T](): typingsSlinky.angularCore.mod.TemplateRef[T] | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_k")().asInstanceOf[typingsSlinky.angularCore.mod.TemplateRef[T] | scala.Null]
  
  @scala.inline
  def ɵangularPackagesCoreCoreL[T](
    hostTNode: typingsSlinky.angularCore.mod.TNode,
    hostLView: typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv
  ): typingsSlinky.angularCore.mod.TemplateRef[T] | scala.Null = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_l")(hostTNode.asInstanceOf[js.Any], hostLView.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.TemplateRef[T] | scala.Null]
  
  @scala.inline
  def ɵangularPackagesCoreCoreM(): typingsSlinky.angularCore.mod.ViewContainerRef = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_m")().asInstanceOf[typingsSlinky.angularCore.mod.ViewContainerRef]
  
  @scala.inline
  def ɵangularPackagesCoreCoreP(nativeNode: js.Any): typingsSlinky.angularCore.mod.DebugNode | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_p")(nativeNode.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.DebugNode | scala.Null]
  
  @scala.inline
  def ɵangularPackagesCoreCoreQ(): typingsSlinky.angularCore.mod.ChangeDetectorRef = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_q")().asInstanceOf[typingsSlinky.angularCore.mod.ChangeDetectorRef]
  @scala.inline
  def ɵangularPackagesCoreCoreQ(isPipe: scala.Boolean): typingsSlinky.angularCore.mod.ChangeDetectorRef = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_q")(isPipe.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.ChangeDetectorRef]
  
  @scala.inline
  def ɵangularPackagesCoreCoreT(): typingsSlinky.angularCore.mod.IterableDiffers = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_t")().asInstanceOf[typingsSlinky.angularCore.mod.IterableDiffers]
  
  @scala.inline
  def ɵangularPackagesCoreCoreU(): typingsSlinky.angularCore.mod.KeyValueDiffers = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_u")().asInstanceOf[typingsSlinky.angularCore.mod.KeyValueDiffers]
  
  @scala.inline
  def ɵangularPackagesCoreCoreV(): java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_v")().asInstanceOf[java.lang.String]
  @scala.inline
  def ɵangularPackagesCoreCoreV(locale: java.lang.String): java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_v")(locale.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵangularPackagesCoreCoreW: js.Array[typingsSlinky.angularCore.mod.StaticProvider] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275angular_packages_core_core_w").asInstanceOf[js.Array[typingsSlinky.angularCore.mod.StaticProvider]]
  
  @scala.inline
  def ɵangularPackagesCoreCoreX(ngZone: typingsSlinky.angularCore.mod.NgZone): js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_x")(ngZone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fn */ js.Function0[scala.Unit], scala.Unit]]
  
  @scala.inline
  def ɵangularPackagesCoreCoreY: /* "USD" */ java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275angular_packages_core_core_y").asInstanceOf[/* "USD" */ java.lang.String]
  
  @scala.inline
  def ɵangularPackagesCoreCoreZ(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _]) | _]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_z")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵangularPackagesCoreCoreZ(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _]) | _],
    bindings: js.UndefOr[scala.Nothing],
    outputs: js.Array[typingsSlinky.angularCore.mod.OutputDef]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_z")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵangularPackagesCoreCoreZ(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _]) | _],
    bindings: js.Array[typingsSlinky.angularCore.mod.BindingDef]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_z")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵangularPackagesCoreCoreZ(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _]) | _],
    bindings: js.Array[typingsSlinky.angularCore.mod.BindingDef],
    outputs: js.Array[typingsSlinky.angularCore.mod.OutputDef]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_z")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵangularPackagesCoreCoreZ(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _]) | _]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_z")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵangularPackagesCoreCoreZ(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _]) | _],
    bindings: js.UndefOr[scala.Nothing],
    outputs: js.Array[typingsSlinky.angularCore.mod.OutputDef]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_z")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵangularPackagesCoreCoreZ(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _]) | _],
    bindings: js.Array[typingsSlinky.angularCore.mod.BindingDef]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_z")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵangularPackagesCoreCoreZ(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null,
    childCount: scala.Double,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _]) | _],
    bindings: js.Array[typingsSlinky.angularCore.mod.BindingDef],
    outputs: js.Array[typingsSlinky.angularCore.mod.OutputDef]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_core_core_z")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵbypassSanitizationTrustHtml(trustedHtml: java.lang.String): typingsSlinky.angularCore.mod.ɵSafeHtml = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275bypassSanitizationTrustHtml")(trustedHtml.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.ɵSafeHtml]
  
  @scala.inline
  def ɵbypassSanitizationTrustResourceUrl(trustedResourceUrl: java.lang.String): typingsSlinky.angularCore.mod.ɵSafeResourceUrl = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275bypassSanitizationTrustResourceUrl")(trustedResourceUrl.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.ɵSafeResourceUrl]
  
  @scala.inline
  def ɵbypassSanitizationTrustScript(trustedScript: java.lang.String): typingsSlinky.angularCore.mod.ɵSafeScript = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275bypassSanitizationTrustScript")(trustedScript.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.ɵSafeScript]
  
  @scala.inline
  def ɵbypassSanitizationTrustStyle(trustedStyle: java.lang.String): typingsSlinky.angularCore.mod.ɵSafeStyle = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275bypassSanitizationTrustStyle")(trustedStyle.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.ɵSafeStyle]
  
  @scala.inline
  def ɵbypassSanitizationTrustUrl(trustedUrl: java.lang.String): typingsSlinky.angularCore.mod.ɵSafeUrl = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275bypassSanitizationTrustUrl")(trustedUrl.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.ɵSafeUrl]
  
  @scala.inline
  def ɵccf(
    selector: java.lang.String,
    componentType: typingsSlinky.angularCore.mod.Type[_],
    viewDefFactory: typingsSlinky.angularCore.mod.ViewDefinitionFactory,
    inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    ngContentSelectors: js.Array[java.lang.String]
  ): typingsSlinky.angularCore.mod.ComponentFactory[_] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275ccf")(selector.asInstanceOf[js.Any], componentType.asInstanceOf[js.Any], viewDefFactory.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], ngContentSelectors.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.ComponentFactory[_]]
  @scala.inline
  def ɵccf(
    selector: java.lang.String,
    componentType: typingsSlinky.angularCore.mod.Type[_],
    viewDefFactory: typingsSlinky.angularCore.mod.ViewDefinitionFactory,
    inputs: scala.Null,
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    ngContentSelectors: js.Array[java.lang.String]
  ): typingsSlinky.angularCore.mod.ComponentFactory[_] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275ccf")(selector.asInstanceOf[js.Any], componentType.asInstanceOf[js.Any], viewDefFactory.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], ngContentSelectors.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.ComponentFactory[_]]
  
  @scala.inline
  def ɵclearOverrides(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275clearOverrides")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵclearResolutionOfComponentResourcesQueue(): typingsSlinky.std.Map[typingsSlinky.angularCore.mod.Type[_], typingsSlinky.angularCore.mod.Component] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275clearResolutionOfComponentResourcesQueue")().asInstanceOf[typingsSlinky.std.Map[typingsSlinky.angularCore.mod.Type[_], typingsSlinky.angularCore.mod.Component]]
  
  @scala.inline
  def ɵcmf(
    ngModuleType: typingsSlinky.angularCore.mod.Type[_],
    bootstrapComponents: js.Array[typingsSlinky.angularCore.mod.Type[_]],
    defFactory: typingsSlinky.angularCore.mod.NgModuleDefinitionFactory
  ): typingsSlinky.angularCore.mod.NgModuleFactory[_] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275cmf")(ngModuleType.asInstanceOf[js.Any], bootstrapComponents.asInstanceOf[js.Any], defFactory.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NgModuleFactory[_]]
  
  @scala.inline
  def ɵcompileComponent(`type`: typingsSlinky.angularCore.mod.Type[_], metadata: typingsSlinky.angularCore.mod.Component): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileComponent")(`type`.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵcompileDirective(`type`: typingsSlinky.angularCore.mod.Type[_]): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileDirective")(`type`.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵcompileDirective(`type`: typingsSlinky.angularCore.mod.Type[_], directive: typingsSlinky.angularCore.mod.Directive): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileDirective")(`type`.asInstanceOf[js.Any], directive.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵcompileNgModule(moduleType: typingsSlinky.angularCore.mod.Type[_]): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileNgModule")(moduleType.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵcompileNgModule(
    moduleType: typingsSlinky.angularCore.mod.Type[_],
    ngModule: typingsSlinky.angularCore.mod.NgModule
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileNgModule")(moduleType.asInstanceOf[js.Any], ngModule.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵcompileNgModuleDefs(
    moduleType: typingsSlinky.angularCore.mod.ɵNgModuleType[_],
    ngModule: typingsSlinky.angularCore.mod.NgModule
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileNgModuleDefs")(moduleType.asInstanceOf[js.Any], ngModule.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵcompileNgModuleDefs(
    moduleType: typingsSlinky.angularCore.mod.ɵNgModuleType[_],
    ngModule: typingsSlinky.angularCore.mod.NgModule,
    allowDuplicateDeclarationsInRoot: scala.Boolean
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileNgModuleDefs")(moduleType.asInstanceOf[js.Any], ngModule.asInstanceOf[js.Any], allowDuplicateDeclarationsInRoot.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵcompileNgModuleFactoryPOSTR3[M](
    injector: typingsSlinky.angularCore.mod.Injector,
    options: typingsSlinky.angularCore.mod.CompilerOptions,
    moduleType: typingsSlinky.angularCore.mod.Type[M]
  ): js.Promise[typingsSlinky.angularCore.mod.NgModuleFactory[M]] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compileNgModuleFactory__POST_R3__")(injector.asInstanceOf[js.Any], options.asInstanceOf[js.Any], moduleType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.angularCore.mod.NgModuleFactory[M]]]
  
  @scala.inline
  def ɵcompilePipe(`type`: typingsSlinky.angularCore.mod.Type[_], meta: typingsSlinky.angularCore.mod.Pipe): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275compilePipe")(`type`.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵcreateInjector(defType: js.Any): typingsSlinky.angularCore.mod.Injector = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: js.UndefOr[scala.Nothing],
    additionalProviders: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typingsSlinky.angularCore.mod.Injector = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: js.UndefOr[scala.Nothing],
    additionalProviders: js.Array[typingsSlinky.angularCore.mod.StaticProvider]
  ): typingsSlinky.angularCore.mod.Injector = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: js.UndefOr[scala.Nothing],
    additionalProviders: js.Array[typingsSlinky.angularCore.mod.StaticProvider],
    name: java.lang.String
  ): typingsSlinky.angularCore.mod.Injector = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: js.UndefOr[scala.Nothing],
    additionalProviders: scala.Null,
    name: java.lang.String
  ): typingsSlinky.angularCore.mod.Injector = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: scala.Null,
    additionalProviders: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typingsSlinky.angularCore.mod.Injector = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: scala.Null,
    additionalProviders: js.Array[typingsSlinky.angularCore.mod.StaticProvider]
  ): typingsSlinky.angularCore.mod.Injector = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: scala.Null,
    additionalProviders: js.Array[typingsSlinky.angularCore.mod.StaticProvider],
    name: java.lang.String
  ): typingsSlinky.angularCore.mod.Injector = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(defType: js.Any, parent: scala.Null, additionalProviders: scala.Null, name: java.lang.String): typingsSlinky.angularCore.mod.Injector = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(defType: js.Any, parent: typingsSlinky.angularCore.mod.Injector): typingsSlinky.angularCore.mod.Injector = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: typingsSlinky.angularCore.mod.Injector,
    additionalProviders: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typingsSlinky.angularCore.mod.Injector = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: typingsSlinky.angularCore.mod.Injector,
    additionalProviders: js.Array[typingsSlinky.angularCore.mod.StaticProvider]
  ): typingsSlinky.angularCore.mod.Injector = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: typingsSlinky.angularCore.mod.Injector,
    additionalProviders: js.Array[typingsSlinky.angularCore.mod.StaticProvider],
    name: java.lang.String
  ): typingsSlinky.angularCore.mod.Injector = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.Injector]
  @scala.inline
  def ɵcreateInjector(
    defType: js.Any,
    parent: typingsSlinky.angularCore.mod.Injector,
    additionalProviders: scala.Null,
    name: java.lang.String
  ): typingsSlinky.angularCore.mod.Injector = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275createInjector")(defType.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], additionalProviders.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.Injector]
  
  @scala.inline
  def ɵcrt(values: typingsSlinky.angularCore.anon.Data): typingsSlinky.angularCore.mod.RendererType2 = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275crt")(values.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.RendererType2]
  
  @scala.inline
  def ɵdefaultIterableDiffers: typingsSlinky.angularCore.mod.IterableDiffers = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275defaultIterableDiffers").asInstanceOf[typingsSlinky.angularCore.mod.IterableDiffers]
  
  @scala.inline
  def ɵdefaultKeyValueDiffers: typingsSlinky.angularCore.mod.KeyValueDiffers = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275defaultKeyValueDiffers").asInstanceOf[typingsSlinky.angularCore.mod.KeyValueDiffers]
  
  @scala.inline
  def ɵdetectChanges(component: js.Object): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275detectChanges")(component.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵdevModeEqual(a: js.Any, b: js.Any): scala.Boolean = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275devModeEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueries: js.Array[
      js.Tuple2[scala.Double | java.lang.String, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _])]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueries: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _]) | _],
    props: js.UndefOr[scala.Nothing],
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], props.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueries: js.Array[
      js.Tuple2[scala.Double | java.lang.String, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _])],
    props: org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, java.lang.String]]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueries: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _]) | _],
    props: org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, java.lang.String]],
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], props.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueries: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _]) | _],
    props: scala.Null,
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], props.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueries: scala.Null,
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _])]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueries: scala.Null,
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _]) | _],
    props: js.UndefOr[scala.Nothing],
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], props.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueries: scala.Null,
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[_ | (js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _])],
    props: org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, java.lang.String]]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueries: scala.Null,
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _]) | _],
    props: org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, java.lang.String]],
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], props.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵdid(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueries: scala.Null,
    childCount: scala.Double,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _]) | _],
    props: scala.Null,
    outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275did")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], props.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵeld(
    checkIndex: scala.Double,
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueriesDsl: scala.Null | (js.Array[
      js.Tuple2[java.lang.String | scala.Double, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ]),
    ngContentIndex: scala.Null | scala.Double,
    childCount: scala.Double,
    namespaceAndName: java.lang.String | scala.Null,
    fixedAttrs: js.UndefOr[scala.Null | (js.Array[js.Tuple2[java.lang.String, java.lang.String]])],
    bindings: js.UndefOr[
      scala.Null | (js.Array[
        js.Tuple3[
          typingsSlinky.angularCore.mod.ɵBindingFlags, 
          java.lang.String, 
          java.lang.String | typingsSlinky.angularCore.mod.SecurityContext | scala.Null
        ]
      ])
    ],
    outputs: js.UndefOr[scala.Null | (js.Array[js.Tuple2[java.lang.String, java.lang.String]])],
    handleEvent: js.UndefOr[scala.Null | typingsSlinky.angularCore.mod.ElementHandleEventFn],
    componentView: js.UndefOr[scala.Null | typingsSlinky.angularCore.mod.ViewDefinitionFactory],
    componentRendererType: js.UndefOr[typingsSlinky.angularCore.mod.RendererType2 | scala.Null]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275eld")(checkIndex.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], matchedQueriesDsl.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], childCount.asInstanceOf[js.Any], namespaceAndName.asInstanceOf[js.Any], fixedAttrs.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], handleEvent.asInstanceOf[js.Any], componentView.asInstanceOf[js.Any], componentRendererType.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵfindLocaleData(locale: java.lang.String): js.Any = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275findLocaleData")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵflushModuleScopingQueueAsMuchAsPossible(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275flushModuleScopingQueueAsMuchAsPossible")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵgetComponentViewDefinitionFactory(componentFactory: typingsSlinky.angularCore.mod.ComponentFactory[_]): typingsSlinky.angularCore.mod.ViewDefinitionFactory = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getComponentViewDefinitionFactory")(componentFactory.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.ViewDefinitionFactory]
  
  @scala.inline
  def ɵgetDebugNodePOSTR3(nativeNode: org.scalajs.dom.raw.Element): typingsSlinky.angularCore.mod.DebugElementPOSTR3 = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getDebugNode__POST_R3__")(nativeNode.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.DebugElementPOSTR3]
  @scala.inline
  def ɵgetDebugNodePOSTR3(nativeNode: org.scalajs.dom.raw.Node): typingsSlinky.angularCore.mod.DebugNodePOSTR3 = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getDebugNode__POST_R3__")(nativeNode.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.DebugNodePOSTR3]
  @scala.inline
  def ɵgetDebugNodePOSTR3(nativeNode: scala.Null): scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getDebugNode__POST_R3__")(nativeNode.asInstanceOf[js.Any]).asInstanceOf[scala.Null]
  
  @scala.inline
  def ɵgetDebugNodeR2(nativeNode: js.Any): typingsSlinky.angularCore.mod.DebugNode | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getDebugNodeR2")(nativeNode.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.DebugNode | scala.Null]
  
  @scala.inline
  def ɵgetDirectives(element: org.scalajs.dom.raw.Element): js.Array[js.Object] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getDirectives")(element.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  
  @scala.inline
  def ɵgetHostElement(componentOrDirective: js.Object): org.scalajs.dom.raw.Element = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getHostElement")(componentOrDirective.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.raw.Element]
  
  @scala.inline
  def ɵgetInjectableDef[T](`type`: js.Any): typingsSlinky.angularCore.mod.ɵɵInjectableDef[T] | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getInjectableDef")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.ɵɵInjectableDef[T] | scala.Null]
  
  @scala.inline
  def ɵgetLContext(target: js.Any): typingsSlinky.angularCore.mod.ɵLContext | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getLContext")(target.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.ɵLContext | scala.Null]
  
  @scala.inline
  def ɵgetLocaleCurrencyCode(locale: java.lang.String): java.lang.String | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getLocaleCurrencyCode")(locale.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def ɵgetLocalePluralCase(locale: java.lang.String): js.Function1[/* value */ scala.Double, scala.Double] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getLocalePluralCase")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ scala.Double, scala.Double]]
  
  @scala.inline
  def ɵgetModuleFactoryPOSTR3(id: java.lang.String): typingsSlinky.angularCore.mod.NgModuleFactory[_] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getModuleFactory__POST_R3__")(id.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.NgModuleFactory[_]]
  
  @scala.inline
  def ɵgetSanitizationBypassType(value: js.Any): typingsSlinky.angularCore.mod.ɵBypassType | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getSanitizationBypassType")(value.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.ɵBypassType | scala.Null]
  
  @scala.inline
  def ɵglobal: js.Any = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275global").asInstanceOf[js.Any]
  
  @scala.inline
  def ɵinitServicesIfNeeded(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275initServicesIfNeeded")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵinlineInterpolate(
    valueCount: scala.Double,
    c0: java.lang.String,
    a1: js.Any,
    c1: java.lang.String,
    a2: js.UndefOr[js.Any],
    c2: js.UndefOr[java.lang.String],
    a3: js.UndefOr[js.Any],
    c3: js.UndefOr[java.lang.String],
    a4: js.UndefOr[js.Any],
    c4: js.UndefOr[java.lang.String],
    a5: js.UndefOr[js.Any],
    c5: js.UndefOr[java.lang.String],
    a6: js.UndefOr[js.Any],
    c6: js.UndefOr[java.lang.String],
    a7: js.UndefOr[js.Any],
    c7: js.UndefOr[java.lang.String],
    a8: js.UndefOr[js.Any],
    c8: js.UndefOr[java.lang.String],
    a9: js.UndefOr[js.Any],
    c9: js.UndefOr[java.lang.String]
  ): java.lang.String = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275inlineInterpolate")(valueCount.asInstanceOf[js.Any], c0.asInstanceOf[js.Any], a1.asInstanceOf[js.Any], c1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], c2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], c3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any], c4.asInstanceOf[js.Any], a5.asInstanceOf[js.Any], c5.asInstanceOf[js.Any], a6.asInstanceOf[js.Any], c6.asInstanceOf[js.Any], a7.asInstanceOf[js.Any], c7.asInstanceOf[js.Any], a8.asInstanceOf[js.Any], c8.asInstanceOf[js.Any], a9.asInstanceOf[js.Any], c9.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵinterpolate(valueCount: scala.Double, constAndInterp: js.Array[java.lang.String]): java.lang.String = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275interpolate")(valueCount.asInstanceOf[js.Any], constAndInterp.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵisBoundToModulePOSTR3[C](cf: typingsSlinky.angularCore.mod.ComponentFactory[C]): scala.Boolean = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isBoundToModule__POST_R3__")(cf.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def ɵisDefaultChangeDetectionStrategy(changeDetectionStrategy: typingsSlinky.angularCore.mod.ChangeDetectionStrategy): scala.Boolean = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isDefaultChangeDetectionStrategy")(changeDetectionStrategy.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def ɵisListLikeIterable(obj: js.Any): scala.Boolean = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isListLikeIterable")(obj.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def ɵisObservable(obj: js.Any): /* is rxjs.rxjs.Observable<any> */ scala.Boolean = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isObservable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rxjs.rxjs.Observable<any> */ scala.Boolean]
  @scala.inline
  def ɵisObservable(obj: typingsSlinky.rxjs.mod.Observable_[_]): /* is rxjs.rxjs.Observable<any> */ scala.Boolean = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isObservable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rxjs.rxjs.Observable<any> */ scala.Boolean]
  
  @scala.inline
  def ɵisPromise[T](obj: js.Any): /* is std.Promise<T> */ scala.Boolean = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isPromise")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<T> */ scala.Boolean]
  
  @scala.inline
  def ɵivyEnabled: /* false */ scala.Boolean = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275ivyEnabled").asInstanceOf[/* false */ scala.Boolean]
  
  @scala.inline
  def ɵmakeDecorator[T](name: java.lang.String): typingsSlinky.angularCore.anon.Call = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    parentClass: js.UndefOr[scala.Nothing],
    additionalProcessing: js.UndefOr[scala.Nothing],
    typeFn: js.Function2[/* type */ typingsSlinky.angularCore.mod.Type[T], /* repeated */ js.Any, scala.Unit]
  ): typingsSlinky.angularCore.anon.Call = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any], typeFn.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    parentClass: js.UndefOr[scala.Nothing],
    additionalProcessing: js.Function1[/* type */ typingsSlinky.angularCore.mod.Type[T], scala.Unit]
  ): typingsSlinky.angularCore.anon.Call = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    parentClass: js.UndefOr[scala.Nothing],
    additionalProcessing: js.Function1[/* type */ typingsSlinky.angularCore.mod.Type[T], scala.Unit],
    typeFn: js.Function2[/* type */ typingsSlinky.angularCore.mod.Type[T], /* repeated */ js.Any, scala.Unit]
  ): typingsSlinky.angularCore.anon.Call = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any], typeFn.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](name: java.lang.String, props: js.UndefOr[scala.Nothing], parentClass: js.Any): typingsSlinky.angularCore.anon.Call = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    parentClass: js.Any,
    additionalProcessing: js.UndefOr[scala.Nothing],
    typeFn: js.Function2[/* type */ typingsSlinky.angularCore.mod.Type[T], /* repeated */ js.Any, scala.Unit]
  ): typingsSlinky.angularCore.anon.Call = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any], typeFn.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ typingsSlinky.angularCore.mod.Type[T], scala.Unit]
  ): typingsSlinky.angularCore.anon.Call = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ typingsSlinky.angularCore.mod.Type[T], scala.Unit],
    typeFn: js.Function2[/* type */ typingsSlinky.angularCore.mod.Type[T], /* repeated */ js.Any, scala.Unit]
  ): typingsSlinky.angularCore.anon.Call = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any], typeFn.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _]): typingsSlinky.angularCore.anon.Call = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.UndefOr[scala.Nothing],
    additionalProcessing: js.UndefOr[scala.Nothing],
    typeFn: js.Function2[/* type */ typingsSlinky.angularCore.mod.Type[T], /* repeated */ js.Any, scala.Unit]
  ): typingsSlinky.angularCore.anon.Call = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any], typeFn.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.UndefOr[scala.Nothing],
    additionalProcessing: js.Function1[/* type */ typingsSlinky.angularCore.mod.Type[T], scala.Unit]
  ): typingsSlinky.angularCore.anon.Call = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.UndefOr[scala.Nothing],
    additionalProcessing: js.Function1[/* type */ typingsSlinky.angularCore.mod.Type[T], scala.Unit],
    typeFn: js.Function2[/* type */ typingsSlinky.angularCore.mod.Type[T], /* repeated */ js.Any, scala.Unit]
  ): typingsSlinky.angularCore.anon.Call = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any], typeFn.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](name: java.lang.String, props: js.Function1[/* repeated */ js.Any, _], parentClass: js.Any): typingsSlinky.angularCore.anon.Call = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.UndefOr[scala.Nothing],
    typeFn: js.Function2[/* type */ typingsSlinky.angularCore.mod.Type[T], /* repeated */ js.Any, scala.Unit]
  ): typingsSlinky.angularCore.anon.Call = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any], typeFn.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ typingsSlinky.angularCore.mod.Type[T], scala.Unit]
  ): typingsSlinky.angularCore.anon.Call = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Call]
  @scala.inline
  def ɵmakeDecorator[T](
    name: java.lang.String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ typingsSlinky.angularCore.mod.Type[T], scala.Unit],
    typeFn: js.Function2[/* type */ typingsSlinky.angularCore.mod.Type[T], /* repeated */ js.Any, scala.Unit]
  ): typingsSlinky.angularCore.anon.Call = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeDecorator")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parentClass.asInstanceOf[js.Any], additionalProcessing.asInstanceOf[js.Any], typeFn.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Call]
  
  @scala.inline
  def ɵmarkDirty(component: js.Object): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275markDirty")(component.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵmod(providers: js.Array[typingsSlinky.angularCore.mod.NgModuleProviderDef]): typingsSlinky.angularCore.mod.NgModuleDefinition = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275mod")(providers.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.NgModuleDefinition]
  
  @scala.inline
  def ɵmpd(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _]) | _]
  ): typingsSlinky.angularCore.mod.NgModuleProviderDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275mpd")(flags.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NgModuleProviderDef]
  
  @scala.inline
  def ɵncd(ngContentIndex: scala.Double, index: scala.Double): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275ncd")(ngContentIndex.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵncd(ngContentIndex: scala.Null, index: scala.Double): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275ncd")(ngContentIndex.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵnoSideEffects[T](fn: js.Function0[T]): T = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275noSideEffects")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def ɵnov(view: typingsSlinky.angularCore.mod.ViewData, index: scala.Double): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275nov")(view.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵoverrideComponentView(
    comp: typingsSlinky.angularCore.mod.Type[_],
    componentFactory: typingsSlinky.angularCore.mod.ComponentFactory[_]
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275overrideComponentView")(comp.asInstanceOf[js.Any], componentFactory.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵoverrideProvider(`override`: typingsSlinky.angularCore.mod.ProviderOverride): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275overrideProvider")(`override`.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵpad(checkIndex: scala.Double, argCount: scala.Double): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275pad")(checkIndex.asInstanceOf[js.Any], argCount.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵpatchComponentDefWithScope[C](
    componentDef: typingsSlinky.angularCore.mod.ɵComponentDef[C],
    transitiveScopes: typingsSlinky.angularCore.mod.ɵNgModuleTransitiveScopes
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275patchComponentDefWithScope")(componentDef.asInstanceOf[js.Any], transitiveScopes.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵpid(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    ctor: js.Any,
    deps: js.Array[(js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _]) | _]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275pid")(flags.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵpod(checkIndex: scala.Double, propToIndex: org.scalablytyped.runtime.StringDictionary[scala.Double]): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275pod")(checkIndex.asInstanceOf[js.Any], propToIndex.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵppd(checkIndex: scala.Double, argCount: scala.Double): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275ppd")(checkIndex.asInstanceOf[js.Any], argCount.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵprd(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueries: js.Array[
      js.Tuple2[java.lang.String | scala.Double, typingsSlinky.angularCore.mod.ɵQueryValueType]
    ],
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _]) | _]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275prd")(flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵprd(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    matchedQueries: scala.Null,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[typingsSlinky.angularCore.mod.ɵDepFlags, _]) | _]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275prd")(flags.asInstanceOf[js.Any], matchedQueries.asInstanceOf[js.Any], token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵpublishDefaultGlobalUtils(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275publishDefaultGlobalUtils")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵpublishGlobalUtil(name: java.lang.String, fn: js.Function): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275publishGlobalUtil")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵqud(
    flags: typingsSlinky.angularCore.mod.ɵNodeFlags,
    id: scala.Double,
    bindings: org.scalablytyped.runtime.StringDictionary[typingsSlinky.angularCore.mod.ɵQueryBindingType]
  ): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275qud")(flags.asInstanceOf[js.Any], id.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵregisterLocaleData(data: js.Any): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerLocaleData")(data.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵregisterLocaleData(data: js.Any, localeId: js.UndefOr[scala.Nothing], extraData: js.Any): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], extraData.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵregisterLocaleData(data: js.Any, localeId: java.lang.String): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵregisterLocaleData(data: js.Any, localeId: java.lang.String, extraData: js.Any): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], extraData.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵregisterLocaleData(data: js.Any, localeId: js.Any): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵregisterLocaleData(data: js.Any, localeId: js.Any, extraData: js.Any): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], extraData.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵregisterModuleFactory(id: java.lang.String, factory: typingsSlinky.angularCore.mod.NgModuleFactory[_]): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerModuleFactory")(id.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵregisterNgModuleType(ngModuleType: typingsSlinky.angularCore.mod.ɵNgModuleType[_]): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275registerNgModuleType")(ngModuleType.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵrenderComponent[T](componentType: typingsSlinky.angularCore.mod.Type[T]): T = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275renderComponent")(componentType.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def ɵrenderComponent[T](
    componentType: typingsSlinky.angularCore.mod.Type[T],
    opts: typingsSlinky.angularCore.mod.CreateComponentOptions
  ): T = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275renderComponent")(componentType.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def ɵrenderComponent[T](componentType: typingsSlinky.angularCore.mod.ɵComponentType[T]): T = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275renderComponent")(componentType.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def ɵrenderComponent[T](
    componentType: typingsSlinky.angularCore.mod.ɵComponentType[T],
    opts: typingsSlinky.angularCore.mod.CreateComponentOptions
  ): T = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275renderComponent")(componentType.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def ɵresetCompiledComponents(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275resetCompiledComponents")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵresetJitOptions(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275resetJitOptions")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵresolveComponentResources(
    resourceResolver: js.Function1[
      /* url */ java.lang.String, 
      js.Promise[java.lang.String | typingsSlinky.angularCore.anon.Text]
    ]
  ): js.Promise[scala.Unit] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275resolveComponentResources")(resourceResolver.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  
  @scala.inline
  def ɵsetClassMetadata(`type`: typingsSlinky.angularCore.mod.Type[_]): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵsetClassMetadata(`type`: typingsSlinky.angularCore.mod.Type[_], decorators: js.Array[_]): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵsetClassMetadata(
    `type`: typingsSlinky.angularCore.mod.Type[_],
    decorators: js.Array[_],
    ctorParameters: js.Function0[js.Array[_]]
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵsetClassMetadata(
    `type`: typingsSlinky.angularCore.mod.Type[_],
    decorators: js.Array[_],
    ctorParameters: js.Function0[js.Array[_]],
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any], propDecorators.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵsetClassMetadata(
    `type`: typingsSlinky.angularCore.mod.Type[_],
    decorators: js.Array[_],
    ctorParameters: scala.Null,
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any], propDecorators.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵsetClassMetadata(
    `type`: typingsSlinky.angularCore.mod.Type[_],
    decorators: scala.Null,
    ctorParameters: js.Function0[js.Array[_]]
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵsetClassMetadata(
    `type`: typingsSlinky.angularCore.mod.Type[_],
    decorators: scala.Null,
    ctorParameters: js.Function0[js.Array[_]],
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any], propDecorators.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵsetClassMetadata(
    `type`: typingsSlinky.angularCore.mod.Type[_],
    decorators: scala.Null,
    ctorParameters: scala.Null,
    propDecorators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setClassMetadata")(`type`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any], ctorParameters.asInstanceOf[js.Any], propDecorators.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵsetCurrentInjector(): js.UndefOr[typingsSlinky.angularCore.mod.Injector | scala.Null] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setCurrentInjector")().asInstanceOf[js.UndefOr[typingsSlinky.angularCore.mod.Injector | scala.Null]]
  @scala.inline
  def ɵsetCurrentInjector(injector: typingsSlinky.angularCore.mod.Injector): js.UndefOr[typingsSlinky.angularCore.mod.Injector | scala.Null] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setCurrentInjector")(injector.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.angularCore.mod.Injector | scala.Null]]
  
  @scala.inline
  def ɵsetDocument(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setDocument")().asInstanceOf[scala.Unit]
  @scala.inline
  def ɵsetDocument(document: org.scalajs.dom.raw.Document): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setDocument")(document.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵsetLocaleId(localeId: java.lang.String): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setLocaleId")(localeId.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵstore[T](
    tView: typingsSlinky.angularCore.mod.TView,
    lView: typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv,
    index: scala.Double,
    value: T
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275store")(tView.asInstanceOf[js.Any], lView.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵstringify(token: js.Any): java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275stringify")(token.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵted(checkIndex: scala.Double, ngContentIndex: scala.Double, staticText: js.Array[java.lang.String]): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275ted")(checkIndex.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], staticText.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  @scala.inline
  def ɵted(checkIndex: scala.Double, ngContentIndex: scala.Null, staticText: js.Array[java.lang.String]): typingsSlinky.angularCore.mod.NodeDef = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275ted")(checkIndex.asInstanceOf[js.Any], ngContentIndex.asInstanceOf[js.Any], staticText.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.NodeDef]
  
  @scala.inline
  def ɵtransitiveScopesFor[T](moduleType: typingsSlinky.angularCore.mod.Type[T]): typingsSlinky.angularCore.mod.ɵNgModuleTransitiveScopes = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275transitiveScopesFor")(moduleType.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.ɵNgModuleTransitiveScopes]
  
  @scala.inline
  def ɵunregisterLocaleData(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275unregisterLocaleData")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵunv(
    view: typingsSlinky.angularCore.mod.ViewData,
    nodeIdx: scala.Double,
    bindingIdx: scala.Double,
    value: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275unv")(view.asInstanceOf[js.Any], nodeIdx.asInstanceOf[js.Any], bindingIdx.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵunwrapSafeValue(value: typingsSlinky.angularCore.mod.ɵSafeValue): java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275unwrapSafeValue")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def ɵunwrapSafeValue[T](value: T): T = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275unwrapSafeValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def ɵvid(
    flags: typingsSlinky.angularCore.mod.ɵViewFlags,
    nodes: js.Array[typingsSlinky.angularCore.mod.NodeDef]
  ): typingsSlinky.angularCore.mod.ɵViewDefinition = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275vid")(flags.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.ɵViewDefinition]
  @scala.inline
  def ɵvid(
    flags: typingsSlinky.angularCore.mod.ɵViewFlags,
    nodes: js.Array[typingsSlinky.angularCore.mod.NodeDef],
    updateDirectives: js.UndefOr[scala.Nothing],
    updateRenderer: typingsSlinky.angularCore.mod.ViewUpdateFn
  ): typingsSlinky.angularCore.mod.ɵViewDefinition = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275vid")(flags.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], updateDirectives.asInstanceOf[js.Any], updateRenderer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.ɵViewDefinition]
  @scala.inline
  def ɵvid(
    flags: typingsSlinky.angularCore.mod.ɵViewFlags,
    nodes: js.Array[typingsSlinky.angularCore.mod.NodeDef],
    updateDirectives: scala.Null,
    updateRenderer: typingsSlinky.angularCore.mod.ViewUpdateFn
  ): typingsSlinky.angularCore.mod.ɵViewDefinition = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275vid")(flags.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], updateDirectives.asInstanceOf[js.Any], updateRenderer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.ɵViewDefinition]
  @scala.inline
  def ɵvid(
    flags: typingsSlinky.angularCore.mod.ɵViewFlags,
    nodes: js.Array[typingsSlinky.angularCore.mod.NodeDef],
    updateDirectives: typingsSlinky.angularCore.mod.ViewUpdateFn
  ): typingsSlinky.angularCore.mod.ɵViewDefinition = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275vid")(flags.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], updateDirectives.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.ɵViewDefinition]
  @scala.inline
  def ɵvid(
    flags: typingsSlinky.angularCore.mod.ɵViewFlags,
    nodes: js.Array[typingsSlinky.angularCore.mod.NodeDef],
    updateDirectives: typingsSlinky.angularCore.mod.ViewUpdateFn,
    updateRenderer: typingsSlinky.angularCore.mod.ViewUpdateFn
  ): typingsSlinky.angularCore.mod.ɵViewDefinition = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275vid")(flags.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], updateDirectives.asInstanceOf[js.Any], updateRenderer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.ɵViewDefinition]
  
  @scala.inline
  def ɵwhenRendered(component: js.Any): js.Promise[scala.Null] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275whenRendered")(component.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Null]]
  
  type ɵɵComponentDefWithMeta[T, Selector /* <: java.lang.String */, ExportAs /* <: js.Array[java.lang.String] */, InputMap /* <: org.scalablytyped.runtime.StringDictionary[java.lang.String] */, OutputMap /* <: org.scalablytyped.runtime.StringDictionary[java.lang.String] */, QueryFields /* <: js.Array[java.lang.String] */, NgContentSelectors /* <: js.Array[java.lang.String] */] = typingsSlinky.angularCore.mod.ɵComponentDef[T]
  
  @scala.inline
  def ɵɵCopyDefinitionFeature(definition: typingsSlinky.angularCore.mod.ɵComponentDef[_]): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275CopyDefinitionFeature")(definition.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵCopyDefinitionFeature(definition: typingsSlinky.angularCore.mod.ɵDirectiveDef[_]): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275CopyDefinitionFeature")(definition.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  type ɵɵDirectiveDefWithMeta[T, Selector /* <: java.lang.String */, ExportAs /* <: js.Array[java.lang.String] */, InputMap /* <: org.scalablytyped.runtime.StringDictionary[java.lang.String] */, OutputMap /* <: org.scalablytyped.runtime.StringDictionary[java.lang.String] */, QueryFields /* <: js.Array[java.lang.String] */] = typingsSlinky.angularCore.mod.ɵDirectiveDef[T]
  
  type ɵɵFactoryDef[T, CtorDependencies /* <: js.Array[typingsSlinky.angularCore.mod.CtorDependency] */] = js.Function0[T]
  
  @scala.inline
  def ɵɵInheritDefinitionFeature(definition: typingsSlinky.angularCore.mod.ɵComponentDef[_]): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275InheritDefinitionFeature")(definition.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵInheritDefinitionFeature(definition: typingsSlinky.angularCore.mod.ɵDirectiveDef[_]): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275InheritDefinitionFeature")(definition.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  type ɵɵNgModuleDefWithMeta[T, Declarations, Imports, Exports] = typingsSlinky.angularCore.mod.ɵNgModuleDef[T]
  
  @scala.inline
  def ɵɵNgOnChangesFeature[T](): typingsSlinky.angularCore.mod.DirectiveDefFeature = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275NgOnChangesFeature")().asInstanceOf[typingsSlinky.angularCore.mod.DirectiveDefFeature]
  
  type ɵɵPipeDefWithMeta[T, Name /* <: java.lang.String */] = typingsSlinky.angularCore.mod.ɵPipeDef[T]
  
  @scala.inline
  def ɵɵProvidersFeature[T](providers: js.Array[typingsSlinky.angularCore.mod.Provider]): js.Function1[/* definition */ typingsSlinky.angularCore.mod.ɵDirectiveDef[T], scala.Unit] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275ProvidersFeature")(providers.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* definition */ typingsSlinky.angularCore.mod.ɵDirectiveDef[T], scala.Unit]]
  @scala.inline
  def ɵɵProvidersFeature[T](
    providers: js.Array[typingsSlinky.angularCore.mod.Provider],
    viewProviders: js.Array[typingsSlinky.angularCore.mod.Provider]
  ): js.Function1[/* definition */ typingsSlinky.angularCore.mod.ɵDirectiveDef[T], scala.Unit] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275ProvidersFeature")(providers.asInstanceOf[js.Any], viewProviders.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* definition */ typingsSlinky.angularCore.mod.ɵDirectiveDef[T], scala.Unit]]
  
  @scala.inline
  def ɵɵadvance(delta: scala.Double): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275advance")(delta.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵattribute(name: java.lang.String, value: js.Any): js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ]]
  @scala.inline
  def ɵɵattribute(
    name: java.lang.String,
    value: js.Any,
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ]]
  @scala.inline
  def ɵɵattribute(name: java.lang.String, value: js.Any, sanitizer: scala.Null, namespace: java.lang.String): js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ]]
  @scala.inline
  def ɵɵattribute(name: java.lang.String, value: js.Any, sanitizer: typingsSlinky.angularCore.mod.SanitizerFn): js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ]]
  @scala.inline
  def ɵɵattribute(
    name: java.lang.String,
    value: js.Any,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attribute")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn | scala.Null], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattribute */ js.Any
  ]]
  
  @scala.inline
  def ɵɵattributeInterpolate1(attrName: java.lang.String, prefix: java.lang.String, v0: js.Any, suffix: java.lang.String): js.Function6[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate1")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function6[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate1(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    suffix: java.lang.String,
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function6[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate1")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function6[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate1(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): js.Function6[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate1")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function6[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate1(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function6[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate1")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function6[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate1 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵattributeInterpolate2(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    suffix: java.lang.String
  ): js.Function8[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate2")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function8[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate2(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    suffix: java.lang.String,
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function8[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate2")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function8[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate2(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): js.Function8[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate2")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function8[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate2(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function8[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate2")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function8[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate2 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵattributeInterpolate3(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String
  ): js.Function10[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate3")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function10[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate3(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String,
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function10[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate3")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function10[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate3(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): js.Function10[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate3")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function10[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate3(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function10[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate3")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function10[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate3 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵattributeInterpolate4(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String
  ): js.Function12[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate4")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function12[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate4(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String,
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function12[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate4")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function12[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate4(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): js.Function12[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate4")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function12[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate4(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function12[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate4")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function12[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate4 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵattributeInterpolate5(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String
  ): js.Function14[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate5")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function14[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate5(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String,
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function14[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate5")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function14[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate5(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): js.Function14[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate5")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function14[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate5(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function14[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate5")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function14[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate5 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵattributeInterpolate6(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String
  ): js.Function16[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate6")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function16[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate6(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String,
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function16[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate6")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function16[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate6(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): js.Function16[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate6")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function16[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate6(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function16[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate6")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function16[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate6 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵattributeInterpolate7(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String
  ): js.Function18[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate7")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function18[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate7(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String,
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function18[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate7")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function18[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate7(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): js.Function18[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate7")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function18[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate7(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function18[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate7")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function18[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate7 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵattributeInterpolate8(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String
  ): js.Function20[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate8")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function20[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate8(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String,
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function20[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate8")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function20[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate8(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): js.Function20[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate8")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function20[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolate8(
    attrName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function20[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolate8")(attrName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function20[
    /* attrName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolate8 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵattributeInterpolateV(attrName: java.lang.String, values: js.Array[_]): js.Function4[
    /* attrName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolateV")(attrName.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* attrName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolateV(
    attrName: java.lang.String,
    values: js.Array[_],
    sanitizer: js.UndefOr[scala.Nothing],
    namespace: java.lang.String
  ): js.Function4[
    /* attrName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolateV")(attrName.asInstanceOf[js.Any], values.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* attrName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolateV(
    attrName: java.lang.String,
    values: js.Array[_],
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): js.Function4[
    /* attrName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolateV")(attrName.asInstanceOf[js.Any], values.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* attrName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any
  ]]
  @scala.inline
  def ɵɵattributeInterpolateV(
    attrName: java.lang.String,
    values: js.Array[_],
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn,
    namespace: java.lang.String
  ): js.Function4[
    /* attrName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275attributeInterpolateV")(attrName.asInstanceOf[js.Any], values.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* attrName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* namespace */ js.UndefOr[java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵattributeInterpolateV */ js.Any
  ]]
  
  @scala.inline
  def ɵɵclassMap(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMap")().asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵclassMap(classes: java.lang.String): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMap")(classes.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵclassMap(classes: org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Boolean | scala.Null]]): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMap")(classes.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassMapInterpolate1(prefix: java.lang.String, v0: js.Any, suffix: java.lang.String): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate1")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassMapInterpolate2(prefix: java.lang.String, v0: js.Any, i0: java.lang.String, v1: js.Any, suffix: java.lang.String): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate2")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassMapInterpolate3(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate3")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassMapInterpolate4(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate4")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassMapInterpolate5(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate5")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassMapInterpolate6(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate6")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassMapInterpolate7(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate7")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassMapInterpolate8(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolate8")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassMapInterpolateV(values: js.Array[_]): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classMapInterpolateV")(values.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵclassProp(className: java.lang.String): js.Function2[
    /* className */ java.lang.String, 
    /* value */ js.UndefOr[scala.Boolean | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵclassProp */ js.Any
  ] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classProp")(className.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* className */ java.lang.String, 
    /* value */ js.UndefOr[scala.Boolean | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵclassProp */ js.Any
  ]]
  @scala.inline
  def ɵɵclassProp(className: java.lang.String, value: scala.Boolean): js.Function2[
    /* className */ java.lang.String, 
    /* value */ js.UndefOr[scala.Boolean | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵclassProp */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275classProp")(className.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* className */ java.lang.String, 
    /* value */ js.UndefOr[scala.Boolean | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵclassProp */ js.Any
  ]]
  
  @scala.inline
  def ɵɵcontentQuery[T](directiveIndex: scala.Double, predicate: js.Array[java.lang.String], descend: scala.Boolean): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275contentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵcontentQuery[T](
    directiveIndex: scala.Double,
    predicate: js.Array[java.lang.String],
    descend: scala.Boolean,
    read: js.Any
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275contentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵcontentQuery[T](
    directiveIndex: scala.Double,
    predicate: typingsSlinky.angularCore.mod.InjectionToken[_],
    descend: scala.Boolean
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275contentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵcontentQuery[T](
    directiveIndex: scala.Double,
    predicate: typingsSlinky.angularCore.mod.InjectionToken[_],
    descend: scala.Boolean,
    read: js.Any
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275contentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵcontentQuery[T](
    directiveIndex: scala.Double,
    predicate: typingsSlinky.angularCore.mod.Type[_],
    descend: scala.Boolean
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275contentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵcontentQuery[T](
    directiveIndex: scala.Double,
    predicate: typingsSlinky.angularCore.mod.Type[_],
    descend: scala.Boolean,
    read: js.Any
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275contentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵdefineComponent[T](componentDefinition: typingsSlinky.angularCore.anon.ChangeDetection[T]): scala.Nothing = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275defineComponent")(componentDefinition.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵdefineDirective[T](directiveDefinition: typingsSlinky.angularCore.anon.ContentQueries[T]): scala.Nothing = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275defineDirective")(directiveDefinition.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵdefineInjectable[T](opts: typingsSlinky.angularCore.anon.Factory[T]): scala.Nothing = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275defineInjectable")(opts.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵdefineInjector(options: typingsSlinky.angularCore.anon.Imports): scala.Nothing = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275defineInjector")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵdefineNgModule[T](`def`: typingsSlinky.angularCore.anon.Bootstrap[T]): scala.Nothing = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275defineNgModule")(`def`.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵdefinePipe[T](pipeDef: typingsSlinky.angularCore.anon.Pure[T]): scala.Nothing = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275definePipe")(pipeDef.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵdirectiveInject[T](token: typingsSlinky.angularCore.mod.InjectionToken[T]): T = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275directiveInject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def ɵɵdirectiveInject[T](
    token: typingsSlinky.angularCore.mod.InjectionToken[T],
    flags: typingsSlinky.angularCore.mod.InjectFlags
  ): T = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275directiveInject")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def ɵɵdirectiveInject[T](token: typingsSlinky.angularCore.mod.Type[T]): T = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275directiveInject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def ɵɵdirectiveInject[T](token: typingsSlinky.angularCore.mod.Type[T], flags: typingsSlinky.angularCore.mod.InjectFlags): T = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275directiveInject")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def ɵɵdisableBindings(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275disableBindings")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵelement(index: scala.Double, name: java.lang.String): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275element")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelement(
    index: scala.Double,
    name: java.lang.String,
    attrsIndex: js.UndefOr[scala.Nothing],
    localRefsIndex: scala.Double
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275element")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelement(index: scala.Double, name: java.lang.String, attrsIndex: scala.Double): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275element")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelement(
    index: scala.Double,
    name: java.lang.String,
    attrsIndex: scala.Double,
    localRefsIndex: scala.Double
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275element")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelement(index: scala.Double, name: java.lang.String, attrsIndex: scala.Null, localRefsIndex: scala.Double): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275element")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵelementContainer(index: scala.Double): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainer")(index.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementContainer(index: scala.Double, attrsIndex: js.UndefOr[scala.Nothing], localRefsIndex: scala.Double): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainer")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementContainer(index: scala.Double, attrsIndex: scala.Double): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainer")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementContainer(index: scala.Double, attrsIndex: scala.Double, localRefsIndex: scala.Double): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainer")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementContainer(index: scala.Double, attrsIndex: scala.Null, localRefsIndex: scala.Double): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainer")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵelementContainerEnd(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainerEnd")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵelementContainerStart(index: scala.Double): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainerStart")(index.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementContainerStart(index: scala.Double, attrsIndex: js.UndefOr[scala.Nothing], localRefsIndex: scala.Double): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainerStart")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementContainerStart(index: scala.Double, attrsIndex: scala.Double): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainerStart")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementContainerStart(index: scala.Double, attrsIndex: scala.Double, localRefsIndex: scala.Double): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainerStart")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementContainerStart(index: scala.Double, attrsIndex: scala.Null, localRefsIndex: scala.Double): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementContainerStart")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵelementEnd(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementEnd")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵelementStart(index: scala.Double, name: java.lang.String): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementStart")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementStart(
    index: scala.Double,
    name: java.lang.String,
    attrsIndex: js.UndefOr[scala.Nothing],
    localRefsIndex: scala.Double
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementStart")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementStart(index: scala.Double, name: java.lang.String, attrsIndex: scala.Double): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementStart")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementStart(
    index: scala.Double,
    name: java.lang.String,
    attrsIndex: scala.Double,
    localRefsIndex: scala.Double
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementStart")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵelementStart(index: scala.Double, name: java.lang.String, attrsIndex: scala.Null, localRefsIndex: scala.Double): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275elementStart")(index.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵenableBindings(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275enableBindings")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵgetCurrentView(): typingsSlinky.angularCore.mod.OpaqueViewState = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275getCurrentView")().asInstanceOf[typingsSlinky.angularCore.mod.OpaqueViewState]
  
  @scala.inline
  def ɵɵgetFactoryOf[T](`type`: typingsSlinky.angularCore.mod.Type[_]): typingsSlinky.angularCore.mod.FactoryFn[T] | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275getFactoryOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.FactoryFn[T] | scala.Null]
  
  @scala.inline
  def ɵɵgetInheritedFactory[T](`type`: typingsSlinky.angularCore.mod.Type[_]): js.Function1[/* type */ typingsSlinky.angularCore.mod.Type[T], T] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275getInheritedFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* type */ typingsSlinky.angularCore.mod.Type[T], T]]
  
  @scala.inline
  def ɵɵhostProperty[T](propName: java.lang.String, value: T): typingsSlinky.angularCore.anon.FnCall = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275hostProperty")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.FnCall]
  @scala.inline
  def ɵɵhostProperty[T](propName: java.lang.String, value: T, sanitizer: typingsSlinky.angularCore.mod.SanitizerFn): typingsSlinky.angularCore.anon.FnCall = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275hostProperty")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.FnCall]
  
  @scala.inline
  def ɵɵi18n(index: scala.Double, messageIndex: scala.Double): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18n")(index.asInstanceOf[js.Any], messageIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵi18n(index: scala.Double, messageIndex: scala.Double, subTemplateIndex: scala.Double): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18n")(index.asInstanceOf[js.Any], messageIndex.asInstanceOf[js.Any], subTemplateIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵi18nApply(index: scala.Double): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nApply")(index.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵi18nAttributes(index: scala.Double, attrsIndex: scala.Double): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nAttributes")(index.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵi18nEnd(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nEnd")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵi18nExp[T](value: T): typingsSlinky.angularCore.anon.FnCallValue = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nExp")(value.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.anon.FnCallValue]
  
  @scala.inline
  def ɵɵi18nPostprocess(message: java.lang.String): java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nPostprocess")(message.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def ɵɵi18nPostprocess(
    message: java.lang.String,
    replacements: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ): java.lang.String = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nPostprocess")(message.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵɵi18nStart(index: scala.Double, messageIndex: scala.Double): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nStart")(index.asInstanceOf[js.Any], messageIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵi18nStart(index: scala.Double, messageIndex: scala.Double, subTemplateIndex: scala.Double): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275i18nStart")(index.asInstanceOf[js.Any], messageIndex.asInstanceOf[js.Any], subTemplateIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵinject[T](token: typingsSlinky.angularCore.mod.InjectionToken[T]): T | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any]).asInstanceOf[T | scala.Null]
  @scala.inline
  def ɵɵinject[T](
    token: typingsSlinky.angularCore.mod.InjectionToken[T],
    flags: typingsSlinky.angularCore.mod.InjectFlags
  ): T | scala.Null = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | scala.Null]
  @scala.inline
  def ɵɵinject[T](token: typingsSlinky.angularCore.mod.Type[T]): T | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any]).asInstanceOf[T | scala.Null]
  @scala.inline
  def ɵɵinject[T](token: typingsSlinky.angularCore.mod.Type[T], flags: typingsSlinky.angularCore.mod.InjectFlags): T | scala.Null = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[T | scala.Null]
  
  @scala.inline
  def ɵɵinjectAttribute(attrNameToInject: java.lang.String): java.lang.String | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275injectAttribute")(attrNameToInject.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def ɵɵinjectPipeChangeDetectorRef(): typingsSlinky.angularCore.mod.ChangeDetectorRef | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275injectPipeChangeDetectorRef")().asInstanceOf[typingsSlinky.angularCore.mod.ChangeDetectorRef | scala.Null]
  @scala.inline
  def ɵɵinjectPipeChangeDetectorRef(flags: typingsSlinky.angularCore.mod.InjectFlags): typingsSlinky.angularCore.mod.ChangeDetectorRef | scala.Null = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275injectPipeChangeDetectorRef")(flags.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.ChangeDetectorRef | scala.Null]
  
  @scala.inline
  def ɵɵinject_T_T[T](token: typingsSlinky.angularCore.mod.InjectionToken[T]): T = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def ɵɵinject_T_T[T](token: typingsSlinky.angularCore.mod.Type[T]): T = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275inject")(token.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def ɵɵinvalidFactory(): scala.Nothing = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275invalidFactory")().asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵinvalidFactoryDep(index: scala.Double): scala.Nothing = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275invalidFactoryDep")(index.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ɵɵlistener(eventName: java.lang.String, listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _]): js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typingsSlinky.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275listener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typingsSlinky.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any
  ]]
  @scala.inline
  def ɵɵlistener(
    eventName: java.lang.String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: js.UndefOr[scala.Nothing],
    eventTargetResolver: typingsSlinky.angularCore.mod.GlobalTargetResolver
  ): js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typingsSlinky.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275listener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any], eventTargetResolver.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typingsSlinky.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any
  ]]
  @scala.inline
  def ɵɵlistener(
    eventName: java.lang.String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: scala.Boolean
  ): js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typingsSlinky.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275listener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typingsSlinky.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any
  ]]
  @scala.inline
  def ɵɵlistener(
    eventName: java.lang.String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: scala.Boolean,
    eventTargetResolver: typingsSlinky.angularCore.mod.GlobalTargetResolver
  ): js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typingsSlinky.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275listener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any], eventTargetResolver.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typingsSlinky.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵlistener */ js.Any
  ]]
  
  @scala.inline
  def ɵɵloadQuery[T](): typingsSlinky.angularCore.mod.QueryList[T] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275loadQuery")().asInstanceOf[typingsSlinky.angularCore.mod.QueryList[T]]
  
  @scala.inline
  def ɵɵnamespaceHTML(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275namespaceHTML")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵnamespaceMathML(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275namespaceMathML")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵnamespaceSVG(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275namespaceSVG")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵnextContext[T](): T = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275nextContext")().asInstanceOf[T]
  @scala.inline
  def ɵɵnextContext[T](level: scala.Double): T = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275nextContext")(level.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def ɵɵpipe(index: scala.Double, pipeName: java.lang.String): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pipe")(index.asInstanceOf[js.Any], pipeName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpipeBind1(index: scala.Double, slotOffset: scala.Double, v1: js.Any): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pipeBind1")(index.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], v1.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpipeBind2(index: scala.Double, slotOffset: scala.Double, v1: js.Any, v2: js.Any): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pipeBind2")(index.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpipeBind3(index: scala.Double, slotOffset: scala.Double, v1: js.Any, v2: js.Any, v3: js.Any): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pipeBind3")(index.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpipeBind4(index: scala.Double, slotOffset: scala.Double, v1: js.Any, v2: js.Any, v3: js.Any, v4: js.Any): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pipeBind4")(index.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpipeBindV(index: scala.Double, slotOffset: scala.Double, values: Array[js.Any]): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pipeBindV")(index.asInstanceOf[js.Any], slotOffset.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵprojection(nodeIndex: scala.Double): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275projection")(nodeIndex.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵprojection(
    nodeIndex: scala.Double,
    selectorIndex: js.UndefOr[scala.Nothing],
    attrs: typingsSlinky.angularCore.mod.TAttributes
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275projection")(nodeIndex.asInstanceOf[js.Any], selectorIndex.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵprojection(nodeIndex: scala.Double, selectorIndex: scala.Double): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275projection")(nodeIndex.asInstanceOf[js.Any], selectorIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵprojection(
    nodeIndex: scala.Double,
    selectorIndex: scala.Double,
    attrs: typingsSlinky.angularCore.mod.TAttributes
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275projection")(nodeIndex.asInstanceOf[js.Any], selectorIndex.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵprojectionDef(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275projectionDef")().asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵprojectionDef(projectionSlots: typingsSlinky.angularCore.mod.ProjectionSlots): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275projectionDef")(projectionSlots.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵproperty[T](propName: java.lang.String, value: T): typingsSlinky.angularCore.anon.FnCallPropNameValueSanitizer = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275property")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.FnCallPropNameValueSanitizer]
  @scala.inline
  def ɵɵproperty[T](propName: java.lang.String, value: T, sanitizer: typingsSlinky.angularCore.mod.SanitizerFn): typingsSlinky.angularCore.anon.FnCallPropNameValueSanitizer = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275property")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.FnCallPropNameValueSanitizer]
  
  @scala.inline
  def ɵɵpropertyInterpolate(propName: java.lang.String, v0: js.Any): js.Function3[
    /* propName */ java.lang.String, 
    /* v0 */ js.Any, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate")(propName.asInstanceOf[js.Any], v0.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* propName */ java.lang.String, 
    /* v0 */ js.Any, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolate(propName: java.lang.String, v0: js.Any, sanitizer: typingsSlinky.angularCore.mod.SanitizerFn): js.Function3[
    /* propName */ java.lang.String, 
    /* v0 */ js.Any, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate")(propName.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* propName */ java.lang.String, 
    /* v0 */ js.Any, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpropertyInterpolate1(propName: java.lang.String, prefix: java.lang.String, v0: js.Any, suffix: java.lang.String): js.Function5[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate1 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate1")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate1 */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolate1(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): js.Function5[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate1 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate1")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate1 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpropertyInterpolate2(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    suffix: java.lang.String
  ): js.Function7[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate2 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate2")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function7[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate2 */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolate2(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): js.Function7[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate2 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate2")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function7[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate2 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpropertyInterpolate3(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String
  ): js.Function9[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate3 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate3")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function9[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate3 */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolate3(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): js.Function9[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate3 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate3")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function9[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate3 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpropertyInterpolate4(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String
  ): js.Function11[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate4 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate4")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function11[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate4 */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolate4(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): js.Function11[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate4 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate4")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function11[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate4 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpropertyInterpolate5(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String
  ): js.Function13[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate5 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate5")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function13[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate5 */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolate5(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): js.Function13[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate5 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate5")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function13[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate5 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpropertyInterpolate6(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String
  ): js.Function15[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate6 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate6")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function15[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate6 */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolate6(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): js.Function15[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate6 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate6")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function15[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate6 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpropertyInterpolate7(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String
  ): js.Function17[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate7 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate7")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function17[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate7 */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolate7(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): js.Function17[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate7 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate7")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function17[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate7 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpropertyInterpolate8(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String
  ): js.Function19[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate8 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate8")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function19[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate8 */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolate8(
    propName: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): js.Function19[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate8 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolate8")(propName.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function19[
    /* propName */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolate8 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpropertyInterpolateV(propName: java.lang.String, values: js.Array[_]): js.Function3[
    /* propName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolateV */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolateV")(propName.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* propName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolateV */ js.Any
  ]]
  @scala.inline
  def ɵɵpropertyInterpolateV(
    propName: java.lang.String,
    values: js.Array[_],
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): js.Function3[
    /* propName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolateV */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275propertyInterpolateV")(propName.asInstanceOf[js.Any], values.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* propName */ java.lang.String, 
    /* values */ js.Array[_], 
    /* sanitizer */ js.UndefOr[typingsSlinky.angularCore.mod.SanitizerFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵpropertyInterpolateV */ js.Any
  ]]
  
  @scala.inline
  def ɵɵpureFunction0[T](slotOffset: scala.Double, pureFn: js.Function0[T]): T = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction0")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def ɵɵpureFunction0[T](slotOffset: scala.Double, pureFn: js.Function0[T], thisArg: js.Any): T = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction0")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def ɵɵpureFunction1(slotOffset: scala.Double, pureFn: js.Function1[/* v */ js.Any, _], exp: js.Any): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction1")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵɵpureFunction1(slotOffset: scala.Double, pureFn: js.Function1[/* v */ js.Any, _], exp: js.Any, thisArg: js.Any): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction1")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpureFunction2(
    slotOffset: scala.Double,
    pureFn: js.Function2[/* v1 */ js.Any, /* v2 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction2")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵɵpureFunction2(
    slotOffset: scala.Double,
    pureFn: js.Function2[/* v1 */ js.Any, /* v2 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    thisArg: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction2")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpureFunction3(
    slotOffset: scala.Double,
    pureFn: js.Function3[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction3")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵɵpureFunction3(
    slotOffset: scala.Double,
    pureFn: js.Function3[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    thisArg: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction3")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpureFunction4(
    slotOffset: scala.Double,
    pureFn: js.Function4[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction4")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵɵpureFunction4(
    slotOffset: scala.Double,
    pureFn: js.Function4[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    thisArg: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction4")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpureFunction5(
    slotOffset: scala.Double,
    pureFn: js.Function5[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, /* v5 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction5")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵɵpureFunction5(
    slotOffset: scala.Double,
    pureFn: js.Function5[/* v1 */ js.Any, /* v2 */ js.Any, /* v3 */ js.Any, /* v4 */ js.Any, /* v5 */ js.Any, _],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    thisArg: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction5")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpureFunction6(
    slotOffset: scala.Double,
    pureFn: js.Function6[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction6")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], exp6.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵɵpureFunction6(
    slotOffset: scala.Double,
    pureFn: js.Function6[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    thisArg: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction6")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], exp6.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpureFunction7(
    slotOffset: scala.Double,
    pureFn: js.Function7[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      /* v7 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    exp7: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction7")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], exp6.asInstanceOf[js.Any], exp7.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵɵpureFunction7(
    slotOffset: scala.Double,
    pureFn: js.Function7[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      /* v7 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    exp7: js.Any,
    thisArg: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction7")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], exp6.asInstanceOf[js.Any], exp7.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpureFunction8(
    slotOffset: scala.Double,
    pureFn: js.Function8[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      /* v7 */ js.Any, 
      /* v8 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    exp7: js.Any,
    exp8: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction8")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], exp6.asInstanceOf[js.Any], exp7.asInstanceOf[js.Any], exp8.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵɵpureFunction8(
    slotOffset: scala.Double,
    pureFn: js.Function8[
      /* v1 */ js.Any, 
      /* v2 */ js.Any, 
      /* v3 */ js.Any, 
      /* v4 */ js.Any, 
      /* v5 */ js.Any, 
      /* v6 */ js.Any, 
      /* v7 */ js.Any, 
      /* v8 */ js.Any, 
      _
    ],
    exp1: js.Any,
    exp2: js.Any,
    exp3: js.Any,
    exp4: js.Any,
    exp5: js.Any,
    exp6: js.Any,
    exp7: js.Any,
    exp8: js.Any,
    thisArg: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunction8")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exp1.asInstanceOf[js.Any], exp2.asInstanceOf[js.Any], exp3.asInstanceOf[js.Any], exp4.asInstanceOf[js.Any], exp5.asInstanceOf[js.Any], exp6.asInstanceOf[js.Any], exp7.asInstanceOf[js.Any], exp8.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵpureFunctionV(slotOffset: scala.Double, pureFn: js.Function1[/* repeated */ js.Any, _], exps: js.Array[_]): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunctionV")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exps.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def ɵɵpureFunctionV(
    slotOffset: scala.Double,
    pureFn: js.Function1[/* repeated */ js.Any, _],
    exps: js.Array[_],
    thisArg: js.Any
  ): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275pureFunctionV")(slotOffset.asInstanceOf[js.Any], pureFn.asInstanceOf[js.Any], exps.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵqueryRefresh(queryList: typingsSlinky.angularCore.mod.QueryList[_]): scala.Boolean = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275queryRefresh")(queryList.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def ɵɵreference[T](index: scala.Double): T = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275reference")(index.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def ɵɵresolveBody(element: typingsSlinky.angularCore.anon.RElementownerDocumentDocu): typingsSlinky.angularCore.anon.Target = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275resolveBody")(element.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.anon.Target]
  
  @scala.inline
  def ɵɵresolveDocument(element: typingsSlinky.angularCore.anon.RElementownerDocumentDocu): typingsSlinky.angularCore.anon.NameTarget = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275resolveDocument")(element.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.anon.NameTarget]
  
  @scala.inline
  def ɵɵresolveWindow(element: typingsSlinky.angularCore.anon.RElementownerDocumentDocu): typingsSlinky.angularCore.anon.NameString = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275resolveWindow")(element.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.anon.NameString]
  
  @scala.inline
  def ɵɵrestoreView(viewToRestore: typingsSlinky.angularCore.mod.OpaqueViewState): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275restoreView")(viewToRestore.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵsanitizeHtml(unsafeHtml: js.Any): java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275sanitizeHtml")(unsafeHtml.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵɵsanitizeResourceUrl(unsafeResourceUrl: js.Any): java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275sanitizeResourceUrl")(unsafeResourceUrl.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵɵsanitizeScript(unsafeScript: js.Any): java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275sanitizeScript")(unsafeScript.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵɵsanitizeStyle(unsafeStyle: js.Any): java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275sanitizeStyle")(unsafeStyle.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵɵsanitizeUrl(unsafeUrl: js.Any): java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275sanitizeUrl")(unsafeUrl.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def ɵɵsanitizeUrlOrResourceUrl(unsafeUrl: js.Any, tag: java.lang.String, prop: java.lang.String): js.Any = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275sanitizeUrlOrResourceUrl")(unsafeUrl.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵɵsetComponentScope(
    `type`: typingsSlinky.angularCore.mod.ɵComponentType[_],
    directives: js.Array[typingsSlinky.angularCore.mod.Type[_]],
    pipes: js.Array[typingsSlinky.angularCore.mod.Type[_]]
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275setComponentScope")(`type`.asInstanceOf[js.Any], directives.asInstanceOf[js.Any], pipes.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵsetNgModuleScope(`type`: js.Any, scope: typingsSlinky.angularCore.anon.Declarations): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275setNgModuleScope")(`type`.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstaticContentQuery[T](directiveIndex: scala.Double, predicate: js.Array[java.lang.String], descend: scala.Boolean): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticContentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticContentQuery[T](
    directiveIndex: scala.Double,
    predicate: js.Array[java.lang.String],
    descend: scala.Boolean,
    read: js.Any
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticContentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticContentQuery[T](
    directiveIndex: scala.Double,
    predicate: typingsSlinky.angularCore.mod.InjectionToken[_],
    descend: scala.Boolean
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticContentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticContentQuery[T](
    directiveIndex: scala.Double,
    predicate: typingsSlinky.angularCore.mod.InjectionToken[_],
    descend: scala.Boolean,
    read: js.Any
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticContentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticContentQuery[T](
    directiveIndex: scala.Double,
    predicate: typingsSlinky.angularCore.mod.Type[_],
    descend: scala.Boolean
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticContentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticContentQuery[T](
    directiveIndex: scala.Double,
    predicate: typingsSlinky.angularCore.mod.Type[_],
    descend: scala.Boolean,
    read: js.Any
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticContentQuery")(directiveIndex.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstaticViewQuery[T](predicate: js.Array[java.lang.String], descend: scala.Boolean): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticViewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticViewQuery[T](predicate: js.Array[java.lang.String], descend: scala.Boolean, read: js.Any): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticViewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticViewQuery[T](predicate: typingsSlinky.angularCore.mod.InjectionToken[_], descend: scala.Boolean): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticViewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticViewQuery[T](predicate: typingsSlinky.angularCore.mod.InjectionToken[_], descend: scala.Boolean, read: js.Any): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticViewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticViewQuery[T](predicate: typingsSlinky.angularCore.mod.Type[_], descend: scala.Boolean): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticViewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstaticViewQuery[T](predicate: typingsSlinky.angularCore.mod.Type[_], descend: scala.Boolean, read: js.Any): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275staticViewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMap(): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMap")().asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstyleMap(styles: java.lang.String): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMap")(styles.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵstyleMap(styles: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMap")(styles.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMapInterpolate1(prefix: java.lang.String, v0: js.Any, suffix: java.lang.String): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate1")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMapInterpolate2(prefix: java.lang.String, v0: js.Any, i0: java.lang.String, v1: js.Any, suffix: java.lang.String): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate2")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMapInterpolate3(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate3")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMapInterpolate4(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate4")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMapInterpolate5(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate5")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMapInterpolate6(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate6")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMapInterpolate7(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate7")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMapInterpolate8(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolate8")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleMapInterpolateV(values: js.Array[_]): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleMapInterpolateV")(values.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵstyleProp(prop: java.lang.String): js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typingsSlinky.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typingsSlinky.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ]]
  @scala.inline
  def ɵɵstyleProp(prop: java.lang.String, value: js.UndefOr[scala.Nothing], suffix: java.lang.String): js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typingsSlinky.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typingsSlinky.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ]]
  @scala.inline
  def ɵɵstyleProp(prop: java.lang.String, value: java.lang.String): js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typingsSlinky.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typingsSlinky.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ]]
  @scala.inline
  def ɵɵstyleProp(prop: java.lang.String, value: java.lang.String, suffix: java.lang.String): js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typingsSlinky.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typingsSlinky.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ]]
  @scala.inline
  def ɵɵstyleProp(prop: java.lang.String, value: scala.Double): js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typingsSlinky.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typingsSlinky.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ]]
  @scala.inline
  def ɵɵstyleProp(prop: java.lang.String, value: scala.Double, suffix: java.lang.String): js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typingsSlinky.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typingsSlinky.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ]]
  @scala.inline
  def ɵɵstyleProp(prop: java.lang.String, value: scala.Null, suffix: java.lang.String): js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typingsSlinky.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typingsSlinky.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ]]
  @scala.inline
  def ɵɵstyleProp(prop: java.lang.String, value: typingsSlinky.angularCore.mod.ɵSafeValue): js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typingsSlinky.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typingsSlinky.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ]]
  @scala.inline
  def ɵɵstyleProp(prop: java.lang.String, value: typingsSlinky.angularCore.mod.ɵSafeValue, suffix: java.lang.String): js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typingsSlinky.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275styleProp")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* value */ js.UndefOr[
      java.lang.String | scala.Double | typingsSlinky.angularCore.mod.ɵSafeValue | scala.Null
    ], 
    /* suffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstyleProp */ js.Any
  ]]
  
  @scala.inline
  def ɵɵstylePropInterpolate1(prop: java.lang.String, prefix: java.lang.String, v0: js.Any, suffix: java.lang.String): js.Function5[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate1 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate1")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate1 */ js.Any
  ]]
  @scala.inline
  def ɵɵstylePropInterpolate1(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    suffix: java.lang.String,
    valueSuffix: java.lang.String
  ): js.Function5[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate1 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate1")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate1 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵstylePropInterpolate2(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    suffix: java.lang.String
  ): js.Function7[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate2 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate2")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function7[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate2 */ js.Any
  ]]
  @scala.inline
  def ɵɵstylePropInterpolate2(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    suffix: java.lang.String,
    valueSuffix: java.lang.String
  ): js.Function7[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate2 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate2")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function7[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate2 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵstylePropInterpolate3(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String
  ): js.Function9[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate3 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate3")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function9[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate3 */ js.Any
  ]]
  @scala.inline
  def ɵɵstylePropInterpolate3(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String,
    valueSuffix: java.lang.String
  ): js.Function9[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate3 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate3")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function9[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate3 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵstylePropInterpolate4(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String
  ): js.Function11[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate4 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate4")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function11[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate4 */ js.Any
  ]]
  @scala.inline
  def ɵɵstylePropInterpolate4(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String,
    valueSuffix: java.lang.String
  ): js.Function11[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate4 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate4")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function11[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate4 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵstylePropInterpolate5(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String
  ): js.Function13[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate5 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate5")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function13[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate5 */ js.Any
  ]]
  @scala.inline
  def ɵɵstylePropInterpolate5(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String,
    valueSuffix: java.lang.String
  ): js.Function13[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate5 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate5")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function13[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate5 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵstylePropInterpolate6(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String
  ): js.Function15[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate6 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate6")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function15[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate6 */ js.Any
  ]]
  @scala.inline
  def ɵɵstylePropInterpolate6(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String,
    valueSuffix: java.lang.String
  ): js.Function15[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate6 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate6")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function15[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate6 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵstylePropInterpolate7(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String
  ): js.Function17[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate7 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate7")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function17[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate7 */ js.Any
  ]]
  @scala.inline
  def ɵɵstylePropInterpolate7(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String,
    valueSuffix: java.lang.String
  ): js.Function17[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate7 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate7")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function17[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate7 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵstylePropInterpolate8(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String
  ): js.Function19[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate8 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate8")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function19[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate8 */ js.Any
  ]]
  @scala.inline
  def ɵɵstylePropInterpolate8(
    prop: java.lang.String,
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String,
    valueSuffix: java.lang.String
  ): js.Function19[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate8 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolate8")(prop.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function19[
    /* prop */ java.lang.String, 
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolate8 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵstylePropInterpolateV(prop: java.lang.String, values: js.Array[_]): js.Function3[
    /* prop */ java.lang.String, 
    /* values */ js.Array[_], 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolateV */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolateV")(prop.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* values */ js.Array[_], 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolateV */ js.Any
  ]]
  @scala.inline
  def ɵɵstylePropInterpolateV(prop: java.lang.String, values: js.Array[_], valueSuffix: java.lang.String): js.Function3[
    /* prop */ java.lang.String, 
    /* values */ js.Array[_], 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolateV */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275stylePropInterpolateV")(prop.asInstanceOf[js.Any], values.asInstanceOf[js.Any], valueSuffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prop */ java.lang.String, 
    /* values */ js.Array[_], 
    /* valueSuffix */ js.UndefOr[java.lang.String | scala.Null], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵstylePropInterpolateV */ js.Any
  ]]
  
  @scala.inline
  def ɵɵsyntheticHostListener(eventName: java.lang.String, listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _]): js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typingsSlinky.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵsyntheticHostListener */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostListener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typingsSlinky.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵsyntheticHostListener */ js.Any
  ]]
  @scala.inline
  def ɵɵsyntheticHostListener(
    eventName: java.lang.String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: js.UndefOr[scala.Nothing],
    eventTargetResolver: typingsSlinky.angularCore.mod.GlobalTargetResolver
  ): js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typingsSlinky.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵsyntheticHostListener */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostListener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any], eventTargetResolver.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typingsSlinky.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵsyntheticHostListener */ js.Any
  ]]
  @scala.inline
  def ɵɵsyntheticHostListener(
    eventName: java.lang.String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: scala.Boolean
  ): js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typingsSlinky.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵsyntheticHostListener */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostListener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typingsSlinky.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵsyntheticHostListener */ js.Any
  ]]
  @scala.inline
  def ɵɵsyntheticHostListener(
    eventName: java.lang.String,
    listenerFn: js.Function1[/* e */ js.UndefOr[js.Any], _],
    useCapture: scala.Boolean,
    eventTargetResolver: typingsSlinky.angularCore.mod.GlobalTargetResolver
  ): js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typingsSlinky.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵsyntheticHostListener */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostListener")(eventName.asInstanceOf[js.Any], listenerFn.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any], eventTargetResolver.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* eventName */ java.lang.String, 
    /* listenerFn */ js.Function1[/* e */ js.UndefOr[js.Any], _], 
    /* useCapture */ js.UndefOr[scala.Boolean], 
    /* eventTargetResolver */ js.UndefOr[typingsSlinky.angularCore.mod.GlobalTargetResolver], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵsyntheticHostListener */ js.Any
  ]]
  
  @scala.inline
  def ɵɵsyntheticHostProperty[T](propName: java.lang.String, value: T): typingsSlinky.angularCore.anon.Fn0 = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostProperty")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Fn0]
  @scala.inline
  def ɵɵsyntheticHostProperty[T](propName: java.lang.String, value: T, sanitizer: typingsSlinky.angularCore.mod.SanitizerFn): typingsSlinky.angularCore.anon.Fn0 = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostProperty")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Fn0]
  @scala.inline
  def ɵɵsyntheticHostProperty[T](propName: java.lang.String, value: typingsSlinky.angularCore.mod.ɵNOCHANGE): typingsSlinky.angularCore.anon.Fn0 = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostProperty")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Fn0]
  @scala.inline
  def ɵɵsyntheticHostProperty[T](
    propName: java.lang.String,
    value: typingsSlinky.angularCore.mod.ɵNOCHANGE,
    sanitizer: typingsSlinky.angularCore.mod.SanitizerFn
  ): typingsSlinky.angularCore.anon.Fn0 = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275syntheticHostProperty")(propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any], sanitizer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.anon.Fn0]
  
  @scala.inline
  def ɵɵtemplate(
    index: scala.Double,
    templateFn: typingsSlinky.angularCore.mod.ComponentTemplate[_] | scala.Null,
    decls: scala.Double,
    vars: scala.Double,
    tagName: js.UndefOr[java.lang.String | scala.Null],
    attrsIndex: js.UndefOr[scala.Double | scala.Null],
    localRefsIndex: js.UndefOr[scala.Double | scala.Null],
    localRefExtractor: js.UndefOr[typingsSlinky.angularCore.mod.LocalRefExtractor]
  ): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275template")(index.asInstanceOf[js.Any], templateFn.asInstanceOf[js.Any], decls.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], attrsIndex.asInstanceOf[js.Any], localRefsIndex.asInstanceOf[js.Any], localRefExtractor.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵtemplateRefExtractor(
    tNode: typingsSlinky.angularCore.mod.TNode,
    lView: typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBv
  ): typingsSlinky.angularCore.mod.TemplateRef[_] | scala.Null = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275templateRefExtractor")(tNode.asInstanceOf[js.Any], lView.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.angularCore.mod.TemplateRef[_] | scala.Null]
  
  @scala.inline
  def ɵɵtext(index: scala.Double): scala.Unit = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275text")(index.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵtext(index: scala.Double, value: java.lang.String): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275text")(index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵɵtextInterpolate(v0: js.Any): js.Function1[
    /* v0 */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate */ js.Any
  ] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate")(v0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* v0 */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtextInterpolate1(prefix: java.lang.String, v0: js.Any, suffix: java.lang.String): js.Function3[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate1 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate1")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate1 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtextInterpolate2(prefix: java.lang.String, v0: js.Any, i0: java.lang.String, v1: js.Any, suffix: java.lang.String): js.Function5[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate2 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate2")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate2 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtextInterpolate3(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    suffix: java.lang.String
  ): js.Function7[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate3 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate3")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function7[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate3 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtextInterpolate4(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    suffix: java.lang.String
  ): js.Function9[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate4 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate4")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function9[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate4 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtextInterpolate5(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    suffix: java.lang.String
  ): js.Function11[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate5 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate5")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function11[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate5 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtextInterpolate6(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    suffix: java.lang.String
  ): js.Function13[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate6 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate6")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function13[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate6 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtextInterpolate7(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    suffix: java.lang.String
  ): js.Function15[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate7 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate7")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function15[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate7 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtextInterpolate8(
    prefix: java.lang.String,
    v0: js.Any,
    i0: java.lang.String,
    v1: js.Any,
    i1: java.lang.String,
    v2: js.Any,
    i2: java.lang.String,
    v3: js.Any,
    i3: java.lang.String,
    v4: js.Any,
    i4: java.lang.String,
    v5: js.Any,
    i5: java.lang.String,
    v6: js.Any,
    i6: java.lang.String,
    v7: js.Any,
    suffix: java.lang.String
  ): js.Function17[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate8 */ js.Any
  ] = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolate8")(prefix.asInstanceOf[js.Any], v0.asInstanceOf[js.Any], i0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], i1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], i2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], i3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], i4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], i5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], i6.asInstanceOf[js.Any], v7.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.Function17[
    /* prefix */ java.lang.String, 
    /* v0 */ js.Any, 
    /* i0 */ java.lang.String, 
    /* v1 */ js.Any, 
    /* i1 */ java.lang.String, 
    /* v2 */ js.Any, 
    /* i2 */ java.lang.String, 
    /* v3 */ js.Any, 
    /* i3 */ java.lang.String, 
    /* v4 */ js.Any, 
    /* i4 */ java.lang.String, 
    /* v5 */ js.Any, 
    /* i5 */ java.lang.String, 
    /* v6 */ js.Any, 
    /* i6 */ java.lang.String, 
    /* v7 */ js.Any, 
    /* suffix */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolate8 */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtextInterpolateV(values: js.Array[_]): js.Function1[
    /* values */ js.Array[_], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolateV */ js.Any
  ] = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275textInterpolateV")(values.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* values */ js.Array[_], 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ɵɵtextInterpolateV */ js.Any
  ]]
  
  @scala.inline
  def ɵɵtrustConstantHtml(html: java.lang.String): typingsSlinky.angularCore.mod.TrustedHTML | java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275trustConstantHtml")(html.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.TrustedHTML | java.lang.String]
  
  @scala.inline
  def ɵɵtrustConstantResourceUrl(url: java.lang.String): typingsSlinky.angularCore.mod.TrustedScriptURL | java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275trustConstantResourceUrl")(url.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.TrustedScriptURL | java.lang.String]
  
  @scala.inline
  def ɵɵtrustConstantScript(script: java.lang.String): typingsSlinky.angularCore.mod.TrustedScript | java.lang.String = typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275trustConstantScript")(script.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCore.mod.TrustedScript | java.lang.String]
  
  @scala.inline
  def ɵɵviewQuery[T](predicate: js.Array[java.lang.String], descend: scala.Boolean): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275viewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵviewQuery[T](predicate: js.Array[java.lang.String], descend: scala.Boolean, read: js.Any): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275viewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵviewQuery[T](predicate: typingsSlinky.angularCore.mod.InjectionToken[_], descend: scala.Boolean): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275viewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵviewQuery[T](predicate: typingsSlinky.angularCore.mod.InjectionToken[_], descend: scala.Boolean, read: js.Any): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275viewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵviewQuery[T](predicate: typingsSlinky.angularCore.mod.Type[_], descend: scala.Boolean): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275viewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ɵɵviewQuery[T](predicate: typingsSlinky.angularCore.mod.Type[_], descend: scala.Boolean, read: js.Any): scala.Unit = (typingsSlinky.angularCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275\u0275viewQuery")(predicate.asInstanceOf[js.Any], descend.asInstanceOf[js.Any], read.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
