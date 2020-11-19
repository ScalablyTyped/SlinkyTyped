package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object jqueryAjaxfile {
  
  type IAjaxFileResultCallback[T] = js.Function1[/* result */ typingsSlinky.jqueryAjaxfile.IAjaxFileResult[T], js.Any]
  
  /**
    * Interface for the JQuery promise/deferred callbacks
    */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, scala.Unit]
  
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ typingsSlinky.jqueryAjaxfile.JQueryPromiseCallback[T] | js.Array[typingsSlinky.jqueryAjaxfile.JQueryPromiseCallback[T]], 
    /* repeated */ typingsSlinky.jqueryAjaxfile.JQueryPromiseCallback[js.Any] | js.Array[typingsSlinky.jqueryAjaxfile.JQueryPromiseCallback[js.Any]], 
    typingsSlinky.jqueryAjaxfile.JQueryPromise[U]
  ]
  
  type Mocha = typingsSlinky.jqueryAjaxfile.Mocha_
  
  type MochaDone = js.Function1[/* error */ js.UndefOr[js.Error], scala.Unit]
}
