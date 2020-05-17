package typingsSlinky.jasmine.jasmine

import typingsSlinky.jasmine.DoneFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function0[js.Thenable[js.Any]]
  - js.Function1[/ * done * / typingsSlinky.jasmine.DoneFn, scala.Unit]
*/
trait ImplementationCallback extends js.Object

object ImplementationCallback {
  @scala.inline
  implicit def apply(value: js.Function0[js.Thenable[js.Any]]): ImplementationCallback = value.asInstanceOf[ImplementationCallback]
  @scala.inline
  implicit def apply(value: js.Function1[/* done */ DoneFn, Unit]): ImplementationCallback = value.asInstanceOf[ImplementationCallback]
}

