package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AUDTWD extends js.Object {
  var AUD: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[String]
}

object AUDTWD {
  @scala.inline
  def apply(AUD: js.Array[String], TWD: js.Array[String], USD: js.Array[String]): AUDTWD = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDTWD]
  }
}

