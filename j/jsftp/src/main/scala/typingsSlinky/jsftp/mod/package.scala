package typingsSlinky.jsftp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorCallback = js.Function1[/* err */ js.Error, scala.Unit]
  type GetCallback = js.Function2[/* err */ js.Error, /* socket */ typingsSlinky.node.netMod.Socket, scala.Unit]
  type ListCallback = js.Function2[/* err */ js.Error, /* dirContents */ java.lang.String, scala.Unit]
  type LsCallback = js.Function2[/* err */ js.Error, /* res */ js.Array[typingsSlinky.jsftp.AnonName], scala.Unit]
  type RawCallback = js.Function2[/* err */ js.Error, /* data */ typingsSlinky.jsftp.AnonCode, scala.Unit]
}
