package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The static data for an LView (shared between all templates of a
  * given type).
  *
  * Stored on the `ComponentDef.tView`.
  */
@js.native
trait TView extends js.Object {
  /**
    * The binding start index is the index at which the data array
    * starts to store bindings only. Saving this value ensures that we
    * will begin reading bindings at the correct point in the array when
    * we are in update mode.
    */
  var bindingStartIndex: Double = js.native
  /**
    * This is a blueprint used to generate LView instances for this TView. Copying this
    * blueprint is faster than creating a new LView from scratch.
    */
  var blueprint: ɵangularPackagesCoreCoreBj = js.native
  /**
    * When a view is destroyed, listeners need to be released and outputs need to be
    * unsubscribed. This cleanup array stores both listener data (in chunks of 4)
    * and output data (in chunks of 2) for a particular view. Combining the arrays
    * saves on memory (70 bytes per array) and on a few bytes of code size (for two
    * separate for loops).
    *
    * If it's a native DOM listener or output subscription being stored:
    * 1st index is: event name  `name = tView.cleanup[i+0]`
    * 2nd index is: index of native element or a function that retrieves global target (window,
    *               document or body) reference based on the native element:
    *    `typeof idxOrTargetGetter === 'function'`: global target getter function
    *    `typeof idxOrTargetGetter === 'number'`: index of native element
    *
    * 3rd index is: index of listener function `listener = lView[CLEANUP][tView.cleanup[i+2]]`
    * 4th index is: `useCaptureOrIndx = tView.cleanup[i+3]`
    *    `typeof useCaptureOrIndx == 'boolean' : useCapture boolean
    *    `typeof useCaptureOrIndx == 'number':
    *         `useCaptureOrIndx >= 0` `removeListener = LView[CLEANUP][useCaptureOrIndx]`
    *         `useCaptureOrIndx <  0` `subscription = LView[CLEANUP][-useCaptureOrIndx]`
    *
    * If it's an output subscription or query list destroy hook:
    * 1st index is: output unsubscribe function / query list destroy function
    * 2nd index is: index of function context in LView.cleanupInstances[]
    *               `tView.cleanup[i+0].call(lView[CLEANUP][tView.cleanup[i+1]])`
    */
  var cleanup: js.Array[_] | Null = js.native
  /**
    * A list of element indices for child components that will need to be
    * refreshed when the current view has finished its check. These indices have
    * already been adjusted for the HEADER_OFFSET.
    *
    */
  var components: js.Array[Double] | Null = js.native
  /**
    * Array of ngAfterContentChecked hooks that should be executed for this view in update
    * mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var contentCheckHooks: HookData | Null = js.native
  /**
    * Array of ngAfterContentInit and ngAfterContentChecked hooks that should be executed
    * for this view in creation mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var contentHooks: HookData | Null = js.native
  /**
    * An array of indices pointing to directives with content queries alongside with the
    * corresponding
    * query index. Each entry in this array is a tuple of:
    * - index of the first content query index declared by a given directive;
    * - index of a directive.
    *
    * We are storing those indexes so we can refresh content queries as part of a view refresh
    * process.
    */
  var contentQueries: js.Array[Double] | Null = js.native
  /** Static data equivalent of LView.data[]. Contains TNodes, PipeDefInternal or TI18n. */
  var data: TData = js.native
  /**
    * Array of ngOnDestroy hooks that should be executed when this view is destroyed.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var destroyHooks: HookData | Null = js.native
  /**
    * Full registry of directives and components that may be found in this view.
    *
    * It's necessary to keep a copy of the full def list on the TView so it's possible
    * to render template functions without a host component.
    */
  var directiveRegistry: DirectiveDefList | Null = js.native
  /**
    * Set of instructions used to process host bindings efficiently.
    *
    * See VIEW_DATA.md for more information.
    */
  var expandoInstructions: ExpandoInstructions | Null = js.native
  /**
    * The index where the "expando" section of `LView` begins. The expando
    * section contains injectors, directive instances, and host binding values.
    * Unlike the "consts" and "vars" sections of `LView`, the length of this
    * section cannot be calculated at compile-time because directives are matched
    * at runtime to preserve locality.
    *
    * We store this start index so we know where to start checking host bindings
    * in `setHostBindings`.
    */
  var expandoStartIndex: Double = js.native
  /**
    * A reference to the first child node located in the view.
    */
  var firstChild: TNode | Null = js.native
  /** Whether or not this template has been processed. */
  var firstTemplatePass: Boolean = js.native
  /**
    * ID for inline views to determine whether a view is the same as the previous view
    * in a certain position. If it's not, we know the new view needs to be inserted
    * and the one that exists needs to be removed (e.g. if/else statements)
    *
    * If this is -1, then this is a component view or a dynamically created view.
    */
  val id: Double = js.native
  /**
    * Pointer to the host `TNode` (not part of this TView).
    *
    * If this is a `TViewNode` for an `LViewNode`, this is an embedded view of a container.
    * We need this pointer to be able to efficiently find this node when inserting the view
    * into an anchor.
    *
    * If this is a `TElementNode`, this is the view of a root component. It has exactly one
    * root TNode.
    *
    * If this is null, this is the view of a component that is not at root. We do not store
    * the host TNodes for child component views because they can potentially have several
    * different host TNodes, depending on where the component is being used. These host
    * TNodes cannot be shared (due to different indices, etc).
    */
  var node: TViewNode | ɵangularPackagesCoreCoreBf | Null = js.native
  /**
    * Full registry of pipes that may be found in this view.
    *
    * The property is either an array of `PipeDefs`s or a function which returns the array of
    * `PipeDefs`s. The function is necessary to be able to support forward declarations.
    *
    * It's necessary to keep a copy of the full def list on the TView so it's possible
    * to render template functions without a host component.
    */
  var pipeRegistry: PipeDefList | Null = js.native
  /**
    * Array of ngOnChanges and ngDoCheck hooks that should be executed for this view in update mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var preOrderCheckHooks: HookData | Null = js.native
  /**
    * Array of ngOnInit, ngOnChanges and ngDoCheck hooks that should be executed for this view in
    * creation mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var preOrderHooks: HookData | Null = js.native
  /**
    * A collection of queries tracked in a given view.
    */
  var queries: TQueries | Null = js.native
  /**
    * Set of schemas that declare elements to be allowed inside the view.
    */
  var schemas: js.Array[SchemaMetadata] | Null = js.native
  /**
    * Whether or not there are any static content queries tracked on this view.
    *
    * We store this so we know whether or not we should do a content query
    * refresh after creation mode to collect static query results.
    */
  var staticContentQueries: Boolean = js.native
  /**
    * Whether or not there are any static view queries tracked on this view.
    *
    * We store this so we know whether or not we should do a view query
    * refresh after creation mode to collect static query results.
    */
  var staticViewQueries: Boolean = js.native
  /**
    * The template function used to refresh the view of dynamically created views
    * and components. Will be null for inline views.
    */
  var template: ComponentTemplate[js.Object] | Null = js.native
  /**
    * Array of ngAfterViewChecked hooks that should be executed for this view in
    * update mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var viewCheckHooks: HookData | Null = js.native
  /**
    * Array of ngAfterViewInit and ngAfterViewChecked hooks that should be executed for
    * this view in creation mode.
    *
    * Even indices: Directive index
    * Odd indices: Hook function
    */
  var viewHooks: HookData | Null = js.native
  /**
    * A function containing query-related instructions.
    */
  var viewQuery: ViewQueriesFunction[js.Object] | Null = js.native
}

