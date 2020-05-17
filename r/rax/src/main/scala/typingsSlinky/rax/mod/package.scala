package typingsSlinky.rax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnimationEventHandler[T] = typingsSlinky.rax.mod.EventHandler[typingsSlinky.rax.mod.AnimationEvent[T]]
  type AppearEventHandler[T] = typingsSlinky.rax.mod.EventHandler[typingsSlinky.rax.mod.AppearEvent[T]]
  // tslint:disable-next-line:no-empty-interface
  type AudioHTMLAttributes[T] = typingsSlinky.rax.mod.MediaHTMLAttributes[T]
  type CElement[P, T /* <: typingsSlinky.rax.mod.Component[P, typingsSlinky.rax.mod.ComponentState, _] */] = typingsSlinky.rax.mod.ComponentElement[P, T]
  type CFactory[P, T /* <: typingsSlinky.rax.mod.Component[P, typingsSlinky.rax.mod.ComponentState, _] */] = typingsSlinky.rax.mod.ComponentFactory[P, T]
  type ChangeEventHandler[T] = typingsSlinky.rax.mod.EventHandler[typingsSlinky.rax.mod.ChangeEvent[T]]
  /**
    * We use an intersection type to infer multiple type parameters from
    * a single argument, which is useful for many top-level API defs.
    * See https://github.com/Microsoft/TypeScript/issues/7234 for more info.
    */
  type ClassType[P, T /* <: typingsSlinky.rax.mod.Component[P, typingsSlinky.rax.mod.ComponentState, _] */, C /* <: typingsSlinky.rax.mod.ComponentClass[P, typingsSlinky.rax.mod.ComponentState] */] = C with (org.scalablytyped.runtime.Instantiable2[/* props */ P, js.UndefOr[/* context */ js.Any], T])
  type ClassicElement[P] = typingsSlinky.rax.mod.CElement[P, typingsSlinky.rax.mod.ClassicComponent[P, typingsSlinky.rax.mod.ComponentState]]
  type ClassicFactory[P] = typingsSlinky.rax.mod.CFactory[P, typingsSlinky.rax.mod.ClassicComponent[P, typingsSlinky.rax.mod.ComponentState]]
  type ClipboardEventHandler[T] = typingsSlinky.rax.mod.EventHandler[typingsSlinky.rax.mod.ClipboardEvent[T]]
  type ComponentFactory[P, T /* <: typingsSlinky.rax.mod.Component[P, typingsSlinky.rax.mod.ComponentState, _] */] = js.Function2[
    /* props */ js.UndefOr[typingsSlinky.rax.mod.ClassAttributes[T] with P], 
    /* repeated */ typingsSlinky.rax.mod.RaxNode, 
    typingsSlinky.rax.mod.CElement[P, T]
  ]
  type ComponentPropsWithoutRef[T /* <: typingsSlinky.rax.mod.ElementType[_] */] = typingsSlinky.rax.mod.PropsWithoutRef[typingsSlinky.rax.mod.ComponentProps[T]]
  type ComponentState = js.Any
  type CompositionEventHandler[T] = typingsSlinky.rax.mod.EventHandler[typingsSlinky.rax.mod.CompositionEvent[T]]
  type Consumer[T] = typingsSlinky.rax.mod.ExoticComponent[typingsSlinky.rax.mod.ConsumerProps[T]]
  type ContextType[C /* <: typingsSlinky.rax.mod.Context[_] */] = js.Any
  type DOMFactory[P /* <: typingsSlinky.rax.mod.DOMAttributes[T] */, T /* <: typingsSlinky.rax.mod.Element */] = js.Function2[
    /* props */ js.UndefOr[(typingsSlinky.rax.mod.ClassAttributes[T] with P) | scala.Null], 
    /* repeated */ typingsSlinky.rax.mod.RaxNode, 
    typingsSlinky.rax.mod.DOMElement[P, T]
  ]
  // The identity check is done with the SameValue algorithm (Object.is), which is stricter than ===
  // TODO (TypeScript 3.0): ReadonlyArray<unknown>
  type DependencyList = js.Array[js.Any]
  type DetailedHTMLProps[E /* <: typingsSlinky.rax.mod.HTMLAttributes[T] */, T] = typingsSlinky.rax.mod.ClassAttributes[T] with E
  // this technically does accept a second argument, but it's already under a deprecation warning
  // and it's not even released so probably better to not define it.
  type Dispatch[A] = js.Function1[/* value */ A, scala.Unit]
  type DragEventHandler[T] = typingsSlinky.rax.mod.EventHandler[typingsSlinky.rax.mod.DragEvent[T]]
  // NOTE: callbacks are _only_ allowed to return either void, or a destructor.
  // The destructor is itself only allowed to return void.
  type EffectCallback = js.Function0[scala.Unit | js.Function0[js.UndefOr[scala.Unit]]]
  //
  // Event Handler Types
  // ----------------------------------------------------------------------
  type EventHandler[E /* <: typingsSlinky.rax.mod.SyntheticEvent[_, org.scalajs.dom.raw.Event] */] = js.Function1[/* event */ E, scala.Unit]
  type ExactlyAnyPropertyKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: rax.rax.IsExactlyAny<T[K]> extends true? K : never}[keyof T] */ js.Any
  type FC[P] = typingsSlinky.rax.mod.FunctionComponent[P]
  /**
    * ======================================================================
    * Rax Factories
    * ======================================================================
    */
  type Factory[P] = js.Function2[
    /* props */ js.UndefOr[typingsSlinky.rax.mod.Attributes with P], 
    /* repeated */ typingsSlinky.rax.mod.RaxNode, 
    typingsSlinky.rax.mod.RaxElement[P, java.lang.String | typingsSlinky.rax.mod.JSXElementConstructor[js.Any]]
  ]
  type FocusEventHandler[T] = typingsSlinky.rax.mod.EventHandler[typingsSlinky.rax.mod.FocusEvent[T]]
  // tslint:disable-next-line:no-empty-interface
  type FormEvent[T] = typingsSlinky.rax.mod.SyntheticEvent[T, org.scalajs.dom.raw.Event]
  type FormEventHandler[T] = typingsSlinky.rax.mod.EventHandler[typingsSlinky.rax.mod.FormEvent[T]]
  type FunctionComponentFactory[P] = js.Function2[
    /* props */ js.UndefOr[typingsSlinky.rax.mod.Attributes with P], 
    /* repeated */ typingsSlinky.rax.mod.RaxNode, 
    typingsSlinky.rax.mod.FunctionComponentElement[P]
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
  type HTMLAnchorElement = org.scalajs.dom.raw.HTMLElement
  type HTMLAreaElement = org.scalajs.dom.raw.HTMLElement
  type HTMLAudioElement = org.scalajs.dom.raw.HTMLElement
  type HTMLBRElement = org.scalajs.dom.raw.HTMLElement
  type HTMLBaseElement = org.scalajs.dom.raw.HTMLElement
  type HTMLBodyElement = org.scalajs.dom.raw.HTMLElement
  type HTMLButtonElement = org.scalajs.dom.raw.HTMLElement
  type HTMLCanvasElement = org.scalajs.dom.raw.HTMLElement
  type HTMLDListElement = org.scalajs.dom.raw.HTMLElement
  type HTMLDataListElement = org.scalajs.dom.raw.HTMLElement
  type HTMLDialogElement = org.scalajs.dom.raw.HTMLElement
  type HTMLDivElement = org.scalajs.dom.raw.HTMLElement
  type HTMLElement = org.scalajs.dom.raw.Element
  type HTMLEmbedElement = org.scalajs.dom.raw.HTMLElement
  // tslint:disable-next-line:no-empty-interface
  type HTMLFactory[T /* <: org.scalajs.dom.raw.Element */] = typingsSlinky.rax.mod.DetailedHTMLFactory[typingsSlinky.rax.mod.AllHTMLAttributes[T], T]
  type HTMLFieldSetElement = org.scalajs.dom.raw.HTMLElement
  type HTMLFormElement = org.scalajs.dom.raw.HTMLElement
  type HTMLHRElement = org.scalajs.dom.raw.HTMLElement
  type HTMLHeadElement = org.scalajs.dom.raw.HTMLElement
  type HTMLHeadingElement = org.scalajs.dom.raw.HTMLElement
  type HTMLHtmlElement = org.scalajs.dom.raw.HTMLElement
  type HTMLIFrameElement = org.scalajs.dom.raw.HTMLElement
  type HTMLImageElement = org.scalajs.dom.raw.HTMLElement
  type HTMLInputElement = org.scalajs.dom.raw.HTMLElement
  type HTMLLIElement = org.scalajs.dom.raw.HTMLElement
  type HTMLLabelElement = org.scalajs.dom.raw.HTMLElement
  type HTMLLegendElement = org.scalajs.dom.raw.HTMLElement
  type HTMLLinkElement = org.scalajs.dom.raw.HTMLElement
  type HTMLMapElement = org.scalajs.dom.raw.HTMLElement
  type HTMLMetaElement = org.scalajs.dom.raw.HTMLElement
  type HTMLModElement = org.scalajs.dom.raw.HTMLElement
  type HTMLOListElement = org.scalajs.dom.raw.HTMLElement
  type HTMLObjectElement = org.scalajs.dom.raw.HTMLElement
  type HTMLOptGroupElement = org.scalajs.dom.raw.HTMLElement
  type HTMLOptionElement = org.scalajs.dom.raw.HTMLElement
  type HTMLParagraphElement = org.scalajs.dom.raw.HTMLElement
  type HTMLParamElement = org.scalajs.dom.raw.HTMLElement
  type HTMLPreElement = org.scalajs.dom.raw.HTMLElement
  type HTMLProgressElement = org.scalajs.dom.raw.HTMLElement
  type HTMLQuoteElement = org.scalajs.dom.raw.HTMLElement
  type HTMLScriptElement = org.scalajs.dom.raw.HTMLElement
  type HTMLSelectElement = org.scalajs.dom.raw.HTMLElement
  type HTMLSourceElement = org.scalajs.dom.raw.HTMLElement
  type HTMLSpanElement = org.scalajs.dom.raw.HTMLElement
  type HTMLStyleElement = org.scalajs.dom.raw.HTMLElement
  type HTMLTableColElement = org.scalajs.dom.raw.HTMLElement
  type HTMLTableDataCellElement = org.scalajs.dom.raw.HTMLElement
  type HTMLTableElement = org.scalajs.dom.raw.HTMLElement
  type HTMLTableHeaderCellElement = org.scalajs.dom.raw.HTMLElement
  type HTMLTableRowElement = org.scalajs.dom.raw.HTMLElement
  type HTMLTableSectionElement = org.scalajs.dom.raw.HTMLElement
  type HTMLTextAreaElement = org.scalajs.dom.raw.HTMLElement
  type HTMLTitleElement = org.scalajs.dom.raw.HTMLElement
  type HTMLTrackElement = org.scalajs.dom.raw.HTMLElement
  type HTMLUListElement = org.scalajs.dom.raw.HTMLElement
  type HTMLVideoElement = org.scalajs.dom.raw.HTMLElement
  type HTMLWebViewElement = org.scalajs.dom.raw.HTMLElement
  type KeyboardEventHandler[T] = typingsSlinky.rax.mod.EventHandler[typingsSlinky.rax.mod.KeyboardEvent[T]]
  type MouseEventHandler[T] = typingsSlinky.rax.mod.EventHandler[typingsSlinky.rax.mod.MouseEvent[T, org.scalajs.dom.raw.MouseEvent]]
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
  type NotExactlyAnyPropertyKeys[T] = typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, typingsSlinky.rax.mod.ExactlyAnyPropertyKeys[T]]
  type PointerEventHandler[T] = typingsSlinky.rax.mod.EventHandler[typingsSlinky.rax.mod.PointerEvent[T]]
  type PropsWithChildren[P] = P with typingsSlinky.rax.anon.Children
  type Provider[T] = typingsSlinky.rax.mod.ProviderExoticComponent[typingsSlinky.rax.mod.ProviderProps[T]]
  type RaxComponentElement[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 209 */ js.Any */, P] = typingsSlinky.rax.mod.RaxElement[P, T]
  type RaxEventHandler[T] = typingsSlinky.rax.mod.EventHandler[typingsSlinky.rax.mod.SyntheticEvent[T, org.scalajs.dom.raw.Event]]
  // RaxHTML for RaxHTMLElement
  type RaxHTMLElement[T /* <: org.scalajs.dom.raw.Element */] = typingsSlinky.rax.mod.DetailedRaxHTMLElement[typingsSlinky.rax.mod.AllHTMLAttributes[T], T]
  // Unlike redux, the actions _can_ be anything
  type Reducer[S, A] = js.Function2[/* prevState */ S, /* action */ A, S]
  type ReducerAction[R /* <: typingsSlinky.rax.mod.Reducer[_, _] */] = js.Any
  // types used to try and prevent the compiler from reducing S
  // to a supertype common with the second argument to useReducer()
  type ReducerState[R /* <: typingsSlinky.rax.mod.Reducer[_, _] */] = js.Any
  type Requireable[T] = typingsSlinky.propTypes.mod.Requireable[T]
  type SVGCircleElement = org.scalajs.dom.raw.SVGElement
  type SVGClipPathElement = org.scalajs.dom.raw.SVGElement
  type SVGDefsElement = org.scalajs.dom.raw.SVGElement
  type SVGDescElement = org.scalajs.dom.raw.SVGElement
  type SVGElement = org.scalajs.dom.raw.Element
  type SVGEllipseElement = org.scalajs.dom.raw.SVGElement
  type SVGFEBlendElement = org.scalajs.dom.raw.SVGElement
  type SVGFEColorMatrixElement = org.scalajs.dom.raw.SVGElement
  type SVGFEComponentTransferElement = org.scalajs.dom.raw.SVGElement
  type SVGFECompositeElement = org.scalajs.dom.raw.SVGElement
  type SVGFEConvolveMatrixElement = org.scalajs.dom.raw.SVGElement
  type SVGFEDiffuseLightingElement = org.scalajs.dom.raw.SVGElement
  type SVGFEDisplacementMapElement = org.scalajs.dom.raw.SVGElement
  type SVGFEDistantLightElement = org.scalajs.dom.raw.SVGElement
  type SVGFEDropShadowElement = org.scalajs.dom.raw.SVGElement
  type SVGFEFloodElement = org.scalajs.dom.raw.SVGElement
  type SVGFEFuncAElement = org.scalajs.dom.raw.SVGElement
  type SVGFEFuncBElement = org.scalajs.dom.raw.SVGElement
  type SVGFEFuncGElement = org.scalajs.dom.raw.SVGElement
  type SVGFEFuncRElement = org.scalajs.dom.raw.SVGElement
  type SVGFEGaussianBlurElement = org.scalajs.dom.raw.SVGElement
  type SVGFEImageElement = org.scalajs.dom.raw.SVGElement
  type SVGFEMergeElement = org.scalajs.dom.raw.SVGElement
  type SVGFEMergeNodeElement = org.scalajs.dom.raw.SVGElement
  type SVGFEMorphologyElement = org.scalajs.dom.raw.SVGElement
  type SVGFEOffsetElement = org.scalajs.dom.raw.SVGElement
  type SVGFEPointLightElement = org.scalajs.dom.raw.SVGElement
  type SVGFESpecularLightingElement = org.scalajs.dom.raw.SVGElement
  type SVGFESpotLightElement = org.scalajs.dom.raw.SVGElement
  type SVGFETileElement = org.scalajs.dom.raw.SVGElement
  type SVGFETurbulenceElement = org.scalajs.dom.raw.SVGElement
  type SVGFilterElement = org.scalajs.dom.raw.SVGElement
  type SVGForeignObjectElement = org.scalajs.dom.raw.SVGElement
  type SVGGElement = org.scalajs.dom.raw.SVGElement
  type SVGImageElement = org.scalajs.dom.raw.SVGElement
  type SVGLineElement = org.scalajs.dom.raw.SVGElement
  type SVGLinearGradientElement = org.scalajs.dom.raw.SVGElement
  type SVGMarkerElement = org.scalajs.dom.raw.SVGElement
  type SVGMaskElement = org.scalajs.dom.raw.SVGElement
  type SVGMetadataElement = org.scalajs.dom.raw.SVGElement
  type SVGPathElement = org.scalajs.dom.raw.SVGElement
  type SVGPatternElement = org.scalajs.dom.raw.SVGElement
  type SVGPolygonElement = org.scalajs.dom.raw.SVGElement
  type SVGPolylineElement = org.scalajs.dom.raw.SVGElement
  type SVGRadialGradientElement = org.scalajs.dom.raw.SVGElement
  type SVGRectElement = org.scalajs.dom.raw.SVGElement
  type SVGSVGElement = org.scalajs.dom.raw.SVGElement
  type SVGStopElement = org.scalajs.dom.raw.SVGElement
  type SVGSwitchElement = org.scalajs.dom.raw.SVGElement
  type SVGSymbolElement = org.scalajs.dom.raw.SVGElement
  type SVGTSpanElement = org.scalajs.dom.raw.SVGElement
  type SVGTextElement = org.scalajs.dom.raw.SVGElement
  type SVGTextPathElement = org.scalajs.dom.raw.SVGElement
  type SVGUseElement = org.scalajs.dom.raw.SVGElement
  type SVGViewElement = org.scalajs.dom.raw.SVGElement
  /**
    * currentTarget - a reference to the element on which the event listener is registered.
    *
    * target - a reference to the element from which the event was originally dispatched.
    * This might be a child element to the element on which the event listener is registered.
    * If you thought this should be `EventTarget & T`, see https://github.com/DefinitelyTyped/DefinitelyTyped/pull/12239
    */
  type SyntheticEvent[T, E] = typingsSlinky.rax.mod.BaseSyntheticEvent[E, typingsSlinky.rax.mod.EventTarget with T, typingsSlinky.rax.mod.EventTarget]
  type TouchEventHandler[T] = typingsSlinky.rax.mod.EventHandler[typingsSlinky.rax.mod.TouchEvent[T]]
  type TransitionEventHandler[T] = typingsSlinky.rax.mod.EventHandler[typingsSlinky.rax.mod.TransitionEvent[T]]
  type UIEventHandler[T] = typingsSlinky.rax.mod.EventHandler[typingsSlinky.rax.mod.UIEvent[T]]
  type ValidationMap[T] = typingsSlinky.propTypes.mod.ValidationMap[T]
  //
  // Rax.PropTypes
  // ----------------------------------------------------------------------
  type Validator[T] = typingsSlinky.propTypes.mod.Validator[T]
  type WeakValidationMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? null extends T[K]? rax.rax.Validator<T[K] | null | undefined> : undefined extends T[K]? rax.rax.Validator<T[K] | null | undefined> : rax.rax.Validator<T[K]>}
    */ typingsSlinky.rax.raxStrings.WeakValidationMap with org.scalablytyped.runtime.TopLevel[js.Any]
  type WheelEventHandler[T] = typingsSlinky.rax.mod.EventHandler[typingsSlinky.rax.mod.WheelEvent[T]]
}
