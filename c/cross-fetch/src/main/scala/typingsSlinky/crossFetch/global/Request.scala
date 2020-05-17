package typingsSlinky.crossFetch.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.experimental.RequestInit
import typingsSlinky.crossFetch.anon.Instantiable
import typingsSlinky.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("_Request")
@js.native
class Request protected ()
  extends typingsSlinky.std.Request {
  def this(input: RequestInfo) = this()
  def this(input: RequestInfo, init: RequestInit) = this()
}

@JSGlobal("_Request")
@js.native
object Request
  extends TopLevel[
      Instantiable with (Instantiable1[/* input */ RequestInfo, typingsSlinky.std.global.Request])
    ]

