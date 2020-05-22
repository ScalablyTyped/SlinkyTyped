package typingsSlinky.amapJsApi.AMap.LabelsLayer

import typingsSlinky.amapJsApi.anon.Icon
import typingsSlinky.amapJsApi.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  var data: Id
  var opts: Icon
}

object EventData {
  @scala.inline
  def apply(data: Id, opts: Icon): EventData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
}

