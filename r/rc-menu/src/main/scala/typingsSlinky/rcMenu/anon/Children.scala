package typingsSlinky.rcMenu.anon

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var defaultActiveFirst: js.UndefOr[Boolean] = js.native
  var eventKey: js.UndefOr[typingsSlinky.react.mod.Key] = js.native
}

object Children {
  @scala.inline
  def apply(): Children = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withDefaultActiveFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActiveFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultActiveFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActiveFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withEventKey(value: typingsSlinky.react.mod.Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventKey")(js.undefined)
        ret
    }
  }
  
}

