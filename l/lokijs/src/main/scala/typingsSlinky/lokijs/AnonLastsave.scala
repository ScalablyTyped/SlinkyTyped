package typingsSlinky.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLastsave extends js.Object {
  var lastsave: js.Date
  var savecount: Double
  var value: String
}

object AnonLastsave {
  @scala.inline
  def apply(lastsave: js.Date, savecount: Double, value: String): AnonLastsave = {
    val __obj = js.Dynamic.literal(lastsave = lastsave.asInstanceOf[js.Any], savecount = savecount.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLastsave]
  }
}

