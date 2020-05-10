package typingsSlinky.baseui.modalMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.baseuiStrings.alertdialog
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.dialog
import typingsSlinky.baseui.baseuiStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedStylePropsArg extends js.Object {
  @JSName("$animate")
  var $animate: js.UndefOr[Boolean] = js.native
  @JSName("$closeable")
  var $closeable: js.UndefOr[Boolean] = js.native
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.native
  @JSName("$isVisible")
  var $isVisible: js.UndefOr[Boolean] = js.native
  @JSName("$role")
  var $role: js.UndefOr[dialog | alertdialog] = js.native
  @JSName("$size")
  var $size: js.UndefOr[default_ | full | auto] = js.native
  @JSName("$unstable_ModalBackdropScroll")
  var $unstable_ModalBackdropScroll: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
}

object SharedStylePropsArg {
  @scala.inline
  def apply(): SharedStylePropsArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedStylePropsArg]
  }
  @scala.inline
  implicit class SharedStylePropsArgOps[Self <: SharedStylePropsArg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$animate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$animate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$animate")(js.undefined)
        ret
    }
    @scala.inline
    def with$closeable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$closeable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$closeable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$closeable")(js.undefined)
        ret
    }
    @scala.inline
    def with$isOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$isOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def with$isVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$isVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$isVisible")(js.undefined)
        ret
    }
    @scala.inline
    def with$role(value: dialog | alertdialog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$role: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$role")(js.undefined)
        ret
    }
    @scala.inline
    def with$size(value: default_ | full | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$size")(js.undefined)
        ret
    }
    @scala.inline
    def with$unstable_ModalBackdropScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$unstable_ModalBackdropScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$unstable_ModalBackdropScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$unstable_ModalBackdropScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}

