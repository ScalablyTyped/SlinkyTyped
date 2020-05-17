package typingsSlinky.c3.anon

import typingsSlinky.c3.c3Strings.center
import typingsSlinky.c3.c3Strings.left
import typingsSlinky.c3.c3Strings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Padding extends js.Object {
  /**
    * Spacing around the title.
    */
  var padding: js.UndefOr[typingsSlinky.c3.mod.Padding] = js.native
  /**
    * Chart title text.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Position the title relative to the chart.
    */
  var title_position: js.UndefOr[right | center | left] = js.native
}

object Padding {
  @scala.inline
  def apply(): Padding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Padding]
  }
  @scala.inline
  implicit class PaddingOps[Self <: Padding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPadding(value: typingsSlinky.c3.mod.Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle_position(value: right | center | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title_position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle_position: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title_position")(js.undefined)
        ret
    }
  }
  
}

