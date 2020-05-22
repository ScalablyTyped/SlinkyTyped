package typingsSlinky.firebaseDatabase.mod

import typingsSlinky.firebaseDatabase.anon.Sv
import typingsSlinky.firebaseDatabase.anon.SvIncrement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database", "ServerValue")
@js.native
object ServerValue extends js.Object {
  var TIMESTAMP: Sv = js.native
  def increment(delta: Double): SvIncrement = js.native
}

