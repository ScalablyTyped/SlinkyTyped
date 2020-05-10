package typingsSlinky.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeginDragOptions extends js.Object {
  var clientOffset: js.UndefOr[XYCoord] = js.native
  var getSourceClientOffset: js.UndefOr[js.Function1[/* sourceId */ Identifier, XYCoord]] = js.native
  var publishSource: js.UndefOr[Boolean] = js.native
}

object BeginDragOptions {
  @scala.inline
  def apply(): BeginDragOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginDragOptions]
  }
  @scala.inline
  implicit class BeginDragOptionsOps[Self <: BeginDragOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientOffset(value: XYCoord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSourceClientOffset(value: /* sourceId */ Identifier => XYCoord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceClientOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetSourceClientOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceClientOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishSource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishSource")(js.undefined)
        ret
    }
  }
  
}

