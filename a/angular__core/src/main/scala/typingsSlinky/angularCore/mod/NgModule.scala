package typingsSlinky.angularCore.mod

import typingsSlinky.angularCore.angularCoreBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NgModule extends StObject {
  
  /**
    * The set of components that are bootstrapped when
    * this module is bootstrapped. The components listed here
    * are automatically added to `entryComponents`.
    */
  var bootstrap: js.UndefOr[js.Array[typingsSlinky.angularCore.mod.Type[_] | js.Array[_]]] = js.native
  
  /**
    * The set of components, directives, and pipes ([declarables](guide/glossary#declarable))
    * that belong to this module.
    *
    * @usageNotes
    *
    * The set of selectors that are available to a template include those declared here, and
    * those that are exported from imported NgModules.
    *
    * Declarables must belong to exactly one module.
    * The compiler emits an error if you try to declare the same class in more than one module.
    * Be careful not to declare a class that is imported from another module.
    *
    * ### Example
    *
    * The following example allows the CommonModule to use the `NgFor`
    * directive.
    *
    * ```javascript
    * @NgModule({
    *   declarations: [NgFor]
    * })
    * class CommonModule {
    * }
    * ```
    */
  var declarations: js.UndefOr[js.Array[typingsSlinky.angularCore.mod.Type[_] | js.Array[_]]] = js.native
  
  /**
    * The set of components to compile when this NgModule is defined,
    * so that they can be dynamically loaded into the view.
    *
    * For each component listed here, Angular creates a `ComponentFactory`
    * and stores it in the `ComponentFactoryResolver`.
    *
    * Angular automatically adds components in the module's bootstrap
    * and route definitions into the `entryComponents` list. Use this
    * option to add components that are bootstrapped
    * using one of the imperative techniques, such as `ViewContainerRef.createComponent()`.
    *
    * @see [Entry Components](guide/entry-components)
    * @deprecated Since 9.0.0. With Ivy, this property is no longer necessary.
    */
  var entryComponents: js.UndefOr[js.Array[typingsSlinky.angularCore.mod.Type[_] | js.Array[_]]] = js.native
  
  /**
    * The set of components, directives, and pipes declared in this
    * NgModule that can be used in the template of any component that is part of an
    * NgModule that imports this NgModule. Exported declarations are the module's public API.
    *
    * A declarable belongs to one and only one NgModule.
    * A module can list another module among its exports, in which case all of that module's
    * public declaration are exported.
    *
    * @usageNotes
    *
    * Declarations are private by default.
    * If this ModuleA does not export UserComponent, then only the components within this
    * ModuleA can use UserComponent.
    *
    * ModuleA can import ModuleB and also export it, making exports from ModuleB
    * available to an NgModule that imports ModuleA.
    *
    * ### Example
    *
    * The following example exports the `NgFor` directive from CommonModule.
    *
    * ```javascript
    * @NgModule({
    *   exports: [NgFor]
    * })
    * class CommonModule {
    * }
    * ```
    */
  var exports: js.UndefOr[js.Array[typingsSlinky.angularCore.mod.Type[_] | js.Array[_]]] = js.native
  
  /**
    * A name or path that uniquely identifies this NgModule in `getModuleFactory`.
    * If left `undefined`, the NgModule is not registered with
    * `getModuleFactory`.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The set of NgModules whose exported [declarables](guide/glossary#declarable)
    * are available to templates in this module.
    *
    * @usageNotes
    *
    * A template can use exported declarables from any
    * imported module, including those from modules that are imported indirectly
    * and re-exported.
    * For example, `ModuleA` imports `ModuleB`, and also exports
    * it, which makes the declarables from `ModuleB` available
    * wherever `ModuleA` is imported.
    *
    * ### Example
    *
    * The following example allows MainModule to use anything exported by
    * `CommonModule`:
    *
    * ```javascript
    * @NgModule({
    *   imports: [CommonModule]
    * })
    * class MainModule {
    * }
    * ```
    *
    */
  var imports: js.UndefOr[
    js.Array[
      typingsSlinky.angularCore.mod.Type[_] | ModuleWithProviders[js.Object] | js.Array[_]
    ]
  ] = js.native
  
  /**
    * When present, this module is ignored by the AOT compiler.
    * It remains in distributed code, and the JIT compiler attempts to compile it
    * at run time, in the browser.
    * To ensure the correct behavior, the app must import `@angular/compiler`.
    */
  var jit: js.UndefOr[`true`] = js.native
  
  /**
    * The set of injectable objects that are available in the injector
    * of this module.
    *
    * @see [Dependency Injection guide](guide/dependency-injection)
    * @see [NgModule guide](guide/providers)
    *
    * @usageNotes
    *
    * Dependencies whose providers are listed here become available for injection
    * into any component, directive, pipe or service that is a child of this injector.
    * The NgModule used for bootstrapping uses the root injector, and can provide dependencies
    * to any part of the app.
    *
    * A lazy-loaded module has its own injector, typically a child of the app root injector.
    * Lazy-loaded services are scoped to the lazy-loaded module's injector.
    * If a lazy-loaded module also provides the `UserService`, any component created
    * within that module's context (such as by router navigation) gets the local instance
    * of the service, not the instance in the root injector.
    * Components in external modules continue to receive the instance provided by their injectors.
    *
    * ### Example
    *
    * The following example defines a class that is injected in
    * the HelloWorld NgModule:
    *
    * ```
    * class Greeter {
    *    greet(name:string) {
    *      return 'Hello ' + name + '!';
    *    }
    * }
    *
    * @NgModule({
    *   providers: [
    *     Greeter
    *   ]
    * })
    * class HelloWorld {
    *   greeter:Greeter;
    *
    *   constructor(greeter:Greeter) {
    *     this.greeter = greeter;
    *   }
    * }
    * ```
    */
  var providers: js.UndefOr[js.Array[Provider]] = js.native
  
  /**
    * The set of schemas that declare elements to be allowed in the NgModule.
    * Elements and properties that are neither Angular components nor directives
    * must be declared in a schema.
    *
    * Allowed value are `NO_ERRORS_SCHEMA` and `CUSTOM_ELEMENTS_SCHEMA`.
    *
    * @security When using one of `NO_ERRORS_SCHEMA` or `CUSTOM_ELEMENTS_SCHEMA`
    * you must ensure that allowed elements and properties securely escape inputs.
    */
  var schemas: js.UndefOr[js.Array[SchemaMetadata | js.Array[_]]] = js.native
}
object NgModule {
  
