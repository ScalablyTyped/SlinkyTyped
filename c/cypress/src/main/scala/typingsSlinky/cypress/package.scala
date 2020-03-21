package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cypress {
  type DragEvent = org.scalajs.dom.raw.DragEvent
  type Event = typingsSlinky.std.Event_
  type FocusEvent = org.scalajs.dom.raw.FocusEvent
  // tslint:disable-next-line:strict-export-declare-modifiers
  type GlobalPartial[T] = typingsSlinky.std.Partial[T]
  // tslint:disable-next-line:no-empty-interface
  type JQueryAjaxSettings = typingsSlinky.cypress.JQuery_.AjaxSettings[js.Any]
  type JQueryAnimationOptions = typingsSlinky.cypress.JQuery_.EffectsOptions[org.scalajs.dom.raw.Element]
  type JQueryCallback = typingsSlinky.cypress.JQuery_.Callbacks[js.Function]
  // tslint:disable-next-line:no-empty-interface
  type JQueryCoordinates = typingsSlinky.cypress.JQuery_.Coordinates
  type JQueryDeferred[T] = typingsSlinky.cypress.JQuery_.Deferred[T, js.Any, js.Any]
  /**
    * @deprecated ​ Deprecated. Internal. See \`{@link https://github.com/jquery/api.jquery.com/issues/912 }\`.
    */
  type JQueryEasingFunction = js.Function1[/* percent */ scala.Double, scala.Double]
  // tslint:disable-next-line:no-empty-interface
  type JQueryEventConstructor = typingsSlinky.cypress.JQuery_.EventStatic
  type JQueryGenericPromise[T] = typingsSlinky.cypress.JQuery_.Thenable[T]
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQueryStatic.param JQueryStatic&#91;'param'&#93;}\`.
    */
  type JQueryParam = js.Function2[/* obj */ js.Any, /* traditional */ js.UndefOr[scala.Boolean], java.lang.String]
  type JQueryPromise[T] = typingsSlinky.cypress.JQuery_.Promise[T, js.Any, js.Any]
  // Legacy types that are not represented in the current type definitions are marked deprecated.
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQuery.Deferred.Callback }\` or \`{@link JQuery.Deferred.CallbackBase }\`.
    */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, scala.Unit]
  /**
    * @deprecated ​ Deprecated.
    */
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ typingsSlinky.cypress.JQuery_.TypeOrArray[typingsSlinky.cypress.JQueryPromiseCallback[T]], 
    /* repeated */ typingsSlinky.cypress.JQuery_.TypeOrArray[typingsSlinky.cypress.JQueryPromiseCallback[js.Any]], 
    typingsSlinky.cypress.JQueryPromise[U]
  ]
  // tslint:disable-next-line:no-empty-interface
  type JQuerySerializeArrayElement = typingsSlinky.cypress.JQuery_.NameValuePair
  /**
    * @deprecated ​ Deprecated since 1.9. See \`{@link https://api.jquery.com/jQuery.support/ }\`.
    */
  // tslint:disable-next-line:no-empty-interface
  type JQuerySupport = typingsSlinky.cypress.JQuery_.PlainObject[js.Any]
  type JQuery_[TElement] = typingsSlinky.cypress.JQuery__[TElement]
  type KeyboardEvent = org.scalajs.dom.raw.KeyboardEvent
  // #endregion Browser augmentations
  // #region Deprecations
  /** @deprecated use `Mocha.Done` instead. */
  type MochaDone = typingsSlinky.cypress.Mocha_.Done
  type Mocha_ = typingsSlinky.cypress.Mocha__
  type MouseEvent = org.scalajs.dom.raw.MouseEvent
  /** @deprecated use `Mocha.ReporterConstructor` instead. */
  type ReporterConstructor = typingsSlinky.cypress.Mocha_.ReporterConstructor
  type TouchEvent = org.scalajs.dom.raw.TouchEvent
  type UIEvent = org.scalajs.dom.raw.UIEvent
}
