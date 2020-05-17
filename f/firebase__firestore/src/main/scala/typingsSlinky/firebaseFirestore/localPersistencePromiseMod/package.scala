package typingsSlinky.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object localPersistencePromiseMod {
  type Rejector = js.Function1[/* error */ js.Error, scala.Unit]
  type Resolver[T] = js.Function1[/* value */ js.UndefOr[T], scala.Unit]
}
