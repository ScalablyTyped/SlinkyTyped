package typingsSlinky

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object jquery {
  
  type DragEvent = org.scalajs.dom.raw.DragEvent
  
  type Event = org.scalajs.dom.raw.Event
  
  type FocusEvent = org.scalajs.dom.raw.FocusEvent
  
  // tslint:disable-next-line:no-empty-interface
  type JQueryAjaxSettings = typingsSlinky.jquery.JQuery.AjaxSettings[js.Any]
  
  type JQueryAnimationOptions = typingsSlinky.jquery.JQuery.EffectsOptions[org.scalajs.dom.raw.Element]
  
  type JQueryCallback = typingsSlinky.jquery.JQuery.Callbacks[js.Function]
  
  // tslint:disable-next-line:no-empty-interface
  type JQueryCoordinates = typingsSlinky.jquery.JQuery.Coordinates
  
  type JQueryDeferred[T] = typingsSlinky.jquery.JQuery.Deferred[T, js.Any, js.Any]
  
  /**
    * @deprecated ​ Deprecated. Internal. See \`{@link https://github.com/jquery/api.jquery.com/issues/912 }\`.
    */
  type JQueryEasingFunction = js.Function1[/* percent */ scala.Double, scala.Double]
  
  // tslint:disable-next-line:no-empty-interface
  type JQueryEventConstructor = typingsSlinky.jquery.JQuery.EventStatic
  
  type JQueryGenericPromise[T] = typingsSlinky.jquery.JQuery.Thenable[T]
  
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQueryStatic.param JQueryStatic&#91;'param'&#93;}\`.
    */
  type JQueryParam = js.Function2[/* obj */ js.Any, /* traditional */ js.UndefOr[scala.Boolean], java.lang.String]
  
  type JQueryPromise[T] = typingsSlinky.jquery.JQuery.Promise[T, js.Any, js.Any]
  
  // Legacy types that are not represented in the current type definitions are marked deprecated.
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQuery.Deferred.Callback }\` or \`{@link JQuery.Deferred.CallbackBase }\`.
    */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, scala.Unit]
  
  /**
    * @deprecated ​ Deprecated.
    */
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ typingsSlinky.jquery.JQuery.TypeOrArray[typingsSlinky.jquery.JQueryPromiseCallback[T]], 
    /* repeated */ typingsSlinky.jquery.JQuery.TypeOrArray[typingsSlinky.jquery.JQueryPromiseCallback[js.Any]], 
    typingsSlinky.jquery.JQueryPromise[U]
  ]
  
  // tslint:disable-next-line:no-empty-interface
  type JQuerySerializeArrayElement = typingsSlinky.jquery.JQuery.NameValuePair
  
  /**
    * @deprecated ​ Deprecated since 1.9. See \`{@link https://api.jquery.com/jQuery.support/ }\`.
    */
  // tslint:disable-next-line:no-empty-interface
  type JQuerySupport = typingsSlinky.jquery.JQuery.PlainObject[js.Any]
  
  type KeyboardEvent = org.scalajs.dom.raw.KeyboardEvent
  
  type MouseEvent = org.scalajs.dom.raw.MouseEvent
  
  type TouchEvent = org.scalajs.dom.raw.TouchEvent
  
  type UIEvent = org.scalajs.dom.raw.UIEvent
}
