package typingsSlinky.jsforce.mod

import typingsSlinky.jsforce.chatterMod.RequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce", "Request")
@js.native
class Request[T] protected ()
  extends typingsSlinky.jsforce.chatterMod.Request[T] {
  def this(chatter: typingsSlinky.jsforce.chatterMod.Chatter, params: RequestParams) = this()
}

