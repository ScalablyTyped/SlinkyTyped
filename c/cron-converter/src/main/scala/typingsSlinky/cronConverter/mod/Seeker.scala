package typingsSlinky.cronConverter.mod

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cron-converter", "Seeker")
@js.native
class Seeker protected () extends js.Object {
  /**
    * Creates an instance of Seeker.
    * Seeker objects search for execution times of a cron schedule.
    * @param cron A Cron instance.
    * @param now A Date or Moment object.
    */
  def this(cron: Cron, now: js.Date) = this()
  /**
    * Returns the time the schedule would run next.
    */
  def next(): Moment = js.native
  /**
    * Returns the time the schedule would have last run at.
    */
  def prev(): Moment = js.native
  /**
    * Resets the iterator.
    */
  def reset(): Unit = js.native
}

