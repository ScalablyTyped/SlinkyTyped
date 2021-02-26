package typingsSlinky.babelPluginReactHtmlAttrs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnimationEventHandler[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.EventHandler[typingsSlinky.babelPluginReactHtmlAttrs.mod.AnimationEvent[T]]
  
  type AudioHTMLAttributes[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.MediaHTMLAttributes[T]
  
  type Booleanish = scala.Boolean
  
  type CElement[P, T /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.Component[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState, _] */] = typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentElement[P, T]
  
  type CFactory[P, T /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.Component[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState, _] */] = typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentFactory[P, T]
  
  type CSSProperties = typingsSlinky.csstype.mod.Properties[java.lang.String | scala.Double]
  
  type ChangeEventHandler[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.EventHandler[typingsSlinky.babelPluginReactHtmlAttrs.mod.ChangeEvent[T]]
  
  @scala.inline
  def Children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactChildren = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Children").asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactChildren]
  
  /**
    * We use an intersection type to infer multiple type parameters from
    * a single argument, which is useful for many top-level API defs.
    * See https://github.com/Microsoft/TypeScript/issues/7234 for more info.
    */
  type ClassType[P, T /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.Component[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState, _] */, C /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState] */] = C with (org.scalablytyped.runtime.Instantiable2[/* props */ P, /* context */ js.UndefOr[js.Any], T])
  
  type ClassicElement[P] = typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[
    P, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState]
  ]
  
  type ClassicFactory[P] = typingsSlinky.babelPluginReactHtmlAttrs.mod.CFactory[
    P, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState]
  ]
  
  type ClipboardEventHandler[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.EventHandler[typingsSlinky.babelPluginReactHtmlAttrs.mod.ClipboardEvent[T]]
  
  type ComponentFactory[P, T /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.Component[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState, _] */] = js.Function2[
    /* props */ js.UndefOr[typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassAttributes[T] with P], 
    /* repeated */ typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[P, T]
  ]
  
  /**
    * NOTE: prefer ComponentPropsWithRef, if the ref is forwarded,
    * or ComponentPropsWithoutRef when refs are not supported.
    */
  type ComponentProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.<global>.JSX.IntrinsicElements[T] */ js.Any)
  
  type ComponentPropsWithRef[T /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.ElementType[_] */] = typingsSlinky.babelPluginReactHtmlAttrs.mod.PropsWithRef[typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentProps[T]] | (typingsSlinky.babelPluginReactHtmlAttrs.mod.PropsWithoutRef[_] with typingsSlinky.babelPluginReactHtmlAttrs.mod.RefAttributes[typingsSlinky.std.InstanceType[T]])
  
  type ComponentPropsWithoutRef[T /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.ElementType[_] */] = typingsSlinky.babelPluginReactHtmlAttrs.mod.PropsWithoutRef[typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentProps[T]]
  
  type ComponentState = js.Any
  
  type ComponentType[P] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState]) | typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponent[P]
  
  type CompositionEventHandler[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.EventHandler[typingsSlinky.babelPluginReactHtmlAttrs.mod.CompositionEvent[T]]
  
  type Consumer[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.ExoticComponent[typingsSlinky.babelPluginReactHtmlAttrs.mod.ConsumerProps[T]]
  
  type ContextType[C /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.Context[_] */] = js.Any
  
  type DOMFactory[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */] = js.Function2[
    /* props */ js.UndefOr[
      (typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassAttributes[T] with P) | scala.Null
    ], 
    /* repeated */ typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMElement[P, T]
  ]
  
  // Any prop that has a default prop becomes optional, but its type is unchanged
  // Undeclared default props are augmented into the resulting allowable attributes
  // If declared props have indexed properties, ignore default props entirely as keyof gets widened
  // Wrap in an outer-level conditional type to allow distribution over props that are unions
  type Defaultize[P, D] = ((typingsSlinky.std.Pick[
    P, 
    typingsSlinky.std.Exclude[/* keyof P */ java.lang.String, /* keyof D */ java.lang.String]
  ]) with (typingsSlinky.std.Partial[
    typingsSlinky.std.Pick[
      P, 
      typingsSlinky.std.Extract[/* keyof P */ java.lang.String, /* keyof D */ java.lang.String]
    ]
  ]) with (typingsSlinky.std.Partial[
    typingsSlinky.std.Pick[
      D, 
      typingsSlinky.std.Exclude[/* keyof D */ java.lang.String, /* keyof P */ java.lang.String]
    ]
  ])) | P
  
  // TODO (TypeScript 3.0): ReadonlyArray<unknown>
  type DependencyList = js.Array[js.Any]
  
  type DetailedHTMLProps[E /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.HTMLAttributes[T] */, T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassAttributes[T] with E
  
  // this technically does accept a second argument, but it's already under a deprecation warning
  // and it's not even released so probably better to not define it.
  type Dispatch[A] = js.Function1[/* value */ A, scala.Unit]
  
  // Since action _can_ be undefined, dispatch may be called without any parameters.
  type DispatchWithoutAction = js.Function0[scala.Unit]
  
  type DragEventHandler[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.EventHandler[typingsSlinky.babelPluginReactHtmlAttrs.mod.DragEvent[T]]
  
  // NOTE: callbacks are _only_ allowed to return either void, or a destructor.
  // The destructor is itself only allowed to return void.
  type EffectCallback = js.Function0[scala.Unit | js.Function0[js.UndefOr[scala.Unit]]]
  
  /**
    * Gets the instance type for a React element. The instance will be different for various component types:
    *
    * - React class components will be the class instance. So if you had `class Foo extends React.Component<{}> {}`
    *   and used `React.ElementRef<typeof Foo>` then the type would be the instance of `Foo`.
    * - React stateless functional components do not have a backing instance and so `React.ElementRef<typeof Bar>`
    *   (when `Bar` is `function Bar() {}`) will give you the `undefined` type.
    * - JSX intrinsics like `div` will give you their DOM instance. For `React.ElementRef<'div'>` that would be
    *   `HTMLDivElement`. For `React.ElementRef<'input'>` that would be `HTMLInputElement`.
    * - React stateless functional components that forward a `ref` will give you the `ElementRef` of the forwarded
    *   to component.
    *
    * `C` must be the type _of_ a React component so you need to use typeof as in React.ElementRef<typeof MyComponent>.
    *
    * @todo In Flow, this works a little different with forwarded refs and the `AbstractComponent` that
    *       `React.forwardRef()` returns.
    */
  type ElementRef[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any */] = js.UndefOr[js.Any | typingsSlinky.std.InstanceType[C]]
  
  //
  // React Elements
  // ----------------------------------------------------------------------
  type ElementType[P] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' ]: P extends babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.<global>.JSX.IntrinsicElements[K]? K : never}['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view'] */ js.Any) | typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentType[P]
  
  //
  // Event Handler Types
  // ----------------------------------------------------------------------
  type EventHandler[E /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.SyntheticEvent[_, org.scalajs.dom.raw.Event] */] = js.Function1[/* event */ E, scala.Unit]
  
  type ExactlyAnyPropertyKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.IsExactlyAny<T[K]> extends true? K : never}[keyof T] */ js.Any
  
  type FC[P] = typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponent[P]
  
  //
  // Factories
  // ----------------------------------------------------------------------
  type Factory[P] = js.Function2[
    /* props */ js.UndefOr[typingsSlinky.babelPluginReactHtmlAttrs.mod.Attributes with P], 
    /* repeated */ typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
      P, 
      java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[js.Any]
    ]
  ]
  
  type FocusEventHandler[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.EventHandler[typingsSlinky.babelPluginReactHtmlAttrs.mod.FocusEvent[T]]
  
  type FormEvent[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.SyntheticEvent[T, org.scalajs.dom.raw.Event]
  
  type FormEventHandler[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.EventHandler[typingsSlinky.babelPluginReactHtmlAttrs.mod.FormEvent[T]]
  
  @scala.inline
  def Fragment: typingsSlinky.babelPluginReactHtmlAttrs.mod.ExoticComponent[typingsSlinky.babelPluginReactHtmlAttrs.anon.Children] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Fragment").asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ExoticComponent[typingsSlinky.babelPluginReactHtmlAttrs.anon.Children]]
  
  type FunctionComponentFactory[P] = js.Function2[
    /* props */ js.UndefOr[typingsSlinky.babelPluginReactHtmlAttrs.mod.Attributes with P], 
    /* repeated */ typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P]
  ]
  
  type GetDerivedStateFromError[P, S] = /**
    * This lifecycle is invoked after an error has been thrown by a descendant component.
    * It receives the error that was thrown as a parameter and should return a value to update state.
    *
    * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
    */
  js.Function1[/* error */ js.Any, typingsSlinky.std.Partial[S] | scala.Null]
  
  type GetDerivedStateFromProps[P, S] = /**
    * Returns an update to a component's state based on its new props and old state.
    *
    * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
    */
  js.Function2[/* nextProps */ P, /* prevState */ S, typingsSlinky.std.Partial[S] | scala.Null]
  
  type HTMLFactory[T /* <: org.scalajs.dom.raw.HTMLElement */] = typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedHTMLFactory[typingsSlinky.babelPluginReactHtmlAttrs.mod.AllHTMLAttributes[T], T]
  
  type JSXElementConstructor[P] = (js.Function1[
    /* props */ P, 
    (typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
      js.Any, 
      java.lang.String | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.JSXElementConstructor<any> */ js.Object)
    ]) | scala.Null
  ]) | (org.scalablytyped.runtime.Instantiable1[
    /* props */ P, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.Component[P, js.Any, js.Any]
  ])
  
  type Key = java.lang.String | scala.Double
  
  type KeyboardEventHandler[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.EventHandler[typingsSlinky.babelPluginReactHtmlAttrs.mod.KeyboardEvent[T]]
  
  type LegacyRef[T] = java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.Ref[T]
  
  // Try to resolve ill-defined props like for JS users: props can be any, or sometimes objects with properties of type any
  type MergePropTypes[P, T] = ((typingsSlinky.std.Pick[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.NotExactlyAnyPropertyKeys[P]]) with (// For props which are exactly any, use the type inferred from propTypes if present
  typingsSlinky.std.Pick[
    T, 
    typingsSlinky.std.Exclude[
      /* keyof T */ java.lang.String, 
      typingsSlinky.babelPluginReactHtmlAttrs.mod.NotExactlyAnyPropertyKeys[P]
    ]
  ]) with (// Keep leftover props not specified in propTypes
  typingsSlinky.std.Pick[
    P, 
    typingsSlinky.std.Exclude[/* keyof P */ java.lang.String, /* keyof T */ java.lang.String]
  ])) | P | T
  
  type MouseEventHandler[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.EventHandler[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.MouseEvent[T, org.scalajs.dom.raw.MouseEvent]
  ]
  
  type NativeAnimationEvent = org.scalajs.dom.raw.AnimationEvent
  
  type NativeClipboardEvent = org.scalajs.dom.raw.ClipboardEvent
  
  type NativeCompositionEvent = org.scalajs.dom.raw.CompositionEvent
  
  type NativeDragEvent = org.scalajs.dom.raw.DragEvent
  
  type NativeFocusEvent = org.scalajs.dom.raw.FocusEvent
  
  type NativeKeyboardEvent = org.scalajs.dom.raw.KeyboardEvent
  
  type NativeMouseEvent = org.scalajs.dom.raw.MouseEvent
  
  type NativePointerEvent = org.scalajs.dom.raw.PointerEvent
  
  type NativeTouchEvent = org.scalajs.dom.raw.TouchEvent
  
  type NativeTransitionEvent = org.scalajs.dom.raw.TransitionEvent
  
  type NativeUIEvent = org.scalajs.dom.raw.UIEvent
  
  type NativeWheelEvent = org.scalajs.dom.raw.WheelEvent
  
  type NotExactlyAnyPropertyKeys[T] = typingsSlinky.std.Exclude[
    /* keyof T */ java.lang.String, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ExactlyAnyPropertyKeys[T]
  ]
  
  type PointerEventHandler[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.EventHandler[typingsSlinky.babelPluginReactHtmlAttrs.mod.PointerEvent[T]]
  
  @scala.inline
  def Profiler: typingsSlinky.babelPluginReactHtmlAttrs.mod.ExoticComponent[typingsSlinky.babelPluginReactHtmlAttrs.mod.ProfilerProps] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Profiler").asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ExoticComponent[typingsSlinky.babelPluginReactHtmlAttrs.mod.ProfilerProps]]
  
  /**
    * {@link https://github.com/bvaughn/rfcs/blob/profiler/text/0000-profiler.md#detailed-design | API}
    */
  type ProfilerOnRenderCallback = js.Function7[
    /* id */ java.lang.String, 
    /* phase */ typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.mount | typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.update, 
    /* actualDuration */ scala.Double, 
    /* baseDuration */ scala.Double, 
    /* startTime */ scala.Double, 
    /* commitTime */ scala.Double, 
    /* interactions */ typingsSlinky.std.Set[typingsSlinky.babelPluginReactHtmlAttrs.mod.SchedulerInteraction], 
    scala.Unit
  ]
  
  type PropsWithChildren[P] = P with typingsSlinky.babelPluginReactHtmlAttrs.anon.Children
  
  /** Ensures that the props do not include string ref, which cannot be forwarded */
  type PropsWithRef[P] = P | (typingsSlinky.babelPluginReactHtmlAttrs.mod.PropsWithoutRef[P] with typingsSlinky.babelPluginReactHtmlAttrs.anon.`1`)
  
  /** Ensures that the props do not include ref at all */
  type PropsWithoutRef[P] = P | (typingsSlinky.std.Pick[
    P, 
    typingsSlinky.std.Exclude[
      /* keyof P */ java.lang.String, 
      typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.ref
    ]
  ])
  
  // NOTE: only the Context object itself can get a displayName
  // https://github.com/facebook/react-devtools/blob/e0b854e4c/backend/attachRendererFiber.js#L310-L325
  type Provider[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.ProviderExoticComponent[typingsSlinky.babelPluginReactHtmlAttrs.mod.ProviderProps[T]]
  
  type ReactChild = (typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    js.Any, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[js.Any]
  ]) | typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactText
  
  type ReactComponentElement[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */, P] = typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[P, typingsSlinky.std.Exclude[T, scala.Double]]
  
  type ReactEventHandler[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.EventHandler[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.SyntheticEvent[T, org.scalajs.dom.raw.Event]
  ]
  
  type ReactFragment = js.Object | typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNodeArray
  
  // ReactHTML for ReactHTMLElement
  type ReactHTMLElement[T /* <: org.scalajs.dom.raw.HTMLElement */] = typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[typingsSlinky.babelPluginReactHtmlAttrs.mod.AllHTMLAttributes[T], T]
  
  //
  // Component API
  // ----------------------------------------------------------------------
  type ReactInstance = (typingsSlinky.babelPluginReactHtmlAttrs.mod.Component[js.Any, js.Object, js.Any]) | org.scalajs.dom.raw.Element
  
  type ReactManagedAttributes[C, P] = P | (typingsSlinky.babelPluginReactHtmlAttrs.mod.Defaultize[
    (typingsSlinky.babelPluginReactHtmlAttrs.mod.MergePropTypes[P, typingsSlinky.propTypes.mod.InferProps[js.Any]]) | P, 
    js.Any
  ]) | (typingsSlinky.babelPluginReactHtmlAttrs.mod.MergePropTypes[P, typingsSlinky.propTypes.mod.InferProps[js.Any]])
  
  type ReactNode = js.UndefOr[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactChild | typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactFragment | typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactPortal | scala.Boolean | scala.Null
  ]
  
  //
  // React Nodes
  // http://facebook.github.io/react/docs/glossary.html
  // ----------------------------------------------------------------------
  type ReactText = java.lang.String | scala.Double
  
  /**
    * @deprecated Please use `ElementType`
    */
  type ReactType[P] = typingsSlinky.babelPluginReactHtmlAttrs.mod.ElementType[P]
  
  // Unlike redux, the actions _can_ be anything
  type Reducer[S, A] = js.Function2[/* prevState */ S, /* action */ A, S]
  
  type ReducerAction[R /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.Reducer[_, _] */] = js.Any
  
  // types used to try and prevent the compiler from reducing S
  // to a supertype common with the second argument to useReducer()
  type ReducerState[R /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.Reducer[_, _] */] = js.Any
  
  // The identity check is done with the SameValue algorithm (Object.is), which is stricter than ===
  type ReducerStateWithoutAction[R /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerWithoutAction[_] */] = js.Any
  
  // If useReducer accepts a reducer without action, dispatch may be called without any parameters.
  type ReducerWithoutAction[S] = js.Function1[/* prevState */ S, S]
  
  type Ref[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.RefCallback[T] | typingsSlinky.babelPluginReactHtmlAttrs.mod.RefObject[T] | scala.Null
  
  type RefCallback[T] = js.Function1[/* instance */ T | scala.Null, scala.Unit]
  
  /**
    * @deprecated Use ForwardRefRenderFunction. forwardRef doesn't accept a
    *             "real" component.
    */
  type RefForwardingComponent[T, P] = typingsSlinky.babelPluginReactHtmlAttrs.mod.ForwardRefRenderFunction[T, P]
  
  type Requireable[T] = typingsSlinky.propTypes.mod.Requireable[T]
  
  //
  // Class Interfaces
  // ----------------------------------------------------------------------
  /**
    * @deprecated as of recent React versions, function components can no
    * longer be considered 'stateless'. Please use `FunctionComponent` instead.
    *
    * @see [React Hooks](https://reactjs.org/docs/hooks-intro.html)
    */
  type SFC[P] = typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponent[P]
  
  /**
    * @deprecated Please use `FunctionComponentElement`
    */
  type SFCElement[P] = typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P]
  
  /**
    * @deprecated Please use `FunctionComponentFactory`
    */
  type SFCFactory[P] = typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponentFactory[P]
  
  //
  // React Hooks
  // ----------------------------------------------------------------------
  // based on the code in https://github.com/facebook/react/pull/13968
  // Unlike the class component setState, the updates are not allowed to be partial
  type SetStateAction[S] = S | (js.Function1[/* prevState */ S, S])
  
  /**
    * @deprecated as of recent React versions, function components can no
    * longer be considered 'stateless'. Please use `FunctionComponent` instead.
    *
    * @see [React Hooks](https://reactjs.org/docs/hooks-intro.html)
    */
  type StatelessComponent[P] = typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponent[P]
  
  @scala.inline
  def StrictMode: typingsSlinky.babelPluginReactHtmlAttrs.mod.ExoticComponent[typingsSlinky.babelPluginReactHtmlAttrs.anon.Children] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("StrictMode").asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ExoticComponent[typingsSlinky.babelPluginReactHtmlAttrs.anon.Children]]
  
  /**
    * This feature is not yet available for server-side rendering.
    * Suspense support will be added in a later release.
    */
  @scala.inline
  def Suspense: typingsSlinky.babelPluginReactHtmlAttrs.mod.ExoticComponent[typingsSlinky.babelPluginReactHtmlAttrs.mod.SuspenseProps] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Suspense").asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ExoticComponent[typingsSlinky.babelPluginReactHtmlAttrs.mod.SuspenseProps]]
  
  @scala.inline
  def SuspenseList: typingsSlinky.babelPluginReactHtmlAttrs.mod.ExoticComponent[
    typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseListProps
  ] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SuspenseList").asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ExoticComponent[
    typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseListProps
  ]]
  
  /**
    * currentTarget - a reference to the element on which the event listener is registered.
    *
    * target - a reference to the element from which the event was originally dispatched.
    * This might be a child element to the element on which the event listener is registered.
    * If you thought this should be `EventTarget & T`, see https://github.com/DefinitelyTyped/DefinitelyTyped/pull/12239
    */
  type SyntheticEvent[T, E] = typingsSlinky.babelPluginReactHtmlAttrs.mod.BaseSyntheticEvent[E, org.scalajs.dom.raw.EventTarget with T, org.scalajs.dom.raw.EventTarget]
  
  type TouchEventHandler[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.EventHandler[typingsSlinky.babelPluginReactHtmlAttrs.mod.TouchEvent[T]]
  
  type TransitionEventHandler[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.EventHandler[typingsSlinky.babelPluginReactHtmlAttrs.mod.TransitionEvent[T]]
  
  type TransitionFunction = js.Function0[js.UndefOr[scala.Unit]]
  
  type TransitionStartFunction = js.Function1[
    /* callback */ typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TransitionFunction, 
    scala.Unit
  ]
  
  type UIEventHandler[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.EventHandler[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.UIEvent[T, org.scalajs.dom.raw.UIEvent]
  ]
  
  type ValidationMap[T] = typingsSlinky.propTypes.mod.ValidationMap[T]
  
  //
  // React.PropTypes
  // ----------------------------------------------------------------------
  type Validator[T] = typingsSlinky.propTypes.mod.Validator[T]
  
  type WeakValidationMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? null extends T[K]? babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.Validator<T[K] | null | undefined> : undefined extends T[K]? babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.Validator<T[K] | null | undefined> : babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.Validator<T[K]>}
    */ typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.WeakValidationMap with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type WheelEventHandler[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.EventHandler[typingsSlinky.babelPluginReactHtmlAttrs.mod.WheelEvent[T]]
  
  // Custom components
  @scala.inline
  def cloneElement[P](
    element: typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P],
    props: typingsSlinky.std.Partial[P] with typingsSlinky.babelPluginReactHtmlAttrs.mod.Attributes,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P]]
  @scala.inline
  def cloneElement[P](
    element: typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P],
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P]]
  @scala.inline
  def cloneElement[P](
    element: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
      P, 
      java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
    ],
    props: typingsSlinky.std.Partial[P] with typingsSlinky.babelPluginReactHtmlAttrs.mod.Attributes,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def cloneElement[P](
    element: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
      P, 
      java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
    ],
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def cloneElement[P, T /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.Component[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState, _] */](
    element: typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[P, T],
    props: typingsSlinky.std.Partial[P] with typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassAttributes[T],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[P, T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[P, T]]
  @scala.inline
  def cloneElement[P, T /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.Component[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState, _] */](
    element: typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[P, T],
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[P, T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[P, T]]
  // DOM Element (has to be the last, because type checking stops at first overload that fits)
  @scala.inline
  def cloneElement[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */](
    element: typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMElement[P, T],
    props: typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMAttributes[T] with P,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMElement[P, T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMElement[P, T]]
  @scala.inline
  def cloneElement[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */](
    element: typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMElement[P, T],
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMElement[P, T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMElement[P, T]]
  // DOM Elements
  // ReactHTMLElement
  @scala.inline
  def cloneElement[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.HTMLAttributes[T] */, T /* <: org.scalajs.dom.raw.HTMLElement */](
    element: typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T],
    props: P,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T]]
  @scala.inline
  def cloneElement[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.HTMLAttributes[T] */, T /* <: org.scalajs.dom.raw.HTMLElement */](
    element: typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T],
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T]]
  // SVGElement
  @scala.inline
  def cloneElement[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.SVGAttributes[T] */, T /* <: org.scalajs.dom.raw.SVGElement */](
    element: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactSVGElement,
    props: P,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactSVGElement = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactSVGElement]
  @scala.inline
  def cloneElement[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.SVGAttributes[T] */, T /* <: org.scalajs.dom.raw.SVGElement */](
    element: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactSVGElement,
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactSVGElement = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactSVGElement]
  
  // ReactHTMLElement, less specific
  @scala.inline
  def cloneElement_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.HTMLAttributes[T] */, T /* <: org.scalajs.dom.raw.HTMLElement */](
    element: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactHTMLElement[T],
    props: P,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactHTMLElement[T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactHTMLElement[T]]
  @scala.inline
  def cloneElement_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.HTMLAttributes[T] */, T /* <: org.scalajs.dom.raw.HTMLElement */](
    element: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactHTMLElement[T],
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactHTMLElement[T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactHTMLElement[T]]
  
  @scala.inline
  def createContext[T](
    // If you thought this should be optional, see
  // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
  defaultValue: T
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.Context[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.Context[T]]
  @scala.inline
  def createContext[T](
    // If you thought this should be optional, see
  // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
  defaultValue: T,
    calculateChangedBits: js.Function2[/* prev */ T, /* next */ T, scala.Double]
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.Context[T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any], calculateChangedBits.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.Context[T]]
  
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: java.lang.String,
    props: typingsSlinky.babelPluginReactHtmlAttrs.mod.Attributes with P,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: java.lang.String,
    props: scala.Null,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassType[
      P, 
      typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState], 
      typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponentClass[P]
    ],
    props: (typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassAttributes[
      typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState]
    ]) with P,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[
    P, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState]
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[
    P, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassType[
      P, 
      typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState], 
      typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponentClass[P]
    ],
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[
    P, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState]
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[
    P, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassType[
      P, 
      typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState], 
      typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponentClass[P]
    ],
    props: scala.Null,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[
    P, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState]
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[
    P, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState],
    props: typingsSlinky.babelPluginReactHtmlAttrs.mod.Attributes with P,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState],
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState],
    props: scala.Null,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponent[P],
    props: typingsSlinky.babelPluginReactHtmlAttrs.mod.Attributes with P,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponent[P],
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponent[P],
    props: scala.Null,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typingsSlinky.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def createElement[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */](
    `type`: java.lang.String,
    props: typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassAttributes[T] with P,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMElement[P, T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMElement[P, T]]
  @scala.inline
  def createElement[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.HTMLAttributes[T] */, T /* <: org.scalajs.dom.raw.HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassAttributes[T] with P,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T]]
  @scala.inline
  def createElement[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.HTMLAttributes[T] */, T /* <: org.scalajs.dom.raw.HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T]]
  @scala.inline
  def createElement[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.HTMLAttributes[T] */, T /* <: org.scalajs.dom.raw.HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: scala.Null,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T]]
  @scala.inline
  def createElement[P /* <: js.Object */, T /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.Component[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState, _] */, C /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState] */](
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassType[P, T, C],
    props: typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassAttributes[T] with P,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[P, T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[P, T]]
  @scala.inline
  def createElement[P /* <: js.Object */, T /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.Component[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState, _] */, C /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState] */](
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassType[P, T, C],
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[P, T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[P, T]]
  @scala.inline
  def createElement[P /* <: js.Object */, T /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.Component[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState, _] */, C /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState] */](
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassType[P, T, C],
    props: scala.Null,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[P, T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.CElement[P, T]]
  
  @scala.inline
  def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */](
    `type`: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMElement[P, T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMElement[P, T]]
  @scala.inline
  def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */](
    `type`: java.lang.String,
    props: scala.Null,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMElement[P, T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMElement[P, T]]
  
  // Custom components
  @scala.inline
  def createElement_P_Object_FunctionComponentElement[P /* <: js.Object */](
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponent[P],
    props: typingsSlinky.babelPluginReactHtmlAttrs.mod.Attributes with P,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P]]
  @scala.inline
  def createElement_P_Object_FunctionComponentElement[P /* <: js.Object */](
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponent[P],
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P]]
  @scala.inline
  def createElement_P_Object_FunctionComponentElement[P /* <: js.Object */](
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponent[P],
    props: scala.Null,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P]]
  
  @scala.inline
  def createElement_P_SVGAttributesTT_SVGElement_ReactSVGElement[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.SVGAttributes[T] */, T /* <: org.scalajs.dom.raw.SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassAttributes[T] with P,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactSVGElement = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactSVGElement]
  @scala.inline
  def createElement_P_SVGAttributesTT_SVGElement_ReactSVGElement[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.SVGAttributes[T] */, T /* <: org.scalajs.dom.raw.SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactSVGElement = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactSVGElement]
  @scala.inline
  def createElement_P_SVGAttributesTT_SVGElement_ReactSVGElement[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.SVGAttributes[T] */, T /* <: org.scalajs.dom.raw.SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: scala.Null,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactSVGElement = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactSVGElement]
  
  // DOM Elements
  // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
  @scala.inline
  def createElement_input(
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.input,
    props: typingsSlinky.babelPluginReactHtmlAttrs.mod.InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement] with typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassAttributes[org.scalajs.dom.raw.HTMLInputElement],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
    org.scalajs.dom.raw.HTMLInputElement
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
    org.scalajs.dom.raw.HTMLInputElement
  ]]
  @scala.inline
  def createElement_input(
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.input,
    props: js.UndefOr[scala.Nothing],
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
    org.scalajs.dom.raw.HTMLInputElement
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
    org.scalajs.dom.raw.HTMLInputElement
  ]]
  @scala.inline
  def createElement_input(
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.input,
    props: scala.Null,
    children: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
    org.scalajs.dom.raw.HTMLInputElement
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
    org.scalajs.dom.raw.HTMLInputElement
  ]]
  
  @scala.inline
  def createFactory(`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any): typingsSlinky.babelPluginReactHtmlAttrs.mod.SVGFactory = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.SVGFactory]
  @scala.inline
  def createFactory[P](
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassType[
      P, 
      typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState], 
      typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponentClass[P]
    ]
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.CFactory[
    P, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState]
  ] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.CFactory[
    P, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState]
  ]]
  @scala.inline
  def createFactory[P](
    `type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState]
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.Factory[P] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.Factory[P]]
  // Custom components
  @scala.inline
  def createFactory[P](`type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponent[P]): typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponentFactory[P] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.FunctionComponentFactory[P]]
  @scala.inline
  def createFactory[P /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */](`type`: java.lang.String): typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMFactory[P, T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.DOMFactory[P, T]]
  @scala.inline
  def createFactory[P, T /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.Component[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState, _] */, C /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState] */](`type`: typingsSlinky.babelPluginReactHtmlAttrs.mod.ClassType[P, T, C]): typingsSlinky.babelPluginReactHtmlAttrs.mod.CFactory[P, T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.CFactory[P, T]]
  
  //
  // Top Level API
  // ----------------------------------------------------------------------
  // DOM Elements
  @scala.inline
  def createFactory_T_HTMLElement_HTMLFactory[T /* <: org.scalajs.dom.raw.HTMLElement */](`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any): typingsSlinky.babelPluginReactHtmlAttrs.mod.HTMLFactory[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.HTMLFactory[T]]
  
  @scala.inline
  def createRef[T](): typingsSlinky.babelPluginReactHtmlAttrs.mod.RefObject[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.RefObject[T]]
  
  @scala.inline
  def forwardRef[T, P](render: typingsSlinky.babelPluginReactHtmlAttrs.mod.ForwardRefRenderFunction[T, P]): typingsSlinky.babelPluginReactHtmlAttrs.mod.ForwardRefExoticComponent[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.PropsWithoutRef[P] with typingsSlinky.babelPluginReactHtmlAttrs.mod.RefAttributes[T]
  ] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.ForwardRefExoticComponent[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.PropsWithoutRef[P] with typingsSlinky.babelPluginReactHtmlAttrs.mod.RefAttributes[T]
  ]]
  
  @scala.inline
  def isValidElement[P](): /* is babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.ReactElement<P, string | babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.JSXElementConstructor<any>> */ scala.Boolean = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")().asInstanceOf[/* is babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.ReactElement<P, string | babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.JSXElementConstructor<any>> */ scala.Boolean]
  @scala.inline
  def isValidElement[P](`object`: js.Object): /* is babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.ReactElement<P, string | babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.JSXElementConstructor<any>> */ scala.Boolean = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.ReactElement<P, string | babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.JSXElementConstructor<any>> */ scala.Boolean]
  
  @scala.inline
  def `lazy`[T /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentType[_] */](factory: js.Function0[js.Promise[typingsSlinky.babelPluginReactHtmlAttrs.anon.Default[T]]]): typingsSlinky.babelPluginReactHtmlAttrs.mod.LazyExoticComponent[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(factory.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.LazyExoticComponent[T]]
  
  @scala.inline
  def memo[T /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentType[_] */](Component: T): typingsSlinky.babelPluginReactHtmlAttrs.mod.MemoExoticComponent[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.MemoExoticComponent[T]]
  @scala.inline
  def memo[T /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentType[_] */](
    Component: T,
    propsAreEqual: js.Function2[
      /* prevProps */ typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentProps[T], 
      /* nextProps */ typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentProps[T], 
      scala.Boolean
    ]
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.MemoExoticComponent[T] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.MemoExoticComponent[T]]
  @scala.inline
  def memo[P /* <: js.Object */](Component: typingsSlinky.babelPluginReactHtmlAttrs.mod.SFC[P]): typingsSlinky.babelPluginReactHtmlAttrs.mod.NamedExoticComponent[P] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.NamedExoticComponent[P]]
  @scala.inline
  def memo[P /* <: js.Object */](
    Component: typingsSlinky.babelPluginReactHtmlAttrs.mod.SFC[P],
    propsAreEqual: js.Function2[
      /* prevProps */ typingsSlinky.babelPluginReactHtmlAttrs.mod.PropsWithChildren[P], 
      /* nextProps */ typingsSlinky.babelPluginReactHtmlAttrs.mod.PropsWithChildren[P], 
      scala.Boolean
    ]
  ): typingsSlinky.babelPluginReactHtmlAttrs.mod.NamedExoticComponent[P] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.NamedExoticComponent[P]]
  
  @scala.inline
  def unstableWithSuspenseConfig(scope: js.Function0[js.UndefOr[scala.Unit]]): scala.Unit = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unstable_withSuspenseConfig")(scope.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def unstableWithSuspenseConfig(
    scope: js.Function0[js.UndefOr[scala.Unit]],
    config: typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseConfig
  ): scala.Unit = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unstable_withSuspenseConfig")(scope.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
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
  @scala.inline
  def useCallback[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T, deps: typingsSlinky.babelPluginReactHtmlAttrs.mod.DependencyList): T = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
  /**
    * Accepts a context object (the value returned from `React.createContext`) and returns the current
    * context value, as given by the nearest context provider for the given context.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usecontext
    */
  @scala.inline
  def useContext[T](context: typingsSlinky.babelPluginReactHtmlAttrs.mod.Context[T]): T = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(context.asInstanceOf[js.Any]).asInstanceOf[T]
  
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
  @scala.inline
  def useDebugValue[T](value: T): scala.Unit = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def useDebugValue[T](value: T, format: js.Function1[/* value */ T, _]): scala.Unit = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def useDeferredValue[T](value: T): T = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useDeferredValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def useDeferredValue[T](
    value: T,
    config: typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TimeoutConfig
  ): T = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useDeferredValue")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Accepts a function that contains imperative, possibly effectful code.
    *
    * @param effect Imperative function that can return a cleanup function
    * @param deps If present, effect will only activate if the values in the list change.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useeffect
    */
  @scala.inline
  def useEffect(effect: typingsSlinky.babelPluginReactHtmlAttrs.mod.EffectCallback): scala.Unit = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def useEffect(
    effect: typingsSlinky.babelPluginReactHtmlAttrs.mod.EffectCallback,
    deps: typingsSlinky.babelPluginReactHtmlAttrs.mod.DependencyList
  ): scala.Unit = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
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
  @scala.inline
  def useImperativeHandle[T, R /* <: T */](ref: js.UndefOr[typingsSlinky.babelPluginReactHtmlAttrs.mod.Ref[T]], init: js.Function0[R]): scala.Unit = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def useImperativeHandle[T, R /* <: T */](
    ref: js.UndefOr[typingsSlinky.babelPluginReactHtmlAttrs.mod.Ref[T]],
    init: js.Function0[R],
    deps: typingsSlinky.babelPluginReactHtmlAttrs.mod.DependencyList
  ): scala.Unit = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
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
  @scala.inline
  def useLayoutEffect(effect: typingsSlinky.babelPluginReactHtmlAttrs.mod.EffectCallback): scala.Unit = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def useLayoutEffect(
    effect: typingsSlinky.babelPluginReactHtmlAttrs.mod.EffectCallback,
    deps: typingsSlinky.babelPluginReactHtmlAttrs.mod.DependencyList
  ): scala.Unit = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
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
  @scala.inline
  def useMemo[T](factory: js.Function0[T]): T = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def useMemo[T](factory: js.Function0[T], deps: typingsSlinky.babelPluginReactHtmlAttrs.mod.DependencyList): T = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
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
  @scala.inline
  def useReducer[R /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.Reducer[_, _] */](
    reducer: R,
    initialState: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerState[R],
    initializer: js.UndefOr[scala.Nothing]
  ): js.Tuple2[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerState[R], 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.Dispatch[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerAction[R]]
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerState[R], 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.Dispatch[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerAction[R]]
  ]]
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
  @scala.inline
  def useReducer[R /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerWithoutAction[_] */, I](
    reducer: R,
    initializerArg: I,
    initializer: js.Function1[
      /* arg */ I, 
      typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerStateWithoutAction[R]
    ]
  ): js.Tuple2[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerStateWithoutAction[R], 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.DispatchWithoutAction
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerStateWithoutAction[R], 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.DispatchWithoutAction
  ]]
  
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
  // If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be ommitted.
  // the last overload effectively behaves as if the identity function (x => x) is the initializer.
  // overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
  @scala.inline
  def useReducer_R_ReducerWildcardWildcardI[R /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.Reducer[_, _] */, I](
    reducer: R,
    initializerArg: (I with typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerState[R]) | I,
    initializer: js.Function1[
      (/* arg */ I with typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerState[R]) | (/* arg */ I), 
      typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerState[R]
    ]
  ): js.Tuple2[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerState[R], 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.Dispatch[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerAction[R]]
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerState[R], 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.Dispatch[typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerAction[R]]
  ]]
  
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
  @scala.inline
  def useReducer_R_ReducerWithoutActionWildcard[R /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerWithoutAction[_] */](
    reducer: R,
    initializerArg: typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerStateWithoutAction[R],
    initializer: js.UndefOr[scala.Nothing]
  ): js.Tuple2[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerStateWithoutAction[R], 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.DispatchWithoutAction
  ] = (typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typingsSlinky.babelPluginReactHtmlAttrs.mod.ReducerStateWithoutAction[R], 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.DispatchWithoutAction
  ]]
  
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
  @scala.inline
  def useRef[T](): typingsSlinky.babelPluginReactHtmlAttrs.mod.RefObject[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.RefObject[T]]
  @scala.inline
  def useRef[T](initialValue: T): typingsSlinky.babelPluginReactHtmlAttrs.mod.RefObject[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.RefObject[T]]
  
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
  @scala.inline
  def useRef_T_MutableRefObject[T](): typingsSlinky.babelPluginReactHtmlAttrs.mod.MutableRefObject[js.UndefOr[T]] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.MutableRefObject[js.UndefOr[T]]]
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
  @scala.inline
  def useRef_T_MutableRefObject[T](initialValue: T): typingsSlinky.babelPluginReactHtmlAttrs.mod.MutableRefObject[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.babelPluginReactHtmlAttrs.mod.MutableRefObject[T]]
  
  // convenience overload when first argument is ommitted
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usestate
    */
  @scala.inline
  def useState[S](): js.Tuple2[
    js.UndefOr[S], 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.Dispatch[typingsSlinky.babelPluginReactHtmlAttrs.mod.SetStateAction[js.UndefOr[S]]]
  ] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useState")().asInstanceOf[js.Tuple2[
    js.UndefOr[S], 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.Dispatch[typingsSlinky.babelPluginReactHtmlAttrs.mod.SetStateAction[js.UndefOr[S]]]
  ]]
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usestate
    */
  @scala.inline
  def useState[S](initialState: S): js.Tuple2[
    S, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.Dispatch[typingsSlinky.babelPluginReactHtmlAttrs.mod.SetStateAction[S]]
  ] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    S, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.Dispatch[typingsSlinky.babelPluginReactHtmlAttrs.mod.SetStateAction[S]]
  ]]
  @scala.inline
  def useState[S](initialState: js.Function0[S]): js.Tuple2[
    S, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.Dispatch[typingsSlinky.babelPluginReactHtmlAttrs.mod.SetStateAction[S]]
  ] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    S, 
    typingsSlinky.babelPluginReactHtmlAttrs.mod.Dispatch[typingsSlinky.babelPluginReactHtmlAttrs.mod.SetStateAction[S]]
  ]]
  
  @scala.inline
  def useTransition(): js.Tuple2[
    typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TransitionStartFunction, 
    scala.Boolean
  ] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")().asInstanceOf[js.Tuple2[
    typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TransitionStartFunction, 
    scala.Boolean
  ]]
  @scala.inline
  def useTransition(
    config: typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseConfig
  ): js.Tuple2[
    typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TransitionStartFunction, 
    scala.Boolean
  ] = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(config.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    typingsSlinky.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TransitionStartFunction, 
    scala.Boolean
  ]]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
