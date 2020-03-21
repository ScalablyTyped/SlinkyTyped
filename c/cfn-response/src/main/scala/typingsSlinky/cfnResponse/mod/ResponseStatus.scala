package typingsSlinky.cfnResponse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cfnResponse.cfnResponseStrings.SUCCESS
  - typingsSlinky.cfnResponse.cfnResponseStrings.FAILED
*/
trait ResponseStatus extends js.Object

object ResponseStatus {
  @scala.inline
  def FAILED: typingsSlinky.cfnResponse.cfnResponseStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def SUCCESS: typingsSlinky.cfnResponse.cfnResponseStrings.SUCCESS = this.cast("SUCCESS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

