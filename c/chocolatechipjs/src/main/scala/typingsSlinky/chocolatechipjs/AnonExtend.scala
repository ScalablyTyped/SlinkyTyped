package typingsSlinky.chocolatechipjs

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExtend extends js.Object {
  /**
    * This method adds the provided object to the Array prototype to make it available to all arrays of HTML elements.
    *
    * @param object And object to add to element arrays.
    * @return The extended array of elements.
    */
  def extend(`object`: js.Object): js.Array[HTMLElement] = js.native
}

object AnonExtend {
  @scala.inline
  def apply(extend: js.Object => js.Array[HTMLElement]): AnonExtend = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend))
    __obj.asInstanceOf[AnonExtend]
  }
  @scala.inline
  implicit class AnonExtendOps[Self <: AnonExtend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtend(value: js.Object => js.Array[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

