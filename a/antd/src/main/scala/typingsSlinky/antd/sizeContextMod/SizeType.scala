package typingsSlinky.antd.sizeContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.antd.antdStrings.small
  - typingsSlinky.antd.antdStrings.middle
  - typingsSlinky.antd.antdStrings.large
  - js.UndefOr[scala.Nothing]
*/
trait SizeType extends js.Object

object SizeType {
  @scala.inline
  def small: typingsSlinky.antd.antdStrings.small = "small".asInstanceOf[typingsSlinky.antd.antdStrings.small]
  @scala.inline
  def middle: typingsSlinky.antd.antdStrings.middle = "middle".asInstanceOf[typingsSlinky.antd.antdStrings.middle]
  @scala.inline
  def large: typingsSlinky.antd.antdStrings.large = "large".asInstanceOf[typingsSlinky.antd.antdStrings.large]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => SizeType): SizeType = value.asInstanceOf[SizeType]
}

