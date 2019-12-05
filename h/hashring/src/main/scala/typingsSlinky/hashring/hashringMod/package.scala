package typingsSlinky.hashring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hashringMod {
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Record

  type Servers = String | js.Array[String] | (Record[String, Partial[ServerConfig]])
}
