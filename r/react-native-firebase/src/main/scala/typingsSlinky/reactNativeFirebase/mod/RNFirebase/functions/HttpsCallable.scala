package typingsSlinky.reactNativeFirebase.mod.RNFirebase.functions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An HttpsCallable is a reference to a "callable" http trigger in
  * Google Cloud Functions.
  */
/* Rewritten from type alias, can be one of: 
  - js.Function1[
/ * data * / Params, 
js.Promise[
  typingsSlinky.reactNativeFirebase.mod.RNFirebase.functions.HttpsCallableResult[Result]
]]
  - js.Function0[
js.Promise[
  typingsSlinky.reactNativeFirebase.mod.RNFirebase.functions.HttpsCallableResult[Result]
]]
*/
trait HttpsCallable[Params, Result] extends js.Object

object HttpsCallable {
  @scala.inline
  implicit def apply[Params, Result](value: js.Function0[js.Promise[HttpsCallableResult[Result]]]): HttpsCallable[Params, Result] = value.asInstanceOf[HttpsCallable[Params, Result]]
  @scala.inline
  implicit def apply[Params, Result](value: js.Function1[/* data */ Params, js.Promise[HttpsCallableResult[Result]]]): HttpsCallable[Params, Result] = value.asInstanceOf[HttpsCallable[Params, Result]]
}

