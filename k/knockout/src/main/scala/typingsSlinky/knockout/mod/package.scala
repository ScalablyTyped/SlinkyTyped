package typingsSlinky.knockout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsExtenders[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: knockout.knockout.Extender<knockout.knockout.Subscribable<any>, T[P]>}
    */ typingsSlinky.knockout.knockoutStrings.AsExtenders with org.scalablytyped.runtime.TopLevel[T]
  
  type BindingAccessors = org.scalablytyped.runtime.StringDictionary[js.Function]
  
  type BindingContextExtendCallback[T] = js.Function3[
    /* self */ typingsSlinky.knockout.mod.BindingContext[T], 
    /* parentContext */ typingsSlinky.knockout.mod.BindingContext[T] | scala.Null, 
    /* dataItem */ T, 
    scala.Unit
  ]
  
  type BindingHandlerAddBinding = js.Function2[/* name */ java.lang.String, /* value */ js.Any, scala.Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.knockout.mod.Subscribable_[T]
    - typingsSlinky.knockout.mod.Observable_[T]
    - typingsSlinky.knockout.mod.Computed_[T]
    - js.ThisFunction0[/ * this * / TTarget, T]
  */
  type ComputedReadFunction[T, TTarget] = (typingsSlinky.knockout.mod._ComputedReadFunction[T, TTarget]) | typingsSlinky.knockout.mod.Subscribable_[T] | (js.ThisFunction0[/* this */ TTarget, T])
  
  type ComputedWriteFunction[T, TTarget] = js.ThisFunction1[/* this */ TTarget, /* val */ T, scala.Unit]
  
  type Extender[T /* <: typingsSlinky.knockout.mod.Subscribable_[_] */, O] = js.Function2[/* target */ T, /* options */ O, T]
  
  type Flatten[T] = T
  
  type MaybeComputed[T] = T | typingsSlinky.knockout.mod.Computed_[T]
  
  type MaybeObservable[T] = T | typingsSlinky.knockout.mod.Observable_[T]
  
  type MaybeObservableArray[T] = js.Array[T] | typingsSlinky.knockout.mod.ObservableArray_[T]
  
  type MaybeSubscribable[T] = T | typingsSlinky.knockout.mod.Subscribable_[T]
  
  type PureComputed_[T] = typingsSlinky.knockout.mod.Computed_[T]
  
  type RateLimitMethod = js.Function3[
    /* callback */ js.Function0[scala.Unit], 
    /* timeout */ scala.Double, 
    /* options */ js.Any, 
    js.Function0[scala.Unit]
  ]
  
  type Subscribable_[T] = typingsSlinky.knockout.mod.SubscribableFunctions[T]
  
  type SubscriptionCallback[T, TTarget] = js.ThisFunction1[/* this */ TTarget, /* val */ T, scala.Unit]
  
  //#endregion
  //#region subscribables/mappingHelpers.js
  type Unwrapped[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias knockout.knockout.Unwrapped<T[P]> * / object}
    */ typingsSlinky.knockout.knockoutStrings.Unwrapped with org.scalablytyped.runtime.TopLevel[js.Any])
  
  @scala.inline
  def applyBindingAccessorsToNode[T](
    node: org.scalajs.dom.raw.Node,
    bindings: js.Function0[typingsSlinky.knockout.mod.BindingAccessors],
    viewModel: T
  ): scala.Unit = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingAccessorsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindingAccessorsToNode[T](
    node: org.scalajs.dom.raw.Node,
    bindings: js.Function0[typingsSlinky.knockout.mod.BindingAccessors],
    viewModel: typingsSlinky.knockout.mod.BindingContext[T]
  ): scala.Unit = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingAccessorsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindingAccessorsToNode[T](
    node: org.scalajs.dom.raw.Node,
    bindings: typingsSlinky.knockout.mod.BindingAccessors,
    viewModel: T
  ): scala.Unit = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingAccessorsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindingAccessorsToNode[T](
    node: org.scalajs.dom.raw.Node,
    bindings: typingsSlinky.knockout.mod.BindingAccessors,
    viewModel: typingsSlinky.knockout.mod.BindingContext[T]
  ): scala.Unit = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingAccessorsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def applyBindings[T](bindingContext: T): scala.Unit = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindings[T](bindingContext: T, rootNode: org.scalajs.dom.raw.Node): scala.Unit = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindings[T](
    bindingContext: T,
    rootNode: org.scalajs.dom.raw.Node,
    extendCallback: typingsSlinky.knockout.mod.BindingContextExtendCallback[T]
  ): scala.Unit = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any], extendCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindings[T](
    bindingContext: T,
    rootNode: scala.Null,
    extendCallback: typingsSlinky.knockout.mod.BindingContextExtendCallback[T]
  ): scala.Unit = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any], extendCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindings[T](bindingContext: typingsSlinky.knockout.mod.BindingContext[T]): scala.Unit = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindings[T](bindingContext: typingsSlinky.knockout.mod.BindingContext[T], rootNode: org.scalajs.dom.raw.Node): scala.Unit = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindings[T](
    bindingContext: typingsSlinky.knockout.mod.BindingContext[T],
    rootNode: org.scalajs.dom.raw.Node,
    extendCallback: typingsSlinky.knockout.mod.BindingContextExtendCallback[T]
  ): scala.Unit = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any], extendCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindings[T](
    bindingContext: typingsSlinky.knockout.mod.BindingContext[T],
    rootNode: scala.Null,
    extendCallback: typingsSlinky.knockout.mod.BindingContextExtendCallback[T]
  ): scala.Unit = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindings")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any], extendCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def applyBindingsToDescendants[T](bindingContext: T): scala.Unit = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToDescendants")(bindingContext.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindingsToDescendants[T](bindingContext: T, rootNode: org.scalajs.dom.raw.Node): scala.Unit = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToDescendants")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindingsToDescendants[T](bindingContext: typingsSlinky.knockout.mod.BindingContext[T]): scala.Unit = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToDescendants")(bindingContext.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindingsToDescendants[T](bindingContext: typingsSlinky.knockout.mod.BindingContext[T], rootNode: org.scalajs.dom.raw.Node): scala.Unit = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToDescendants")(bindingContext.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def applyBindingsToNode[T](node: org.scalajs.dom.raw.Node, bindings: js.Function0[js.Object], viewModel: T): scala.Unit = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindingsToNode[T](
    node: org.scalajs.dom.raw.Node,
    bindings: js.Function0[js.Object],
    viewModel: typingsSlinky.knockout.mod.BindingContext[T]
  ): scala.Unit = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindingsToNode[T](node: org.scalajs.dom.raw.Node, bindings: js.Object, viewModel: T): scala.Unit = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyBindingsToNode[T](
    node: org.scalajs.dom.raw.Node,
    bindings: js.Object,
    viewModel: typingsSlinky.knockout.mod.BindingContext[T]
  ): scala.Unit = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyBindingsToNode")(node.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def bindingHandlers: typingsSlinky.knockout.mod.BindingHandlers_ = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].selectDynamic("bindingHandlers").asInstanceOf[typingsSlinky.knockout.mod.BindingHandlers_]
  
  @scala.inline
  def cleanNode(node: org.scalajs.dom.raw.Node): js.Any = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cleanNode")(node.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def computedContext: typingsSlinky.knockout.mod.ComputedContext_ = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].selectDynamic("computedContext").asInstanceOf[typingsSlinky.knockout.mod.ComputedContext_]
  
  @scala.inline
  def contextFor[T](node: org.scalajs.dom.raw.Node): typingsSlinky.knockout.mod.BindingContext[T] = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("contextFor")(node.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.knockout.mod.BindingContext[T]]
  
  @scala.inline
  def dataFor[T](node: org.scalajs.dom.raw.Node): T = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dataFor")(node.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def extenders: typingsSlinky.knockout.mod.Extenders_[js.Any] = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].selectDynamic("extenders").asInstanceOf[typingsSlinky.knockout.mod.Extenders_[js.Any]]
  
  @scala.inline
  def getBindingHandler(handler: java.lang.String): typingsSlinky.knockout.mod.BindingHandler[_] = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBindingHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.knockout.mod.BindingHandler[_]]
  
  @scala.inline
  def ignoreDependencies[Return, Target, Args /* <: js.Array[_] */](callback: js.ThisFunction1[/* this */ Target, /* args */ Args, Return]): Return = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ignoreDependencies")(callback.asInstanceOf[js.Any]).asInstanceOf[Return]
  @scala.inline
  def ignoreDependencies[Return, Target, Args /* <: js.Array[_] */](callback: js.ThisFunction1[/* this */ Target, /* args */ Args, Return], callbackTarget: Target): Return = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ignoreDependencies")(callback.asInstanceOf[js.Any], callbackTarget.asInstanceOf[js.Any])).asInstanceOf[Return]
  @scala.inline
  def ignoreDependencies[Return, Target, Args /* <: js.Array[_] */](
    callback: js.ThisFunction1[/* this */ Target, /* args */ Args, Return],
    callbackTarget: Target,
    callbackArgs: Args
  ): Return = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ignoreDependencies")(callback.asInstanceOf[js.Any], callbackTarget.asInstanceOf[js.Any], callbackArgs.asInstanceOf[js.Any])).asInstanceOf[Return]
  @scala.inline
  def ignoreDependencies[Return, Target, Args /* <: js.Array[_] */](
    callback: js.ThisFunction1[/* this */ Target, /* args */ Args, Return],
    callbackTarget: js.UndefOr[scala.Nothing],
    callbackArgs: Args
  ): Return = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ignoreDependencies")(callback.asInstanceOf[js.Any], callbackTarget.asInstanceOf[js.Any], callbackArgs.asInstanceOf[js.Any])).asInstanceOf[Return]
  
  @scala.inline
  def isComputed[T](instance: js.Any): /* is knockout.knockout.Computed<T> */ scala.Boolean = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isComputed")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.Computed<T> */ scala.Boolean]
  
  @scala.inline
  def isObservable[T](instance: js.Any): /* is knockout.knockout.Observable<T> */ scala.Boolean = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.Observable<T> */ scala.Boolean]
  
  @scala.inline
  def isObservableArray[T](instance: js.Any): /* is knockout.knockout.ObservableArray<T> */ scala.Boolean = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isObservableArray")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.ObservableArray<T> */ scala.Boolean]
  
  @scala.inline
  def isPureComputed[T](instance: js.Any): /* is knockout.knockout.PureComputed<T> */ scala.Boolean = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPureComputed")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.PureComputed<T> */ scala.Boolean]
  
  @scala.inline
  def isSubscribable[T](instance: js.Any): /* is knockout.knockout.Subscribable<T> */ scala.Boolean = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isSubscribable")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.Subscribable<T> */ scala.Boolean]
  
  @scala.inline
  def isWritableObservable[T](instance: js.Any): /* is knockout.knockout.Observable<T> */ scala.Boolean = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isWritableObservable")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.Observable<T> */ scala.Boolean]
  
  @scala.inline
  def isWriteableObservable[T](instance: js.Any): /* is knockout.knockout.Observable<T> */ scala.Boolean = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isWriteableObservable")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is knockout.knockout.Observable<T> */ scala.Boolean]
  
  @scala.inline
  def onError(error: js.Error): scala.Unit = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onError")(error.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def options: typingsSlinky.knockout.mod.Options_ = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].selectDynamic("options").asInstanceOf[typingsSlinky.knockout.mod.Options_]
  
  @scala.inline
  def pureComputed[T](evaluator: typingsSlinky.knockout.mod.ComputedReadFunction[T, scala.Unit]): typingsSlinky.knockout.mod.PureComputed_[T] = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pureComputed")(evaluator.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.knockout.mod.PureComputed_[T]]
  @scala.inline
  def pureComputed[T, TTarget](evaluator: typingsSlinky.knockout.mod.ComputedReadFunction[T, TTarget], evaluatorTarget: TTarget): typingsSlinky.knockout.mod.PureComputed_[T] = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pureComputed")(evaluator.asInstanceOf[js.Any], evaluatorTarget.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.knockout.mod.PureComputed_[T]]
  @scala.inline
  def pureComputed[T, TTarget](options: typingsSlinky.knockout.mod.ComputedOptions[T, TTarget]): typingsSlinky.knockout.mod.PureComputed_[T] = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pureComputed")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.knockout.mod.PureComputed_[T]]
  
  @scala.inline
  def removeNode(node: org.scalajs.dom.raw.Node): scala.Unit = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeNode")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def renderTemplate(template: java.lang.String): java.lang.String = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate(template: js.Function0[java.lang.String | org.scalajs.dom.raw.Node]): java.lang.String = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate(template: org.scalajs.dom.raw.Node): java.lang.String = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: java.lang.String | org.scalajs.dom.raw.Node | (js.Function0[java.lang.String | org.scalajs.dom.raw.Node]),
    dataOrBindingContext: js.UndefOr[T | typingsSlinky.knockout.mod.BindingContext[T] | scala.Null],
    options: js.UndefOr[typingsSlinky.knockout.mod.TemplateOptions[T] | scala.Null],
    targetNodeOrNodeArray: org.scalajs.dom.raw.Node | js.Array[org.scalajs.dom.raw.Node],
    renderMode: js.UndefOr[
      typingsSlinky.knockout.knockoutStrings.replaceChildren | typingsSlinky.knockout.knockoutStrings.replaceNode | typingsSlinky.knockout.knockoutStrings.ignoreTargetNode
    ]
  ): typingsSlinky.knockout.mod.Computed_[scala.Unit] = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any], targetNodeOrNodeArray.asInstanceOf[js.Any], renderMode.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.knockout.mod.Computed_[scala.Unit]]
  @scala.inline
  def renderTemplate[T](template: java.lang.String, dataOrBindingContext: T): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: java.lang.String,
    dataOrBindingContext: T,
    options: typingsSlinky.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: java.lang.String,
    dataOrBindingContext: js.UndefOr[scala.Nothing],
    options: typingsSlinky.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: java.lang.String,
    dataOrBindingContext: scala.Null,
    options: typingsSlinky.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](template: java.lang.String, dataOrBindingContext: typingsSlinky.knockout.mod.BindingContext[T]): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: java.lang.String,
    dataOrBindingContext: typingsSlinky.knockout.mod.BindingContext[T],
    options: typingsSlinky.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](template: js.Function0[org.scalajs.dom.raw.Node | java.lang.String], dataOrBindingContext: T): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: js.Function0[java.lang.String | org.scalajs.dom.raw.Node],
    dataOrBindingContext: T,
    options: typingsSlinky.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: js.Function0[java.lang.String | org.scalajs.dom.raw.Node],
    dataOrBindingContext: js.UndefOr[scala.Nothing],
    options: typingsSlinky.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: js.Function0[java.lang.String | org.scalajs.dom.raw.Node],
    dataOrBindingContext: scala.Null,
    options: typingsSlinky.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: js.Function0[org.scalajs.dom.raw.Node | java.lang.String],
    dataOrBindingContext: typingsSlinky.knockout.mod.BindingContext[T]
  ): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: js.Function0[java.lang.String | org.scalajs.dom.raw.Node],
    dataOrBindingContext: typingsSlinky.knockout.mod.BindingContext[T],
    options: typingsSlinky.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](template: org.scalajs.dom.raw.Node, dataOrBindingContext: T): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: org.scalajs.dom.raw.Node,
    dataOrBindingContext: T,
    options: typingsSlinky.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: org.scalajs.dom.raw.Node,
    dataOrBindingContext: js.UndefOr[scala.Nothing],
    options: typingsSlinky.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: org.scalajs.dom.raw.Node,
    dataOrBindingContext: scala.Null,
    options: typingsSlinky.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: org.scalajs.dom.raw.Node,
    dataOrBindingContext: typingsSlinky.knockout.mod.BindingContext[T]
  ): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate[T](
    template: org.scalajs.dom.raw.Node,
    dataOrBindingContext: typingsSlinky.knockout.mod.BindingContext[T],
    options: typingsSlinky.knockout.mod.TemplateOptions[T]
  ): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], dataOrBindingContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def renderTemplate_T[T](template: java.lang.String): java.lang.String = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate_T[T](template: js.Function0[org.scalajs.dom.raw.Node | java.lang.String]): java.lang.String = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def renderTemplate_T[T](template: org.scalajs.dom.raw.Node): java.lang.String = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def setTemplateEngine(): scala.Unit = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setTemplateEngine")().asInstanceOf[scala.Unit]
  @scala.inline
  def setTemplateEngine(templateEngine: typingsSlinky.knockout.mod.templateEngine): scala.Unit = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setTemplateEngine")(templateEngine.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def toJS[T](rootObject: T): typingsSlinky.knockout.mod.Unwrapped[T] = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(rootObject.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.knockout.mod.Unwrapped[T]]
  
  @scala.inline
  def toJSON(rootObject: js.Any): java.lang.String = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(rootObject.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def toJSON(rootObject: js.Any, replacer: js.UndefOr[scala.Nothing], space: scala.Double): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(rootObject.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def toJSON(rootObject: js.Any, replacer: js.Function): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(rootObject.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def toJSON(rootObject: js.Any, replacer: js.Function, space: scala.Double): java.lang.String = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(rootObject.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def unwrap[T](value: typingsSlinky.knockout.mod.MaybeSubscribable[T]): T = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unwrap")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
  
  @scala.inline
  def when[T](predicate: typingsSlinky.knockout.mod.ComputedReadFunction[T, scala.Unit]): js.Promise[T] = typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  @scala.inline
  def when[T, TTarget](
    predicate: typingsSlinky.knockout.mod.ComputedReadFunction[T, TTarget],
    callback: typingsSlinky.knockout.mod.SubscriptionCallback[T, TTarget]
  ): typingsSlinky.knockout.mod.Subscription = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.knockout.mod.Subscription]
  @scala.inline
  def when[T, TTarget](
    predicate: typingsSlinky.knockout.mod.ComputedReadFunction[T, TTarget],
    callback: typingsSlinky.knockout.mod.SubscriptionCallback[T, TTarget],
    context: TTarget
  ): typingsSlinky.knockout.mod.Subscription = (typingsSlinky.knockout.mod.^.asInstanceOf[js.Dynamic].applyDynamic("when")(predicate.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.knockout.mod.Subscription]
}
