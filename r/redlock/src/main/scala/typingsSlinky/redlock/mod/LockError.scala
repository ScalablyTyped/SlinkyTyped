package typingsSlinky.redlock.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This error is returned when there is an error locking a resource.
  */
@JSImport("redlock", "LockError")
@js.native
class LockError () extends Error {
  def this(message: String) = this()
  var attempts: Double = js.native
  @JSName("name")
  val name_LockError: typingsSlinky.redlock.redlockStrings.LockError = js.native
}

