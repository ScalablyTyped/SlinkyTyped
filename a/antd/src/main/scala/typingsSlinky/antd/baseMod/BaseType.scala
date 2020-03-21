package typingsSlinky.antd.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.antd.antdStrings.secondary
  - typingsSlinky.antd.antdStrings.danger
  - typingsSlinky.antd.antdStrings.warning
*/
trait BaseType extends js.Object

object BaseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def danger: typingsSlinky.antd.antdStrings.danger = this.cast("danger")
  @scala.inline
  def secondary: typingsSlinky.antd.antdStrings.secondary = this.cast("secondary")
  @scala.inline
  def warning: typingsSlinky.antd.antdStrings.warning = this.cast("warning")
}

