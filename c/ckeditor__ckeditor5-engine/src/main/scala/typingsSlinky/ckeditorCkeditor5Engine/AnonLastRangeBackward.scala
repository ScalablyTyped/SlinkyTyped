package typingsSlinky.ckeditorCkeditor5Engine

import typingsSlinky.ckeditorCkeditor5Engine.mod.view.DocumentFragment
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLastRangeBackward extends js.Object {
  var lastRangeBackward: js.UndefOr[Boolean] = js.native
  var order: js.UndefOr[js.Array[Double]] = js.native
  var rootElement: js.UndefOr[Element | DocumentFragment] = js.native
  var sameSelectionCharacters: js.UndefOr[Boolean] = js.native
}

object AnonLastRangeBackward {
  @scala.inline
  def apply(): AnonLastRangeBackward = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLastRangeBackward]
  }
  @scala.inline
  implicit class AnonLastRangeBackwardOps[Self <: AnonLastRangeBackward] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastRangeBackward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRangeBackward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastRangeBackward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRangeBackward")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withRootElement(value: Element | DocumentFragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootElement")(js.undefined)
        ret
    }
    @scala.inline
    def withSameSelectionCharacters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameSelectionCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSameSelectionCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameSelectionCharacters")(js.undefined)
        ret
    }
  }
  
}

