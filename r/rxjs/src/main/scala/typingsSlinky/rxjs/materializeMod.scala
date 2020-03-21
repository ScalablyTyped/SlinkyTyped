package typingsSlinky.rxjs

import typingsSlinky.rxjs.notificationMod.Notification
import typingsSlinky.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/materialize", JSImport.Namespace)
@js.native
object materializeMod extends js.Object {
  def materialize[T](): OperatorFunction[T, Notification[T]] = js.native
}

