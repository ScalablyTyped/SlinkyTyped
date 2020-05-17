package typingsSlinky.jquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQuery {
  /**
    * @deprecated ​ Deprecated since 1.8. Use \`{@link Tween.propHooks jQuery.Tween.propHooks}\`.
    *
    * `jQuery.fx.step` functions are being replaced by `jQuery.Tween.propHooks` and may eventually be removed, but are still supported via the default tween propHook.
    */
  type AnimationHook[TElement] = js.Function1[/* fx */ typingsSlinky.jquery.JQuery.Tween[TElement], scala.Unit]
  // #endregion
  // region CSS hooks
  // #region CSS hooks
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  type CSSHook[TElement] = typingsSlinky.std.Partial[typingsSlinky.jquery.JQuery._CSSHook[TElement]] with (typingsSlinky.std.Pick[
    typingsSlinky.jquery.JQuery._CSSHook[TElement], 
    typingsSlinky.jquery.jqueryStrings.get | typingsSlinky.jquery.jqueryStrings.set
  ])
  type CSSHooks = // Set to HTMLElement to minimize breaks but should probably be Element.
  org.scalablytyped.runtime.StringDictionary[typingsSlinky.jquery.JQuery.CSSHook[org.scalajs.dom.raw.HTMLElement]]
  // #endregion
  // region Callbacks
  // #region Callbacks
  type CallbacksStatic = js.Function1[
    /* flags */ js.UndefOr[java.lang.String], 
    typingsSlinky.jquery.JQuery.Callbacks[js.Function]
  ]
  // #endregion
  // region Easing
  // #region Easing
  type EasingMethod = js.Function1[/* percent */ scala.Double, scala.Double]
  type Easings = org.scalablytyped.runtime.StringDictionary[typingsSlinky.jquery.JQuery.EasingMethod]
  type EventHandler[TCurrentTarget, TData] = typingsSlinky.jquery.JQuery.EventHandlerBase[
    TCurrentTarget, 
    typingsSlinky.jquery.JQuery.TriggeredEvent[TCurrentTarget, TData, js.Any, js.Any]
  ]
  // Extra parameters can be passed from trigger()
  type EventHandlerBase[TContext, T] = js.ThisFunction2[/* this */ TContext, /* t */ T, /* repeated */ js.Any, js.Any]
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
  type Promise[TR, TJ, TN] = typingsSlinky.jquery.JQuery.PromiseBase[TR, TJ, TN, TR, TJ, TN, TR, TJ, TN, TR, TJ, TN]
  /**
    * This object provides a subset of the methods of the Deferred object (then, done, fail, always, pipe, progress, state and promise) to prevent users from changing the state of the Deferred.
    * @see \`{@link https://api.jquery.com/Types/#Promise }\`
    */
  type Promise2[TR, TJ, TN, UR, UJ, UN] = typingsSlinky.jquery.JQuery.PromiseBase[
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
  type Promise3[TR, TJ, TN, UR, UJ, UN, VR, VJ, VN] = typingsSlinky.jquery.JQuery.PromiseBase[TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, scala.Nothing, scala.Nothing, scala.Nothing]
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  type PropHooks = org.scalablytyped.runtime.StringDictionary[typingsSlinky.jquery.JQuery.PropHook[typingsSlinky.jquery.JQuery.Node]]
  type QueueFunction[TElement] = js.ThisFunction1[/* this */ TElement, /* next */ js.Function0[scala.Unit], scala.Unit]
  /**
    * A selector is used in jQuery to select DOM elements from a DOM document. That document is, in most cases, the DOM document present in all browsers, but can also be an XML document received via Ajax.
    */
  type Selector = java.lang.String
  type SpecialEventHooks = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.jquery.JQuery.SpecialEventHook[org.scalajs.dom.raw.EventTarget, js.Any]
  ]
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
    /* this */ typingsSlinky.jquery.JQuery.Animation[TElement], 
    /* propName */ java.lang.String, 
    /* finalValue */ scala.Double, 
    typingsSlinky.jquery.JQuery.Tween[TElement]
  ]
  type TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, TType /* <: /* keyof jquery.JQuery.TypeToTriggeredEventMap<TDelegateTarget, TData, TCurrentTarget, TTarget> */ typingsSlinky.jquery.jqueryStrings.change | typingsSlinky.jquery.jqueryStrings.resize | typingsSlinky.jquery.jqueryStrings.scroll | typingsSlinky.jquery.jqueryStrings.select | typingsSlinky.jquery.jqueryStrings.submit | typingsSlinky.jquery.jqueryStrings.click | typingsSlinky.jquery.jqueryStrings.contextmenu | typingsSlinky.jquery.jqueryStrings.dblclick | typingsSlinky.jquery.jqueryStrings.mousedown | typingsSlinky.jquery.jqueryStrings.mouseenter | typingsSlinky.jquery.jqueryStrings.mouseleave | typingsSlinky.jquery.jqueryStrings.mousemove | typingsSlinky.jquery.jqueryStrings.mouseout | typingsSlinky.jquery.jqueryStrings.mouseover | typingsSlinky.jquery.jqueryStrings.mouseup | typingsSlinky.jquery.jqueryStrings.drag | typingsSlinky.jquery.jqueryStrings.dragend | typingsSlinky.jquery.jqueryStrings.dragenter | typingsSlinky.jquery.jqueryStrings.dragexit | typingsSlinky.jquery.jqueryStrings.dragleave | typingsSlinky.jquery.jqueryStrings.dragover | typingsSlinky.jquery.jqueryStrings.dragstart | typingsSlinky.jquery.jqueryStrings.drop | typingsSlinky.jquery.jqueryStrings.keydown | typingsSlinky.jquery.jqueryStrings.keypress | typingsSlinky.jquery.jqueryStrings.keyup | typingsSlinky.jquery.jqueryStrings.touchcancel | typingsSlinky.jquery.jqueryStrings.touchend | typingsSlinky.jquery.jqueryStrings.touchmove | typingsSlinky.jquery.jqueryStrings.touchstart | typingsSlinky.jquery.jqueryStrings.blur | typingsSlinky.jquery.jqueryStrings.focus | typingsSlinky.jquery.jqueryStrings.focusin | typingsSlinky.jquery.jqueryStrings.focusout */] = typingsSlinky.jquery.JQuery.EventHandlerBase[
    TCurrentTarget, 
    /* import warning: importer.ImportType#apply Failed type conversion: jquery.JQuery.TypeToTriggeredEventMap<TDelegateTarget, TData, TCurrentTarget, TTarget>[TType] */ js.Any
  ]
  type ValHooks = // Set to HTMLElement to minimize breaks but should probably be Element.
  org.scalablytyped.runtime.StringDictionary[typingsSlinky.jquery.JQuery.ValHook[org.scalajs.dom.raw.HTMLElement]]
  /**
    * A string is designated htmlString in jQuery documentation when it is used to represent one or more DOM elements, typically to be created and inserted in the document. When passed as an argument of the jQuery() function, the string is identified as HTML if it starts with <tag ... >) and is parsed as such until the final > character. Prior to jQuery 1.9, a string was considered to be HTML if it contained <tag ... > anywhere within the string.
    */
  type htmlString = java.lang.String
}
