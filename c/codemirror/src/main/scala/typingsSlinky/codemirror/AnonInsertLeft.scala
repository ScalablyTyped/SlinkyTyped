package typingsSlinky.codemirror

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInsertLeft extends js.Object {
  /** By default, text typed when the cursor is on top of the bookmark will end up to the right of the bookmark.
    Set this option to true to make it go to the left instead. */
  var insertLeft: js.UndefOr[Boolean] = js.native
  /** Can be used to display a DOM node at the current location of the bookmark (analogous to the replacedWith option to markText). */
  var widget: js.UndefOr[HTMLElement] = js.native
}

object AnonInsertLeft {
  @scala.inline
  def apply(): AnonInsertLeft = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInsertLeft]
  }
  @scala.inline
  implicit class AnonInsertLeftOps[Self <: AnonInsertLeft] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withWidget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(js.undefined)
        ret
    }
  }
  
}

