package typingsSlinky.meteorAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetIdentifier extends js.Object {
  def getIdentifier(identifier: js.Any): String = js.native
  def getValues(): js.Array[_] = js.native
}

object AnonGetIdentifier {
  @scala.inline
  def apply(getIdentifier: js.Any => String, getValues: () => js.Array[_]): AnonGetIdentifier = {
    val __obj = js.Dynamic.literal(getIdentifier = js.Any.fromFunction1(getIdentifier), getValues = js.Any.fromFunction0(getValues))
    __obj.asInstanceOf[AnonGetIdentifier]
  }
  @scala.inline
  implicit class AnonGetIdentifierOps[Self <: AnonGetIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetIdentifier(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIdentifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetValues(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValues")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

