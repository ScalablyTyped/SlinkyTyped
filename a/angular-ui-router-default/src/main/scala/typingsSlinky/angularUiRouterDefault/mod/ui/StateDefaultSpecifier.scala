package typingsSlinky.angularUiRouterDefault.mod.ui

import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function1[
/ * repeated * / js.Any, 
typingsSlinky.angular.mod.IPromise[java.lang.String] | java.lang.String]
  - js.Array[
(js.Function1[
  / * repeated * / js.Any, 
  typingsSlinky.angular.mod.IPromise[java.lang.String] | java.lang.String
]) | java.lang.String]
*/
trait StateDefaultSpecifier extends js.Object

object StateDefaultSpecifier {
  @scala.inline
  implicit def apply(value: js.Array[(js.Function1[/* repeated */ js.Any, IPromise[String] | String]) | String]): StateDefaultSpecifier = value.asInstanceOf[StateDefaultSpecifier]
  @scala.inline
  implicit def apply(value: js.Function1[/* repeated */ js.Any, IPromise[String] | String]): StateDefaultSpecifier = value.asInstanceOf[StateDefaultSpecifier]
  @scala.inline
  implicit def apply(value: String): StateDefaultSpecifier = value.asInstanceOf[StateDefaultSpecifier]
}

