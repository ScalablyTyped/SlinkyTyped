package typingsSlinky.parse.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse", "Session")
@js.native
class Session[T /* <: js.Any */] ()
  extends typingsSlinky.parse.nodeMod.Session[T]

/* static members */
@JSImport("parse", "Session")
@js.native
object Session extends js.Object {
  def current(): js.Promise[typingsSlinky.parse.Parse.Session[_]] = js.native
}

