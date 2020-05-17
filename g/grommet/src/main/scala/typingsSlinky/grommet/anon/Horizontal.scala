package typingsSlinky.grommet.anon

import typingsSlinky.grommet.grommetStrings.auto
import typingsSlinky.grommet.grommetStrings.hidden
import typingsSlinky.grommet.grommetStrings.scroll
import typingsSlinky.grommet.grommetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Horizontal extends js.Object {
  var horizontal: js.UndefOr[auto | hidden | scroll | visible] = js.native
  var vertical: js.UndefOr[auto | hidden | scroll | visible] = js.native
}

object Horizontal {
  @scala.inline
  def apply(): Horizontal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Horizontal]
  }
  @scala.inline
  implicit class HorizontalOps[Self <: Horizontal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontal(value: auto | hidden | scroll | visible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: auto | hidden | scroll | visible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

