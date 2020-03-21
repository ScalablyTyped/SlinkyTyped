package typingsSlinky.ldapjs.mod

import typingsSlinky.ldapjs.AnonFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "NotFilter")
@js.native
class NotFilter protected () extends Filter {
  def this(options: AnonFilter) = this()
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override def matches(obj: js.Any): Boolean = js.native
}

