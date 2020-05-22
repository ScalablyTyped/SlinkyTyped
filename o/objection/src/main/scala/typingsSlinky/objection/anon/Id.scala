package typingsSlinky.objection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  @JSName("#id")
  var Numbersignid: js.UndefOr[String] = js.undefined
}

object Id {
  @scala.inline
  def apply(Numbersignid: String = null): Id = {
    val __obj = js.Dynamic.literal()
    if (Numbersignid != null) __obj.updateDynamic("#id")(Numbersignid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

