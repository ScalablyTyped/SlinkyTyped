package typingsSlinky.reactNative

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends Object
     with Body {
  val credentials: RequestCredentials = js.native
  val headers: Headers = js.native
  val method: String = js.native
  val mode: RequestMode = js.native
  val referrer: String = js.native
  val url: String = js.native
}

@JSGlobal("Request")
@js.native
object Request
  extends Instantiable1[(/* input */ Request) | (/* input */ String), Request]
     with Instantiable2[(/* input */ Request) | (/* input */ String), /* init */ RequestInit, Request]

