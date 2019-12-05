package typingsSlinky.openDashGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object openDashGraphMod {
  type DataCallback = js.Function2[/* err */ js.Error | Null, /* data */ js.UndefOr[Data], Unit]
  type RequestCallback = js.Function2[/* err */ js.Error | Null, /* data */ js.UndefOr[String], Unit]
}
