package typingsSlinky.fetchDashMock.fetchDashMockMod

import org.scalajs.dom.experimental.Request
import typingsSlinky.std.Array
import typingsSlinky.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockCall
  extends Array[js.UndefOr[String | RequestInit]] {
  var `0`: String = js.native
  var `1`: js.UndefOr[org.scalajs.dom.experimental.RequestInit] = js.native
  var identifier: String = js.native
  var isUnmatched: js.UndefOr[Boolean] = js.native
  var request: js.UndefOr[Request] = js.native
}