object TView {
  @scala.inline
  def apply(
    bindingStartIndex: Double,
    blueprint: ɵangularPackagesCoreCoreBj,
    data: TData,
    expandoStartIndex: Double,
    firstTemplatePass: Boolean,
    id: Double,
    staticContentQueries: Boolean,
    staticViewQueries: Boolean
  ): TView = {
    val __obj = js.Dynamic.literal(bindingStartIndex = bindingStartIndex.asInstanceOf[js.Any], blueprint = blueprint.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], expandoStartIndex = expandoStartIndex.asInstanceOf[js.Any], firstTemplatePass = firstTemplatePass.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], staticContentQueries = staticContentQueries.asInstanceOf[js.Any], staticViewQueries = staticViewQueries.asInstanceOf[js.Any])
    __obj.asInstanceOf[TView]
  }
  @scala.inline
  implicit class TViewOps[Self <: TView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindingStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlueprint(value: ɵangularPackagesCoreCoreBj): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: TData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandoStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandoStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstTemplatePass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstTemplatePass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaticContentQueries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticContentQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaticViewQueries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticViewQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCleanup(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCleanupNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanup")(null)
        ret
    }
    @scala.inline
    def withComponents(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(null)
        ret
    }
    @scala.inline
    def withContentCheckHooks(value: HookData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentCheckHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentCheckHooksNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentCheckHooks")(null)
        ret
    }
    @scala.inline
    def withContentHooks(value: HookData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentHooksNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHooks")(null)
        ret
    }
    @scala.inline
    def withContentQueries(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentQueriesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentQueries")(null)
        ret
    }
    @scala.inline
    def withDestroyHooks(value: HookData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroyHooksNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyHooks")(null)
        ret
    }
    @scala.inline
    def withDirectiveRegistry(value: DirectiveDefList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directiveRegistry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectiveRegistryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directiveRegistry")(null)
        ret
    }
    @scala.inline
    def withExpandoInstructions(value: ExpandoInstructions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandoInstructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandoInstructionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandoInstructions")(null)
        ret
    }
    @scala.inline
    def withFirstChild(value: TNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstChildNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstChild")(null)
        ret
    }
    @scala.inline
    def withNode(value: TViewNode | ɵangularPackagesCoreCoreBf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(null)
        ret
    }
    @scala.inline
    def withPipeRegistry(value: PipeDefList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeRegistry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipeRegistryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeRegistry")(null)
        ret
    }
    @scala.inline
    def withPreOrderCheckHooks(value: HookData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preOrderCheckHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreOrderCheckHooksNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preOrderCheckHooks")(null)
        ret
    }
    @scala.inline
    def withPreOrderHooks(value: HookData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preOrderHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreOrderHooksNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preOrderHooks")(null)
        ret
    }
    @scala.inline
    def withQueries(value: TQueries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueriesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(null)
        ret
    }
    @scala.inline
    def withSchemas(value: js.Array[SchemaMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemasNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(null)
        ret
    }
    @scala.inline
    def withTemplate(value: (/* rf */ ɵRenderFlags, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTemplateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(null)
        ret
    }
    @scala.inline
    def withViewCheckHooks(value: HookData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewCheckHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewCheckHooksNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewCheckHooks")(null)
        ret
    }
    @scala.inline
    def withViewHooks(value: HookData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewHooksNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewHooks")(null)
        ret
    }
    @scala.inline
    def withViewQuery(value: (/* rf */ ɵRenderFlags, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewQuery")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withViewQueryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewQuery")(null)
        ret
    }
  }
  
}

