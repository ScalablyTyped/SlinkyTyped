package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BOBJPY extends js.Object {
  var BOB: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object BOBJPY {
  @scala.inline
  def apply(BOB: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): BOBJPY = {
    val __obj = js.Dynamic.literal(BOB = BOB.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BOBJPY]
  }
}

