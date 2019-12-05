package typingsSlinky.pgDashPool

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pgDashPoolMod {
  import org.scalablytyped.runtime.Instantiable1
  import typingsSlinky.pg.pgMod.Client
  import typingsSlinky.pg.pgMod.ClientConfig

  type ClientLikeCtr[T /* <: Client */] = Instantiable1[js.UndefOr[String | ClientConfig], T]
}
