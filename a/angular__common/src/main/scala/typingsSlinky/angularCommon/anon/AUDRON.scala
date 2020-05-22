package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AUDRON extends js.Object {
  var AUD: js.Array[String]
  var RON: js.Array[js.UndefOr[String]]
  var USD: js.Array[String]
}

object AUDRON {
  @scala.inline
  def apply(AUD: js.Array[String], RON: js.Array[js.UndefOr[String]], USD: js.Array[String]): AUDRON = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDRON]
  }
}

