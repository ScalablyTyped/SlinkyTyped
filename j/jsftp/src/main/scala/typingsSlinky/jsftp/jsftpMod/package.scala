package typingsSlinky.jsftp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsftpMod {
  import typingsSlinky.jsftp.Anon_Code
  import typingsSlinky.jsftp.Anon_Name
  import typingsSlinky.node.netMod.Socket

  type ErrorCallback = js.Function1[/* err */ js.Error, Unit]
  type GetCallback = js.Function2[/* err */ js.Error, /* socket */ Socket, Unit]
  type ListCallback = js.Function2[/* err */ js.Error, /* dirContents */ String, Unit]
  type LsCallback = js.Function2[/* err */ js.Error, /* res */ js.Array[Anon_Name], Unit]
  type RawCallback = js.Function2[/* err */ js.Error, /* data */ Anon_Code, Unit]
}
