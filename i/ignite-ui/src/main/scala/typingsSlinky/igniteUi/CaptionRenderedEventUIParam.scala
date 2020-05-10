package typingsSlinky.igniteUi

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionRenderedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the caption container.
  	 */
  var captionContainer: js.UndefOr[Element] = js.native
  /**
  	 * Gets a reference to the grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object CaptionRenderedEventUIParam {
  @scala.inline
  def apply(): CaptionRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionRenderedEventUIParam]
  }
  @scala.inline
  implicit class CaptionRenderedEventUIParamOps[Self <: CaptionRenderedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptionContainer(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

