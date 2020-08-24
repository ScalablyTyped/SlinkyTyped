package typingsSlinky.nock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nock", "enableNetConnect")
@js.native
object enableNetConnect extends js.Object {
  def apply(): Unit = js.native
  def apply(matcher: String): Unit = js.native
  def apply(matcher: js.Function1[/* host */ String, Boolean]): Unit = js.native
  def apply(matcher: js.RegExp): Unit = js.native
}

