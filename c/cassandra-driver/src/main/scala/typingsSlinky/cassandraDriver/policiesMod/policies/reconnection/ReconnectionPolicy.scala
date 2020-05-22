package typingsSlinky.cassandraDriver.policiesMod.policies.reconnection

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReconnectionPolicy extends js.Object {
  def getOptions(): Map[String, js.Object]
  def newSchedule(): js.Iterator[Double]
}

object ReconnectionPolicy {
  @scala.inline
  def apply(getOptions: () => Map[String, js.Object], newSchedule: () => js.Iterator[Double]): ReconnectionPolicy = {
    val __obj = js.Dynamic.literal(getOptions = js.Any.fromFunction0(getOptions), newSchedule = js.Any.fromFunction0(newSchedule))
    __obj.asInstanceOf[ReconnectionPolicy]
  }
}

