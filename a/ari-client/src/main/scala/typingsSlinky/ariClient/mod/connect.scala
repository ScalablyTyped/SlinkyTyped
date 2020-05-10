package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ari-client", "connect")
@js.native
object connect extends js.Object {
  def apply(baseUrl: String, user: String, pass: String): js.Promise[Client] = js.native
  def apply(
    baseUrl: String,
    user: String,
    pass: String,
    callback: js.Function2[/* err */ js.Error, /* client */ Client, Unit]
  ): js.Promise[Client] = js.native
}

