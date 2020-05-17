package typingsSlinky.cron.mod

import typingsSlinky.cron.anon.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function0[scala.Unit]
  - java.lang.String
  - typingsSlinky.cron.anon.Args
*/
trait CronCommand extends js.Object

object CronCommand {
  @scala.inline
  implicit def apply(value: Args): CronCommand = value.asInstanceOf[CronCommand]
  @scala.inline
  implicit def apply(value: js.Function0[Unit]): CronCommand = value.asInstanceOf[CronCommand]
  @scala.inline
  implicit def apply(value: String): CronCommand = value.asInstanceOf[CronCommand]
}