  @JSImport("@angular/core", "NgModule")
  @js.native
  val ^ : NgModuleDecorator = js.native
  
  @scala.inline
  implicit class NgModuleMutableBuilder[Self <: NgModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBootstrap(value: js.Array[typingsSlinky.angularCore.mod.Type[_] | js.Array[_]]): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapUndefined: Self = StObject.set(x, "bootstrap", js.undefined)
    
    @scala.inline
    def setBootstrapVarargs(value: (typingsSlinky.angularCore.mod.Type[js.Any] | js.Array[js.Any])*): Self = StObject.set(x, "bootstrap", js.Array(value :_*))
    
    @scala.inline
    def setDeclarations(value: js.Array[typingsSlinky.angularCore.mod.Type[_] | js.Array[_]]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
    
    @scala.inline
    def setDeclarationsVarargs(value: (typingsSlinky.angularCore.mod.Type[js.Any] | js.Array[js.Any])*): Self = StObject.set(x, "declarations", js.Array(value :_*))
    
    @scala.inline
    def setEntryComponents(value: js.Array[typingsSlinky.angularCore.mod.Type[_] | js.Array[_]]): Self = StObject.set(x, "entryComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryComponentsUndefined: Self = StObject.set(x, "entryComponents", js.undefined)
    
    @scala.inline
    def setEntryComponentsVarargs(value: (typingsSlinky.angularCore.mod.Type[js.Any] | js.Array[js.Any])*): Self = StObject.set(x, "entryComponents", js.Array(value :_*))
    
    @scala.inline
    def setExports(value: js.Array[typingsSlinky.angularCore.mod.Type[_] | js.Array[_]]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    @scala.inline
    def setExportsVarargs(value: (typingsSlinky.angularCore.mod.Type[js.Any] | js.Array[js.Any])*): Self = StObject.set(x, "exports", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImports(
      value: js.Array[
          typingsSlinky.angularCore.mod.Type[_] | ModuleWithProviders[js.Object] | js.Array[_]
        ]
    ): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    @scala.inline
    def setImportsVarargs(
      value: (typingsSlinky.angularCore.mod.Type[js.Any] | ModuleWithProviders[js.Object] | js.Array[js.Any])*
    ): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    @scala.inline
    def setJit(value: `true`): Self = StObject.set(x, "jit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJitUndefined: Self = StObject.set(x, "jit", js.undefined)
    
    @scala.inline
    def setProviders(value: js.Array[Provider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(value: Provider*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[SchemaMetadata | js.Array[_]]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    @scala.inline
    def setSchemasVarargs(value: (SchemaMetadata | js.Array[js.Any])*): Self = StObject.set(x, "schemas", js.Array(value :_*))
  }
}
