package typingsSlinky.dayjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.std.Date
  - typingsSlinky.dayjs.mod.Dayjs
*/
trait ConfigType extends js.Object

object ConfigType {
  @scala.inline
  implicit def apply(value: js.Date): ConfigType = value.asInstanceOf[ConfigType]
  @scala.inline
  implicit def apply(value: Dayjs): ConfigType = value.asInstanceOf[ConfigType]
  @scala.inline
  implicit def apply(value: Double): ConfigType = value.asInstanceOf[ConfigType]
  @scala.inline
  implicit def apply(value: String): ConfigType = value.asInstanceOf[ConfigType]
}

