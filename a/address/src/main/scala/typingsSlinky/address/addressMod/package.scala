package typingsSlinky.address

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object addressMod {
  type AddressCallback = js.Function2[/* err */ js.Error, /* addr */ Address, Unit]
  type DnsCallback = js.Function2[/* err */ js.Error, /* servers */ js.Array[String], Unit]
  type MacCallback = js.Function2[/* err */ js.Error, /* addr */ String, Unit]
}
