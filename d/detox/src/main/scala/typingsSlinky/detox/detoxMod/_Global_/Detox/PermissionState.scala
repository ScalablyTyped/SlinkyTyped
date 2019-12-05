package typingsSlinky.detox.detoxMod._Global_.Detox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.detox.detoxStrings.YES
  - typings.detox.detoxStrings.NO
  - typings.detox.detoxStrings.unset
*/
trait PermissionState extends js.Object

object PermissionState {
  @scala.inline
  def NO: typingsSlinky.detox.detoxStrings.NO = this.cast("NO")
  @scala.inline
  def YES: typingsSlinky.detox.detoxStrings.YES = this.cast("YES")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def unset: typingsSlinky.detox.detoxStrings.unset = this.cast("unset")
}

