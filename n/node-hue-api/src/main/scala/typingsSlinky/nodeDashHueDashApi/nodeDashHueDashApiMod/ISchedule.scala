package typingsSlinky.nodeDashHueDashApi.nodeDashHueDashApiMod

import typingsSlinky.nodeDashHueDashApi.Anon_Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISchedule extends js.Object {
  var command: Anon_Address
  var description: String
  var name: String
  var time: js.Date
}

object ISchedule {
  @scala.inline
  def apply(command: Anon_Address, description: String, name: String, time: js.Date): ISchedule = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISchedule]
  }
}

