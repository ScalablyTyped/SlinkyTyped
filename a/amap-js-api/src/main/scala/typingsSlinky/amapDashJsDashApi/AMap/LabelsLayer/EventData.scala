package typingsSlinky.amapDashJsDashApi.AMap.LabelsLayer

import typingsSlinky.amapDashJsDashApi.Anon_Icon
import typingsSlinky.amapDashJsDashApi.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  var data: Anon_Id
  var opts: Anon_Icon
}

object EventData {
  @scala.inline
  def apply(data: Anon_Id, opts: Anon_Icon): EventData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventData]
  }
}

