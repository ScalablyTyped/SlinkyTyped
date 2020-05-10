package typingsSlinky.cron.mod

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cron", "sendAt")
@js.native
object sendAt extends js.Object {
  def apply(cronTime: String): Moment = js.native
  def apply(cronTime: Moment): Moment = js.native
  def apply(cronTime: js.Date): Moment = js.native
}

