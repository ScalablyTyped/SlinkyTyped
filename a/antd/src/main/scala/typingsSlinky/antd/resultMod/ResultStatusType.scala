package typingsSlinky.antd.resultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.antd.resultMod.ExceptionStatusType
  - typingsSlinky.antd.antdStrings.success
  - typingsSlinky.antd.antdStrings.error
  - typingsSlinky.antd.antdStrings.info
  - typingsSlinky.antd.antdStrings.warning
*/
trait ResultStatusType extends js.Object

object ResultStatusType {
  @scala.inline
  def success: typingsSlinky.antd.antdStrings.success = "success".asInstanceOf[typingsSlinky.antd.antdStrings.success]
  @scala.inline
  def error: typingsSlinky.antd.antdStrings.error = "error".asInstanceOf[typingsSlinky.antd.antdStrings.error]
  @scala.inline
  def info: typingsSlinky.antd.antdStrings.info = "info".asInstanceOf[typingsSlinky.antd.antdStrings.info]
  @scala.inline
  def warning: typingsSlinky.antd.antdStrings.warning = "warning".asInstanceOf[typingsSlinky.antd.antdStrings.warning]
  @scala.inline
  implicit def apply(value: ExceptionStatusType): ResultStatusType = value.asInstanceOf[ResultStatusType]
}

