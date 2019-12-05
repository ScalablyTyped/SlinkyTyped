package typingsSlinky.googleDashP12DashPem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-p12-pem", JSImport.Namespace)
@js.native
object googleDashP12DashPemMod extends js.Object {
  def getPem(filename: String): js.Promise[String] = js.native
  def getPem(filename: String, callback: js.Function2[/* err */ js.Error | Null, /* pem */ String | Null, Unit]): Unit = js.native
}

