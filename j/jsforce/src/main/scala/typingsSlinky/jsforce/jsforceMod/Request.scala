package typingsSlinky.jsforce.jsforceMod

import typingsSlinky.jsforce.apiChatterMod.RequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce", "Request")
@js.native
class Request[T] protected ()
  extends typingsSlinky.jsforce.apiChatterMod.Request[T] {
  def this(chatter: typingsSlinky.jsforce.apiChatterMod.Chatter, params: RequestParams) = this()
}

