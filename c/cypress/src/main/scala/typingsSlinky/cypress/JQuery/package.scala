package typingsSlinky.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQuery {
  /**
    * @deprecated ​ Deprecated since 1.8. Use \`{@link Tween.propHooks jQuery.Tween.propHooks}\`.
    *
    * `jQuery.fx.step` functions are being replaced by `jQuery.Tween.propHooks` and may eventually be removed, but are still supported via the default tween propHook.
    */
  type AnimationHook[TElement] = js.Function1[/* fx */ typingsSlinky.cypress.JQuery.Tween[TElement], scala.Unit]
  // #endregion
  // region CSS hooks
  // #region CSS hooks
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  type CSSHook[TElement] = typingsSlinky.std.Partial[typingsSlinky.cypress.JQuery._CSSHook[TElement]] with (typingsSlinky.std.Pick[
    typingsSlinky.cypress.JQuery._CSSHook[TElement], 
    typingsSlinky.cypress.cypressStrings.get_ | typingsSlinky.cypress.cypressStrings.set
  ])
  type CSSHooks = // Set to HTMLElement to minimize breaks but should probably be Element.
  org.scalablytyped.runtime.StringDictionary[typingsSlinky.cypress.JQuery.CSSHook[org.scalajs.dom.raw.HTMLElement]]
  // #endregion
  // region Callbacks
  // #region Callbacks
  type CallbacksStatic = js.Function1[
    /* flags */ js.UndefOr[java.lang.String], 
    typingsSlinky.cypress.JQuery.Callbacks[js.Function]
  ]
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.cypress.anon.PickCoordinatesleft
    - typingsSlinky.cypress.anon.PickCoordinatestop
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type CoordinatesPartial = typingsSlinky.cypress.JQuery._CoordinatesPartial | org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  // #endregion
  // region Effects
  // #region Effects
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsSlinky.cypress.cypressStrings.fast
    - typingsSlinky.cypress.cypressStrings.slow
  */
  type Duration = typingsSlinky.cypress.JQuery._Duration | scala.Double
  // #endregion
  // region Easing
  // #region Easing
  type EasingMethod = js.Function1[/* percent */ scala.Double, scala.Double]
  type Easings = org.scalablytyped.runtime.StringDictionary[typingsSlinky.cypress.JQuery.EasingMethod]
  type EventHandler[TCurrentTarget, TData] = typingsSlinky.cypress.JQuery.EventHandlerBase[
    TCurrentTarget, 
    typingsSlinky.cypress.JQuery.TriggeredEvent[TCurrentTarget, TData, js.Any, js.Any]
  ]
  // Extra parameters can be passed from trigger()
  type EventHandlerBase[TContext, T] = js.ThisFunction2[/* this */ TContext, /* t */ T, /* repeated */ js.Any, js.Any]
  // #endregion
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.cypress.cypressBooleans.`false`
    - scala.Null
    - js.UndefOr[scala.Nothing]
    - typingsSlinky.cypress.cypressNumbers.`0`
    - typingsSlinky.cypress.cypressStrings._empty
    - typingsSlinky.std.HTMLAllCollection
  */
  type Falsy = js.UndefOr[
    typingsSlinky.cypress.JQuery._Falsy | scala.Null | typingsSlinky.std.HTMLAllCollection
  ]
  type Node = org.scalajs.dom.raw.Element | org.scalajs.dom.raw.Text | org.scalajs.dom.raw.Comment | org.scalajs.dom.raw.DocumentFragment
  /**
    * The PlainObject type is a JavaScript object containing zero or more key-value pairs. The plain object is, in other words, an Object object. It is designated "plain" in jQuery documentation to distinguish it from other kinds of JavaScript objects: for example, null, user-defined arrays, and host objects such as document, all of which have a typeof value of "object."
    *
    * **Note**: The type declaration of PlainObject is imprecise. It includes host objects and user-defined arrays which do not match jQuery's definition.
    */
  type PlainObject[T] = org.scalablytyped.runtime.StringDictionary[T]
  /**
    * This object provides a subset of the methods of the Deferred object (then, done, fail, always, pipe, progress, state and promise) to prevent users from changing the state of the Deferred.
    * @see \`{@link https://api.jquery.com/Types/#Promise }\`
    */
  type Promise[TR, TJ, TN] = typingsSlinky.cypress.JQuery.PromiseBase[TR, TJ, TN, TR, TJ, TN, TR, TJ, TN, TR, TJ, TN]
  /**
    * This object provides a subset of the methods of the Deferred object (then, done, fail, always, pipe, progress, state and promise) to prevent users from changing the state of the Deferred.
    * @see \`{@link https://api.jquery.com/Types/#Promise }\`
    */
  type Promise2[TR, TJ, TN, UR, UJ, UN] = typingsSlinky.cypress.JQuery.PromiseBase[
    TR, 
    TJ, 
    TN, 
    UR, 
    UJ, 
    UN, 
    scala.Nothing, 
    scala.Nothing, 
    scala.Nothing, 
    scala.Nothing, 
    scala.Nothing, 
    scala.Nothing
  ]
  /**
    * This object provides a subset of the methods of the Deferred object (then, done, fail, always, pipe, progress, state and promise) to prevent users from changing the state of the Deferred.
    * @see \`{@link https://api.jquery.com/Types/#Promise }\`
    */
  type Promise3[TR, TJ, TN, UR, UJ, UN, VR, VJ, VN] = typingsSlinky.cypress.JQuery.PromiseBase[TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, scala.Nothing, scala.Nothing, scala.Nothing]
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.cypress.anon.Get[TElement]
    - typingsSlinky.cypress.anon.Set[TElement]
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type PropHook[TElement] = typingsSlinky.cypress.JQuery._PropHook[TElement] | org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  type PropHooks = org.scalablytyped.runtime.StringDictionary[typingsSlinky.cypress.JQuery.PropHook[typingsSlinky.cypress.JQuery.Node]]
  type QueueFunction[TElement] = js.ThisFunction1[/* this */ TElement, /* next */ js.Function0[scala.Unit], scala.Unit]
  /**
    * A selector is used in jQuery to select DOM elements from a DOM document. That document is, in most cases, the DOM document present in all browsers, but can also be an XML document received via Ajax.
    */
  type Selector = java.lang.String
  // region Special event hooks
  // #region Special event hooks
  /**
    * The jQuery special event hooks are a set of per-event-name functions and properties that allow code to control the behavior of event processing within jQuery. The mechanism is similar to `fixHooks` in that the special event information is stored in `jQuery.event.special.NAME`, where `NAME` is the name of the special event. Event names are case sensitive.
    *
    * As with `fixHooks`, the special event hooks design assumes it will be very rare that two unrelated pieces of code want to process the same event name. Special event authors who need to modify events with existing hooks will need to take precautions to avoid introducing unwanted side-effects by clobbering those hooks.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#special-event-hooks }\`
    */
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.cypress.anon.NoBubble
    - typingsSlinky.cypress.anon.BindType
    - typingsSlinky.cypress.anon.DelegateType
    - typingsSlinky.cypress.anon.Setup[TTarget, TData]
    - typingsSlinky.cypress.anon.Teardown[TTarget]
    - typingsSlinky.cypress.anon.`2`[TTarget, TData]
    - typingsSlinky.cypress.anon.Remove[TTarget, TData]
    - typingsSlinky.cypress.anon.Trigger[TTarget, TData]
    - typingsSlinky.cypress.anon.Default[TTarget, TData]
    - typingsSlinky.cypress.anon.Handle[TTarget, TData]
    - typingsSlinky.cypress.anon.PreDispatch[TTarget]
    - typingsSlinky.cypress.anon.PostDispatch[TTarget]
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type SpecialEventHook[TTarget, TData] = (typingsSlinky.cypress.JQuery._SpecialEventHook[TTarget, TData]) | org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  type SpecialEventHooks = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.cypress.JQuery.SpecialEventHook[org.scalajs.dom.raw.EventTarget, js.Any]
  ]
  // #endregion
  // region Speed
  // #region Speed
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.cypress.anon.Duration
    - typingsSlinky.cypress.anon.Easing
    - typingsSlinky.cypress.anon.Complete[TElement]
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type SpeedSettings[TElement] = typingsSlinky.cypress.JQuery._SpeedSettings[TElement] | org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  // #endregion
  // region Deferred
  // #region Deferred
  /**
    * Any object that has a then method.
    */
  type Thenable[T] = js.Thenable[T]
  /**
    * A "Tweener" is a function responsible for creating a tween object, and you might want to override these if you want to implement complex values ( like a clip/transform array matrix ) in a single property.
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweeners }\`
    * @since 1.8
    */
  type Tweener[TElement] = js.ThisFunction2[
    /* this */ typingsSlinky.cypress.JQuery.Animation[TElement], 
    /* propName */ java.lang.String, 
    /* finalValue */ scala.Double, 
    typingsSlinky.cypress.JQuery.Tween[TElement]
  ]
  type TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, TType /* <: /* keyof cypress.JQuery.TypeToTriggeredEventMap<TDelegateTarget, TData, TCurrentTarget, TTarget> */ typingsSlinky.cypress.cypressStrings.change | typingsSlinky.cypress.cypressStrings.resize | typingsSlinky.cypress.cypressStrings.scroll | typingsSlinky.cypress.cypressStrings.select | typingsSlinky.cypress.cypressStrings.submit | typingsSlinky.cypress.cypressStrings.click | typingsSlinky.cypress.cypressStrings.contextmenu | typingsSlinky.cypress.cypressStrings.dblclick | typingsSlinky.cypress.cypressStrings.mousedown | typingsSlinky.cypress.cypressStrings.mouseenter | typingsSlinky.cypress.cypressStrings.mouseleave | typingsSlinky.cypress.cypressStrings.mousemove | typingsSlinky.cypress.cypressStrings.mouseout | typingsSlinky.cypress.cypressStrings.mouseover | typingsSlinky.cypress.cypressStrings.mouseup | typingsSlinky.cypress.cypressStrings.drag | typingsSlinky.cypress.cypressStrings.dragend | typingsSlinky.cypress.cypressStrings.dragenter | typingsSlinky.cypress.cypressStrings.dragexit | typingsSlinky.cypress.cypressStrings.dragleave | typingsSlinky.cypress.cypressStrings.dragover | typingsSlinky.cypress.cypressStrings.dragstart | typingsSlinky.cypress.cypressStrings.drop | typingsSlinky.cypress.cypressStrings.keydown | typingsSlinky.cypress.cypressStrings.keypress | typingsSlinky.cypress.cypressStrings.keyup | typingsSlinky.cypress.cypressStrings.touchcancel | typingsSlinky.cypress.cypressStrings.touchend | typingsSlinky.cypress.cypressStrings.touchmove | typingsSlinky.cypress.cypressStrings.touchstart | typingsSlinky.cypress.cypressStrings.blur | typingsSlinky.cypress.cypressStrings.focus | typingsSlinky.cypress.cypressStrings.focusin | typingsSlinky.cypress.cypressStrings.focusout */] = typingsSlinky.cypress.JQuery.EventHandlerBase[
    TCurrentTarget, 
    /* import warning: importer.ImportType#apply Failed type conversion: cypress.JQuery.TypeToTriggeredEventMap<TDelegateTarget, TData, TCurrentTarget, TTarget>[TType] */ js.Any
  ]
  type TypeOrArray[T] = T | js.Array[T]
  // #endregion
  // region Val hooks
  // #region Val hooks
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.cypress.anon.`3`[TElement]
    - typingsSlinky.cypress.anon.`4`[TElement]
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type ValHook[TElement] = typingsSlinky.cypress.JQuery._ValHook[TElement] | org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  type ValHooks = // Set to HTMLElement to minimize breaks but should probably be Element.
  org.scalablytyped.runtime.StringDictionary[typingsSlinky.cypress.JQuery.ValHook[org.scalajs.dom.raw.HTMLElement]]
  /**
    * A string is designated htmlString in jQuery documentation when it is used to represent one or more DOM elements, typically to be created and inserted in the document. When passed as an argument of the jQuery() function, the string is identified as HTML if it starts with <tag ... >) and is parsed as such until the final > character. Prior to jQuery 1.9, a string was considered to be HTML if it contained <tag ... > anywhere within the string.
    */
  type htmlString = java.lang.String
}
