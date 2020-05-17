package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cypress {
  type DragEvent = org.scalajs.dom.raw.DragEvent
  type Event = org.scalajs.dom.raw.Event
  type FocusEvent = org.scalajs.dom.raw.FocusEvent
  // tslint:disable-next-line:strict-export-declare-modifiers
  type GlobalPartial[T] = typingsSlinky.std.Partial[T]
  type JQuery[TElement] = typingsSlinky.cypress.JQuery_[TElement]
  // tslint:disable-next-line:no-empty-interface
  type JQueryAjaxSettings = typingsSlinky.cypress.JQuery.AjaxSettings[js.Any]
  type JQueryAnimationOptions = typingsSlinky.cypress.JQuery.EffectsOptions[org.scalajs.dom.raw.Element]
  type JQueryCallback = typingsSlinky.cypress.JQuery.Callbacks[js.Function]
  // tslint:disable-next-line:no-empty-interface
  type JQueryCoordinates = typingsSlinky.cypress.JQuery.Coordinates
  type JQueryDeferred[T] = typingsSlinky.cypress.JQuery.Deferred[T, js.Any, js.Any]
  /**
    * @deprecated ​ Deprecated. Internal. See \`{@link https://github.com/jquery/api.jquery.com/issues/912 }\`.
    */
  type JQueryEasingFunction = js.Function1[/* percent */ scala.Double, scala.Double]
  // tslint:disable-next-line:no-empty-interface
  type JQueryEventConstructor = typingsSlinky.cypress.JQuery.EventStatic
  type JQueryGenericPromise[T] = typingsSlinky.cypress.JQuery.Thenable[T]
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQueryStatic.param JQueryStatic&#91;'param'&#93;}\`.
    */
  type JQueryParam = js.Function2[/* obj */ js.Any, /* traditional */ js.UndefOr[scala.Boolean], java.lang.String]
  type JQueryPromise[T] = typingsSlinky.cypress.JQuery.Promise[T, js.Any, js.Any]
  // Legacy types that are not represented in the current type definitions are marked deprecated.
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQuery.Deferred.Callback }\` or \`{@link JQuery.Deferred.CallbackBase }\`.
    */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, scala.Unit]
  /**
    * @deprecated ​ Deprecated.
    */
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ typingsSlinky.cypress.JQuery.TypeOrArray[typingsSlinky.cypress.JQueryPromiseCallback[T]], 
    /* repeated */ typingsSlinky.cypress.JQuery.TypeOrArray[typingsSlinky.cypress.JQueryPromiseCallback[js.Any]], 
    typingsSlinky.cypress.JQueryPromise[U]
  ]
  // tslint:disable-next-line:no-empty-interface
  type JQuerySerializeArrayElement = typingsSlinky.cypress.JQuery.NameValuePair
  /**
    * @deprecated ​ Deprecated since 1.9. See \`{@link https://api.jquery.com/jQuery.support/ }\`.
    */
  // tslint:disable-next-line:no-empty-interface
  type JQuerySupport = typingsSlinky.cypress.JQuery.PlainObject[js.Any]
  type KeyboardEvent = org.scalajs.dom.raw.KeyboardEvent
  type Mocha = typingsSlinky.cypress.Mocha_
  // #endregion Browser augmentations
  // #region Deprecations
  /** @deprecated use `Mocha.Done` instead. */
  type MochaDone = typingsSlinky.cypress.Mocha.Done
  type MouseEvent = org.scalajs.dom.raw.MouseEvent
  /** @deprecated use `Mocha.ReporterConstructor` instead. */
  type ReporterConstructor = typingsSlinky.cypress.Mocha.ReporterConstructor
  type TouchEvent = org.scalajs.dom.raw.TouchEvent
  type UIEvent = org.scalajs.dom.raw.UIEvent
}
