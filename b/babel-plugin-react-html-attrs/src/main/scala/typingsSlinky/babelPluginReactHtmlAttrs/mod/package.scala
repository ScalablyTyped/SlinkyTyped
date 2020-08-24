package typingsSlinky.babelPluginReactHtmlAttrs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnimationEventHandler[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.EventHandler[typingsSlinky.babelPluginReactHtmlAttrs.mod.AnimationEvent[T]]
  // tslint:disable-next-line:no-empty-interface
  type AudioHTMLAttributes[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.MediaHTMLAttributes[T]
  type Booleanish = scala.Boolean
  type CElement[P, T /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.Component[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState, _] */] = typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentElement[P, T]
  type CFactory[P, T /* <: typingsSlinky.babelPluginReactHtmlAttrs.mod.Component[P, typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentState, _] */] = typingsSlinky.babelPluginReactHtmlAttrs.mod.ComponentFactory[P, T]
  type ChangeEventHandler[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.EventHandler[typingsSlinky.babelPluginReactHtmlAttrs.mod.ChangeEvent[T]]
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
  // tslint:disable-next-line:no-empty-interface
  type FormEvent[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.SyntheticEvent[T, org.scalajs.dom.raw.Event]
  type FormEventHandler[T] = typingsSlinky.babelPluginReactHtmlAttrs.mod.EventHandler[typingsSlinky.babelPluginReactHtmlAttrs.mod.FormEvent[T]]
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
  // tslint:disable-next-line:no-empty-interface
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
  type PropsWithRef[P] = P | (typingsSlinky.babelPluginReactHtmlAttrs.mod.PropsWithoutRef[P] with typingsSlinky.babelPluginReactHtmlAttrs.anon.`0`)
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
  // tslint:disable-next-line:no-empty-interface
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
}
