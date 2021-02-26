package typingsSlinky.fluxxor

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.fluxxor.fluxxorStrings.input
import typingsSlinky.react.anon.Default
import typingsSlinky.react.experimentalMod.reactAugmentingMod.OpaqueIdentifier
import typingsSlinky.react.experimentalMod.reactAugmentingMod.SuspenseConfig
import typingsSlinky.react.experimentalMod.reactAugmentingMod.SuspenseListProps
import typingsSlinky.react.experimentalMod.reactAugmentingMod.TransitionFunction
import typingsSlinky.react.experimentalMod.reactAugmentingMod.TransitionStartFunction
import typingsSlinky.react.mod.Attributes
import typingsSlinky.react.mod.CElement
import typingsSlinky.react.mod.CFactory
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.ClassType
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.react.mod.DOMElement
import typingsSlinky.react.mod.DOMFactory
import typingsSlinky.react.mod.DependencyList
import typingsSlinky.react.mod.DetailedReactHTMLElement
import typingsSlinky.react.mod.Dispatch
import typingsSlinky.react.mod.DispatchWithoutAction
import typingsSlinky.react.mod.EffectCallback
import typingsSlinky.react.mod.Factory
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.ForwardRefRenderFunction
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.FunctionComponentElement
import typingsSlinky.react.mod.FunctionComponentFactory
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.HTMLFactory
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.react.mod.ProfilerProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.ReactChildren
import typingsSlinky.react.mod.ReactHTMLElement
import typingsSlinky.react.mod.ReactSVGElement
import typingsSlinky.react.mod.Reducer
import typingsSlinky.react.mod.ReducerAction
import typingsSlinky.react.mod.ReducerState
import typingsSlinky.react.mod.ReducerStateWithoutAction
import typingsSlinky.react.mod.ReducerWithoutAction
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.SVGAttributes
import typingsSlinky.react.mod.SVGFactory
import typingsSlinky.react.mod.SetStateAction
import typingsSlinky.react.mod.SuspenseProps
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofComponent extends StObject {
    
    // tslint won't let me format the sample code in a way that vscode likes it :(
    /**
      * If set, `this.context` will be set at runtime to the current value of the given Context.
      *
      * Usage:
      *
      * ```ts
      * type MyContext = number
      * const Ctx = React.createContext<MyContext>(0)
      *
      * class Foo extends React.Component {
      *   static contextType = Ctx
      *   context!: React.ContextType<typeof Ctx>
      *   render () {
      *     return <>My context's value: {this.context}</>;
      *   }
      * }
      * ```
      *
      * @see https://reactjs.org/docs/context.html#classcontexttype
      */
    /* static member */
    var contextType: js.UndefOr[Context[_]] = js.native
  }
  object TypeofComponent {
    
    @scala.inline
    def apply(): TypeofComponent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeofComponent]
    }
    
    @scala.inline
    implicit class TypeofComponentMutableBuilder[Self <: TypeofComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextType(value: Context[_]): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextTypeUndefined: Self = StObject.set(x, "contextType", js.undefined)
    }
  }
  
  @js.native
  trait TypeofReact extends StObject {
    
    val Children: ReactChildren = js.native
    
    // Base component for plain JS classes
    var Component: (Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
        ReactComponentClass[js.Object]
      ]) with TypeofComponent = js.native
    
    val Fragment: ReactComponentClass[typingsSlinky.react.anon.Children] = js.native
    
    val Profiler: ReactComponentClass[ProfilerProps] = js.native
    
    var PureComponent: Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
        ReactComponentClass[js.Object]
      ] = js.native
    
    val StrictMode: ReactComponentClass[typingsSlinky.react.anon.Children] = js.native
    
    /**
      * This feature is not yet available for server-side rendering.
      * Suspense support will be added in a later release.
      */
    val Suspense: ReactComponentClass[SuspenseProps] = js.native
    
    // Custom components
    def cloneElement[P](element: FunctionComponentElement[P], props: Partial[P] with Attributes, children: ReactElement*): FunctionComponentElement[P] = js.native
    def cloneElement[P](element: FunctionComponentElement[P], props: js.UndefOr[scala.Nothing], children: ReactElement*): FunctionComponentElement[P] = js.native
    def cloneElement[P](
      element: typingsSlinky.react.mod.ReactElement,
      props: Partial[P] with Attributes,
      children: ReactElement*
    ): ReactElement = js.native
    def cloneElement[P](
      element: typingsSlinky.react.mod.ReactElement,
      props: js.UndefOr[scala.Nothing],
      children: ReactElement*
    ): ReactElement = js.native
    def cloneElement[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T], props: Partial[P] with ClassAttributes[T], children: ReactElement*): CElement[P, T] = js.native
    def cloneElement[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactElement*): CElement[P, T] = js.native
    // DOM Element (has to be the last, because type checking stops at first overload that fits)
    def cloneElement[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: DOMAttributes[T] with P, children: ReactElement*): ReactElement = js.native
    def cloneElement[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactElement = js.native
    // ReactHTMLElement, less specific
    def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: ReactElement*): ReactHTMLElement[T] = js.native
    def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactHTMLElement[T] = js.native
    // SVGElement
    def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: ReactElement*): ReactSVGElement = js.native
    def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactSVGElement = js.native
    // DOM Elements
    // ReactHTMLElement
    @JSName("cloneElement")
    def cloneElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: ReactElement*): DetailedReactHTMLElement[P, T] = js.native
    @JSName("cloneElement")
    def cloneElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactElement*): DetailedReactHTMLElement[P, T] = js.native
    
    def createContext[T](
      // If you thought this should be optional, see
    // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
    defaultValue: T
    ): Context[T] = js.native
    
    def createElement[P /* <: js.Object */](`type`: String, props: Attributes with P, children: ReactElement*): ReactElement = js.native
    def createElement[P /* <: js.Object */](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactElement = js.native
    def createElement[P /* <: js.Object */](`type`: String, props: Null, children: ReactElement*): ReactElement = js.native
    def createElement[P /* <: js.Object */](
      `type`: ClassType[P, ReactComponentClass[P], ReactComponentClass[P]],
      props: ClassAttributes[ReactComponentClass[P]] with P,
      children: ReactElement*
    ): CElement[P, ReactComponentClass[P]] = js.native
    def createElement[P /* <: js.Object */](
      `type`: ClassType[P, ReactComponentClass[P], ReactComponentClass[P]],
      props: js.UndefOr[scala.Nothing],
      children: ReactElement*
    ): CElement[P, ReactComponentClass[P]] = js.native
    def createElement[P /* <: js.Object */](
      `type`: ClassType[P, ReactComponentClass[P], ReactComponentClass[P]],
      props: Null,
      children: ReactElement*
    ): CElement[P, ReactComponentClass[P]] = js.native
    def createElement[P /* <: js.Object */](`type`: ComponentClass[P, js.Object], props: Attributes with P, children: ReactElement*): ReactElement = js.native
    def createElement[P /* <: js.Object */](`type`: ComponentClass[P, js.Object], props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactElement = js.native
    def createElement[P /* <: js.Object */](`type`: ComponentClass[P, js.Object], props: Null, children: ReactElement*): ReactElement = js.native
    // Custom components
    def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: ReactElement*): FunctionComponentElement[P] = js.native
    def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: js.UndefOr[scala.Nothing], children: ReactElement*): FunctionComponentElement[P] = js.native
    def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactElement*): FunctionComponentElement[P] = js.native
    def createElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] with P, children: ReactElement*): ReactElement = js.native
    def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
      props: ClassAttributes[T] with P,
      children: ReactElement*
    ): ReactSVGElement = js.native
    def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
      props: js.UndefOr[scala.Nothing],
      children: ReactElement*
    ): ReactSVGElement = js.native
    def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
      props: Null,
      children: ReactElement*
    ): ReactSVGElement = js.native
    def createElement[P /* <: js.Object */, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: ReactElement*): CElement[P, T] = js.native
    def createElement[P /* <: js.Object */, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C], props: js.UndefOr[scala.Nothing], children: ReactElement*): CElement[P, T] = js.native
    def createElement[P /* <: js.Object */, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C], props: Null, children: ReactElement*): CElement[P, T] = js.native
    @JSName("createElement")
    def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactElement = js.native
    @JSName("createElement")
    def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Null, children: ReactElement*): ReactElement = js.native
    @JSName("createElement")
    def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
      props: ClassAttributes[T] with P,
      children: ReactElement*
    ): DetailedReactHTMLElement[P, T] = js.native
    @JSName("createElement")
    def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
      props: js.UndefOr[scala.Nothing],
      children: ReactElement*
    ): DetailedReactHTMLElement[P, T] = js.native
    @JSName("createElement")
    def createElement_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
      props: Null,
      children: ReactElement*
    ): DetailedReactHTMLElement[P, T] = js.native
    @JSName("createElement")
    def createElement_P_Object_ReactElement[P /* <: js.Object */](`type`: ReactComponentClass[P], props: Attributes with P, children: ReactElement*): ReactElement = js.native
    @JSName("createElement")
    def createElement_P_Object_ReactElement[P /* <: js.Object */](`type`: ReactComponentClass[P], props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactElement = js.native
    @JSName("createElement")
    def createElement_P_Object_ReactElement[P /* <: js.Object */](`type`: ReactComponentClass[P], props: Null, children: ReactElement*): ReactElement = js.native
    // DOM Elements
    // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
    @JSName("createElement")
    def createElement_input(
      `type`: input,
      props: InputHTMLAttributes[HTMLInputElement] with ClassAttributes[HTMLInputElement],
      children: ReactElement*
    ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
    @JSName("createElement")
    def createElement_input(`type`: input, props: js.UndefOr[scala.Nothing], children: ReactElement*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
    @JSName("createElement")
    def createElement_input(`type`: input, props: Null, children: ReactElement*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
    
    def createFactory(`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any): SVGFactory = js.native
    def createFactory[P](`type`: ClassType[P, ReactComponentClass[P], ReactComponentClass[P]]): CFactory[P, ReactComponentClass[P]] = js.native
    def createFactory[P](`type`: ComponentClass[P, js.Object]): Factory[P] = js.native
    // Custom components
    def createFactory[P](`type`: FunctionComponent[P]): FunctionComponentFactory[P] = js.native
    def createFactory[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String): DOMFactory[P, T] = js.native
    def createFactory[P, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C]): CFactory[P, T] = js.native
    //
    // Top Level API
    // ----------------------------------------------------------------------
    // DOM Elements
    @JSName("createFactory")
    def createFactory_T_HTMLElement_HTMLFactory[T /* <: HTMLElement */](`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any): HTMLFactory[T] = js.native
    
    def createRef[T](): ReactRef[T] = js.native
    
    def forwardRef[T, P](render: ForwardRefRenderFunction[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[T]] = js.native
    
    def isValidElement[P](): /* is react.react.ReactElement */ Boolean = js.native
    def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = js.native
    
    def `lazy`[T /* <: ReactComponentClass[_] */](factory: js.Function0[js.Promise[Default[T]]]): ReactComponentClass[T] = js.native
    
    def memo[T /* <: ReactComponentClass[_] */](Component: T): ReactComponentClass[T] = js.native
    def memo[T /* <: ReactComponentClass[_] */](
      Component: T,
      propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
    ): ReactComponentClass[T] = js.native
    def memo[P /* <: js.Object */](Component: ReactComponentClass[P]): ReactComponentClass[P] = js.native
    def memo[P /* <: js.Object */](
      Component: ReactComponentClass[P],
      propsAreEqual: js.Function2[/* prevProps */ PropsWithChildren[P], /* nextProps */ PropsWithChildren[P], Boolean]
    ): ReactComponentClass[P] = js.native
    
    val unstable_SuspenseList: ReactComponentClass[SuspenseListProps] = js.native
    
    def unstable_startTransition(scope: TransitionFunction): Unit = js.native
    
    def unstable_useDeferredValue[T](value: T): T = js.native
    
    def unstable_useOpaqueIdentifier(): OpaqueIdentifier = js.native
    
    def unstable_useTransition(): js.Tuple2[TransitionStartFunction, Boolean] = js.native
    def unstable_useTransition(config: SuspenseConfig): js.Tuple2[TransitionStartFunction, Boolean] = js.native
    
    def unstable_withSuspenseConfig(scope: js.Function0[js.UndefOr[Unit]]): Unit = js.native
    def unstable_withSuspenseConfig(scope: js.Function0[js.UndefOr[Unit]], config: SuspenseConfig): Unit = js.native
    
    // I made 'inputs' required here and in useMemo as there's no point to memoizing without the memoization key
    // useCallback(X) is identical to just using X, useMemo(() => Y) is identical to just using Y.
    /**
      * `useCallback` will return a memoized version of the callback that only changes if one of the `inputs`
      * has changed.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usecallback
      */
    // TODO (TypeScript 3.0): <T extends (...args: never[]) => unknown>
    def useCallback[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T, deps: DependencyList): T = js.native
    
    // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
    /**
      * Accepts a context object (the value returned from `React.createContext`) and returns the current
      * context value, as given by the nearest context provider for the given context.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usecontext
      */
    def useContext[T](context: Context[T]): T = js.native
    
    /**
      * `useDebugValue` can be used to display a label for custom hooks in React DevTools.
      *
      * NOTE: We don’t recommend adding debug values to every custom hook.
      * It’s most valuable for custom hooks that are part of shared libraries.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usedebugvalue
      */
    // the name of the custom hook is itself derived from the function name at runtime:
    // it's just the function name without the "use" prefix.
    def useDebugValue[T](value: T): Unit = js.native
    def useDebugValue[T](value: T, format: js.Function1[/* value */ T, _]): Unit = js.native
    
    /**
      * Accepts a function that contains imperative, possibly effectful code.
      *
      * @param effect Imperative function that can return a cleanup function
      * @param deps If present, effect will only activate if the values in the list change.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#useeffect
      */
    def useEffect(effect: EffectCallback): Unit = js.native
    def useEffect(effect: EffectCallback, deps: DependencyList): Unit = js.native
    
    // NOTE: this does not accept strings, but this will have to be fixed by removing strings from type Ref<T>
    /**
      * `useImperativeHandle` customizes the instance value that is exposed to parent components when using
      * `ref`. As always, imperative code using refs should be avoided in most cases.
      *
      * `useImperativeHandle` should be used with `React.forwardRef`.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#useimperativehandle
      */
    def useImperativeHandle[T, R /* <: T */](ref: js.UndefOr[Ref[T]], init: js.Function0[R]): Unit = js.native
    def useImperativeHandle[T, R /* <: T */](ref: js.UndefOr[Ref[T]], init: js.Function0[R], deps: DependencyList): Unit = js.native
    
    /**
      * The signature is identical to `useEffect`, but it fires synchronously after all DOM mutations.
      * Use this to read layout from the DOM and synchronously re-render. Updates scheduled inside
      * `useLayoutEffect` will be flushed synchronously, before the browser has a chance to paint.
      *
      * Prefer the standard `useEffect` when possible to avoid blocking visual updates.
      *
      * If you’re migrating code from a class component, `useLayoutEffect` fires in the same phase as
      * `componentDidMount` and `componentDidUpdate`.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#uselayouteffect
      */
    def useLayoutEffect(effect: EffectCallback): Unit = js.native
    def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = js.native
    
    /**
      * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
      *
      * Usage note: if calling `useMemo` with a referentially stable function, also give it as the input in
      * the second argument.
      *
      * ```ts
      * function expensive () { ... }
      *
      * function Component () {
      *   const expensiveResult = useMemo(expensive, [expensive])
      *   return ...
      * }
      * ```
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usememo
      */
    // allow undefined, but don't make it optional as that is very likely a mistake
    def useMemo[T](factory: js.Function0[T]): T = js.native
    def useMemo[T](factory: js.Function0[T], deps: DependencyList): T = js.native
    
    /**
      * An alternative to `useState`.
      *
      * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
      * multiple sub-values. It also lets you optimize performance for components that trigger deep
      * updates because you can pass `dispatch` down instead of callbacks.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usereducer
      */
    // overload where dispatch could accept 0 arguments.
    def useReducer[R /* <: ReducerWithoutAction[_] */](reducer: R, initializerArg: ReducerStateWithoutAction[R], initializer: js.UndefOr[scala.Nothing]): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = js.native
    /**
      * An alternative to `useState`.
      *
      * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
      * multiple sub-values. It also lets you optimize performance for components that trigger deep
      * updates because you can pass `dispatch` down instead of callbacks.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usereducer
      */
    // overload where dispatch could accept 0 arguments.
    def useReducer[R /* <: ReducerWithoutAction[_] */, I](
      reducer: R,
      initializerArg: I,
      initializer: js.Function1[/* arg */ I, ReducerStateWithoutAction[R]]
    ): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = js.native
    /**
      * An alternative to `useState`.
      *
      * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
      * multiple sub-values. It also lets you optimize performance for components that trigger deep
      * updates because you can pass `dispatch` down instead of callbacks.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usereducer
      */
    // I'm not sure if I keep this 2-ary or if I make it (2,3)-ary; it's currently (2,3)-ary.
    // The Flow types do have an overload for 3-ary invocation with undefined initializer.
    // NOTE: without the ReducerState indirection, TypeScript would reduce S to be the most common
    // supertype between the reducer's return type and the initialState (or the initializer's return type),
    // which would prevent autocompletion from ever working.
    // TODO: double-check if this weird overload logic is necessary. It is possible it's either a bug
    // in older versions, or a regression in newer versions of the typescript completion service.
    @JSName("useReducer")
    def useReducer_R_ReducerWildcardWildcard[R /* <: Reducer[_, _] */](reducer: R, initialState: ReducerState[R], initializer: js.UndefOr[scala.Nothing]): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = js.native
    /**
      * An alternative to `useState`.
      *
      * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
      * multiple sub-values. It also lets you optimize performance for components that trigger deep
      * updates because you can pass `dispatch` down instead of callbacks.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usereducer
      */
    // overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
    // If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be omitted.
    // the last overload effectively behaves as if the identity function (x => x) is the initializer.
    // overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
    @JSName("useReducer")
    def useReducer_R_ReducerWildcardWildcardI[R /* <: Reducer[_, _] */, I](
      reducer: R,
      initializerArg: (I with ReducerState[R]) | I,
      initializer: js.Function1[(/* arg */ I with ReducerState[R]) | (/* arg */ I), ReducerState[R]]
    ): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = js.native
    
    // convenience overload for potentially undefined initialValue / call with 0 arguments
    // has a default to stop it from defaulting to {} instead
    /**
      * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
      * (`initialValue`). The returned object will persist for the full lifetime of the component.
      *
      * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
      * value around similar to how you’d use instance fields in classes.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#useref
      */
    // TODO (TypeScript 3.0): <T extends unknown>
    def useRef[T](): MutableRefObject[js.UndefOr[T]] = js.native
    /**
      * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
      * (`initialValue`). The returned object will persist for the full lifetime of the component.
      *
      * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
      * value around similar to how you’d use instance fields in classes.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#useref
      */
    // TODO (TypeScript 3.0): <T extends unknown>
    def useRef[T](initialValue: T): MutableRefObject[T] = js.native
    // convenience overload for refs given as a ref prop as they typically start with a null value
    /**
      * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
      * (`initialValue`). The returned object will persist for the full lifetime of the component.
      *
      * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
      * value around similar to how you’d use instance fields in classes.
      *
      * Usage note: if you need the result of useRef to be directly mutable, include `| null` in the type
      * of the generic argument.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#useref
      */
    // TODO (TypeScript 3.0): <T extends unknown>
    @JSName("useRef")
    def useRef_T_RefObject[T](): ReactRef[T] = js.native
    @JSName("useRef")
    def useRef_T_RefObject[T](initialValue: T): ReactRef[T] = js.native
    
    // convenience overload when first argument is omitted
    /**
      * Returns a stateful value, and a function to update it.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usestate
      */
    def useState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = js.native
    /**
      * Returns a stateful value, and a function to update it.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usestate
      */
    def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
    def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
    
    val version: String = js.native
  }
}
