package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cypress {
  import org.scalajs.dom.raw.DragEvent
  import org.scalajs.dom.raw.Element
  import org.scalajs.dom.raw.Event
  import org.scalajs.dom.raw.FocusEvent
  import org.scalajs.dom.raw.KeyboardEvent
  import org.scalajs.dom.raw.MouseEvent
  import org.scalajs.dom.raw.TouchEvent
  import org.scalajs.dom.raw.UIEvent
  import typingsSlinky.cypress.JQuery.AjaxSettings
  import typingsSlinky.cypress.JQuery.Callbacks
  import typingsSlinky.cypress.JQuery.Coordinates
  import typingsSlinky.cypress.JQuery.Deferred
  import typingsSlinky.cypress.JQuery.EffectsOptions
  import typingsSlinky.cypress.JQuery.EventStatic
  import typingsSlinky.cypress.JQuery.NameValuePair
  import typingsSlinky.cypress.JQuery.PlainObject
  import typingsSlinky.cypress.JQuery.Promise
  import typingsSlinky.cypress.JQuery.Thenable
  import typingsSlinky.cypress.JQuery.TypeOrArray
  import typingsSlinky.cypress.JQuery.jqXHR
  import typingsSlinky.cypress.Mocha.Done
  import typingsSlinky.std.Partial

  // tslint:disable-next-line:strict-export-declare-modifiers
  type GlobalPartial[T] = Partial[T]
  type JQuery[TElement] = JQuery_[TElement]
  // tslint:disable-next-line:no-empty-interface
  type JQueryAjaxSettings = AjaxSettings[js.Any]
  type JQueryAnimationOptions = EffectsOptions[Element]
  type JQueryCallback = Callbacks[js.Function]
  // tslint:disable-next-line:no-empty-interface
  type JQueryCoordinates = Coordinates
  type JQueryDeferred[T] = Deferred[T, js.Any, js.Any]
  /**
    * @deprecated ​ Deprecated. Internal. See \`{@link https://github.com/jquery/api.jquery.com/issues/912 }\`.
    */
  type JQueryEasingFunction = js.Function1[/* percent */ Double, Double]
  // tslint:disable-next-line:no-empty-interface
  type JQueryEventConstructor = EventStatic
  type JQueryGenericPromise[T] = Thenable[T]
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQueryStatic.param JQueryStatic&#91;'param'&#93;}\`.
    */
  type JQueryParam = js.Function2[/* obj */ js.Any, /* traditional */ js.UndefOr[Boolean], String]
  type JQueryPromise[T] = Promise[T, js.Any, js.Any]
  // Legacy types that are not represented in the current type definitions are marked deprecated.
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQuery.Deferred.Callback }\` or \`{@link JQuery.Deferred.CallbackBase }\`.
    */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, Unit]
  /**
    * @deprecated ​ Deprecated.
    */
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ TypeOrArray[JQueryPromiseCallback[T]], 
    /* repeated */ TypeOrArray[JQueryPromiseCallback[js.Any]], 
    JQueryPromise[U]
  ]
  // tslint:disable-next-line:no-empty-interface
  type JQuerySerializeArrayElement = NameValuePair
  /**
    * @deprecated ​ Deprecated since 1.9. See \`{@link https://api.jquery.com/jQuery.support/ }\`.
    */
  // tslint:disable-next-line:no-empty-interface
  type JQuerySupport = PlainObject[js.Any]
  // tslint:disable-next-line:no-empty-interface
  type JQueryXHR = jqXHR[js.Any]
  type Mocha = Mocha_
  // #endregion Browser augmentations
  // #region Deprecations
  /** @deprecated use `Mocha.Done` instead. */
  type MochaDone = Done
  /** @deprecated use `Mocha.ReporterConstructor` instead. */
  type ReporterConstructor = typingsSlinky.cypress.Mocha.ReporterConstructor
  type _DragEvent = DragEvent
  type _Event = Event
  type _FocusEvent = FocusEvent
  type _KeyboardEvent = KeyboardEvent
  type _MouseEvent = MouseEvent
  type _TouchEvent = TouchEvent
  type _UIEvent = UIEvent
}
