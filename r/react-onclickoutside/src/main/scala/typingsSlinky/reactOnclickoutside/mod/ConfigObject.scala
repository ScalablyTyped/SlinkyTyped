package typingsSlinky.reactOnclickoutside.mod

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigObject extends js.Object {
  var excludeScrollbar: js.UndefOr[Boolean] = js.native
  var handleClickOutside: js.UndefOr[MouseEventHandler[_]] = js.native
}

object ConfigObject {
  @scala.inline
  def apply(): ConfigObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigObject]
  }
  @scala.inline
  implicit class ConfigObjectOps[Self <: ConfigObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleClickOutside(value: SyntheticMouseEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClickOutside")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleClickOutside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClickOutside")(js.undefined)
        ret
    }
  }
  
}

